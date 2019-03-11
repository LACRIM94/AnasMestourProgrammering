import java.util.ArrayList;

public class ArrayList2 {
	
	public static void main(String[] args) {
		int[] jonny = {1, 2, 3, 4, 5};
		String[] pontus = {"Sträng", "Hej"};
		
		for (int i = 0; i < pontus.length; i++) {
			System.out.println(jonny[i]);
		}
		
		
	ArrayList<String> nameList = new ArrayList<>();
	
	nameList.add("Olle"); 
	nameList.add("Lisa");
	nameList.add("Lasse");
	
	for (int i = 0; i < nameList.size(); i++) {
		System.out.println(nameList.get(i) + " ");
		
	}
	
	System.out.println();
	
	nameList.add(1, "Anna");
	System.out.println(nameList);
	
	nameList.set(2, "Britta");
	System.out.println(nameList);
	
	}

}
