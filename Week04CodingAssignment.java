package week04;

public class Week04CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Create an array of int called "ages" that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//a. Subtract the value of the first element in the array from the value in the last element of the array 
			//(i.e. do not use ages[7] in your code). Print the result to the console. 
		//b. Create a new array of int called ages2 with 9 elements 
				//(ages2 will be longer than the ages array, and have more elements). 
			//i. Make sure that there are 9 elements of type int in this new array.  
			//ii. Repeat the subtraction from Step 1.a. 
				//(subtract the value of the first element in the new array ages2 from the last element of ages2). 
			//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
				//c. Use a loop to iterate through the array and calculate the average age. 
					//Print the result to the console.
		
		//Create a new array called"ages" with the following values: 3, 9, 23, 64, 2, 8, 28, and 93
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//Subtract the value of the 1st element with value of last element and print to console
		System.out.println(ages[ages.length - 1] - ages[0]);
		//Create new array called "ages2" with 9 elements
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 4};
		//Check if there are 9 elements in the array
		int length = ages2.length;
		//Repeat subtraction of 1st element from the last element in the array
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		//Use a loop to iterate through the array and calculate the average age. 
			//Print the result to the console.
		//Set default sum value at 0
		int sum = 0;
		//Iterate through loop to calculate the sum of ages in the array
		for (int i = 0; i < ages2.length; i++) {
			sum =+ ages2[i];
		}
		//Calculate the average age and print to console
		double averageAge = sum / ages2.length;
		System.out.println(averageAge);
		
		
		
		//2. Create an array of String called names that contains the following values: 
				//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			//a. Use a loop to iterate through the array and calculate the average number of letters per name. 
				//Print the result to the console.
			//b. Use a loop to iterate through the array again and concatenate all the names together, 
				//separated by spaces, and print the result to the console.
		
		//Create array of String called names with the values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, & “Bob”.
		String[] names = { "Sam", "Tommy", "tim", "Sally", "Buck", "Bob" };
		
		
		//3. How do you access the last element of any array?
		//array[array.length - 1];

		//4. How do you access the first element of any array?
		//array[0];

		//5. Create a new array of int called nameLengths. 
			//Write a loop to iterate over the previously created names array and 
			//add the length of each name to the nameLengths array.
		
		//Create new array of int called nameLengths
		int[] nameLengths = new int[names.length];
		//Create loop to iterate over the previously created names array and 
			//add the length of each name to the nameLengths array.
		//Set default sum to 0
		int sumOfLetters = 0;
		//error suggestions tells me to delete above code, I dont understand why so I commented it out instead
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfLetters += nameLengths.length;
		}
		
		
		//6. Write a loop to iterate over the nameLengths array 
			//and calculate the sum of all the elements in the array. Print the result to the console.
		//
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfLetters += nameLengths.length;
		}
		
	
	} //End of main*********************Methods start here*****************************	
		//7. Write a method that takes a String, word, and an int, n, as arguments 
			//and returns the word concatenated to itself n number of times. 
			//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		//public static String repeatWord(String word, int n) {
			//return (word * n);
			//Compilation error associated with above line of code. 
			//Commented out entire method to be able to continue through remaining code
		//}

		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
			//(the full name should be the first and the last name as a String separated by a space).
		public static String fullName(String firstName, String lastName) {
			return firstName + lastName;
		}

		//9. Write a method that takes an array of int and returns true if 
			//the sum of all the ints in the array is greater than 100.
		public static boolean isSumGreaterThan100(int[] sum) {
			return isSumGreaterThan100(sum);
		}

		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		public static double calculateAverage(double[] average) {
			int sum =0;
			for (int i = 0; i >= average.length -1; i++) {
				//I can't figure out what goes here;
			}
			return sum / average.length;
		}

		//11. Write a method that takes two arrays of double and returns true if 
			//the average of the elements in the first array is > the average of the elements in the second array.
		public boolean isAverageGreater(double firstArray[], double lastArray[]) {
			var isHotOutside = true;
			double moneyInPocket = 0.00;
			return(isHotOutside = true && moneyInPocket > 10.50);
		}
		

		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
			//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return(isHotOutside = true && moneyInPocket > 10.50);
		}

		//I somehow deleted all of my code and was able to get about half of it back. 
		//I have attempted to correct the errors after retrieving what work I could salvage.
		//The more I attempted to fix my code the more errors I got. I do not know how to explain what is wrong properly
		//At some point I had to give up or I was going to have nothing to submit. Java is not for me.


		
		
		
		

}
