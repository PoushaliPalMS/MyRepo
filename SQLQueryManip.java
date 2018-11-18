public class SQLQueryManip {

	public static void main(String[] args) 
	{
		// Task #1.a. Display all words from User Input, in separate lines.
		// 1. Take User Input for the Query. Store as a string. 
		String userInput = " select * from ipl.csv where season > 2014 and city = 'Bangalore'";

		// 2. Split all words and store the words in a string array.
		String inputWords[] = userInput.strip().split(" ");
		
		// 3. Print the stored words in separate lines. 
		for (int i=0; i< inputWords.length; i++)
		{
			System.out.println(inputWords[i]);
		}
		
		// Task #1.b. Extract certain parts of the same query. 
		// 1. Get only file name from the query string
		// An SQL of this format always has the file name as the 4th substring in the Input. 
		System.out.println("File name: " + inputWords[3]);
		
		// 2. Get only base part(before `where` word) of the query from the given query string.
		// Display substring till the word: "where". Remove any extra spaces in the Output. 
		System.out.println(userInput.substring(0, userInput.indexOf("where")).strip());
		
		// 3. Get only filter part(after `where` word) of the query from the given query string.
		// Display substring of User Input starting from "where" and skipping the word "where" itself.
		String queryFilter = userInput.substring(userInput.indexOf("where") + "where".length()).strip();
		System.out.println(queryFilter);
		
		// 4. As there will be multiple conditions, separate each condition and display in different line.
		// 4.a. Split the string output from Step #3 above at the string: "and". 
		String partsOfQueryFilter[] = queryFilter.split("and");
		
		// 4.b. Display resultant query by parts, each in a new line.
		for (int i=0; i< partsOfQueryFilter.length; i++)
		{
			System.out.println(partsOfQueryFilter[i].strip());
		}
		
		// 5. Extract the logical operators in sequence from the given query string.		
		for (int i=0; i< inputWords.length; i++)
		{
			if (inputWords[i].equals("and") || 
					inputWords[i].equals("or") || 
					inputWords[i].equals("not"))
			{
				// Print only logical operators from the User input. 
				System.out.println(inputWords[i]);				
			}			
		}
		
		// 6. Extract the selected fields/information from the given query.
		
	}
}