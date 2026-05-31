import java.util.*;
//Packages Apnacollege;
public class JAVAbasics10
{
 public static void main(String  args [])
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("area of circle");
    float rad = sc.nextFloat();
    float area = 3.14f * rad * rad  ;  // why eerors occours
   //in this we have to declare that 
   // 3.14 is a floating value by using f with it 
   
   
    System.out.println(area);
 }
}