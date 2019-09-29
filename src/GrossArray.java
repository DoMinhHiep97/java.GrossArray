import java.util.Scanner;

public class GrossArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr1= new int[5];
        System.out.println("Enter 5 elements in array 1:");
        for (int i=0;i<arr1.length;i++){
            System.out.println("Element "+i+":");
            arr1[i]=scanner.nextInt();
        }
        int[] arr2= new int[5];
        System.out.println("Enter 5 elements in array 2:");
        for (int i=0;i<arr2.length;i++){
            System.out.println("Element "+i+":");
            arr2[i]=scanner.nextInt();
        }
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
            arr3[i+arr1.length]=arr2[i];
        }

        System.out.println("arr1");
        for(int element: arr1){
            System.out.print(element);
        }
        System.out.println("arr2:");
        for (int value : arr2) {
            System.out.print(value);
        }
        System.out.println("arr3:");
        for (int value:arr3){

            System.out.print(value);
        }
    }


}
