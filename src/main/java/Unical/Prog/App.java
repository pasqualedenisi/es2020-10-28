package Unical.Prog;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int n = 10;
        MyMath math = new MyMath();
        LinkedList<Integer> primi = (LinkedList<Integer>)math.primeNumbersGenerator(n);
        System.out.println(primi);
    }
}
