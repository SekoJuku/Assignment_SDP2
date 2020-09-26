package members;

import members.Worker;

public class Employee implements Worker {
    private String uname;
    private int workExp;
    private String direction;

    public Employee(String uname,int workExp, String direction) {
        setUname(uname);
        setWorkExp(workExp);
        setDirection(direction);
    }

    private void setDirection(String direction) { this.direction = direction; }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public int getWorkExp() {
        return workExp;
    }
    public String getUname() {
        return uname;
    }
    public String getDirection() { return direction; }

    @Override
    public void work() {
        System.out.println("I'm working!");
    }
    @Override
    public void rest() {
        System.out.println("I'm sleeping!");
    }
}
