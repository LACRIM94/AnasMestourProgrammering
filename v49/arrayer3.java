
public class arrayer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 100 tal i intervallet [0-9]
		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};

		countTal(numbers);
	}
	
	public static void countTal (int [] numbers) {
		int counter = 0;
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter6 = 0;
		int counter7 = 0;
		int counter8 = 0;
		int counter9 = 0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == 0){
				
				counter++;
			}
		}	
	
	
	for (int i = 0; i < numbers.length; i++) {
		
		if (numbers[i] == 1){
			
			counter1++;
		}
	}
 
	
	for (int i = 0; i < numbers.length; i++) {
		
		if (numbers[i] == 2){
			
			counter2++;
		}
	}

	for (int i = 0; i < numbers.length; i++) {
		
		if (numbers[i] == 3){
			
			counter3++;
		}
		
	}	
	for (int i = 0; i < numbers.length; i++) {
			
	if (numbers[i] == 4){
				
	counter4++;
			}
			
	}		
	for (int i = 0; i < numbers.length; i++) {
				
	if (numbers[i] == 5){
					
	counter5++;
				}
	}	
	for (int i = 0; i < numbers.length; i++) {
					
	if (numbers[i] == 6){
						
	counter6++;
					}
	}
	for (int i = 0; i < numbers.length; i++) {
						
	if (numbers[i] == 7){
							
	counter7++;
						}
	}					
	for (int i = 0; i < numbers.length; i++) {
							
	if (numbers[i] == 8){
								
	counter8++;
							}
	}						
	for (int i = 0; i < numbers.length; i++) {
								
	if (numbers[i] == 9){
									
	counter9++;
								}
} 

System.out.println(counter);
System.out.println(counter1);
System.out.println(counter2);
System.out.println(counter3);
System.out.println(counter4);
System.out.println(counter5);
System.out.println(counter6);
System.out.println(counter7);
System.out.println(counter8);
System.out.println(counter9);
	}
}
