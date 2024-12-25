package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.UsingSpringFrameWork;

import com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling.GamingConsole;

public class MarioGame implements GamingConsole {
    public MarioGame(){

    }

    public void up(){
        System.out.println("Jumping Up");
    }

    public void down(){
        System.out.println("Going down the tunnel");
    }

    public void left(){
        System.out.println("Going Back");
    }

    public void right(){
        System.out.println("Accelerating speed,Run Run Run");
    }
}
