package Assignment1;

public class Week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 1 (a)
		// The program calculates the difference between the last element and the first element in ages
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// Subtract the first element from the last element and print the result		

		int difference = ages[ages.length -1] - ages[0];
		System.out.println(difference);
		
		// Question 1 (b)
		// The program calculates the difference between the last element and the first element in ages2
		// The aim is to show that the index values for the elements is dynamic (works for arrays of different lengths).
		// We added one element to the array
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 47};
		
		// Subtract the first element from the last element and print the result		

		int difference2 = ages2[ages2.length -1] - ages2[0];
		System.out.println(difference2);
		
		//Question 1 (c)
		// Calculate the average age in the ages2 array using a loop
		
		int sum = 0;
        for (int age : ages2) {
            sum += age;
        }
        double average = (double) sum / ages2.length;
        System.out.println(average);
			
		//Question 2  Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        // Question 2(a) Use a loop to iterate through the array and calculate the average number of letters per name.
        
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        // Part a: Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) { 
        	totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println(averageLetters);	
        	
        //2b. Use a loop to iterate through the array again and concatenate all the names together,	
        	
        StringBuilder ConcatenatedNames = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
        	ConcatenatedNames.append(names[i]);
        	if (i < names.length - 1) {
        		ConcatenatedNames.append(" ");
        	}
        }
		
        System.out.println(ConcatenatedNames.toString());
        
        //Ouestion 3 How to access the last element of any array?
        
        String lastElement = names[names.length - 1];
        
        System.out.println(lastElement);
        
        // Question 4 How to access the first element of any array
        
        String firstElement = names[0];
        
        System.out.println(firstElement);
        
        // Question5. Create a new array of int called nameLengths. 
        //Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths = new int[names.length];
        
        for (int i = 0; i < names.length; i++) {
        nameLengths[i] = names[i].length();
        }
        
        for (int length : nameLengths) {
        	System.out.println(length);
        }
        
        
        //Question 6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
        
        
        // Calculate the sum of all elements in nameLengths
                
              
        for (int i = 0; i < names.length; i++) {
        nameLengths[i] = names[i].length();
        }
        
        sum = 0;
        
        for (int length : nameLengths) {
        	sum += length;
        }
        
       System.out.println(sum); 
     //Question 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.   
	System.out.println(repeatWord("Hello", 3));
	
	// Question 8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	   // (the full name should be the first and the last name as a String separated by a space).
	System.out.println(getFullName("Tom", "Cruise"));
	
	// Question 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	System.out.println(isSumGreaterThan100(ages));
	
	// Question 10 Write a method that takes an array of double and returns the average of all the elements in the array
	double[] numbers = {2.5, 7.0, 7.5, 4.9, 6.8};
	System.out.println(calculateAverage(numbers));
	
	// Question 11 Write a method that takes two arrays of double and returns true if the average of the elements in the 
	//first array is greater than the average of the elements in the second array.
	
	double[] array1 = {4.5, 3.0, 5.5, 7.2, 8.8}; 
    double[] array2 = {3.0, 4.0, 2.0, 6.5};
    
    System.out.println(isFirstArrayAverageGreater(array1, array2));
    
    // Question 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
    //if it is hot outside and if moneyInPocket is greater than 10.50.
    boolean isHotOutside = true;
    double moneyInPocket = 15.50;
    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
    
 // Question 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    
    System.out.println(isPalindrome("Madam"));
	
	} // End of Main.
	

       
       //Question 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
	
	

   
	   public static String repeatWord(String word, int n) {   
	     StringBuilder result = new StringBuilder(); 
	     for (int i = 0; i < n; i++) {
	            result.append(word);
	     }
	        return result.toString();
	    }

	    
	    
	   // Question 8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	   // (the full name should be the first and the last name as a String separated by a space).   
	    
       
	  public static String getFullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }

	    
  		// Question 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
  
 

	    public static boolean isSumGreaterThan100(int[] numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return sum > 100;
	    }

	    // Question 10 Write a method that takes an array of double and returns the average of all the elements in the array.

	    public static double calculateAverage(double[] numbers) {
	        double sum = 0;
	        for (double number : numbers) {
	            sum += number;
	        }
	        
	        return sum / numbers.length;
	    }
	    
	    
	    
	   // Question 11 Write a method that takes two arrays of double and returns true if the average of the elements in the 
	   //first array is greater than the average of the elements in the second array. 
	    
	    public static double calculateAverage1(double[] numbers) {
	        double sum = 0;
	        for (double number : numbers) {
	            sum += number;
	        }
	        return sum / numbers.length;
	    }

	    // Method to compare the averages of two arrays
	    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
	        double average1 = calculateAverage(array1);
	        double average2 = calculateAverage(array2);
	        return average1 > average2;
	    } 
	    
	    // Question 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
	    //if it is hot outside and if moneyInPocket is greater than 10.50.
	    
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && moneyInPocket > 10.50;
	    
   }

	    // Question 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	    
	   // This method checks if a given word is a palindrome.
	   // A palindrome is a word that reads the same backward as forward.
	   // I created the method because it a good way to identify palindromes. 
	    
	    public static boolean isPalindrome(String word) {
	        
	        word = word.toLowerCase();
	        
	        
	        int left = 0;
	        int right = word.length() - 1;
	        
	        
	        while (left < right) {
	            if (word.charAt(left) != word.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
	    
}