package problem_36_valid_sudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

static char[][] grid = { {'1','2','3','.','.','.','.','.','.'}
                        ,{'4','5','6','.','.','.','.','.','.'}
                        ,{'7','8','9','.','.','.','.','.','.'}
                        ,{'1','2','3','.','.','.','.','.','.'}
                        ,{'5','6','.','.','.','.','.','.','.'}
                        ,{'7','.','8','.','.','.','.','.','.'}
                        ,{'.','8','9','.','.','.','.','.','.'}
                        ,{'8','9','1','.','.','.','.','.','.'}
                        ,{'9','1','2','.','.','.','.','.','.'}};

    public static void main(String[] args) {
    isValidSudoku(grid);
    }
    public static boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++){
            Map<Character, Integer> rowMap = new HashMap();
            for(int j = 0; j < 9; j++){
                if(rowMap.containsKey(board[i][j])){
                    rowMap.replace(board[i][j], 2);
                }else if (board[i][j] != '.'){
                    rowMap.put(board[i][j], 1);
                }
            }
            System.out.println(rowMap);
            if(rowMap.containsValue(2)){
                return false;
            }
        }

        for(int i = 0; i < 9; i++){
            Map<Character, Integer> colMap = new HashMap();
            for(int j = 0; j < 9; j++){
                if(colMap.containsKey(board[j][i])){
                    colMap.replace(board[j][i], 2);
                }else if (board[j][i] != '.'){
                    colMap.put(board[j][i], 1);
                }
            }
            System.out.println(colMap);
            if(colMap.containsValue(2)){
                return false;
            }
        }

        for(int startX = 0; startX < 9; startX += 3){
            for(int startY = 0; startY <9; startY += 3){

                Map<Character, Integer> boxMap = new HashMap();
                for(int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++) {
                        if(boxMap.containsKey(board[startX+i][startY+j])){
                            boxMap.replace(board[startX+i][startY+j], 2);
                        }else if (board[startX+i][startY+j] != '.'){
                            boxMap.put(board[startX+i][startY+j], 1);
                        }
                    }
                }
                System.out.println(boxMap);
                if(boxMap.containsValue(2)){
                    return false;
                }
            }
        }


        return true;
    }
}
