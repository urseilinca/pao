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
public class ProgrORL extends Programare{
    private String tipControl;
    
    public ProgrORL(int id, Client client, String data, String ora, Angajat medic, String tipControl)
    {
        super(id,client,data, ora, medic);
        this.tipControl=tipControl;
    }
    
    public String getTipControl() {
        return tipControl;
    }
    
    public void setTipControl(String tipControl) {
        this.tipControl=tipControl;
    }
    
    @Override
    public String toString() {
        return super.toString() + " / " + tipControl;
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
