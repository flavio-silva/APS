package org.calculoemergiapet.model;
public class Simulacao{
    private final double r,n,f;
    public Simulacao(double r,double n,double f){this.r=r;this.n=n;this.f=f;}
    public double y(){return r+n+f;} public double ren(){return y()==0?0:r/y()*100;}
    public double elr(){return r==0?0:(f+n)/r;} public double eir(){return (r+n)==0?0:f/(r+n);}
    public double eyr(){return f==0?0:y()/f;} public double esi(){return elr()==0?0:eyr()/elr();}
}