package com.noteproject.demo.partOne.knights;

import com.noteproject.demo.partOne.quests.RescueDamselQuest;

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();   // This is tightly coupled to RescueDamselQuest
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
