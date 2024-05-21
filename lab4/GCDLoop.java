package lab4;

public class GCDLoop {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int greater = number1 > number2 ? number1:number2;
        int smaller = number1 < number2 ? number1:number2;
        int remainder;
        do{
            System.out.println("Greater = " + greater );
            System.out.println("Smaller = " + smaller);

            remainder = greater % smaller;
            System.out.println("Remainder " + remainder);
            greater = smaller;
            smaller = remainder;
        } while(remainder != 0);
        System.out.println("GCD " + greater);
    }
}


