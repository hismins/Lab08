package edu.handong.csee.java.Overload;


// TODO add javadoc later
public class Overload {

		public static void main(String[] args) {
		
			double average1 = Overload.getAverage(30,  40);
			double average2 = Overload.getAverage(30,  40, 20);
			char average3 = Overload.getAverage('a',  'c');//if return was float, after point will be cut.
		
			System.out.println(average1);
			System.out.println(average2);
			System.out.println(average3);
		}
		
		public static double getAverage(double first, double second) {
			return (first+second)/2;
		}
		
		public static double getAverage(double first, double second, double three) {
			return (first+second+three)/3;
		}
		
		public static char getAverage(char first, char second) {
			return (char)(((int)first+(int)second)/2);
		}
}
