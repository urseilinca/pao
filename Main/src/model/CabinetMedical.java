/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Ilinca
 */
public class CabinetMedical {
    private Client[] clients = new Client[10];
    private Angajat[] angajati = new Angajat[10];
    private Programare[] prog = new Programare[10];

    public Client[] getClients() {
        return clients;
    }
    

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
    
    public Angajat[] getAngajati() {
        return angajati;
    }

    public void setAngajati(Angajat[] angajati) {
        this.angajati = angajati;
    }
    
    public Programare[] getProg() {
        return prog;
    }
    
    public void setProg(Programare[] prog) {
        this.prog = prog;
    }
    
    public Client getClientbyId(int id) {
        Client a = new Client();
        for (Client c : clients){
            if(c!=null){
             if(c.id==id){
                a=c;
            }
            }
        }
        return a;
    }
    
    public Angajat getAngajatbyId(int id) {
        Angajat a = new Angajat();
        for (Angajat c : angajati){
            if(c!=null){
            if(c.id==id){
                a=c;
            }
            }
        }
        return a;
    }
    
    public Programare getProgbyId(int id) {
        Programare a = new Programare();
        for (Programare c : prog){
            if(c.id==id){
                a=c;
            }
        }
        return a;
    }
    
    
}
