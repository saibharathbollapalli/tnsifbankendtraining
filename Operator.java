// Operators are used for Mathematical and logical operations
public class Operator {
    public static void main(String args[]) {

      //Unary operators need only one operand:(++,--)
        //if increment or decrement is not stored in any other variable
        int a=5;
        a++; //not stored in any variable so it increments furtherly
        System.out.println("a is: " +a); //6

        // if increment or decrement is stored in other variable
        int b=5;
        int c=b++; //5
        System.out.println("c is: " +c); //5

        int d=5;
        d--; 
        System.out.println("d is: "+d); //4

        int e=5;
        --e; //4
        int i=--e; //3
        System.out.println("i is: " +i); //3

        int j=5;
        int k=2;
        int l= ++j + k + j--; //(6+2+6 = 14)
        System.out.println("l is: " +l); //14

        int m=5;
        int n=2;
        int o= ++m + n++ + --m; //(6+2+5 = 13)
        System.out.println("o is: " +o); //13


     //binary operator needs 3 operand:(+,-,*,/)
        int p=5, q=5;
        int r=p+q; //10
        System.out.println("r is: " +r); //10


     //ternary operator need 3 operands:(?,:)
        int s=19;
        int t=20;
        int u= (t>s)?t:s; //if t is greater then print t else s
        System.out.println("u is: " +u);

    }

} 
