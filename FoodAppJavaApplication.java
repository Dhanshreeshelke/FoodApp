import java.util.*;

public class JavaApplication25 {

    public static void main(String[] args) {
        
        System.out.println("Hello, Welcome to the food app ");
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please create a password");
        String pass=sc.nextLine();
        System.out.println("Your password is now "+pass);
        
        
        System.out.println("Please enter your password");
        String password=sc.nextLine();
        
        while(!password.equals(pass))
        {
            System.out.println("This is not the right password, try again");
            password=sc.nextLine();
            
        }
        {
        System.out.println("Access granted");
        
        }
        
        System.out.println("Are you hungry Yes or No");
        String ans1=sc.nextLine();
        
        if(ans1.equals("Yes"))
        {
            System.out.println("Great, What you would like to have between pizza burger and fish");
            String ans2=sc.nextLine();
            
            while(!ans2.equals("pizza")&& !ans2.equals("burger")&& !ans2.equals("fish"))
            {
                System.out.println("Sorry, we don't have it please choose between pizza burger or fish");
                ans2=sc.nextLine();
            }
            if(ans2.equals("pizza")|| ans2.equals("burger")|| ans2.equals("fish"))
            {
                System.out.println("ok , would you like to have some drink with it Yes or No");
                String ans3=sc.nextLine();
                
                while(!ans3.equals("Yes")&& !ans3.equals("No"))
                {
                    System.out.println("Invalid input, please try again");
                    ans3=sc.nextLine();
                }
                if(ans3.equals("Yes"))
                {
                    System.out.println("Which drink you would like to have coke or juice ");
                    String ans4=sc.nextLine();
                    
                   while(!ans4.equals("coke")&& !ans4.equals("juice"))
                {
                    System.out.println("Sorry, we don't have it ask anything between coke or juice ");
                    ans4=sc.nextLine();
                } 
                   if(ans4.equals("coke")|| ans4.equals("juice"))
                   {
                       System.out.println("Great! You have ordered "+ans2+" & "+ans4);
                   }
                   
                   System.out.println("Please confirm your password");
                   password=sc.nextLine();
                   
                   while(!password.equals(pass))
        {
                  System.out.println("This is not the right password, try again");
                  password=sc.nextLine();
            
        }
                   
                }
                else
                {
                    System.out.println("You have ordered "+ans2);
                
                 System.out.println("Please confirm your password");
                   password=sc.nextLine();
                   
                   while(!password.equals(pass))
        {
                  System.out.println("This is not the right password, try again");
                  password=sc.nextLine();
            
        }
                }
                   System.out.println("Allright your order is on its way!");
               }
        }
               else
        {
                   System.out.println("Allright, have a good day ");
        }
    
}
}
