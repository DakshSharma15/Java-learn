import java.util.*;
public class sorting {

    public static void main(String[] args) {
    //  Scanner sc=new Scanner(System.in);
    //  int size = sc.nextInt();
    //  int [] arr = new int[size];
    //  arr [size] = sc.nextInt();
    int arr[]={5,7,6,5,1,6,3,4,9};
    int n=arr.length;
    int mid =n/2;
    for(int i=0;i<n;i++){
        for(int j=0;j<mid;j++){
            if (arr[j]>arr[j+1]) {
                int temp =arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
        for(int j=mid;j<n-1;j++){
            if (arr[j+1]>arr[j]) {
                int temp =arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));

    }
}