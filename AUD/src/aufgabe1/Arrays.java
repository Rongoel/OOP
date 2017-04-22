package aufgabe1;

public class Arrays {
	public static String[] expandArray(String[] arr){
		
		String[] newStringArray = new String[2*arr.length];
		
		for (int i = 0 ; i < arr.length; i++ ){
			
			newStringArray[i] = arr[i];
			
			
		}
		
		return newStringArray;	
		  
	  }
	
	
	public static String[] ShiftElements(String[] arr, int i){
		
		
		String old = arr[i];
	    String next = arr[i+1];
		
	    
	    for(int j = i+1 ; j < arr.length; j++ ){
	    	arr[j] = old;
	    	old = next;
	    	next = arr[j+1];
	    }
		
	    return arr;
		
	
	}
	

	
	
}
