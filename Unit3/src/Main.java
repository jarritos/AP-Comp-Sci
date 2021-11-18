//Step 1: import the scanner
import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
    //Step 2: Make the Scanner
    Scanner scanny = new Scanner(System.in); 

    //this scanner has abilites! It can read
    //lines of text, single words, read numbers...
    //and we can store those. 

    //Step 3: Let's ask a question: 
    System.out.print("How is your day? "); 
    String answer = scanny.nextLine(); 
    //              this returns a String!!
    
    System.out.println("You just answered " + answer); 


    //WATCH OUT!!!! When you grab numbers...
    //Weird things can happen. 

    System.out.print("How old are you?"); 
    int age = scanny.nextInt(); 
    //you type '36 ENTER'
    //scanny grabs... the 36 ONLY!! The ENTER is still there
    // we can "consume" the ENTER like this: 
    scanny.nextLine(); 

    System.out.println("You are " + age + " years old"); 

    //if you want a String AFTER this... watch...
    System.out.print("What's your favorite food? "); 
    String food = scanny.nextLine(); 
    //The ENTER from before is considered a line of text!!
    System.out.println("You just answered " + food); 

  }
}