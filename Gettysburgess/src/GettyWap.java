import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettyWap {
	public static void main(String[] args) throws FileNotFoundException {
	Scanner file = new Scanner(new File("GettysburgAddress.txt"));	
	String newWord;	
	ArrayList<String> array = new ArrayList<String>();
	
	while (file.hasNext()) {
		newWord = file.next();
		
	
		array.add(newWord);
	}
	int max = array.get(0).length();
	int total = 0;
	int longestWordIndex= 0;
	for (int i = 0; i <= array.size() - 1; i++) {
		if (array.get(i).length() > max) {
			max =  array.get(i).length();
			longestWordIndex = i;
		}
		total += array.get(i).length();
		}
	double avg = total/array.size();
	System.out.print("The average is "+ avg+" and the longest word is "+ array.get(longestWordIndex)+ " with a length of "+ array.get(longestWordIndex).length());
	}
}

