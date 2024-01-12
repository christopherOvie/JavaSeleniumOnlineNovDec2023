package javaPackage;

public class Array4 {

	public static void main(String[] args) {
	int a [] []= {{1,2,4,9},{7,9,3,1},{2,8,6,9}  };
	//total number of lenght
	int row=a.length;
	System.out.println("total row :"+row);
	//column
	
	int column=a[0].length;
	System.out.println("total column :"+column);
	//print all in matrix form
	
	//outer loop
	for(int i =0;i<row;i++) {
		
		
		
		//inner loop
		
		for(int j=0;j<column;j++) {
			System.out.println(a[i][j] + "");
		}
		System.out.println();
	}

	}

}
