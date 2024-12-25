package com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling;

import com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling.GameRunner;
import com.StarkIndustries.SpringCoreModuleMark2.TightAndLooseCoupling.LooselyCoupling.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean(name = "Pacman")
    public PacMan getGamingConsole(){
        return new PacMan();
    }

    @Bean(name = "GameRunner")
    public GameRunner getGameRunner(GamingConsole Pacman){
        return new GameRunner(Pacman);
    }
}
