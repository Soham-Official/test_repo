class PrimeRange {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        for (int j = a; j <= b; j++) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(j);
            }
        }

    }
}
