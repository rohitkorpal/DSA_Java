/**
 * Demonstrates different types of inheritance in Java using a simple company hierarchy.
 * Includes interfaces and classes for various managerial and employee roles.
 */
package Inheritance;

/**
 * Role indicating an employee can manage projects.
 */
interface ProjectManager {
    /** Manage the project tasks and deliverables. */
    void manageProject();
}

/**
 * Role indicating an employee can lead a team.
 */
interface TeamLead {
    /** Lead and mentor a development team. */
    void leadTeam();
}

/**
 * Base class representing an employee with common attributes.
 */
class Employee {
    /** Employee name. */
    protected String name;
    /** Employee unique identifier. */
    protected int id;
    /** Employee salary in yearly terms. */
    protected double salary;

    /**
     * Constructs an Employee with the given details.
     *
     * @param name   employee name
     * @param id     employee id
     * @param salary employee salary
     */
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /** Print employee details (name, id, salary) to standard output. */
    void display() {
        System.out.println(name + " " + id + " " + salary);
    }
}

/**
 * Role for employees responsible for boosting sales.
 */
interface SalesManager {

    /** Increase sales by implementing sales strategies. */
    void boostSales();

}

/**
 * Marketing manager extends Employee with marketing-specific behavior.
 */
class MarketingManager extends Employee {

    MarketingManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    void createMarketingStrategy() {
        System.out.println(name + " created a marketing strategy.");
    }
}

/**
 * BusinessDevelopmentManager combines marketing and sales responsibilities.
 */
class BusinessDevelopmentManager extends MarketingManager
        implements SalesManager {

    BusinessDevelopmentManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    /** Increase sales through business development activities. */
    @Override
    public void boostSales() {
        System.out.println(name + " is boosting sales.");
    }

    void createBusinessDeal() {
        System.out.println(name + " created a business deal.");
    }
}

/**
 * Executive role with higher-level decision making.
 */
class Executive extends Employee {
    Executive(String name, int id, double salary) {
        super(name, id, salary);
    }

    void executiveDecision() {
        System.out.println("Inheritance.Executive Decision Taken");
    }
}

/**
 * Chief Executive Officer — top-level executive who leads the company.
 */
class CEO extends Executive {
    CEO(String name, int id, double salary) {
        super(name, id, salary);
    }

    void leadCompany() {
        System.out.println("Leading Company");
    }
}

/**
 * Developer role responsible for writing code.
 */
class Developer extends Employee {
    Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    void writeCode() {
        System.out.println("Writing Code");
    }
}

/**
 * HR manager handles recruitment and employee relations.
 */
class HRManager extends Employee {
    HRManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    void recruit() {
        System.out.println("Recruiting Employees");
    }
}

/**
 * HR Director with additional HR management responsibilities.
 */
class HRDirector extends HRManager {
    HRDirector(String name, int id, double salary) {
        super(name, id, salary);
    }

    void manageHR() {
        System.out.println("Managing HR Department");
    }
}

/**
 * TechLead who manages projects and leads teams — demonstrates multiple interface implementation.
 */
class TechLead extends Employee implements ProjectManager, TeamLead {

    TechLead(String name, int id, double salary) {
        super(name, id, salary);
    }

    /** Manage the project from planning through delivery. */
    public void manageProject() {
        System.out.println("Managing Project");
    }

    /** Lead and mentor the team to deliver quality software. */
    public void leadTeam() {
        System.out.println("Leading Team");
    }
}

/**
 * Entry point demonstrating various inheritance types: single, multilevel, and interface implementation.
 */
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