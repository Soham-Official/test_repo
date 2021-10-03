class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int first = 0;
        int second = 1;
        if (n >= 1) {
            System.out.println(first);
        }
        if (n >= 2) {
            System.out.println(second);
        }

        if (n >= 3) {
            int temp = first + second;
            for (int j = 3; j <= n+1; j++) {
                System.out.println(temp);
                first = second;
                second = temp;
                temp = first + second;
            }
        }

    }
}
