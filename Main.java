import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<EmployeeInfo> employees = new ArrayList<EmployeeInfo>();
        EmployeeInfo emp1 = new EmployeeInfo("01", "Marcus", "Rahsford", "Athelete", 250000);
        EmployeeInfo emp2 = new EmployeeInfo("02", "Mukesh", "Ambani", "Business Man", 500000);
        EmployeeInfo emp3 = new EmployeeInfo("03", "Elon", " Musk", "Software Engineer", 75000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Welcome To The Wolf Of Wall Street");
        System.out.println("Choose the option that you want to proceed with ?");
        System.out.println("1. Do you want to see the employee information ?");
        System.out.println("2. Do you want to see the occupation list ?");
        System.out.println("3. Do you want the name of our staffs ?");
        System.out.println("4. Quit the program!");

        while (true) {
            Scanner input = new Scanner((System.in));
            System.out.print("\n\nEnter a option from 1-4: ");
            int option = input.nextInt();
            if (option == 1) {
                displayEmployeeInformation(employees);
            }
            if (option == 2) {
                displayOccupationList(employees);
            }
            if (option == 3) {
                displayStaffName(employees);
            }
            if (option == 4) {
                break;
            }

        }
    }

    public static void displayEmployeeInformation(ArrayList<EmployeeInfo> employees) {
        for (EmployeeInfo emp : employees) {
            System.out.println(emp.getUserId() + " " + emp.getFirstName() + " " +
                    emp.getLastName() + " " + emp.getOccupation() + " " +
                    emp.getMonthlySalary());
        }
    }

    public static void displayOccupationList(ArrayList<EmployeeInfo> employees) {
        for (EmployeeInfo emp : employees) {
            System.out.println(emp.getOccupation());
        }
    }

    public static void displayStaffName(ArrayList<EmployeeInfo> employees) {
        for (EmployeeInfo emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName());
        }
    }
}