class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        Set<String> set = Set.of("+", "-", "*", "/");
        for (String str : tokens) {
            if (!set.contains(str)) {
                stack.push(Integer.parseInt(str));
            } else {
                switch (str) {
                    case "+" -> stack.push(stack.pop() + stack.pop());
                    case "-" -> {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b - a);
                    }
                    case "*" -> stack.push(stack.pop() * stack.pop());
                    case "/" -> {
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b / a);
                    }
                };
            }
        }
        return stack.pop();
    }
}
