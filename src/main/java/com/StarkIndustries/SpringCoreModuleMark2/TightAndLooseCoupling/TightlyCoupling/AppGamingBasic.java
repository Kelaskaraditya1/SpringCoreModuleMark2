package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.TightlyCoupling;

public class AppGamingBasic {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        ContraGame contraGame = new ContraGame();
        GameRunner gameRunner = new GameRunner(contraGame);
        gameRunner.run();

    }
}
