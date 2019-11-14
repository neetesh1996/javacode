//package day1;
 
 public class Switch {
 	public static void main(String[] args) {
 		char grade;
 		grade='M';
 		switch(grade){
 			case 'M':
 			case 'm':
 			System.out.println("y1");
 			break;
 			case 'S':
 			case  's':
 			System.out.println("y2");
 			break;
 			default:
 			System.out.println("y3");
 			break;
 		}
 	}
 }