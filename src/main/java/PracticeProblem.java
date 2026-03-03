public class PracticeProblem {
	public static void main(String args[]) {

	}

    public static int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
        
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            case '^':  
                return (int) Math.pow(a, b);
			default:
            throw new IllegalArgumentException("Invalid operator");

		}
	}

    public static final int MAXIMUM = 10;

    public static boolean totalWordsChecker(String input) {

        if (input == null || input.trim().isEmpty()) {
            return true;
        }

       
        String[] words = input.trim().split("[^\\w']+");
        return words.length <= MAXIMUM;
    }

    public static String minString(String str1, String str2, String str3) {
        String min = str1;

        if (str2.compareToIgnoreCase(min) < 0) {
            min = str2;
        }

        if (str3.compareToIgnoreCase(min) < 0) {
            min = str3;
        }

        return min;
    }
}


