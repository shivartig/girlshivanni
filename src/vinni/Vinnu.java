package vinni;

public class Vinnu {

    public String hello(String name) {
        String message = ("welcome to java " + name);
        return message;

    }

    public int makingsquare(int number) {
        int square = number * number;
        return square;

    }

    public String eligibilities(double marks) {
        if (marks > 75.5) {
            return "take science";
        } else {
            return "not taken scince";
        }
    }

        public static void main(String[]args){
            Vinnu obj = new Vinnu();
            String result = obj.hello("aaaaaaa");
            System.out.println("Printing in main method..." +result);
            int output = obj.makingsquare(5);
            System.out.println("printing in main square" +output);
            String percentage = obj.eligibilities(65.5);
            System.out.println("output is ......" +percentage);
        }
    }



