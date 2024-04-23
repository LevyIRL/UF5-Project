/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author levy
 */
public class Champion implements Comparable<Champion>{
    private int code;
    private String name;
    private Role role;
    private Region region;
    private int winrate;
    private double pickrate;
    private double banrate;
    private boolean isRanged;

    public Champion(int code, String name, Role role, Region region, int winrate, double pickrate, double banrate, boolean isRanged) {
        this.code = code;
        this.name = name;
        this.role = role;
        this.region = region;
        this.winrate = winrate;
        this.pickrate = pickrate;
        this.banrate = banrate;
        this.isRanged = isRanged;
    }
    
    public Champion(){}

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

    public int getWinrate() {
        return winrate;
    }
    public void setWinrate(int winrate) {
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

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public Region getRegion() {
        return region;
    }
    public void setRegion(Region region) {
        this.region = region;
    }
    
    @Override
    public String toString() {
        return "Champion{" + "code=" + code + ", name=" + name + ", role=" + role.toString() + ", region=" + region.toString() + ", winrate=" + winrate + ", pickrate=" + pickrate + ", banrate=" + banrate + ", isRanged=" + isRanged + '}';
    }

    @Override
    public int compareTo(Champion o) {
        if(this.code < o.getCode()){
            return -1;
        }else if(this.code == o.getCode()){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.code;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Champion other = (Champion) obj;
        return this.code == other.code;
    }
    
    
}
