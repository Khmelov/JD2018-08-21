package by.it.bindyuk.project.java.controller;

public interface Patterns {

    String LOGIN = "[a-zA-Zа-яА-ЯёЁ0-9]{3,}";
    String PASSWORD = "[a-zA-Z0-9а-яА-ЯёЁ]{3,}";
    String EMAIL = "[a-z0-9\\._-]+@[a-z0-9_-]+\\.[a-z0-9_-]{2,6}";
    String BANCARD = "[0-9]{16,20}";
    String PASSPORTID = "[0-9]{6,9}";
    String PASSPORTSERIES = "[a-zA-Zа-яА-ЯёЁ]{2,3}";
    String CID = "[0-9]{3}";
    String TRANSPORT = "[a-zA-Zа-яА-ЯёЁ]{3,15}";
    String CITY = "[a-zA-Zа-яА-ЯёЁ0-9]{1,20}";

}
