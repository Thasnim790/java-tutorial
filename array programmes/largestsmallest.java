import java.util.Scanner;
class largestsmallest{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the integers:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int smallest=arr[0];
int largest=arr[0];
for(int i=0;i<n;i++){
if(arr[i]<smallest){
smallest=arr[i];
}
if(arr[i]>largest){
largest=arr[i];
}
}
System.out.println("smallest number:"+smallest);
System.out.println("largest number:"+largest);
}
}
