package mainPackage;

import java.lang.Integer;

public class MyInteger {
	//creating int value variable
	private int value;
	
	//creating constructor
	public MyInteger (int value){
		this.value = value;
	}
	
	//getter
	public int getValue(){
		return this.value;
	}
	
	//Boolean Methods
	public boolean IsEven(){
		return (this.value % 2 == 0);
	}
	
	public boolean IsOdd() {
		return(this.value % 2 != 0);
		
	}
	
	public boolean IsPrime(){
		for(int i=2; i <= this.value/2; i++){
			if(this.value % i == 0){
				return false;
			}
		}
		
		return true;
	}
	
	//Static Methods
	public static boolean IsEven(MyInteger Myint){
		return (Myint.value % 2 == 0);
		
	}
	
	public static boolean IsOdd(MyInteger Myint){
		return (Myint.value %2 != 0);
	}
	
	public static boolean IsPrime(MyInteger Myint){
		for(int i=2; i <= Myint.value/2; i++){
			if(Myint.value % i == 0){
				return false;
			}
		
		}
		return true;
	}
	
	
		
	
	//Equals methods
	
	public boolean equals(int value){
		
		return(this.value == value);
			
	}
	
	public boolean equals(MyInteger MyInt){
		
		return(MyInt.value == this.value);
		
	}
	
	public static int ParseInt(char[] a){
		int sumvalue=0;
		for(int i=0; i < a.length; i++){
			sumvalue+=a[i];
		}
		return sumvalue;
		
	}
	
	public static int ParseInt(String word){
		int i = Integer.parseInt(word);
		return i;	
		
	}
	
	public static void main(String[] args){
		
		MyInteger odd = new MyInteger(5);
		MyInteger new_odd = new MyInteger(5);
		String a = "15";
		System.out.println(odd.IsEven());
		System.out.println(IsOdd(new_odd));
	}
}


