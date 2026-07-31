import java.util.Scanner;
public class Calculator{
       public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("a:");
       int a=sc.nextInt();
       System.out.println("b:");
       int b=sc.nextInt();
       System.out.println(" give one input for this operation \n:1 addition :2substraction :3multiplication :4 division");
       int c=sc.nextInt();
       if(c==1){
        System.out.println(a+b);
       }
       else if(c==2){
        System.out.println(a-b);

       }
       else if(c==3){
        System.out.println(a*b);
       }
       else if(c==4){
        System.out.println(a/b);
       }
       else{
        System.out.println("invalid state");
       }

       }
    }
      
    
