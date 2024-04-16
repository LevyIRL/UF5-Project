/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;

/**
 *
 * @author levy
 */
public class characterRoster {
    private HashSet<Champion> championList;

    public characterRoster(HashSet<Champion> championList) {
        this.championList = new HashSet<Champion>();
    }

    public HashSet<Champion> getChampionList() {
        return championList;
    }

    public void setChampionList(HashSet<Champion> championList) {
        this.championList = championList;
    }
    
}
