import java.util.Stack;

public class EvaluateString {

	public static int evaluate(String expression) {

		char[] tokens = expression.toCharArray();
		// Stack for numbers : 'values'
		Stack<Integer> values = new Stack<>();
		// Stack for operators: 'ops'
		Stack<Character> ops = new Stack<>();

		for (int i = 0; i < tokens.length; i++) {
			// Current tokens is writespace, skip it
			if (tokens[i] == ' ')
				continue;
			// Current token is a number, push it to stack for numbers
			if (tokens[i] >= '0' && tokens[i] <= '9') {
				StringBuffer sb = new StringBuffer();
				// There may be more than one digits in number
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
					sb.append(tokens[i++]);
				values.push(Integer.parseInt(sb.toString()));
			}
//				Current token is an opening brace, push it to 'ops'
			else if (tokens[i] == '(')
				ops.push(tokens[i]);

//			closing brace encountered, solve entire brace
			else if (tokens[i] == ')') {
				while (ops.peek() != '(')
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				ops.pop();
			}
//				current tokens is operator.
			else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
//				while top of 'ops' has same or greater precedence to current 
//				token, which is an operator. Appply operator on top of 'ops'
//				to top two elements in values stack
				while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
					values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				}
//				Push current tokens to 'ops'
				ops.push(tokens[i]);
			}
		}
		// Entire expression has been parsed at this point, apply remaining
		// ops to remaining values
		while (!ops.empty())
			values.push(applyOp(ops.pop(), values.pop(), values.pop()));

		// Top of 'values' contains result, return it
		return values.pop();

	}

	// Returns true if 'op2' has higher or same precedence as 'op1',
	// otherwise returns false.
	public static boolean hasPrecedence(char op1, char op2) {
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

	// A utility method to apply an operator 'op' on operands 'a'
	// and 'b'. Return the result.
	public static int applyOp(char op, int b, int a) {
		switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(EvaluateString.evaluate("10 + 2 * 6"));
		System.out.println(EvaluateString.evaluate("100 * 2 + 12"));
		System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 )"));
		System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 ) / 14"));
		
		System.out.println("*********************************************************");
		boolean eyesClosed = true;
		boolean breathhingSlowly = true;
		
		boolean resting = eyesClosed | breathhingSlowly;
		boolean asleep = eyesClosed & breathhingSlowly;
		boolean awake = eyesClosed ^ breathhingSlowly;
		
		System.out.println(resting);
		System.out.println(asleep);
		System.out.println(awake);
		System.out.println("*************************");
		int owl = 5;
		int temp;
		if(owl < 2) {
			temp = 3;
		}else
			temp = 4;
		System.out.println(temp);
		

	}
	

}
