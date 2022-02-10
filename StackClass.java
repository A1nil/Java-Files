public class StackClass {
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("The removed value is " + s.pop() +".");
        
        s.push(4);
        s.push(5);

        s.show();
        System.out.println("The peek value is " +s.peek() +".");
    }
}

class Stack{
    int size[] = new int[5];
    int Top_Index = 0;

    public void push(int data){
        size[Top_Index] = data;
        Top_Index++;
    }

    public void show(){
        for(int n : size){
            System.out.println(n + " ");
        }
    }

    public int pop(){
        int data;
        Top_Index--;
        data = size[Top_Index];
        size[Top_Index]= 0;
        return data;
    }

    public int peek(){
        int data;
        data = size[Top_Index -1];
        return data;
    }
}
