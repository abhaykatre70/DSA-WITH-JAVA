// Assending order or oincreasiing order
// public class bubblesort{
//     public static void sort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,4,7,8,12,2};
//         sort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// Decending order or decreasing order
public class bubblesort{
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,4,7,8,12,2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
} 