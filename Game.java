package com.company;
public class Game
{
    private  Player player1 = new Player ();
    private TicTacToe tris = new TicTacToe();
    private Bot cpu = new Bot();

    public void Play()
    {
        tris.PrintGameTable();
        while(!tris.isGameEnded())
        {
            tris.PrintGameTable();
            tris.CheckWin();
            System.out.println("Inserisci la tua mossa (1-9)");
            tris.setC("player");
            SetPlayerMove();
            tris.PrintGameTable();
            tris.setC("cpu");
            SetBotMove();
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
    public void  SetPlayerMove()
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
    public  void SetBotMove()
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