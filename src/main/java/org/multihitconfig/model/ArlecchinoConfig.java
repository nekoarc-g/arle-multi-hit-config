package org.multihitconfig.model;

import java.util.List;


public class ArlecchinoConfig {
    private String name;
    private String description;
    private List<Targets> targets;

    public ArlecchinoConfig() {
    }

    public ArlecchinoConfig(String name, String description, List<Targets> targets) {
        this.name = name;
        this.description = description;
        this.targets = targets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Targets> getTargets() {
        return targets;
    }

    public void setTargets(List<Targets> targets) {
        this.targets = targets;
    }

    @Override
    public String toString() {
        return "ArlecchinoConfig{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", targets=" + targets +
                '}';
    }
}
