/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicionmartesayala.modelos;

/**
 *
 * @author ROCIO
 */
public class constructorresults {
    private  int constructorResultId;
    private  int raceId;
    private  int constructorId;
    private  float points;
    private  String status;

    public constructorresults(int constructorResultId, int raceId, int constructorId, float points, String status) {
        this.constructorResultId = constructorResultId;
        this.raceId = raceId;
        this.constructorId = constructorId;
        this.points = points;
        this.status = status;
    }

    public int getConstructorResultId() {
        return constructorResultId;
    }

    public int getRaceId() {
        return raceId;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public float getPoints() {
        return points;
    }

    public String getStatus() {
        return status;
    }
    
    
}
