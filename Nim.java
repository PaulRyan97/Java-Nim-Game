import java.util.Scanner;
import java.util.Random;

class Nim   {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random initial_turn = new Random();
    Random total_matches = new Random();
    Random computer = new Random();
    
    int matches = total_matches.nextInt(100) - 10;
    int remaining = matches;
    int comp_pick;
    int turn = initial_turn.nextInt(2);
    
    while (remaining > 0) {
	while (true) {
	  System.out.println(remaining + "" + "matches left.");
	  if ( turn == 1 ) {
	  System.out.println("How many matches will you pick?");
	  int user_pick = sc.nextInt();
	  if ( remaining != 1 ){
	    if ( user_pick == 0 || user_pick > remaining/2 ) {
	      System.out.println("Please pick a number between 1 and half the total number of matches.");
	      break;
	    }
	  }
	  
	   remaining = remaining - user_pick;
	   turn = 0;
	   if ( remaining <= 0 ) {
	   System.out.println("You Lose");
	   break;
	   }

	  }
	  
	  if ( turn == 0 ){
	    turn = 1; 
	    if ( remaining < 3) {
	    comp_pick = computer.nextInt(1) + 1;
	    System.out.println("Computer picked" + " " + comp_pick  + " " + "matches.");
	    remaining = remaining - comp_pick;
	    }
	    else if ( remaining > 3 ) {
	    comp_pick = computer.nextInt(remaining/2) + 1;
	    remaining = remaining - comp_pick;
	    System.out.println("Computer picked" + " " + comp_pick  + " " + "matches.");
	    }
	  }
	  
	  if ( remaining <= 0 ) {
	    System.out.println("You Win");
	    break;
	  }
	}
	
    }
    
    
    
    
   }
}
    
    
    
    
    
    
    
    
