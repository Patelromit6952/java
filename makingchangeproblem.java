import java.util.*;
public class makingchangeproblem {
    
     public static void findchange(int n){
        int []abc={1,2,5,10,20,50,100,200,500,2000};
        stack s=new stack();
        int a=abc.length;
        int b,c;
       
        if(n>abc[a]){
            b=n/abc[a];
            c=n-(b*abc[a]);
            s.push(a);
            s.push(b);
            a--;
            findchange(c);
        }
       while(s.top!=-1){
        System.out.println(s.pop()+" "+abc[s.pop()]);
        s.top--;
       }

     }
    public static void main(String[] args) {
        
        System.out.println("Enter The Amount:");
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        sc.close();
            findchange(total);

    }
}
class stack{
    int top=-1;
    int []arr=new int[20];

    void push(int n){
        top++;
        arr[top]=n;
    }
    int pop(){
        return arr[top--];
    }
}
