package by.it.galushka.jd02_03;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Buyer extends Thread implements IBuyer, IUseBacket {

    Buyer(int number) {
        super("Buyer #" + number);
        Dispatcher.buyerEnterToMarket();
    }

    static boolean pensioneer;
    private final double KSPEED = pensioneer ? 1.5 : 1.0;

    @Override
    public void run() {
        enterToMarket();
        takeBacket();
        Map<String, Double> goods = chooseGoods();
        goToQueue();
        Check.printCheck(this, goods);
        goOut();
    }

    private void goToQueue() {
        Queue.addBuyerInQueue(this);
        synchronized (this) {
            try {
                System.out.println(this + " is waiting.");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //========================================================================
    // IBuyer methods
    @Override
    public void enterToMarket() {
        if (pensioneer) {
            System.out.println(this + "(pensioneer) enter to market.");
        } else {
            System.out.println(this + " enter to market.");
        }
    }

    public Map<String, Double> chooseGoods() {
        ConcurrentHashMap<String, Double> goodsMap = new ConcurrentHashMap<>();
        int quantityGoods = Util.getRandom(1, 4);
        for (int goods = 0; goods < quantityGoods; goods++) {
            System.out.println(this + " start choosing goods.");
            Util.sleep((Util.getRandom(500, 2000)));
            Map<String, Double> choosedGood = Goods.getRandomGood();
            String good = Goods.getGoodName(choosedGood);
            double cost = Goods.getGoodCost(choosedGood);
            if (!goodsMap.containsKey(good))
                goodsMap.putAll(choosedGood);
            else {
                Check.addCost(good, cost, goodsMap);
            }
            System.out.println(this + " choosed " + good + ", cost - " + cost + " rubles.");
            putGoodsToBacket(good);
        }
        System.out.println(this + " end choosing goods today.");
        return goodsMap;
    }

    @Override
    public void goOut() {
        System.out.println(this + " go out.");
        Dispatcher.buyerLeaveMarket();
    }
    //=========================================================================

    //=========================================================================
    // IUseBacket methods
    @Override
    public void takeBacket() {
        Util.sleep((int) (Util.getRandom(100, 200) * KSPEED));
        System.out.println(this + " took backet.");
    }

    @Override
    public void putGoodsToBacket() {
        Util.sleep((int) (Util.getRandom(100, 200) * KSPEED));
        System.out.println(this + " put good to backet.");
    }

    private void putGoodsToBacket(String good) {
        Util.sleep((int) (Util.getRandom(100, 200) * KSPEED));
        System.out.println(this + " put " + good + " to backet.");
    }
    //=========================================================================

    @Override
    public String toString() {
        return this.getName();
    }
}
