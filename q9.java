import java.util.*;
import java.io.*;
class q9{
    public void changeChar(Scanner p, PrintStream q)throws IOException
    {
        while (p.hasNextLine()) {
            String line = p.nextLine();
            for(int i=0;i<line.length();i++){
                char ch=line.charAt(i);
                if(i==0)
                   q.print('(');
                if(ch=='O' || ch=='o'){
                    int k=0;
                    q.print(k);
                }
                else if(ch=='l' || ch=='L'){
                    int k=1;
                    q.print(k);
                }
                else if(ch=='E' || ch=='e'){
                    int k=6;
                    q.print(k);
                }
                else if(ch=='A' || ch=='a'){
                    int k=4;
                    q.print(k);
                }
                else if(ch=='T' || ch=='t'){
                    int k=7;
                    q.print(k);
                }
                else if((ch=='s' || ch=='S'))
                {
                    char c=line.charAt(i+1);
                    if(c==' '){
                        q.print('5');
                    }
                    else{
                        q.print(ch);
                    }

                }
                else if(ch==' '){
                    q.print(')');
                    q.print('(');
                }
                else{
                    q.print(ch);
                }
                if(i==line.length()-1){
                    q.print(')');
                }
            }
            q.println();
        }  
    }
    public static void main(String a[])throws IOException{
        q9 ob=new q9();
        File f=new File("input.txt");
        ob.changeChar(new Scanner(f),new PrintStream("output.txt") );
    }
}