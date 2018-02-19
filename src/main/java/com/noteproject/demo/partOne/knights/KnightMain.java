package com.noteproject.demo.partOne.knights;

import com.noteproject.demo.partOne.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();  // for Java-based configurations
        context.register(KnightConfig.class);   // Load our config file, containing our bean definitions
        context.refresh();  // Refresh the context - this is mandatory, or else an error pops up (investigate?)

        // Using the application context as a factory
        Knight testKnight = (Knight) context.getBean("knight");
        testKnight.embarkOnQuest();
    }
}
