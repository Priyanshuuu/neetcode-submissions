class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> mp = new HashMap<>();
        mp.put('(', ')');
        mp.put('{', '}');
        mp.put('[', ']');
        for (char c : s.toCharArray()) {
            if (mp.containsKey(c)) {
                stack.push(c);
                continue;
            } else if (!stack.isEmpty() && mp.get(stack.peek()) == c) {
                stack.pop();
                continue;
            }
            return false;
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
