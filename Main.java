import java.util.Scanner;
import java.util.Arrays;

class Array {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

    int arr []; //declaration

    //initialized with int 5 objects
    arr = new int[5]; 

    

    for(int i=0;i<arr.length;i++){
      System.out.println("Enter element: "+i );
        arr[i] = sc.nextInt();
    }

    //interating via index
      System.out.println("Your Elements are : via index");
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

      System.out.println("Your Elements are :");
     for(int num : arr){
        System.out.println(num);
      }

  // array ogf objects

  String names []= {"Bilal","Imran","Rehan"};

  System.out.println(Arrays.toString(arr));

  names [2]="Arman";

  System.out.println(Arrays.toString(arr));


  //2D arrays

  int mat[][] = new int[3][3];

  for(int row=0;row<mat.length;row++){
    System.out.println("Row :"+row);
    for(int col=0;col<mat[row].length;col++){
      System.out.println("Col :"+col);
      mat[row][col] = sc.nextInt();
    }
  }

  // disp

  for(int row[] : mat){
    System.out.println(Arrays.toString(row));
  }


  }
}