package data;

import members.team.Backend;
import members.team.Frontend;
import members.team.UIUX;

import java.util.LinkedList;

public class Data {
    LinkedList<Backend> a1 = new LinkedList<>();
    LinkedList<Frontend> b1 = new LinkedList<>();
    LinkedList<UIUX> c1 = new LinkedList<>();


    LinkedList<Backend> a = new LinkedList<>();
    LinkedList<Frontend> b = new LinkedList<>();
    LinkedList<UIUX> c = new LinkedList<>();

    public Data() {
        a1.add(new Backend("Seko",2));
        a1.add(new Backend("z1z",50));
        a1.add(new Backend("Ibra",100));

        b1.add(new Frontend("Adilkhan",3));
        b1.add(new Frontend("Ulan",5));
        b1.add(new Frontend("Berik",10));

        c1.add(new UIUX("Rakhat",1));
        c1.add(new UIUX("Ayan",4));
        c1.add(new UIUX("Akan",9));

        a = a1;
        b = b1;
        c = c1;
    }


}
