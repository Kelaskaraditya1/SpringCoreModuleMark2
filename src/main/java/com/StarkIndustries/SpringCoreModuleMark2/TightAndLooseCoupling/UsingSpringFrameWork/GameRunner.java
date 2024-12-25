package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.UsingSpringFrameWork;

import com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling.GamingConsole;

public class GameRunner {

    private final com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling.GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole){
        this.gamingConsole=gamingConsole;
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.up();
        gamingConsole.right();
    }

    public void run(){
        System.out.println("Running Game:"+this.gamingConsole);
    }
}
