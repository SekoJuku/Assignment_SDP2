package members.team;

import members.Employee;

public class Backend extends Employee {


    public Backend(String uname, int workExp) {
        super(uname, workExp);
    }

    @Override
    public void work() {
        System.out.println("Database is working!\n");
    }
    @Override
    public void rest() {
        System.out.println("Sleeping!\n");
    }
}
