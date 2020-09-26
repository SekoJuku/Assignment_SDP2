package facade;

import data.Data;
import members.Employee;

import java.util.LinkedList;
import java.util.Scanner;

public class BuilderHelper {
    Scanner sc = new Scanner(System.in);

    public int chooseMain() {
        System.out.println("Who you want to choose:\n" +
                "1. Backend Developper\n" +
                "2. Frontend Developper\n" +
                "3. UI/UX Developper\n" +
                "4. Team(Choosing is option)\n" +
                "9. Exit\n");
        return end();
    }



/*
    public int chooseDev(String option, LinkedList<Employee> a) {
        int n = 0;
        if( option.equals("B")) n = chooseEmployee(a);
        else if( option.equals("F")) n = chooseEmployee(a);
        else if( option.equals("U")) n = chooseEmployee(a);
        return end();
    }
 */

    public int chooseEmployee(String s,LinkedList<Employee> a) {
        int l = 0;
        LinkedList<Integer> option = new LinkedList<Integer>();
        String direction = "";
        if(s.equals("B")) direction = "BackEnd";
        if(s.equals("F")) direction = "FrontEnd";
        if(s.equals("U")) direction = "UI/UX";
        while (a.size() > l) {
            Employee temp = a.get(l);
            if(temp.getDirection().equals(s)) {
                option.add(l);
                System.out.println(l+1 + ". " + temp.getUname());
            }
            ++l;
        }
        System.out.println(l + ". Exit");
        option.add(l);
        int number = end();
        if(option.contains(number - 1))
            return number;
        else
            return -1;
    }

    private int end() {
        return sc.nextInt();
    }
}
