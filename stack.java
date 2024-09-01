import java.io.*;
// import java.util.*;
public  class stack {
    public static void main(String[] args) {
        stack1 s1=new stack1(5);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        // s1.push(6);
        s1.pop();
        s1.dispaly();
//         Stack <String> stack = new Stack<String>();  //declare stack
//         System.out.println(stack.empty());
//         stack.push("ROMIT");                    // push element in stack
//         stack.push("RKPATEL1");
//         stack.push("RKPATEL2");
//         stack.push("RKPATEL3");

//         System.out.println(stack);

//         stack.pop();                                    //pop into stack
//         System.out.println(stack);                      // dispaly the stack
//         System.out.println(stack.peek());               //return top of stack element
// System.out.println(stack.search("ROMIT"));    //search element into the stack return its position from top
      }
    
}
class stack1{
    int size,top=-1;
    int arr[];

    stack1(int size){
        this.size=size;
      arr=new int[size];
    }

    void push(int n){
        // try{
            if (top==size) {
                // throw new Exception();
                System.out.println("stack overflow");
            }
            else{
                top++;
                arr[top]=n;
            }
        // }
        // catch(Exception e){
        //     System.out.println("stack overflow");
        // }
    }
    void pop(){
        // try{
            if(top==-1){
                // throw new Exception();
                System.out.println("stack underflow");
            }
            else{
                top--;
            }
        // }
        // catch(Exception e){
        //     System.out.println("stack underflow");
        // }
    }
    void dispaly(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}