import java.util.*;
public class JAVAbasics12
{
    public static void main(String args[]) // type conversion in java 
    {
        Scanner sc = new Scanner(System.in);
       // int number = sc.nextFloat();    
       // as we use this we got error because 
       //      we cannot use float value in INT variable

       // but we can use
       float number = sc.nextInt(); 
        System.out.println(number);
    }
}


// out put 
// if we pass 16 it will make it 16.0