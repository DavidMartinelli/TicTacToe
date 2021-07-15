package com.company;
public class Game
{
    private  Player player1 = new Player ();
    private TicTacToe tris = new TicTacToe();
    private Bot cpu = new Bot();

    public void Play()
    {
        tris.PrintGameTable();
        while(tris.isGameEnded()!=true)
        {

            System.out.println("Inserisci la tua mossa (1-9)");
            tris.setC("player");
            SetPlayerMove();
            tris.setC("cpu");
            SetBotMove();
            tris.PrintGameTable();
            tris.CheckWin();

        }

            System.out.printf("il vincitore è %s",tris.GetWinner());

    }
    public void  SetPlayerMove()
    {
        player1.SetPosition();
        tris.Place(player1.GetPosition());
        if(tris.isInputOk()==false)
        {
            SetPlayerMove();
        }
    }
    public  void SetBotMove()
    {
        cpu.SetPosition();
        tris.Place(cpu.GetPosition());
        if(tris.isInputOk()==false)
        {
            SetBotMove();
        }
    }


}