class MinStack {
    Deque<Integer> st, mStk;

    public MinStack() {
        st = new ArrayDeque<>();
        mStk = new ArrayDeque<>();
    }

    public void push(int val) {
        if (mStk.isEmpty() || mStk.peek() > val) {
            mStk.push(val);
        } else {
            mStk.push(mStk.peek());
        }
        st.push(val);
    }

    public void pop() {
        mStk.pop();
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return mStk.peek();
    }
}
