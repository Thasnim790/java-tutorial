import java.util.Scanner;
class sumnum{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the integers:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++){
if(arr[i]%2==0){
   sum+=arr[i];
}
}
System.out.println("sum of even elements:"+sum);
}
}



