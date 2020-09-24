package structure;

import members.team.Backend;
import members.team.Frontend;
import members.team.UIUX;

import java.util.LinkedList;

public class Team {
    LinkedList<Backend> a = new LinkedList<>();
    LinkedList<Frontend> b = new LinkedList<>();
    LinkedList<UIUX> c = new LinkedList<>();
    LinkedList<Team> d = new LinkedList<>();
    Backend dev1 = null;
    Frontend dev2 = null;
    UIUX dev3 = null;
    Team dev4 = null;

    public Team(Backend a) {
        setBackend(a);
    }
    public Team(Frontend b) {
        setFrontend(b);
    }
    public Team(UIUX c) {
        setUIUX(c);
    }
    public Team(Team d) {

    }



    public void setBackend(Backend a) {
        this.a.add(a);
    }
    public void setFrontend(Frontend b) {
        this.b.add(b);
    }
    public void setUIUX(UIUX c) {
        this.c.add(c);
    }


    public LinkedList<Backend> getBackend() {
        return a;
    }
    public LinkedList<Frontend> getFrontend() {
        return b;
    }
    public LinkedList<UIUX> getUIUX() {
        return c;
    }
}
