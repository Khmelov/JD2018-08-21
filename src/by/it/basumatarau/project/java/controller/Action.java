package by.it.basumatarau.project.java.controller;

import by.it.basumatarau.project.java.commands.*;

public enum Action {

    INDEX {{
        this.command = new CmdIndex();
        this.jsp = "/index.jsp";
    }},
    LOGIN {{
        this.command = new CmdLogin();
        this.jsp = "/login.jsp";
    }},
    SEARCH {{
        this.command = new CmdSearch();
        this.jsp = "/search.jsp";
    }},
    PROFILE {{
        this.command = new CmdProfile();
        this.jsp = "/profile.jsp";
    }},
    ADMIN {{
        this.command = new CmdAdmin();
        this.jsp = "/admin.jsp";
    }},
    ERROR {{
        this.command = new CmdError();
        this.jsp = "/error.jsp";
    }},
    RESET {{
        this.command = new CmdReset();
        this.jsp = "/index.jsp";
    }},
    SIGNUP {{
        this.command = new CmdSignUp();
        this.jsp = "/signup.jsp";
    }},
    CREATEVENUE {{
        this.command = new CmdCreateVenue();
        this.jsp = "/createVenue.jsp";
    }},
    LISTVENUES{{
        this.command = new CmdListVenues();
        this.jsp = "/listVenues.jsp";
    }};

    public String jsp = "/error.jsp";
    public Cmd command = new CmdError();

}
