/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author levy
 */



public class Role {
    private static Map<Integer, Role> roles = new HashMap<Integer, Role>();
    
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public static Map<Integer, Role> getRoles() {
        return roles;
    }

    public static void setRoles(Map<Integer, Role> roles) {
        Role.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
