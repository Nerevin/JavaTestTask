package ru.test.task19;

import java.util.ArrayList;

public abstract class StoryItem {
    ArrayList<StoryItem> killed = new ArrayList<>();
    ArrayList<StoryItem> ate = new ArrayList<>();
}
