package com.StarkIndustries.SpringCoreModuleMark2.AnnotationConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
    private int x;
    @Value("#{78+69}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(576)}")
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Demo(int x, int y){
        this.x=x;
        this.y=y;
    }

    public Demo(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "X:"+String.valueOf(this.getX())+" y:"+String.valueOf(this.getY()+" z:"+String.valueOf(this.getZ()));
    }
}
