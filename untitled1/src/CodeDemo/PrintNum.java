
package CodeDemo;


public class PrintNum {
    public void calcu() {
        //Sum of numbers
        double i = 100;
        double sumNum = i * (i + 1) / 2;
        System.out.println("Numbers from another class: " + sumNum);

        int x = 1;
        int y = x++; //post fix, Y=1 and x=2
        x += 2;

        int z = 1;
        int k = ++z; //prefix z=2 and y=2

    }
}
