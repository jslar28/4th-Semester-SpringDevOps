package com.noteproject.demo.partOne.knights.config;

import com.noteproject.demo.partOne.knights.BraveKnight;
import com.noteproject.demo.partOne.knights.Knight;
import com.noteproject.demo.partOne.quests.Quest;
import com.noteproject.demo.partOne.quests.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    //This defines beans and associations between the components
    //The application context loads these definitions, and wires them together

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
