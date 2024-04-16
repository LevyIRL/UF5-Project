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
    private String role;
    private String type;
    private double winrate;
    private double pickrate;
    private double banrate;

    public Champion(String name, String role, String type, double winrate, double pickrate, double banrate) {
        this.name = name;
        this.role = role;
        this.type = type;
        this.winrate = winrate;
        this.pickrate = pickrate;
        this.banrate = banrate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        return "Champion{" + "name=" + name + ", role=" + role + ", type=" + type + ", winrate=" + winrate + ", pickrate=" + pickrate + ", banrate=" + banrate + '}';
    }
}
