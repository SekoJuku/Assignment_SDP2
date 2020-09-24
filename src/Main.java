import facade.TeamBuilder;

public class Main {
    public static void main(String[] args) {
        TeamBuilder tb = new TeamBuilder();

        int ch = tb.chooseMain();
        if(ch == 1) {
            tb.addBackend();
        } else if(ch == 2) {
            tb.addFrontend();
        } else if(ch == 3) {
            tb.addUIUX();
        } else if(ch == 4) {
            tb.addTeam();
        } else if(ch == 9) {
            tb.toString();
        }
    }
}
