package sort;

public class SortTest {

	public static void main(String[] args) {
		ISort[] sortList = {new BubbleSort(), new InsertSort(), new QuickSort()};
		
		int arr [] = new int[10];
		if(args[0].equals("B")) 
			sortList[0].sort(arr);
		else if(args[0].equals("Q")) 
			sortList[1].sort(arr);
		else if(args[0].equals("I")) 
			sortList[2].sort(arr);	
	}

}
