package algorithms.backtracking.booglewordsearch;

import java.util.List;

public class BoogleWordSearch {
    static final List<String> dictionary=List.of("RAY","APPLE","FAKE","BOOKS");
    static int M=4,N=4;
    public static void main(String[] args) {
         char boggle[][]={{'T','Y','R','S'},
                 {'N','U','A','K'},
                 {'Z','F','E','O'},
                 {'A','C','B','O'}};
         int visited[][]=new int[M][N];
         String str=" ";
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                findWords(boggle,visited,i,j,str);
            }
        }
    }
    private static void findWords(char[][] boggle,int[][] visited,int i,int j,String word){
        visited[i][j]=1;
        word+=boggle[i][j];

        if(dictionary.contains(word)){
            System.out.println(word);
        }

        for (int row = 0; row <= i+1; row++) {
            for (int col = 0; col <= j+1; col++) {
                if (isValid(row, col, visited)) {
                    findWords(boggle, visited, row, col, word);
                }
            }
        }
        visited[i][j]=0;
    }
    private static boolean isValid(int row,int col,int[][] visited){
        return (row>=0&&row<M&&
                col>=0&&col<N&&
                visited[row][col]==0);
    }
}
