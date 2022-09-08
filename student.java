import java.util.Scanner;
class Main{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Input the asked details***");
        System.out.println("Enter Roll Number:");
        String studentid = sc.next(); 
        
        System.out.println("Enter Name:");
        String sname = sc.next();
        System.out.println("Enter Your Attendance:");
        String attendance = sc.next();
       
        System.out.println("***Displaying Student Details***");
        
        
        System.out.println("Name:"+sname);
        System.out.println("Student Id:"+studentid);
        System.out.println("Attendance:"+attendance);
     }
   }