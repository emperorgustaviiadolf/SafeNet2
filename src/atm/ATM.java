package atm;

import java.util.ArrayList;

public class ATM {
	
	private int hundred = 10;
	private int fifty = 10;
	private  int twenty = 10;
	private int ten = 10;
	private int five = 10;
	private int one = 10;
	private String money = "";
	
	public ATM() {
		hundred = 10;
		fifty = 10;
		twenty = 10;
		ten = 10;
		five = 10;
		one = 10;
		money = "";
	}
	
	public void R() {
		hundred = 10;
		fifty = 10;
		twenty = 10;
		ten = 10;
		five = 10;
		one = 10;
	}
	public void W(String xMoney){
		money = xMoney.replaceAll("[^0-9.]", "");
		int numAmount = Integer.parseInt(money);
		int counter = 0;
		int tempHundred = hundred;
		int tempFifty = fifty;
		int tempTwenty = twenty;
		int tempTen = ten;
		int tempFive = five;
		int tempOne = one;
			
		while(numAmount >= 100) {
			if(numAmount >= 100) {
				numAmount -= 100;
				hundred --;
			}
		}
			
		while(numAmount >= 50) {
			if(numAmount >= 50) {
				numAmount -= 50;
				fifty --;
			}
		}
			
		while(numAmount >= 20) {
			if(numAmount >= 20) {
				numAmount -= 20;
				twenty --;
			}
		}
			
		while(numAmount >= 10) {
			if(numAmount >= 10) {
				numAmount -= 10;
				ten--;
			}
		}
			
		while(numAmount >= 5) {
			if(numAmount >= 5) {
				numAmount -= 5;
				five--;
			}
		}
			
		while(numAmount >= 1) {
			if(numAmount >= 1) {
				numAmount -= 1;
				one--;
			}
		}
			
			if(hundred < 0) {
				System.out.println("Insufficient Funds.");
				counter = 1;
				hundred = tempHundred;
				fifty = tempFifty;
				twenty = tempTwenty;
				ten = tempTen;
				five = tempFive;
				one = tempOne;
			}
			if(fifty < 0) {
				System.out.println("Insufficient Funds.");
				counter = 1;
				hundred = tempHundred;
				fifty = tempFifty;
				twenty = tempTwenty;
				ten = tempTen;
				five = tempFive;
				one = tempOne;
			}
			if(twenty < 0) {
				System.out.println("Insufficient Funds.");
				counter = 1;
				hundred = tempHundred;
				fifty = tempFifty;
				twenty = tempTwenty;
				ten = tempTen;
				five = tempFive;
				one = tempOne;
			}
			if(ten < 0) {
				System.out.println("Insufficient Funds.");
				counter = 1;
				hundred = tempHundred;
				fifty = tempFifty;
				twenty = tempTwenty;
				ten = tempTen;
				five = tempFive;
				one = tempOne;
			}
			if(five < 0) {
				System.out.println("Insufficient Funds.");
				counter = 1;
				hundred = tempHundred;
				fifty = tempFifty;
				twenty = tempTwenty;
				ten = tempTen;
				five = tempFive;
				one = tempOne;
			}
			if(one < 0) {
				System.out.println("Insufficient Funds.");
				counter = 1;
				hundred = tempHundred;
				fifty = tempFifty;
				twenty = tempTwenty;
				ten = tempTen;
				five = tempFive;
				one = tempOne;
		}
		if(counter != 1) {
			System.out.println("Successfully Dispensed $" + money );
			System.out.println("Machine Balance: ");
			System.out.println("$100 - " + hundred);
			System.out.println("$50 - " + fifty);
			System.out.println("$20 - " + twenty);
			System.out.println("$10 - " + ten);
			System.out.println("$5 - " + five);
			System.out.println("$1 - " + one);
		}
	}
	
	public void I(String stuff) {
		ArrayList<String> nums = new ArrayList<String>();
		int i, c, length;
	      length = stuff.length();   
	    
	      for(String num : stuff.split(" ")) {
	    	  nums.add(num);
	      }
	      
	      for(int z = 0; z < nums.size(); z++) {
	    	if(nums.get(z).equals("$100")) {
	    		System.out.println("$100 - " + hundred);
	    	}
	    	if(nums.get(z).equals("$50")) {
	    		System.out.println("$50 - " + hundred);
	    	}
	    	if(nums.get(z).equals("$20")) {
	    		System.out.println("$20 - " + twenty);
	    	}
	    	if(nums.get(z).equals("$10")) {
	    		System.out.println("$10 - " + ten);
	    	}
	    	if(nums.get(z).equals("$5")) {
	    		System.out.println("$5 - " + five);
	    	}
	    	if(nums.get(z).equals("$1")) {
	    		System.out.println("$1 - " + one);
	    	}
	      }
	}
	
}
