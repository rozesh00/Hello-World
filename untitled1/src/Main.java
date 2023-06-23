import java.awt.*;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {




        int age = 30;
        System.out.println(age);

        Date now = new Date();
        System.out.println(now);

        //primitive and reference type
        byte x= 1;
        byte y=x;
        x=4;
        //in this example y and x are in different memory location so chaning value of one variable
        //impact other
        System.out.println("the value of y:"+ y);

        //however when we are using reference, the two variables points to the same reference,
        //so updating the value does change to both

        Point point1= new Point(1, 1);
        Point point2 = point1;
        point1.x=22;
        System.out.println(point2);





        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}