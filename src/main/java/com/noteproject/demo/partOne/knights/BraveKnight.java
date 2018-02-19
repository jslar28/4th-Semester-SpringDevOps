package com.noteproject.demo.partOne.knights;

import com.noteproject.demo.partOne.quests.Quest;

public class BraveKnight implements Knight {

    private Quest quest; // loose coupling to quests

    public BraveKnight(Quest quest) {   // constructor injection
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
