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
        if(pos>=0&&pos<=9)
        {
            this.pos = pos;
        }
        else
        {
            System.out.println("retry");
            SetPosition();
        }

    }

}
