import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String selde = "";
        String n = in.nextLine();
        int length = n.length();

        inputKan(n,length);
    }

    public static int inputKan(String a, int b) {
        int i = b - 1;
        String selde = "";
        for (; i >= 0; i--)
            selde = selde + a.charAt(i);
        if (a.equals(selde))
            System.out.print(a + " adalah selde.");
        else
            System.out.print(a + " bukan selde.");

        return i;
    }

}