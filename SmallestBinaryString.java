public class SmallestBinaryString {
    // Define a simple Stack class
    static class Stack {
        private char[] elements;
        private int size;

        public Stack(int capacity) {
            elements = new char[capacity]; 
            size = 0;
        }

        public void push(char c) {
            elements[size++] = c;
        }

        public char pop() {
            return elements[--size];
        }

        public char peek() {
            return elements[size - 1];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }
    }

    public static String smallestBinaryString(String s) {
        int n = s.length();
        Stack stack = new Stack(n);
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            
            if (!stack.isEmpty() && stack.peek() == '1' && current == '0') {
                stack.pop(); 
            } else {
                stack.push(current); 
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stack.getSize(); i++) {
            result.append(stack.elements[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Sample Input 1
        System.out.println(smallestBinaryString("0000111111"));  // Output: "0000111111"

        // Sample Input 2
        System.out.println(smallestBinaryString("1111111"));  // Output: "1111111"

        // Sample Input 3
        System.out.println(smallestBinaryString("110"));  // Output: "0"
    }
}
