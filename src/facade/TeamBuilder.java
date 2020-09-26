package facade;

import data.Data;
import members.Employee;
import members.Worker;
/*
import members.team.Backend;
import members.team.Frontend;
import members.team.UIUX;
*/
import structure.Team;

import java.util.LinkedList;

public class TeamBuilder extends BuilderHelper {
    Team team = new Team();
    Team dev2 = new Team();
    Data data = new Data();

    public int add() {
        int n = chooseMain();
        String d = "";

        if(n == 1) {
            d = "B";
        } else if( n == 2 ) {
            d = "F";
        } else if( n == 3 ) {
            d = "U";
        } else if( n == 4 ) {
            int choice = chooseMain();
            String choice1 = fillTeam(choice);
            int choice3 = chooseEmployee(choice1,data.getE());
            if(choice3 != -1) {
                addToTeam(choice3);
            }
            else {
                addTeam(dev2);
            }

        } else if( n == 9 ) {
            execute();
            return 9;
        }
        int number = chooseEmployee(d, data.getE());
        if(number != -1 && number != data.getE().size()) {
            addEmployee(number - 1);
        }
        else
            return -1;
        return 0;
    }

    public void addEmployee(int n) {
        team.add((data.getE().get(n)));
        data.deleteE(n);
    }

    public String fillTeam(int choice) {
        String direction = "";
        if(choice == 1) return "B";
        if(choice == 2) return "F";
        if(choice == 3) return "U";

        return "";
    }


/*
    public void addBackend() {
        int n = chooseDev("B",data.getA());
        team = new Team(data.getA().get(n - 1));
        data.deleteA(n - 1);
    }

    public void addFrontend() {
        int n = chooseDev("F",data.getB());
        team = new Team(data.getB().get(n - 1));
        data.deleteB(n - 1);
    }

    public void addUIUX() {
        int n = chooseDev("U",data.getC());
        team = new Team(data.getC().get(n - 1));
        data.deleteC(n - 1);
    }

 */
    public void addTeam(Team d) {
        team.add(d);
    }

    public void addToTeam(int n) {
        dev2.add(data.getE().get(n));
        data.deleteE(n);
    }

    public void show(String s ,LinkedList<Employee> a) {
        int l = 0, k = 1;
        String direction = "";
        if(s.equals("B")) direction = "BackEnd";
        if(s.equals("F")) direction = "FrontEnd";
        if(s.equals("U")) direction = "UI/UX";
        System.out.println("All " + direction + " developpers:");
        while (a.size() > l) {
            Employee temp = a.get(l);
            if(temp.getDirection().equals(s)) {
                System.out.println(k + ". " + temp.getUname());
                k++;
                temp.work();
            }
            ++l;
        }
    }

    public String toString(Team a) {
        show("B",a.getEmployee());
        show("F",a.getEmployee());
        show("U",a.getEmployee());
        show(a.getTeam());
        return "";
    }

    private void show(LinkedList<Team> d) {
        int l = 0;
        while(d.size() > l) {
            Team temp = d.get(l);
            System.out.println("Team " + l+1 + ":");
            String s = toString(temp);
            l++;
        }
    }


    public void execute() {
        String s = toString(team);
    }
}
