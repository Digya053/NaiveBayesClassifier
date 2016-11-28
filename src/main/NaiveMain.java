package main;

public class NaiveMain {
	
	public static void main(String[] args){
		NaiveBayes nb = new NaiveBayes();
		nb.probTextPositive("good");
		nb.probTextNegative("bad");
		nb.probPositiveText("good nice");
	    nb.probNegativeText("bad dull");
		
	}
}