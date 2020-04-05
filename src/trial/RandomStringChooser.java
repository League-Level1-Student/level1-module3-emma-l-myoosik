package trial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStringChooser {
	private List<String> words;
	
	public RandomStringChooser(String[] wordArray) {
		words = new ArrayList<String>();
		
		for(String singleWord: wordArray) {
			words.add(singleWord);
		}
		
		System.out.println(words);
	}
	
	public String getNext() {
		if (words.size() > 0) {
			Random rand = new Random();
			int choice = (rand.nextInt(words.size()));
			System.out.println(choice);
			String returnValue = words.remove(choice);
			System.out.println(returnValue);
			return returnValue;
		
		}
		return "NONE";
	}
	
	public static void main(String[] args) {
		String[] wordArray = {"lafayette", "washington", "hamilton"};
		RandomStringChooser chooser = new RandomStringChooser(wordArray);
		
		for(int i = 0; i < 5; i++) {	
			String output = chooser.getNext();
			System.out.println(output);
		}
	}
}
