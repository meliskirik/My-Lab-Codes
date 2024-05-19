package lab2;
public class FindMinimum {
    public static void main(String[] args) {

            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            int the_minimum = number1 < number2 ? number1 : number2;
            System.out.println("the min is: " + the_minimum);
        }

    }
