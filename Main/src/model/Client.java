/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ilinca
 */
public class Client {
    int id;
    String nume;
    String cnp;
    int varsta;
    String email;
    String nrtelef;
    
    public Client(){
        this.nume="";
        this.cnp="";
        this.varsta=0;
        this.email="";
        this.nrtelef="";
    }
    
    public Client(int id,String nume, String cnp, int varsta, String email, String nrtelef){
        this.id=id;
        this.nume=nume;
        this.cnp=cnp;
        this.varsta=varsta;
        this.email=email;
        this.nrtelef=nrtelef;
    }
    
    public void setName(String nume){
        this.nume=nume;
    }
    
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    
    public void setCNP(String cnp){
        this.cnp=cnp;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public void setNrTelef(String nrtelef){
        this.nrtelef=nrtelef;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return nume;
    }
    
    public int getVarsta(){
        return varsta;
    }
    
    public String getCNP(){
        return cnp;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getNrTelef(){
        return nrtelef;
    }
    
    @Override
    public String toString() {
        return id + " " +nume + " " + varsta + " " + cnp + " "+email+" "+nrtelef;

    }
}
