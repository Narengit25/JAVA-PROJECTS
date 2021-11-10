package OOPS;

public class objectInitialisation {

    int rollNo;
    String name;
//    3 ways byReference,byMethod,byConstructor

//    1.byReference
    public static void main(String[] args) {


        objectInitialisation ob = new objectInitialisation();

        ob.rollNo = 100;
        ob.name = "Naren";

        System.out.println(ob.rollNo+" "+ob.name);
    }


}
