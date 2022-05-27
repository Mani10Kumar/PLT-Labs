import java.io.*;
  import java.util.*;
public class P16lab {
    public static void main(String[] args)
    {
        int x = 3, n = 3;
        int result = 1;
        // running loop while the power > 0
        while (n != 0) {
            result = result * x;
            // power will get reduced after
            // each multiplication
            n--;
        }
        System.out.println("Result =  " + result);
    }
}// x power n eg 2 power 3=8 