import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String kata = in.nextLine();
        int key = in.nextInt();

        System.out.println(Kaisar(kata, key));
    }


    public static String Kaisar(String kata, int geser)
    {
        String encryptedText="";
        int length = kata.length();

        if(geser > 26)
            geser = geser % 26;

        else if(geser < 0)
            geser = (geser % 26) + 26;

        int i = 0;
        for (; i < length;i++)
        {
            char charr = kata.charAt(i);
            if (Character.isLetter(charr))
            {
                if(Character.isUpperCase(charr))
                {
                    char ch = (char)(charr + geser);
                    if(ch > 'Z')
                        encryptedText += (char)(charr - (26 - geser));

                    else
                        encryptedText += ch;
                }

                else if (Character.isLowerCase(charr))
                {
                    char ch = (char)(charr + geser);
                    if(ch > 'z')
                        encryptedText += (char)(charr - (26 - geser));

                    else
                        encryptedText += ch;
                }

            }

            else
                encryptedText += charr;

        }

        return encryptedText;
    }
}