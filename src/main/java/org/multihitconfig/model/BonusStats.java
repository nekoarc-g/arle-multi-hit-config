package org.multihitconfig.model;

public class BonusStats {
    private double all_dmgInc;
    private double atk;
    private double atk_;
    private double pyro_dmg_;
    private double all_dmg_;
    private double pyro_enemyRes_;
    private double normal_dmgInc;

    public BonusStats() {
    }

    public BonusStats(double all_dmgInc, double atk, double atk_, double pyro_dmg_, double all_dmg_, double pyro_enemyRes_, double normal_dmgInc) {
        this.all_dmgInc = all_dmgInc;
        this.atk = atk;
        this.atk_ = atk_;
        this.pyro_dmg_ = pyro_dmg_;
        this.all_dmg_ = all_dmg_;
        this.pyro_enemyRes_ = pyro_enemyRes_;
        this.normal_dmgInc = normal_dmgInc;
    }

    public double getAll_dmgInc() {
        return all_dmgInc;
    }

    public void setAll_dmgInc(double all_dmgInc) {
        this.all_dmgInc = all_dmgInc;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getAtk_() {
        return atk_;
    }

    public void setAtk_(double atk_) {
        this.atk_ = atk_;
    }

    public double getPyro_dmg_() {
        return pyro_dmg_;
    }

    public void setPyro_dmg_(double pyro_dmg_) {
        this.pyro_dmg_ = pyro_dmg_;
    }

    public double getAll_dmg_() {
        return all_dmg_;
    }

    public void setAll_dmg_(double all_dmg_) {
        this.all_dmg_ = all_dmg_;
    }

    public double getPyro_enemyRes_() {
        return pyro_enemyRes_;
    }

    public void setPyro_enemyRes_(double pyro_enemyRes_) {
        this.pyro_enemyRes_ = pyro_enemyRes_;
    }

    public double getNormal_dmgInc() {
        return normal_dmgInc;
    }

    public void setNormal_dmgInc(double normal_dmgInc) {
        this.normal_dmgInc = normal_dmgInc;
    }
}
