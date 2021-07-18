package com.company;
public class Game
{
    private enum Turn
    {
        Player,
        Cpu
    }
    private  Player player1 = new Player ();
    private TicTacToe tris = new TicTacToe();
    private Bot cpu = new Bot();
    Turn _turn = Turn.Player;
    public void Play()
    {
        tris.printGameBoard();
        while(!tris.isGameEnded())
        {
            if(_turn ==Turn.Player)
            {
                System.out.println("Inserisci la tua mossa (1-9)");
                doPlayerTurn();
                _turn = Turn.Cpu;
            }
            else
            {
                doCpuTurn();
                _turn = Turn.Player;
            }
        }
        if(tris.GetWinner().equals("Tie"))
        {
            System.out.println("Complimenti ad entrambi , avete pareggiato");
        }
        else
        {
            System.out.printf("il giocatore %s ha vinto!",tris.GetWinner());
        }
    }
    private void  SetPlayerMove()
    {
        if(tris.isSpaceFounded())
        {
            player1.SetPosition();
            tris.Place(player1.GetPosition());
        }
        if(tris.isInputOk()==false)
        {
            SetPlayerMove();
        }
    }
    private void doCpuTurn()
    {
        tris.setC("cpu");
        SetBotMove();
        tris.printGameBoard();
        tris.CheckWin();

    }
    private void doPlayerTurn()
    {
        tris.setC("player");
        SetPlayerMove();
        tris.printGameBoard();
        tris.CheckWin();

    }
    private  void SetBotMove()
    {
        if(tris.isSpaceFounded())
        {
            cpu.SetPosition();
            tris.Place(cpu.GetPosition());
        }
        if(tris.isInputOk()==false)
        {
            SetBotMove();
        }
    }


}