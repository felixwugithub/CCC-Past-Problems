import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(); //num rows
        int N = input.nextInt(); //num cols
        int K = input.nextInt(); //num actions
        int numGold = 0;

        boolean[][] table = new boolean[M][N]; //false = black, true = gold

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                table[i][j] = false;
            }
        }

        Action[] actions = new Action[K];
        for (int i = 0; i < K; i++) {
            boolean direction;
            if (input.next().equals("R")) {
                direction = true;  // is along rows
            } else {
                direction = false; // is along column
            }
            actions[i] = new Action(direction, input.nextInt());

            if(actions[i].getIsAlongRows()){
                for (int j = 0; j < N; j++) {
                  table[actions[i].getPosition()][j] = !table[actions[i].getPosition()][j];
                }
            }else{
                for (int j = 0; j < M; j++) {
                    table[j][actions[i].getPosition()] = !table[j][actions[i].getPosition()];
                }

            }

        }

        for (int i = 0; i < actions.length; i++) {
            System.out.println(actions[i]);

        }


        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(table[i][j]){
                    numGold ++;
                }
            }
        }
        System.out.print(numGold);
}


static class Action {
    private boolean isAlongRows;
    private int position = -1;

    public Action(boolean isAlongRows, int position) {
        this.isAlongRows = isAlongRows;
        this.position = position - 1;
    }

    public String toString(){
        String returnStatement = String.valueOf(isAlongRows) + "," + String.valueOf(position);
        return returnStatement;
    }

    public int getPosition() {
        return position;
    }

    public boolean getIsAlongRows() {
        return isAlongRows;
    }
}
}

