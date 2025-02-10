class Main {
    public static void main(String[] args) {
        printNumbers(5);
    }
    
    public static void printNumbers(int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
}
