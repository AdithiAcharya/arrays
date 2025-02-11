class Main {
        public static int hanoimoves(int n)
        {
            return (int) Math.pow(2,n) - 1;
        }
        
        public static void hanoisolution(int n, char source, char destination, char auxillary)
        {
            if(n==1)
            {
                System.out.println("move the disc 1 from"+source+"to"+destination);
                return;
            }
            hanoisolution(n-1,source,auxillary,destination);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            hanoisolution(n-1,auxillary,destination,source);
        }
        
        public static void main(String[] args) {
            int n=4;
            System.out.println("the total number of moves " +hanoimoves(n));
            System.out.println("the sequence of moves ");
            hanoisolution(n,'A','C','B');
    }
}
