package main;

import java.util.ArrayList;
import java.util.List;

public class NaiveBayes {
	
	List<String> positive;
	List<String> negative;
	List<String> textt;
	
	NaiveBayes(){
		positive = new ArrayList <String>();
		positive.add("good");
		positive.add("excellent");
		positive.add("awesome");
		positive.add("nice");
		positive.add("love");
		positive.add("adore");
		positive.add("nice");
		positive.add("love");
		positive.add("adore");
		
		negative = new ArrayList<String>();
		negative.add("bad");
		negative.add("dull");
		negative.add("hate");
		negative.add("dislike");
		negative.add("disgusting");
		negative.add("dislike");
		negative.add("disgusting");
		
		textt = new ArrayList<String>();
	
		
}
	public double probTextPositive(String text){
		int textCountp =0;
		int positiveCount= positive.size();
		//System.out.println(positiveCount);
		for(int i=0;i<positiveCount; i++){
			if(text.equals(positive.get(i))){
				
				textCountp++;	
				
			}
		}
			double p = (double) textCountp/(double)positiveCount ;
			return p;
		}

	
	public double probTextNegative(String text){
		int textCountn =0;
		int negativeCount= negative.size();
		for(int i=0;i<negativeCount; i++){
			if(text.equals(negative.get(i))){
				textCountn++;
				
			}
		}
			double n = (double)textCountn/(double)negativeCount;
			return n;
	}
	
	public double totalprob(){
		double a= positive.size();
		double b= negative.size();
		double x= a/(a+b);
		return x;
		
	}
	
	public double probPositiveText(String text){
		int textPositiveCount=0;
		
		String[] splitted = text.split("\\s+");
		double x = 1;
		
		if (splitted.length>0){
		
			for(int i=0;i<splitted.length;i++){
			
				String b= splitted[i];
				System.out.println(b);
				double p= probTextPositive(b);
		    	x *= p;
		    	System.out.println(x);
			 
			}
	
		}
		
		return x*totalprob();
	}
	
	public double probNegativeText(String text){
		int textPositiveCount=0;
		
		String[] splitted = text.split("\\s+");
		double y= 1;
		
		if (splitted.length>0){
		
			for(int i=0;i<splitted.length;i++){
			
		        String b= splitted[i];
		        System.out.println(b);
		        double p= probTextNegative(b);
			    y *= p;
				System.out.println(y);
			}
	
	    }
		
		return y*totalprob();
	}
	
}

