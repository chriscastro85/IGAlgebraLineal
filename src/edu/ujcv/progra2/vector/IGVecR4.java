package edu.ujcv.progra2.vector;

public class IGVecR4 {

   private double x;
    private double y;
    private double z;
    private double w;

    public IGVecR4(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }

    public IGVecR4(double x, double y, double z, double a){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = a;
    }

    public IGVecR4(IGVecR4 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
        this.w = b.w;
    }

    public IGVecR4 suma(IGVecR4 b){
        IGVecR4 r = new IGVecR4();
        r.x = x + b.x;
        r.y = y + b.y;
        r.z = z + b.z;
        r.w = w + b.w;
        return r;
    }

    public IGVecR4 resta(IGVecR4 b){
        IGVecR4 r = new IGVecR4();
        r.x = x - b.x;
        r.y = y - b.y;
        r.z = z - b.z;
        r.w = w- b.w;
        return r;
    }

    public  IGVecR4 escalarPorVector(double alpha){
        IGVecR4 r = new IGVecR4();
        r.x = alpha * x;
        r.y = alpha * y;
        r.z = alpha * z;
        r.w = alpha * w;
        return r;
    }

    public double productoPunto(IGVecR4 b){
        IGVecR4 r = new IGVecR4();
        r.x = x * b.x;
        r.y = y * b.y;
        r.z = z * b.z;
        r.w = w * b.w;
        double ret = r.x + r.y + r.z + r.w;
        return ret;
    }

    public double magnitud(IGVecR4 b){
        return  Math.sqrt((Math.pow(b.x,2) + Math.pow(b.y,2) + Math.pow(b.z,2) + Math.pow(b.w,2)));
    }

    public double angulo(IGVecR4 a, IGVecR4 b){
        double r;
        r = Math.acos(a.productoPunto(b)/(magnitud(a)*magnitud(b)));
        return Math.toDegrees(r);
    }

    public double getX (){
        return x;
    }

    public void setX (double x){
        this.x = x;
    }

    public double getY (){
        return y;
    }

    public void setY (double y){
        this.y = y;
    }

    public double getZ (){
        return z;
    }

    public void setZ (double z) {
        this.z = z;
    }

    public double getW (){
        return w;
    }

    public void setW(double a){
        this.w = w;
    }
}

