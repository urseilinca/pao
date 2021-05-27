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
public class ProgrOFT extends Programare {
    
    private double dioptrie;
    
    public ProgrOFT(int id, Client client, String data, String ora, Angajat medic, double dioptrie)
    {
        super(id, client,data, ora, medic);
        this.dioptrie=dioptrie;
    }
    
    public double getDioptrie() {
        return dioptrie;
    }
    
    public void setDioptrie(double dioptrie) {
        this.dioptrie=dioptrie;
    }
    
    @Override
    public String toString() {
        return super.toString() + " / " + dioptrie;
    }
    
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ProgrORL prog = (ProgrORL) o;
//        return model.equals(prog.getModel());
//    }
//    
//    @Override
//    public int hashCode() {
//        return Objects.hash(model);
//    }
    
}
