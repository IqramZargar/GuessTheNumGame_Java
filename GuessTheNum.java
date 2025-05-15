import java.util.Scanner; 
 
public class GuessTheNum { 
   public static void main(String[] args) { 
        
       Scanner sc = new Scanner(System.in); 
       int random_num = (int)(Math.random()*100); 
       int guess_num = 0; 
 
       do { 
           System.out.println("Guess my number(1-100) : "); 
           guess_num = sc.nextInt(); 
 
           if(guess_num == random_num) { 
               System.out.println("WOOHOO .. CORRECT NUMBER!!!"); 
               break; 
           } 
           else if(guess_num > random_num) { 
               System.out.println("your number is too large"); 
           } 
           else { 
               System.out.println("your number is too small"); 
           } 
       } while(guess_num >= 0); 
 
       System.out.print("My number was : "); 
       System.out.println(random_num);
    }
}           