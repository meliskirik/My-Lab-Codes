package lab2;

public class grade {

    public static void main(String[] args) {

        int grade  = Integer.parseInt(args[0]);

        if (90<= grade && grade <= 100) {
            System.out.println("AA");
        }
        else if (80 <= grade && grade < 90) {
            System.out.println("BB");
        }
        else if (70 <= grade && grade < 80) {
            System.out.println("CC");
        }
        else if (60 <= grade && grade < 70) {
            System.out.println("DD");
        }else {
            System.out.println("FF");
        }
    }

}

