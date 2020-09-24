package facade;

import data.Data;
import members.team.Backend;
import members.team.Frontend;
import members.team.UIUX;

import java.util.LinkedList;
import java.util.Scanner;

public class BuilderHelper {
    Scanner sc = new Scanner(System.in);
    Data data = new Data();

    public int chooseMain() {
        System.out.println("Who you want to choose:" +
                "1. Backend Developper" +
                "2. Frontend Developper" +
                "3. UI/UX Developper" +
                "4. Team(Choosing is option)" +
                "9. Exit");
        return end();
    }

    public int chooseDev(String option, LinkedList a) {
        int n = 0;
        if( option.equals("B")) n = chooseBack(a);
        else if( option.equals("F")) n = chooseFront(a);
        else if( option.equals("U")) n = chooseUIUX(a);

        System.out.println(n + ". Exit");
        return end();
    }

    public int chooseBack(LinkedList<Backend> a) {
        int l = 1;
        System.out.println("");
        while (a.listIterator().hasNext()) {
            System.out.println( l + ". " + a.listIterator().next().getUname() );
        }
        return l;
    }
    public int chooseFront(LinkedList<Frontend> b) {
        int l = 1;
        System.out.println("");
        while (b.listIterator().hasNext()) {
            System.out.println( l + ". " + b.listIterator().next().getUname() );
        }
        return l;
    }
    public int chooseUIUX(LinkedList<UIUX> c) {
        int l = 1;
        System.out.println("");
        while (c.listIterator().hasNext()) {
            System.out.println( l + ". " + c.listIterator().next().getUname() );
        }
        return l;
    }

    private int end() {
        return sc.nextInt();
    }
}
