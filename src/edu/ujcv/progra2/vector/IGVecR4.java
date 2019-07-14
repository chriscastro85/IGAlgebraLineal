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
        this.z = 0;
    }
    public IGVecR4(double x, double y, double z, double w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    public IGVecR4(IGVecR4 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
        this.w = b.w;
    }
    
    public IGVecR4 suma(IGVecR4 b){
        IGVecR4 a1 = new IGVecR4();
        a1.x = x + b.x;
        a1.y = y + b.y;
        a1.z = z + b.z;
        a1.w = w + b.w;
        return a1;

    }

    public IGVecR4 resta(IGVecR4 b){
        IGVecR4 a1 = new IGVecR4();
        a1.x = x - (b.x);
        a1.y = y - (b.y);
        a1.z = z - (b.z);
        a1.w = w - (b.w);
        return a1;
    }



    public double productoPunto(IGVecR4 b){
        IGVecR4 a1 = new IGVecR4();
        a1.x = x * b.x;
        a1.y = y * b.y;
        a1.z = z * b.z;
        a1.w = w * b.w;
        double a = a1.x + a1.y + a1.z + a1.w;
        return a;

    }


    // no esta definido en R4.!!!!!
    //public IGVecR4 productoCruz(IGVecR4 b){

    //}




    public double angulo(IGVecR4 b){
        IGVecR4 a1 = new IGVecR4();
        a1.x = x * b.x;
        a1.y = y * b.y;
        a1.z = z * b.z;
        a1.w = w * b.w;
        double a = a1.x + a1.y + a1.z + a1.w;
        double c = Math.sqrt(((Math.pow(b.x,2)+Math.pow(b.y,2)+Math.pow(b.z,2)+Math.pow(b.w,2))));
        double f = Math.sqrt(((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)+Math.pow(w,2))));
        double d = Math.acos((a/(c*f)));

        return d;

    }

    public double magnitud(IGVecR4 b){
        IGVecR4 a1 = new IGVecR4();
        a1.x = (b.x) - x;
        a1.y = (b.y) - y;
        a1.z = (b.z) - z;
        a1.w = (b.w) - w;
        double a = Math.pow(a1.x, 2) + Math.pow(a1.y,2) + Math.pow(a1.z,2) + Math.pow(a1.w,2);
        return Math.sqrt(a);
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

}
