package atm;

import java.util.*;

public class AtmDriver {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Scanner input = new Scanner(System.in);
		String answer = "";
		while(!answer.equals("Q")) {
		System.out.println("Input a command. Q to quit.");
		answer = input.nextLine();
		if(answer.contains("W $")) {
			atm.W(answer); 
		}
		if(answer.contains("I ")) {
			atm.I(answer); 
		}
		if(answer.contains("R ")) {
			atm.R();
		}
		}

	}

}
