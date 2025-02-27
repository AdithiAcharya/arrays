import java.util.*;

class GFG {
    static String current_state_url = "";
    static Stack<String> forward_stack = new Stack<>();
    static Stack<String> backward_stack = new Stack<>();

    static void visit_new_url(String url) {
        if (current_state_url != "") {
            backward_stack.add(current_state_url);
        }
        current_state_url = url;
    }

    static void forward() {
        if (forward_stack.isEmpty() || current_state_url == forward_stack.peek()) {
            System.out.print("Not Available\n");
            return;
        } else {
            backward_stack.add(current_state_url);
            current_state_url = forward_stack.peek();
            forward_stack.pop();
        }
    }

    static void backward() {
        if (backward_stack.isEmpty() || current_state_url == backward_stack.peek()) {
            System.out.print("Not Available\n");
            return;
        } else {
            forward_stack.add(current_state_url);
            current_state_url = backward_stack.peek();
            backward_stack.pop();
        }
    }

    static void simulatorFunction() {
        String url = "ajay.com";
        visit_new_url(url);
        System.out.print("Current URL is: " + current_state_url + " \n");

        url = "abc.com";
        visit_new_url(url);
        System.out.print("Current URL is: " + current_state_url + " \n");

        backward();
        System.out.print("Current URL after pressing Backward button is: " + current_state_url + " \n");

        forward();
        System.out.print("Current URL after pressing Forward button is: " + current_state_url + " \n");

        url = "nikhil.com";
        visit_new_url(url);
        System.out.print("Current URL is: " + current_state_url + " \n");

        forward();
        System.out.print("Current URL after pressing Forward button is: " + current_state_url + " \n");

        backward();
        System.out.print("Current URL after pressing Backward button is: " + current_state_url + " \n");
    }

    public static void main(String[] args) {
        simulatorFunction();
    }
}
