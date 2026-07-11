import java.util.Scanner;

public class arrayInsertion {
    public static void main(String[] args){
        int[] arr = new int[] {20,30,50};
        Scanner scn = new Scanner(System.in);
        int id,num;
        System.out.println("Array: ");
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("  ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(i+" ");
        }
        System.out.print(" ");
        System.out.println();
        
        System.out.print("Enter Index: ");
        id = scn.nextInt();
        scn.nextLine();
        System.out.print("Enter Element: ");
        num = scn.nextInt();
        scn.nextLine();
        
        for(int i =id;i<arr.length;i++){
            int temp = arr[i];
            arr[i]= num;
            num = temp;
        }
        System.out.println("Array: ");
        System.out.print("[ ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        scn.close();
    }
}
