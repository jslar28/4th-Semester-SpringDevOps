package com.noteproject.demo.partOne.quests;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        System.out.println("Embarked on a quest where you need to slay a dragon");
    }
}
