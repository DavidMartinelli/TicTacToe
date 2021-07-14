package com.company;

public class Main  
{
    static public  Player player1 = new Player ();
    static public TicTacToe tris = new TicTacToe();
    static public Bot cpu = new Bot();

    public static void main(String[] args) 
    {
        while(tris.isGameEnded()!=true)
        {
            tris.PrintGameTable();
            System.out.println("Inserisci la casella dove vuoi che venga inserita la tua 'X' (1-9)");
            tris.setC("player");
            player1.SetPosition();
            tris.Place(player1.GetPosition());
            tris.PrintGameTable();
            System.out.println("Inserimento da parte del bot");
            tris.setC("cpu");
            cpu.SetPosition();
            tris.Place(cpu.GetPosition());
            tris.CheckWin();
        }
    }
}
