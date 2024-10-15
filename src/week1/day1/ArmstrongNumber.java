package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 155;
		
		int sum = 0;
		int rem;
		int temp = num;
		
		while(temp > 0) {
			
			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
			
		}
		
		if(sum == num) {
			System.out.println("Armnstrong number");
		}else {
			System.out.println("Not an Armnstrong number");
		}

	}

}
