
public class Warmup {

    public static void main(String[] args) {

        // Explicit casting: double to int
        int a = (int) 7.9;

        // Implicit casting: int to double
        int x = 5;
        double d = x;

        // Explicit casting: int to byte
        int n = 130;
        byte b = (byte) n;

        System.out.println(a + " " + d + " " + b);

        // Switch statement without break
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");
        }
    }
}
