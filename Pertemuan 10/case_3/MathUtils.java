package case_3;
// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException{
        int fac = 1;
        if (n < 0) {
            throw new IllegalArgumentException("The number is less than 0.");
        } else if (n > 16) {
            throw new IllegalArgumentException("The number is more than 16.");
        }
        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}    