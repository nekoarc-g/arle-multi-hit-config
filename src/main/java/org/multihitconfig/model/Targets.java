package org.multihitconfig.model;

import java.util.List;

public class Targets {

    private int weight;
    private List<String> path;
    private String hitMode;
    private String reaction;
    private BonusStats bonusStats;
    private String description;

    public Targets() {
    }

    public Targets(List<String> path, int weight, String hitMode, String reaction, BonusStats bonusStats, String description) {
        this.path = path;
        this.weight = weight;
        this.hitMode = hitMode;
        this.reaction = reaction;
        this.bonusStats = bonusStats;
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }

    public String getHitMode() {
        return hitMode;
    }

    public void setHitMode(String hitMode) {
        this.hitMode = hitMode;
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction;
    }

    public BonusStats getBonusStats() {
        return bonusStats;
    }

    public void setBonusStats(BonusStats bonusStats) {
        this.bonusStats = bonusStats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
