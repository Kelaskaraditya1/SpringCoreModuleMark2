package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling;

public class LooseCouplingMain {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var contraGame = new ContraGame();
        var pacmanGame = new PacMan();
        GameRunner runner1 = new GameRunner(marioGame);
        GameRunner runner2 = new GameRunner(contraGame);
        GameRunner runner3 = new GameRunner(pacmanGame);
//        runner1.run();
//        runner2.run();
        runner3.run();
    }
}
