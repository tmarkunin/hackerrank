
public class GradingStudents {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] grades = {73, 67, 38,33};
		
        for (int i = 0; i < grades.length; i++){
            
            if (grades[i] > 37){
                
                if (grades[i] % 5 > 2)
                    grades[i] = grades[i] + 5 - grades[i] % 5;
            }
            
            System.out.println(grades[i]);
                
        }
        
        

	}

}
