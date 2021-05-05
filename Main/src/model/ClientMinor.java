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
public class ClientMinor extends Client{
    String CNPAdult;
    
    public ClientMinor(int id,String nume, String cnp, int varsta, String email, String nrtelef, String CNPAdult)
    {
        super(id,nume,cnp,varsta,email,nrtelef);
        this.CNPAdult=CNPAdult;
    }
    
    public String getCNPAdult() {
        return CNPAdult;
    }
    
    public void setCNPAdult(boolean acnee) {
        this.CNPAdult=CNPAdult;
    }
    
    @Override
    public String toString() {
        return super.toString() + " / " + CNPAdult;
    }
    
}
