package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.UsingSpringFrameWork;

import com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling.GameRunner;
import com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling.GamingConsole;
import com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean(name = "GamingConsole")
    public GamingConsole getGamingConsole(){
        var game = new PacMan();
        return game;
    }

    @Bean(name = "GameRunner")
    public GameRunner getGameRunner(GamingConsole GamingConsole){
        var gameRunner = new GameRunner(GamingConsole);
        return gameRunner;
    }
}
