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

    public  static char GameTable[][] =
            {
                    {' ','|',' ','|',' '},
                    {'-','+','-','+','-'},
                    {' ','|',' ','|',' '},
                    {'-','+','-','+','-'},
                    {' ','|',' ','|',' '}
            };
    public void PrintGameTable()
    {
        for(char[] riga:GameTable)
        {
            for (char c:  riga) System.out.print(c);
            System.out.println();
        }
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
        for(char arr[]: GameTable)
        {
            for(char c : arr)
            {
                if(c == ' ')
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
        if(GameTable[0][0] == aCharacter&&GameTable[0][2]==aCharacter&&GameTable[0][4]==aCharacter||
                (GameTable[4][0]==aCharacter&&GameTable[4][2]==aCharacter&&GameTable[4][4]==aCharacter)||
                (GameTable[2][0]==aCharacter&&GameTable[2][2]==aCharacter&&GameTable[2][4]==aCharacter)||
                (GameTable[0][0]==aCharacter&&GameTable[2][0]==aCharacter&&GameTable[4][0]==aCharacter)||
                (GameTable[0][2]==aCharacter&&GameTable[2][2]==aCharacter&&GameTable[4][2]==aCharacter)||
                (GameTable[0][4]==aCharacter&&GameTable[2][4]==aCharacter&&GameTable[4][4]==aCharacter)||
                (GameTable[0][0]==aCharacter&&GameTable[2][2]==aCharacter&&GameTable[4][4]==aCharacter)||
                (GameTable[0][4]==aCharacter&&GameTable[2][2]==aCharacter&&GameTable[4][0]==aCharacter))
        {
            gameEnded = true;
            return true;
        }
        return false;
    }
    private void SetPlace(int i, int j)
    {
        if(GameTable[i][j]==' ')
        {
            GameTable[i][j] = player;
            isInputOk = true;
        }
        else if (GameTable[i][j]!=' ' && player =='X')
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
                 SetPlace(0,2);
                    break;
            case 3:
                  SetPlace(0,4);
                    break;
            case 4:
                 SetPlace(2,0);
                    break;
            case 5:
                  SetPlace(2,2);
                    break;
            case 6:
                 SetPlace(2,4);
                    break;
            case 7:
                 SetPlace(4,0);
                    break;
            case 8:
                 SetPlace(4,2);
                    break;
            case 9:
                 SetPlace(4,4);
                    break;
        }
    }
}
