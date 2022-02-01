

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

        for (int i = 0; i < K; i++) {
            String tempB = input.next();
            int pos = input.nextInt()-1;

            if(tempB.equals("R")){
                for (int j = 0; j < N; j++) {
                    table[pos][j] = !table[pos][j];
                    if(table[pos][j]){
                        numGold++;
                    }else{
                        numGold--;
                    }
                }
            }else{
                for (int j = 0; j < M; j++) {
                    table[j][pos] = !table[j][pos];
                    if(table[j][pos]){
                        numGold++;
                    }else{
                        numGold--;
                    }

                }
            }

        }
        System.out.println(numGold);
    }
    }



