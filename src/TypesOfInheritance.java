interface ProjectManager {
    void manageProject();
}

interface TeamLead {
    void leadTeam();
}

class Employee {
    protected String name;
    protected int id;
    protected double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + id + " " + salary);
    }
}

interface SalesManager {

    void boostSales();

}

class MarketingManager extends Employee {

    MarketingManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    void createMarketingStrategy() {
        System.out.println(name + " created a marketing strategy.");
    }
}

class BusinessDevelopmentManager extends MarketingManager
        implements SalesManager {

    BusinessDevelopmentManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void boostSales() {
        System.out.println(name + " is boosting sales.");
    }

    void createBusinessDeal() {
        System.out.println(name + " created a business deal.");
    }
}

class Executive extends Employee {
    Executive(String name, int id, double salary) {
        super(name, id, salary);
    }

    void executiveDecision() {
        System.out.println("Executive Decision Taken");
    }
}

class CEO extends Executive {
    CEO(String name, int id, double salary) {
        super(name, id, salary);
    }

    void leadCompany() {
        System.out.println("Leading Company");
    }
}

class Developer extends Employee {
    Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    void writeCode() {
        System.out.println("Writing Code");
    }
}

class HRManager extends Employee {
    HRManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    void recruit() {
        System.out.println("Recruiting Employees");
    }
}

class HRDirector extends HRManager {
    HRDirector(String name, int id, double salary) {
        super(name, id, salary);
    }

    void manageHR() {
        System.out.println("Managing HR Department");
    }
}

class TechLead extends Employee implements ProjectManager, TeamLead {

    TechLead(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void manageProject() {
        System.out.println("Managing Project");
    }

    public void leadTeam() {
        System.out.println("Leading Team");
    }
}

public class TypesOfInheritance {

    public static void main(String[] args) {


        BusinessDevelopmentManager bdm =
                new BusinessDevelopmentManager("Rohit", 101, 60000);

        bdm.display();
        bdm.createMarketingStrategy();
        bdm.boostSales();
        bdm.createBusinessDeal();

        CEO ceo = new CEO("Raj", 103, 200000);
        ceo.display();
        ceo.executiveDecision();
        ceo.leadCompany();

        Developer dev = new Developer("Priya", 104, 70000);
        dev.display();
        dev.writeCode();

        HRDirector hr = new HRDirector("Neha", 105, 90000);
        hr.display();
        hr.recruit();
        hr.manageHR();

        TechLead tl = new TechLead("Vikas", 106, 95000);
        tl.display();
        tl.manageProject();
        tl.leadTeam();
    }
}