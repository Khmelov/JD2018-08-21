package by.it.korolchuk.project.java.controller;

public enum Action {

    INDEX {{

        cmd = new CmdIndex();
    }}, LOGIN {{

        cmd = new CmdLogin();
    }}, LOGOUT {{

        cmd = new CmdLogout();
    }}, SIGNUP {{

        cmd = new CmdSignup();
    }}, CREATEAD {{

        cmd = new CmdCreateAd();
    }}, LISTAD {{

        cmd = new CmdListAd();
    }},ERROR {{

        cmd = new CmdError();
    }};

    public String getJsp(){
       return  "/"+this.cmd.toString().toLowerCase()+".jsp";
    }

    public Cmd cmd = new CmdError();
}


