package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling;

public class PacMan implements GamingConsole{

    public PacMan(){

    }

    @Override
    public void up() {
        System.out.println("Move Upwards");
    }

    @Override
    public void down() {
        System.out.println("Move Downwards");
    }

    @Override
    public void left() {
        System.out.println("Move Leftwards");
    }

    @Override
    public void right() {
        System.out.println("Move Rightwards");
    }
}