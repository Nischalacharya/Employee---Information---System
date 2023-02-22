public class EmployeeInfo {
    private String userId;
    private String firstName;
    private String lastName;
    private String occupation;
    private int monthlySalary;

    public EmployeeInfo(String userId, String firstName,
            String lastName, String occupation,
            int monthlySalary) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.monthlySalary = monthlySalary;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

}
