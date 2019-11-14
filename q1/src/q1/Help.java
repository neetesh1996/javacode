package q1;

public class Help {
	public static void main(String[]args){
		int[][]arr={{10,2,4},{34,35,36},{23,24,26}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
