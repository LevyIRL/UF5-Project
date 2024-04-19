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

    public characterRoster(String gameVersion) {
        this.gameVersion = gameVersion;
        this.championList = new HashSet<>();
        this.roleList = new ArrayList<>();
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

    public boolean addRole(Role item){
        return roleList.add(item);
    }
    
    public boolean addChamp(Champion item){
        return this.championList.add(item);
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
