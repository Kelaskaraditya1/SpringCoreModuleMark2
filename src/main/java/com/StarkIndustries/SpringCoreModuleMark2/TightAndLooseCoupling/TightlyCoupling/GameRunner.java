package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.TightlyCoupling;

public class GameRunner {

    private MarioGame marioGame;
    private ContraGame contraGame;

    public GameRunner(MarioGame marioGame){
        this.marioGame=marioGame;
        marioGame.down();
        marioGame.left();
        marioGame.up();
        marioGame.right();
    }

    public GameRunner(ContraGame contraGame){
        this.contraGame=contraGame;
        contraGame.down();
        contraGame.left();
        contraGame.right();
        contraGame.up();
    }

    public MarioGame getMarioGame() {
        return marioGame;
    }

    public void setMarioGame(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public ContraGame getContraGame() {
        return contraGame;
    }

    public void setContraGame(ContraGame contraGame) {
        this.contraGame = contraGame;
    }

    public void run(){
        System.out.println("Running Game:"+this.getContraGame());
    }


}
