package OOPS;

public class ConstructorOverloading {


        String name ;
        int age ;
        int dob;
        String fatherName;

        public static void main(String[] args) {

            ConstructorOverloading hello = new ConstructorOverloading( "naren",22,25/06/1999,"devaraj");
            hello.printf();
        }

        public ConstructorOverloading(String name, int age, int dob) {
            this.name = name;
            this.age = age;
            this.dob = dob;
        }

        public ConstructorOverloading(String name, int age, int dob, String fatherName) {
            this.name = name;
            this.age = age;
            this.dob = dob;
            this.fatherName = fatherName;
        }

        void printf(){
            System.out.println("Name: " +  name + "\n" + "Fathers name: " + fatherName + "\n" + "Age: " + age + "\n" + "DOB: "  + dob  );
        }

    }

