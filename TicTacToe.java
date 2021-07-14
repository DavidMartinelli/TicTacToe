package com.company;

public class TicTacToe 
{
    char c;
    private boolean gameEnded = false;

    public void setGameEnded(boolean gameEnded) 
    {
        this.gameEnded = gameEnded;
    }


    public static char GameTable[][] =
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
            c = 'X';
        }
        else if (who.equals("cpu"))
        {
            c = 'O';
        }
    }

    public void CheckWin()
    {
        if(GameTable[0][0] == 'X'&&GameTable[0][2] == 'X'&&GameTable[0][4] == 'X'||
                (GameTable[4][0] == 'X'&&GameTable[4][2] == 'X'&&GameTable[4][4] == 'X')||
                (GameTable[2][0] == 'X'&&GameTable[2][2] == 'X'&&GameTable[2][4] == 'X')||
                (GameTable[0][0]=='X'&&GameTable[2][0]=='X'&&GameTable[4][0]=='X')||
                (GameTable[0][2]=='X'&&GameTable[2][2]=='X'&&GameTable[4][2]=='X')||
                (GameTable[0][4]=='X'&&GameTable[2][4]=='X'&&GameTable[4][4]=='X')||
                (GameTable[0][0] =='X'&&GameTable[2][2] =='X'&&GameTable[4][4] =='X')||
                (GameTable[0][4] =='X'&&GameTable[2][2] =='X'&&GameTable[4][0] =='X'))

        {
            System.out.println("IL GIOCATORE 'X' HA VINTO");
            gameEnded = true;
        }
        else if(GameTable[0][0] == 'O'&&GameTable[0][2] == 'O'&&GameTable[0][4] == 'O'||
                (GameTable[4][0] == 'O'&&GameTable[4][2] == 'O'&&GameTable[4][4] == 'O')||
                (GameTable[2][0] == 'O'&&GameTable[2][2] == 'O'&&GameTable[2][4] == 'O')||
                (GameTable[0][0] == 'O'&&GameTable[2][0] =='O'&&GameTable[4][0]=='O')||
                (GameTable[0][2] == 'O'&&GameTable[2][2] =='O'&&GameTable[4][2]=='O')||
                (GameTable[0][4] == 'O'&&GameTable[2][4] =='O'&&GameTable[4][4]=='O')||
                (GameTable[0][0] == 'O'&&GameTable[2][2] =='O'&&GameTable[4][4] =='O')||
                (GameTable[0][4] == 'O'&&GameTable[2][2] =='O'&&GameTable[4][0] =='O'))
        {
            System.out.println("IL GIOCATORE 'O' HA VINTO");
            gameEnded = true;
        }
        else
        {
            System.out.println("PAREGGIO");
        }
    }

    public void Place(int pos)
    {
        switch(pos)
        {
            case 1:
                TicTacToe.GameTable[0][0] =c ;
                break;
            case 2:
                TicTacToe.GameTable[0][2] =c;
                break;
            case 3:
                TicTacToe.GameTable[0][4]=c ;
                break;
            case 4:
                TicTacToe.GameTable[2][0] =c ;
                break;
            case 5:
                TicTacToe.GameTable[2][2] =c ;
                break;
            case 6:
                TicTacToe.GameTable[2][4]=c ;
                break;
            case 7:
                TicTacToe.GameTable[4][0] =c ;
                break;
            case 8:
                TicTacToe.GameTable[4][2] = c;
                break;
            case 9:
                TicTacToe.GameTable[4][4]= c;
                break;
        }
    }

    public boolean isGameEnded() 
    { 
        return gameEnded; 
    }

}
