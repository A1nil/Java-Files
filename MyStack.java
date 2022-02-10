import java.util.Scanner;

public class MyStack {
    int Size_of_Stack= 4;
    int element[]= new int[Size_of_Stack];
    int tos= -1;
    
    void push(int item){
    if(tos>= Size_of_Stack -1){
    System.out.println("Stack is full or overflow condition error !!");
    return;
    }
    else{
    //tos=tos+1;
    element[++tos]=item;
    }
    }
    
    boolean isEmpty(){
    if(tos==-1){
    return true;
    }
    else{
    return false;
    }
    }
    
    int pop(){
    if(isEmpty()){
    System.out.println("Stack is Empty or underflow condition erro!!");
    return 0;
    }
    else{
    return element[tos--]; 
    //tos=tos-1
    }
    
    }
    
    void print(){
    int temp =0;
    
    if(!isEmpty()){
    temp=pop();
    System.out.println(temp);
    print(); //function call within a function 
    
    }
    // this function is used to print data element from stack
    push(temp); // this is used to insert data element into stack to get previous stack
    } 
    
   }
    
   class TestStack{
    public static void main(String[] args) {
    MyStack obj1 = new MyStack();
    Scanner s = new Scanner(System.in);
    s.close();
    int type_of_op;

    while(true){
        System.out.println("\nEnter your choice");
        System.out.println("Enter 1 for push operation");
        System.out.println("Enter 2 for pop operation");
        System.out.println("Enter 3 for print operation");
        System.out.println("Enter 4 for Exit \n");
        type_of_op=s.nextInt();

        switch(type_of_op){
            case 1: System.out.println("Enter the element which you want to push");
            obj1.push(s.nextInt());
            break;
            case 2: System.out.println("Removed Element" +obj1.pop());
            break;
            case 3: System.out.println("Stack Element are: ");
            obj1.print();
            break;
            default: System.out.println("Invalid Input!!");
            return;
        }
    }
    }
    
   class Stack {
    
}
}


