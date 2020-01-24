
public class AlternatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "AAABBB";
		
		int length = s.length();
		int count = 0;
		
//		while(s.length() > 1){
//			
//			String ch1 = s.substring(0, 1);
//			String ch2 = s.substring(1, 2);
//			
//			if (ch1.equals(ch2)){
//				count++;
//			}
//			
//			System.out.println(s);
//			
//			s = s.substring(1,s.length());
//			
//			
//			
//			
//		}
		
		for (int k = 0; k < length -1; k++){
			
			String ch1 = s.substring(k, k+1);
			String ch2 = s.substring(k+1, k + 2);
			
			if (ch1.equals(ch2)){
				count++;
			}
		}
		
		System.out.println(count);

	}

}
