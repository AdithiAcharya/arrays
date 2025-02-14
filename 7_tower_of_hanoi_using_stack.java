import java.util.Stack;

class TowerOfHanoi {
    static class Move {
        int n;
        char fromRod;
        char toRod;
        char auxRod;

        Move(int n, char fromRod, char toRod, char auxRod) {
            this.n = n;
            this.fromRod = fromRod;
            this.toRod = toRod;
            this.auxRod = auxRod;
        }
    }

    static void towerOfHanoi(int N) {
        Stack<Move> stack = new Stack<>();
        stack.push(new Move(N, 'A', 'C', 'B'));

        while (!stack.isEmpty()) {
            Move move = stack.peek();

            if (move.n == 0) {
                stack.pop();
                continue;
            }

            move.n--;

            stack.push(new Move(move.n, move.fromRod, move.auxRod, move.toRod));
            System.out.println("Move disk " + (move.n + 1) + " from rod " + move.fromRod + " to rod " + move.toRod);
            stack.push(new Move(move.n, move.auxRod, move.toRod, move.fromRod));
        }
    }

    public static void main(String[] args) {
        int N = 3;
        towerOfHanoi(N);
    }
}
