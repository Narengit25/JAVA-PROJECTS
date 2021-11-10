package OOPS;

public class oopsByConstructor {
    String name ;
    String fatherName;
    int Dob;

    public static void main(String[] args) {

        oopsByConstructor ob = new oopsByConstructor("Naren","devaraj",25/06/1999);
        ob.show();


    }

    oopsByConstructor(String n, String fN, int d) {
        this.name = n;
        this.fatherName = fN;
        Dob = d;

    }
    void show(){
        System.out.println("Name : " + name + "\nFathers name : " + fatherName + "\nDOB : " + Dob );
    }

}
