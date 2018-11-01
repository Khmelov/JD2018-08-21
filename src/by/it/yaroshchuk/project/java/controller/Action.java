package by.it.yaroshchuk.project.java.controller;

public enum Action {

    INDEX {{
            cmd = new CmdIndex();
        }},
    RESET {{
            cmd = new CmdReset();
        }},
    LOGIN {{
            cmd = new CmdLogin();
        }},
    LOGOUT {{
            cmd = new CmdIndex();
        }},
    SIGNUP {{
            cmd = new CmdSignUp();
        }},
    CREATERESUME {{
            cmd = new CmdCreateResume();
        }},
    LISTRESUMES {{
            cmd = new CmdListResumes();
    }},
    ERROR {{
            cmd = new CmdError();
        }};

    public String getJsp() {
        return "/" + this.cmd.toString().toLowerCase() + ".jsp";
    }

    public Cmd cmd = new CmdError();
}
