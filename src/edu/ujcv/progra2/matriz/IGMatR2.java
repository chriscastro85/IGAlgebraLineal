package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

public class IGMatR2 {
    // TODO: implementar.

    //double x1,y1;
    //double x2,y2;


    // double[][] m;

    //IGVecR2 f1;
    //IGVecR2 f2;

    //IGVecR2 col1;
    //IGVecR2 col2;


    private IGVecR2 colX;
    private IGVecR2 colY;


    public IGMatR2(){
        colX = new IGVecR2(1,0);
        colY = new IGVecR2(0,1);
    }

    public IGMatR2(IGVecR2 colX, IGVecR2 colY){
        this.colX = new IGVecR2(colX);
        this.colY = new IGVecR2(colY);
    }

    public IGMatR2(IGMatR2 b){
        this.colX = new IGVecR2(b.colX);
        this.colY = new IGVecR2(b.colY);
    }
    public IGVecR2 getColX() {
        return colX;
    }

    public void setColX(IGVecR2 colX) {
        this.colX = colX;
    }

    public IGVecR2 getColY() {
        return colY;
    }

    public void setColY(IGVecR2 colY) {
        this.colY = colY;
    }

    public IGVecR2 getFilaX(){
        return new IGVecR2(colX.getX(),colY.getX());
    }
    public IGVecR2 getFilaY(){
        return new IGVecR2(colX.getY(),colY.getY());
    }

    public IGMatR2 mul(IGMatR2 b){
        IGMatR2 retval = new IGMatR2();
        retval.setColX(new IGVecR2(this.getFilaX().productoPunto(b.colX), this.getFilaY().productoPunto(b.colX)));
        retval.setColY(new IGVecR2(this.getFilaX().productoPunto(b.colY),this.getFilaY().productoPunto(b.colY)));
        return retval;
    }


    public IGVecR2 colXMat(IGVecR2 fila){
        IGVecR2 retval = new IGVecR2();
        retval.setX(fila.productoPunto(this.getFilaX()));
        retval.setY(fila.productoPunto(this.getFilaY()));
        return retval;
    }

    public IGMatR2 suma (IGMatR2 b){
        IGMatR2 retval = new IGMatR2();
        retval.setColX(this.colX.suma(b.colX));
        retval.setColY(this.colY.suma(b.colY));
        return retval;
    }

    public IGMatR2 escalarXmat(double escalar){
        IGMatR2 retval = new IGMatR2();
        retval.colX.setX(this.colX.getX() * escalar);
        retval.colX.setY(this.colX.getY() * escalar);
        retval.colY.setX(this.colY.getX() * escalar);
        retval.colY.setY(this.colY.getY() * escalar);
        return retval;
    }




}
