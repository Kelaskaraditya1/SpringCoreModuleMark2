package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling;

public class GameRunner {

    private final GamingConsole gamingConsole;

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
