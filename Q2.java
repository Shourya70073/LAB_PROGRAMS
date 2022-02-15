import java.util.Scanner;
public class Q2 {
    public void display(int a[],int size){
        for(int i=0;i<size;i++){
            System.out.print(a[i]+"- ");
            for(int j=0;j<a[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of input");
        int n=sc.nextInt();
        int a [];
        a=new int[30];
        System.out.println("Enter your inputs");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Q2 ob=new Q2();
        ob.display(a, n);}
}
