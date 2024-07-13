/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicionmartesayala.modelos;

/**
 *
 * @author ROCIO
 */
public class driverresults {
    
    private String forName;
    private String surName;
    private int wins;
    private int totalPoints;
    private int seasonRank;
   

    public driverresults( String forName, String surName, int wins, int totalPoints, int seasonRank) {
      
        this.forName = forName;
        this.surName = surName;
        this.wins = wins;
        this.totalPoints = totalPoints;
        this.seasonRank = seasonRank;
    }

   

    public String getForName() {
        return forName;
    }

    public String getSurName() {
        return surName;
    }

    public int getWins() {
        return wins;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getSeasonRank() {
        return seasonRank;
    }
}
