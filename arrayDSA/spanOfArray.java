import java.util.Scanner; 
public class spanOfArray{
public static void main(String[] args) {
    Scanner r= new Scanner(System.in);
    int n = r.nextInt();
    int arr[]= new int[n];
    for(int i =0; i<arr.length; i++){
        arr[i]=r.nextInt();
    }
    int max = arr[0];
    int min = arr[0];
    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            max = arr[i];
        }

    }
    for(int i=0; i<arr.length; i++){
        if(arr[i]<min){
            min = arr[i];
        }
        int span = max - min;
        System.out.println(span);
        
    }
    r.close();
}
}

