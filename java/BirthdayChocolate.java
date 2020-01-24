
public class BirthdayChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int month = 2;
		int day = 3;
		int[] arr = {1, 2, 1, 3, 2};
		
		int count = 0;
		
		int length = arr.length;
		
		for (int i = 0; i < length - month + 1; i++){
			
			int sum = 0;
			
			for (int k = 0; k < month; k ++){
				sum = sum + arr[i + k];
			}
			
			System.out.println(sum);
			
			if (sum == day)
				count++;
		}
		

	}

}
