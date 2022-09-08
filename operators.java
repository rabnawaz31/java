import java.util.*;

 // Compiler version JDK 11.0.2

 class Operator 
 {
   public static void main(String args[])
   { 
    int a=10,b=20;
    System.out.println("# Arthmetic Operators : +,-,*,/,%");
       System.out.println("A+B = "+(a+b));
    System.out.println("A-B = "+(a-b));
    System.out.println("A*B = "+(a*b));
    System.out.println("B/A = "+(b/a));
    System.out.println("B%A = "+(b%a));
    
    System.out.println("# Assignment Operator : =");
    
    int c=5 , d=8,e;
     e=c+b;
    System.out.println("C=D = "+(c=d));
    System.out.println("C+D= "+e);
    
    System.out.println("# Multiple Assignment Operator : +=,-=,*=,/=,%=");

    a*=10;
    b/=10;
    c+=5;
    d-=10;
    e%=10;
    System.out.println("a*=10; : "+a);
    System.out.println("b/=10; : "+b);
    System.out.println("c+=5; : "+c);
    System.out.println("d-=10; : "+d);
    System.out.println("e%=10; : "+e);
    
    System.out.println("# Logical Operator : &&,||,!");

       System.out.println("Value of C : "+c);//25;
    System.out.println("Value of D : "+d);//5;
    System.out.println("Value of E : "+e);//0;
    System.out.println("(C>D)&&(D<C)&&(E!=C) : "+((c>d)&&(d<=c)&&(e!=c)));
    System.out.println("(C==D)&&(D<C)&&(E<C) : "+((c==d)&&(d<c)&&(e<c)));
    System.out.println("(C>D)||(D==C)||(E!=C) : "+((c>d)||(d==c)||(e!=c)));
    System.out.println("(C==D)||(D>C)||(E>C) : "+((c==d)||(d>c)||(e>c)));
    System.out.println("!(E>C) : "+(!(e>c)));
    System.out.println("!(D>E) : "+(!(d>e)));

    System.out.println("# Unary Operator : ++, --");
     int x,y,z;
     x=5;
     y=++x;
     z=--x + ++y;
    System.out.println("x= "+x);
    System.out.println("y= "+y);
    System.out.println("z= "+z);
    
    System.out.println("# Ternary Operator : ? , : ");
    int m1, m2, m3;
    String result;
    m1=50;
    m2=40;
    m3=90;
    result=(m1>=35 && m2>=40 && m3>=40)?"Passed":"Failed";
    System.out.println(result);
    
    System.out.println("# Bitwise Operator : &,|,^,<<,>>,~");
    int a1,b1,c1;
    a1=5;
    b1=7;
    c1=9;
    System.out.println("The value of A : "+a1+" The value of B : "+b1+" The value of C : "+c1);
    
    System.out.println("Operation of Bitwise AND Operator A & B & C : "+(a1&b1&c1));
    System.out.println("Operation of Bitwise OR Operator A | B | C : "+(a1|b1|c1));
    System.out.println("Operation of Bitwise XOR Operator A ^ B ^ C : "+(a1^b1^c1));
    System.out.println("Operation of Bitwise and Right Shift (3) Operator A >> : "+(a1>>3));
    System.out.println("Operation of Bitwise and Left Shift (3) Operator A << : "+(a1<<3));
    
    
   }
 }
