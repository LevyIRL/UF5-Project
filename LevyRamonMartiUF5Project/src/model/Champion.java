/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author levy
 */
public class Champion {
    private String name;
    private Role role;
    private double winrate;
    private double pickrate;
    private double banrate;
    private boolean isRanged;

    public Champion(String name, Role role, double winrate, double pickrate, double banrate, boolean isRanged) {
        this.name = name;
        this.role = role;
        this.winrate = winrate;
        this.pickrate = pickrate;
        this.banrate = banrate;
        this.isRanged = isRanged;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public double getWinrate() {
        return winrate;
    }
    public void setWinrate(double winrate) {
        this.winrate = winrate;
    }

    public double getPickrate() {
        return pickrate;
    }
    public void setPickrate(double pickrate) {
        this.pickrate = pickrate;
    }

    public double getBanrate() {
        return banrate;
    }
    public void setBanrate(double banrate) {
        this.banrate = banrate;
    }

    public boolean isIsRanged() {
        return isRanged;
    }
    public void setIsRanged(boolean isRanged) {
        this.isRanged = isRanged;
    }

    @Override
    public String toString() {
        return "Champion{" + "name=" + name + ", role=" + role + ", winrate=" + winrate + ", pickrate=" + pickrate + ", banrate=" + banrate + ", isRanged=" + isRanged + '}';
    }
    
    
}
