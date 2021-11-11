package OOPS;

public class commonStatic {

    String projectName;
    static String School = "Oxford International School";
    static int totalAmount = 2000;
    int totalDuration ;
    int dateOfSubmission;
    
    public static void main(String[] args) {
        commonStatic cs = new commonStatic("Prosper",1600, 20 );
        cs .show();
    }

    public commonStatic(String projectName, int totalDuration) {
        this.projectName = projectName;
        this.totalDuration = totalDuration;
    }

    public commonStatic(String projectName, int totalDuration, int dateFromTo) {
        this(projectName, totalDuration);
        this.dateOfSubmission = dateFromTo;
    }
    void show(){
        System.out.println("Project: " +
                projectName + "\n" + "School: "
                + School + "\n" + "TotalBudget: " +
                totalAmount + "\n" + "TotalDuration: " +
                totalDuration + "\n" + "DateOfSubmission: "
                + dateOfSubmission);
    }

}
