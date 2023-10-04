import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner läsre = new Scanner (System.in);

        int tal1 = 5;
        int tal2 = 7;
        System.out.println("tal1:" + tal2);
        System.out.println("tal2=" + tal2);

        tal1++;
        tal2--;

        System.out.println("tal1" + tal2);
        System.out.println("tal2="+ tal2);

        int tal3 = 2;
        int tal4 = 2;
        
        tal3/= 2;
        tal4*= 2;

        System.out.println(tal3);
        System.out.println(tal4);



        int tal5 = 2;
        System.out.println(tal5==3);
        System.out.println(tal5==2);

        String hej = "hej";
        System.out.println(hej.equals("HEJ"));
        System.out.println(hej.equalsIgnoreCase("HEJ"));

        int tjugo = 20;
    }
}
