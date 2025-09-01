class MinStack {
    Stack<Integer>s;
    Stack<Integer>min;
    public MinStack(){
        s=new Stack<>();
        min=new Stack<>();
    }
    public void push(int x){
        s.push(x);
        if(min.isEmpty()||x<=min.peek())min.push(x);
    }
    public void pop(){
        if(s.pop().equals(min.peek()))min.pop();
    }
    public int top(){
        return s.peek();
    }
    public int getMin(){
        return min.peek();
    }
}
