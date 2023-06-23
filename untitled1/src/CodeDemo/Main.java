package CodeDemo;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PrintNum printing = new PrintNum();
        printing.calcu();









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


        String message = "Hello World" + "!!"; //String is a reference type, shortcut without
        //using new to instansiate
        System.out.println(message.endsWith("!!")); //message.lenght(), message.indexof("0")

        //creating an array
        int numbers[]= new int[4];
        // int numbers[] ={0,1,2,3} if we already know the elements
        //int numbers[][]= new int[2][3]; 2 rows 3 coulumns [[1,2,3], [5,6,7]]

        //adding elements in the array
        for (int i = 1; i < numbers.length; i++) {
            numbers[i]=i;


        }
        for (int i =0; i < numbers.length; i++){
            System.out.println("Numbers in arrays are:" + numbers[i]);
            //when you print array numbers only you will get an ADdress
        }
        System.out.println(Arrays.toString(numbers));




    }
}