package Princeton_Exercises;
import java.lang.Math;

public class Uniform_random_numbers {

	public static void main(String[] args) {
		// TODO 
		//Write a Program that prints 5 uniform random numbers between 0 and 1 - OK
		//Print their average value - OK
		//Print their minimum and maximum values - OK
		//Use Math.random(), Math.min(), and Math.max() - OK
		
		double Sum = 0;		
		double min = 1;
		double max = 0;

		System.out.println("Numbers: ");
		for(double i = 0; i < 5; i++) {
			double Random = Math.random();
			System.out.println(Random);
			Sum += Random;
			
			min = Math.min(min, Random);
			max = Math.max(max, Random);
		}

		double Average = Sum/5;
		
		System.out.println();
		System.out.println("Average: " + Average);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		
	}

}
