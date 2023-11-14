package question5;

public class Executive extends Manager{
    private int executive_number;

    public Executive(String name, double salary, String department, int executive_number) {
        super(name, salary, department);
        this.executive_number = executive_number;
    }
    
}
