
public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1= 1571;
		int v1= 4240;
		
		int x2 = 9023;
		int v2 = 4234;
		
        String result = "NO";

        if (x2 > x1 && v2 > v1)
            result = "NO";
        
        for (int i = 1; i < 100000; i++){
            
            if ((x1 + v1*i) == (x2 + v2*i)){
                result = "YES";
                break;
            }
        }
        
        System.out.println(result);

	}

}
