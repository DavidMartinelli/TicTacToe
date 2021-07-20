package com.company;

public class TicTacToe
{
    char player;
    public boolean gameEnded = false;
    private boolean isInputOk = true;
    private String winner;
    public String GetWinner()
    {
        return winner;
    }
    public boolean isInputOk()
    {
        return isInputOk;
    }
    public boolean isGameEnded()
    {
        return gameEnded;
    }
    private char[][] board = new char [3][3];
    public void printGameBoard()
    {
        for(char[] arr : board)
        {
            System.out.println("===============");
            for(char c: arr)
            {
                if (c==0)
                {
                    c=' ';
                }
                System.out.printf("| %c |",c);

            }

            System.out.println("");
        }
        System.out.println("===============");
    }
    public void setC(String who)
    {
        if(who.equals("player"))
        {
            player = 'X';
        }
        else if (who.equals("cpu"))
        {
            player = 'O';
        }
    }
    public void CheckWin()
    {
        if(CheckWin('X')==true)
        {
            winner = "X";
        }
        else if(CheckWin('O')==true)
        {
            winner = "O";
        }
        else if(!CheckWin('O')&&!CheckWin('X')&&!isSpaceFounded())
        {
            gameEnded = true;
            winner = "Tie";
        }
    }
    public boolean isSpaceFounded()
    {
        int n = 0;
        boolean found = false;
        for(char arr[]: board)
        {
            for(char c : arr)
            {
                if(c ==0)
                {
                    n++;
                    found  = true;
                }
            }
        }
        if(n==0)
        {
            found = false;
        }
        return found;
    }
    public boolean CheckWin(char aCharacter)
    {
        if((board[1][0]==aCharacter&&board[1][1]==aCharacter&&board[1][2]==aCharacter)||
                (board[2][0]==aCharacter&&board[2][1]==aCharacter&&board[2][2]==aCharacter)||
                (board[0][0]==aCharacter&&board[1][0]==aCharacter&&board[2][0]==aCharacter)||
                (board[0][1]==aCharacter&&board[1][1]==aCharacter&&board[2][1]==aCharacter)||
                (board[0][2]==aCharacter&&board[1][2]==aCharacter&&board[2][2]==aCharacter)||
                (board[0][0]==aCharacter&&board[1][1]==aCharacter&&board[2][2]==aCharacter)||
                (board[0][2]==aCharacter&&board[1][1]==aCharacter&&board[2][0]==aCharacter)||
                (board[0][0]==aCharacter&&board[0][1]==aCharacter&&board[0][2]==aCharacter))
        {
            gameEnded = true;
            return true;
        }
        return false;
    }
    private void SetPlace(int i, int j)
    {

        if(board[i][j]==0)
        {
            board[i][j] = player;
            isInputOk = true;
        }
        else if (board[i][j]!=0 && player =='X')
        {
            System.out.println("Errore inserire una casella vuota");
            isInputOk = false;
        }
        else isInputOk = false;
    }
    public void Place(int pos)
    {
        switch(pos)
        {
            case 1:
                 SetPlace(0,0);
                    break;
            case 2:
                 SetPlace(0,1);
                    break;
            case 3:
                  SetPlace(0,2);
                    break;
            case 4:
                 SetPlace(1,0);
                    break;
            case 5:
                  SetPlace(1,1);
                    break;
            case 6:
                 SetPlace(1,2);
                    break;
            case 7:
                 SetPlace(2,0);
                    break;
            case 8:
                 SetPlace(2,1);
                    break;
            case 9:
                 SetPlace(2,2);
                    break;
        }
    }
}
