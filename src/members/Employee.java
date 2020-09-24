package members;

import members.Worker;

public class Employee implements Worker {
    private String uname;
    private int workExp;

    public Employee(String uname,int workExp) {
        setUname(uname);
        setWorkExp(workExp);
    }

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

    @Override
    public void work() {
        System.out.println("I'm working!");
    }
    @Override
    public void rest() {
        System.out.println("I'm sleeping!");
    }
}
