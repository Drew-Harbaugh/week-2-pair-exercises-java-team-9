package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    private static List<Department> departments = new ArrayList<Department>();
    public static List<Employee> employees = new ArrayList<Employee>();

    public static Map<String, Project> projects = new HashMap<>();








    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();

    }

    /**
     * Create departments and add them to the collection of departments
     */
    private static void createDepartments() {
        Department marketing = new Department(001, "Marketing");
        departments.add(marketing);
        Department sales = new Department(002, "Sales");
        departments.add(sales);
        Department engineering = new Department(003,"Engineering");
        departments.add(engineering);

    }


    /**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");

        for(int i = 0; i < departments.size(); i++){
            System.out.println(departments.get(i).getName());
        }
        //public List toString(){
            //return departments;


    }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
        Employee emp1 = new Employee();
        emp1.setFirstName("Dean");
        emp1.setLastName("Johnson");
        emp1.setEmail("djohnson@teams.com");
        emp1.setSalary(60000.0);
        emp1.setDepartment(departments.get(2));
        emp1.setHireDate("08/21/2020");
        employees.add(emp1);
        Employee emp2 = new Employee(002,"Angie", "Smith", "asmith@teams.com",66000, departments.get(2) , "08/21/2020" );
        employees.add(emp2);
        Employee emp3 = new Employee(003,"Margaret", "Thompson", "mthompson@teams.com", 60000.0, departments.get(0),"08/21/2020");
        employees.add(emp3);
    }

    /**
     * Print out each employee in the collection.
     */
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).getFullName()+ " ("+ employees.get(i).getSalary() +") " + employees.get(i).getDepartment().getName());
        }

    }

    /**
     * Create the 'TEams' project.
     */
    private static void createTeamsProject() {
        Project pro1 = new Project("TEams", "Project Management Software", "10/10/2020", "11/10/2020");
        projects.put(employees, employees.get().getDepartment(2));
        projects.put("TEams", pro1);




    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {
        Project pro2 = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
        ;

    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
