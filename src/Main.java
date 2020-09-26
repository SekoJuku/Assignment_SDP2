import facade.TeamBuilder;

public class Main {
    public static void main(String[] args) {
        TeamBuilder tb = new TeamBuilder();
        while (tb.add() != 9) {
            tb.execute();
        }
    }
}
