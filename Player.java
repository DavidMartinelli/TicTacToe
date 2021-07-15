package com.company;

import java.util.Scanner;

public class Player
{

    protected int pos;



    public int GetPosition()
    {
        return pos;
    }
    public void SetPosition()
    {
        Scanner scan = new Scanner(System.in);
        int pos = scan.nextInt();
        this.pos = pos;
    }


}
