package com.company;

import java.util.Random;

public class Bot extends Player
{

    public void SetPosition()
    {
        Random rand = new Random();
        this.pos = rand.nextInt(9) + 1;
    }

}
