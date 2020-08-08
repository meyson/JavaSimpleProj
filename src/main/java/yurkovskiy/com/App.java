package yurkovskiy.com;

import yurkovskiy.com.shapes.base.Circle;
import yurkovskiy.com.shapes.base.Rectangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println("Playing with geometry");

        Rectangle R = new Rectangle(1000.0, 1000.0);
        System.out.println("The length of Rectangle is: "+ R.length());
        System.out.println("The square of Rectangle is: "+ R.square());

        Circle C = new Circle(1000.0);
        System.out.println("The length of Circle is: "+ C.length());
        System.out.println("The square of Circle is: "+ C.square());


    }
}
