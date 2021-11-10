package OOPS;

public class oopsByMethod {

    static int id ;
    static String name;
    static double salary;


    public static void main(String[] args) {

        oopsByMethod ob = new oopsByMethod();
        ob.get(10,"naren",1000000.00);
        ob.printf();
    }

    public static void get (int i,String s,double d){

        id = i;
        name = s;
        salary = d ;
    }
    public static void printf(){
        System.out.println(id + "\n");
        System.out.println(name + "\n");
        System.out.println(salary);
    }
}
