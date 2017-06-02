package com.model;

import javax.persistence.Embeddable;

/**
 * Created by vinod on 5/25/2017.
 */
@Embeddable
public class Tires {
    private int frontLeft;
    private int frontRight;
    private int rearLeft;
    private int rearRight;

    public enum CarTire{
        LEFTFRONT,
        LEFTRIGHT,
        RIGHTREAR,
        RIGHTFRONT;

    }


    public int getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(int frontLeft) {
        this.frontLeft = frontLeft;
    }

    public int getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(int frontRight) {
        this.frontRight = frontRight;
    }

    public int getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(int rearLeft) {
        this.rearLeft = rearLeft;
    }

    public int getRearRight() {
        return rearRight;
    }

    public void setRearRight(int rearRight) {
        this.rearRight = rearRight;
    }


public boolean isTirePressureValid(){
    return (frontLeft<32||frontLeft>36)&&(frontRight<32||frontRight>36)&&(rearLeft<32||rearLeft>36)&&(rearRight<32||rearRight>36);

}
}
