package Inheritance;

    class phone {


        void phone1() {

            System.out.println("switch on ");

        }
    }

        class type extends phone {

            void phoneType() {
                System.out.println("keypad, android ");


            }
        }

        class keypadType extends type {

            void keypad() {

                System.out.println("buttons with short screen");
            }

        }

        class Android extends keypadType {

            void AndroidType() {
                System.out.println("Screen with touch");
            }

        }

        class Oreo extends Android {

            void Version() {

                System.out.println("Oreo");
            }


        }