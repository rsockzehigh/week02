package week02;

public class BooleanOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//== equality operator
		System.out.println(2==2);
		//Boolean Expression
		System.out.println(2 > 5);
		System.out.println(3 <= 5);
		System.out.println(5 <= 5);
		// && and || or confines
		System.out.println(2 == 2 && 1 < 5);
		//both sides have to be true
		System.out.println(true && true);
		System.out.println(true && false);
		//saying in order to trade i want item a and item b
		//
		System.out.println(true ||false);
		System.out.println(false || false);
		System.out.println(2 == 2 || 1 == 5);
		//both are equal
		//using && false one of them is false and both need to be true
			System.out.println(2 == 2 && 1 == 5);
			
			int ageRequiredToDrive = 16;
					int currentAge = 14;
					boolean canPersonDrive = (currentAge >= ageRequiredToDrive);
					System.out.println(canPersonDrive);
	

	}

}
