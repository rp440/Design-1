// Time Complexity : O(1)
// Space Complexity : 0(N) -> 0(2N) but we ignore the constants
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class MinStack {
    int min;
    Stack <Integer> st;
    Stack <Integer> minSt;
    
    public MinStack() {
        min = Integer.MAX_VALUE;
        st = new Stack<>();
        minSt = new Stack<>();
        minSt.push(min);
    }
    
    public void push(int val) {
        if(val<= min){
            min = val;
        }
        st.push(val);
        minSt.push(min);
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
        min = minSt.peek();
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */