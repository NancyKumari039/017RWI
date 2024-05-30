public class overloading {

        // Method to add two integers
        public int add(int a, int b) {
            return a + b;
        }

        // Overloaded method to add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Overloaded method to add two double values
        public double add(double a, double b) {
            return a + b;
        }

        public static void main(String[] args) {
            overloading calc = new overloading();

            // Calling the method with two int parameters
            int sum1 = calc.add(5, 10);
            System.out.println("Sum of 5 and 10 is: " + sum1);

            // Calling the method with three int parameters
            int sum2 = calc.add(5, 10, 15);
            System.out.println("Sum of 5, 10, and 15 is: " + sum2);

            // Calling the method with two double parameters
            double sum3 = calc.add(5.5, 10.5);
            System.out.println("Sum of 5.5 and 10.5 is: " + sum3);
        }
    }


