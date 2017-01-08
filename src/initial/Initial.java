package initial;


import java.util.Scanner;

public class Initial {
	public void bubbleSort(int[] arr) {
		int temp;
	      for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]= arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public void insertionSort(int[] input){
		
	}
	public void selectionSort(int[] input){
		
	}
	public void printArr(int[] input){
		String resp="";
		for (int i = 0; i < input.length; i++) {
			resp+= input[i]+" ";
		}
		System.out.println(" :: "+resp);
	}
	public int[] change(String input){
		String[] arr=input.split(" ");
		int[] res=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i]=Integer.parseInt(arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		Initial init= new Initial();
		String input;
		int[] output;
		Scanner sc= new Scanner(System.in);
		while (sc.hasNext()){
			input=sc.nextLine();
			output=init.change(input);
			init.bubbleSort(output);
			init.printArr(output);

			
		}
		sc.close();
	}
}
