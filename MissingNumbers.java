package week5.day2;






import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {
	
	public static void main(String[] args) {
		 int[] numbers= {4,6,7,2,3,1,10,9,8,8,6};
		 
		 
		Set<Integer> num=new TreeSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			num.add(numbers[i]);
			
			
			
			
		}
		
		List<Integer> value=new ArrayList<Integer>(num);
		
		System.out.println(value);
		for (int i = 1; i <value .size(); i++) {
			if(i != value.get(i-1))
			{
				
		
		System.out.println(i);
			
		break;
	//System.out.println(value.size());
		
		
		
		
		
		
//		for (Integer integer : num) {
//		
//		if (integer!=integer+1) {
//			
//			System.out.println(integer+1);
//				break;
				
			}
	

		
		}
				
}
}
		
			
						
		
		
		
		
		
		
	


