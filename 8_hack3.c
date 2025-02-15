public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    StringBuilder sb=new StringBuilder();
    
    
    Stack<String> history = new Stack<>();  
    int n = sc.nextInt();
    sc.nextLine();
    
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < n; i++) {
        String[] command = sc.nextLine().split(" ");
        int operation = Integer.parseInt(command[0]);

        switch (operation) {
            case 1: 
              
                String W = command[1];  
                history.push(sb.toString());   
                sb.append(W);
                break;

            case 2: 
               
                int k = Integer.parseInt(command[1]);
                history.push(sb.toString()); 
                if (k <= sb.length()) {
                    sb.delete(sb.length() - k, sb.length());
                }
                break;

            case 3: 
              
                int kPrint = Integer.parseInt(command[1]) - 1; 
                if (kPrint >= 0 && kPrint < sb.length()) {
                    output.append(sb.charAt(kPrint)).append('\n');
                }
                break;

            case 4: 
               
                if (!history.isEmpty()) {
                    sb = new StringBuilder(history.pop()); 
                }
                break;
        }
    }

    System.out.print(output.toString());  
    sc.close();
}
