package members.team;

import members.Employee;

public class Frontend extends Employee {


    public Frontend(String uname, int workExp) {
        super(uname, workExp);
    }

    @Override
    public void work() {
        System.out.println("Site is working!");
    }
    @Override
    public void rest() {
        System.out.println("Zzz...\n");
    }
}
