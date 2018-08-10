public class Lesson3 {
    public static void main(String args[]){
        //a = a+1;
        //a +=1;
        int a = 1;
        a++; // Incrementing a number (adding 1 to a number)
        //a = 2
        int b = 10;
        a += b/(4+1);
        //Division if there would be a decimal it gets dropped.
        //Order of operations same as math:  P(arenthesis), E exponents, m/d (multiplication an division), a/s (add / subtract)
        // m/d a/s -- left to right.  12/3*2; // This is correct (left to right)  12/3 = 4 * 2 = 8  -- This is not how math happens - 12/6 = 2;

        System.out.println(a);

        String hello = "Hello ";
        //hello = hello + "World";
        hello += "World";

        System.out.println(hello);
        //Variable or value in between parenthesis is called an "argument"
        //Argument tells a method what to use
        //Method is a stored set of a procedures.

    }
}
