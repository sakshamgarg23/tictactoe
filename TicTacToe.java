import java.util.*;
class TicTacToe{
private static char[][] board;
private static char  Currplayer;

public static void main(String[] args){

    initializeBoard();
    printBoard();
    moveofPlayers();
    while(true){
    }
   

    }

    private static void moveofPlayers(){
    Scanner sc= new Scanner(System.in);
    while(true){
    int row,colm;
    row=sc.nextInt();
    colm=sc.nextInt();
    if(row>=0 && row<=2 && colm>=0 && colm<=2 && board[row][colm]=='-'){
    board[row][colm]=Currplayer;
    break;
    }

    else{
    System.out.print("input not valid please try again");}

    }
    }
    private static void initializeBoard(){
    board=new char[3][3];
    Currplayer='X';
    for(int i=0;i<board.length;i++){
    for(int j=0;j<board.length;j++){
    board[i][j]='-';
        }
    }
 }

    private static void printBoard(){
    //System.out.print("board");
    for(int i=0;i<board.length;i++){
    for(int j=0;j<board.length;j++){
    System.out.print(board[i][j]+ " ");
}
    System.out.println(" ");
}
}
 
    public static char[][] getBoard() {
    return board;
}

    public static void setBoard(char[][] board) {
    TicTacToe.board = board ;
}

public static char getCurrplayer() {
    return Currplayer;
}

public static void setCurrplayer(char currplayer) {
    Currplayer = currplayer;
}
}


