import java.util.Stack;

class Solution {
  public int naiveCalPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    int score = 0;

    for (String s : operations) {
      if (s.equals("+")) {
        Integer num1 = stack.get(stack.size() - 1);
        Integer num2 = stack.get(stack.size() - 2);
        stack.push(num1 + num2);

      } else if (s.equals("D")) {
        Integer num = stack.peek();
        stack.push(num * 2);

      } else if (s.equals("C")) {
        stack.pop();

      } else {
        stack.push(Integer.parseInt(s));
      }
    }
    System.out.println(stack);

    while (!stack.empty()) {
      score += stack.pop();
    }
    System.out.println(stack);

    return score;
  }
}