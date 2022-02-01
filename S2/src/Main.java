import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt(); //num rows
        int N = input.nextInt(); //num cols
        int K = input.nextInt(); //num actions

        Action[] actions = new Action[K];
        for (int i = 0; i < K; i++) {
            boolean direction;
            if(input.next().equals("R")){
                direction = true;  // is along rows
            }else{
                direction = false; // is along column
            }
            actions[i] = new Action(direction, input.nextInt());
        }



    }
}
class Action{
    private boolean isAlongRows;
    private int position = -1;
    public Action(boolean isAlongRows, int position){
        this.isAlongRows = isAlongRows;
        this.position = position;
    }

}
