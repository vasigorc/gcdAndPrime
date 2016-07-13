/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.vgorcinschi.classseven_two.math;

import java.util.Scanner;
import java.util.stream.IntStream;
import static src.main.java.com.vgorcinschi.classseven_two.util.NumberFormatter.validateDoubleValue;

/**
 *
 * @author v_gorcin
 */
public class MathematicOps {

    Scanner sc = new Scanner(System.in);

    public MathematicOps() {
    }

    public void runGCD(){
         int first = validateDoubleValue(() -> "first number", 2, sc).intValue();
         int second = validateDoubleValue(() -> "second number", 2, sc).intValue();
         System.out.println("The greatest GCD for these numbers is "+gcd(first, second));
    }
    
    public void runPrimes(){
        int number = validateDoubleValue(()-> "number of primes that you wish to "
                + "display", 2, sc).intValue();
        int count=0;
        for (int i = 2; count<number; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
                count++;
            }
            if (count%10==0) {
                System.out.println("");
            }
        }
    }
    
    public int gcd(int x, int y) {
        while (y != 0) {
            x = x % y;
            int intermediary = y;
            y = x;
            x = intermediary;
        }
        return x;
    }
    
    public boolean isPrime(int candidate){
        return IntStream.range(2, candidate).noneMatch(i -> candidate%i==0);
    }
}
