
public class Stairs {

	int n = 5;
	
	
    for(int i = 1; i < n + 1 ; i++){
         String stair = "";

         String space ="";
         
         for(int k =0; k < i; k++ ){

             stair = stair + "#";    

         }

         for (int l = 0; l < n - i; l ++){

             space = space + " ";

         }
         
         System.out.println(space + stair);
}
}
