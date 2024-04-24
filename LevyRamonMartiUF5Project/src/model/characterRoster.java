/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author levy
 */
public class characterRoster {
    private String gameVersion;
    private Set<Champion> championList;
    private ArrayList<Role> roleList;
    private ArrayList<Region> regionList;

    public characterRoster(String gameVersion) {
        this.gameVersion = gameVersion;
        this.championList = new HashSet<>();
        this.roleList = new ArrayList<>();
        this.regionList = new ArrayList<>();
    }

    
    public String getGameVersion() {
        return gameVersion;
    }
    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }
    
    public Set<Champion> getChampionList() {
        return championList;
    }
    public void setChampionList(Set<Champion> championList) {
        this.championList = championList;
    }

    public ArrayList<Role> getRoleList() {
        return roleList;
    }
    public void setRoleList(ArrayList<Role> roleList) {
        this.roleList = roleList;
    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }
    public void setRegionList(ArrayList<Region> regionList) {
        this.regionList = regionList;
    }
    
    

    public boolean addRole(Role item){
        return roleList.add(item);
    }
    
    public boolean addChamp(Champion item){
        return this.championList.add(item);
    }
    
    public boolean addRegion(Region item){
        return this.regionList.add(item);
    }
    
    public int searchRegion(String search){
        int pos = 0;
        for (Region region : regionList) {
            if(region.getName().equals(search)){
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    public boolean deleteChamp(int code){
        return championList.remove(searchChamp(code));
    }
    
    public Champion searchChamp(int code){
        for (Champion champion : championList) {
            if(code == champion.getCode()){
                return champion;
            }
        }
        return null;
    }

    
    
}
