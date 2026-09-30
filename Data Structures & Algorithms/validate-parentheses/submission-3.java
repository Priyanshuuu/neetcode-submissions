class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')', '(');
        mp.put('}', '{');
        mp.put(']', '[');
        for (char c : s.toCharArray()) {
            if (mp.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != mp.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }
}
