package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LooseCouplingMain {
    @Bean(name = "Pacman")
    public PacMan getGamingConsole(){
        return new PacMan();
    }

    @Bean(name = "GameRunner")
    public GameRunner getGameRunner(GamingConsole Pacman){
        return new GameRunner(Pacman);
    }

    public static void main(String[] args) {

//        var marioGame = new MarioGame();
//        var contraGame = new ContraGame();
//        var pacmanGame = new PacMan();
//        GameRunner runner1 = new GameRunner(marioGame);
//        GameRunner runner2 = new GameRunner(contraGame);
//        GameRunner runner3 = new GameRunner(pacmanGame);
////        runner1.run();
////        runner2.run();
//        runner3.run();

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
//        context.getBean("Pacman", PacMan.class).down();
//        context.getBean("GameRunner",GameRunner.class).run();



    }
}
