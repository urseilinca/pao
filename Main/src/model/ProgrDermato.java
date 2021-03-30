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
public class ProgrDermato extends Programare{
     private boolean acnee;
    
    public ProgrDermato(int id, Client client, String data, String ora, Angajat medic, boolean acnee)
    {
        super(id,client,data, ora, medic);
        this.acnee=acnee;
    }
    
    public boolean getAcnee() {
        return acnee;
    }
    
    public void setAcnee(boolean acnee) {
        this.acnee=acnee;
    }
    
    @Override
    public String toString() {
        return super.toString() + " / " + acnee;
    }
}
