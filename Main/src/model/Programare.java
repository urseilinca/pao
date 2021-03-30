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
public class Programare {
    int id;
    Client client;
    String data;
    String ora;
    Angajat medic;
    
    public Programare(){
        this.client=null;
        this.data=null;
        this.ora=null;
        this.medic=null;
    }
    
    public Programare(int id,Client client,String data,String ora,Angajat medic){
        this.id=id;
        this.client=client;
        this.data=data;
        this.ora=ora;
        this.medic=medic;
    }
    
    public void setClient(Client client){
        this.client=client;
    }
    
    public void setData(String data){
        this.data=data;
    }
    
    public void setOra(String ora){
        this.ora=ora;
    }
    
    public void setMedic(Angajat medic){
        this.medic=medic;
    }
    
    public int getId(){
        return id;
    }
    
    public Client getClient(){
        return client;
    }
    
    public String getData(){
        return data;
    }
    
    public String getOra(){
        return ora;
    }
    
    public Angajat getMedic(){
        return medic;
    }
    
     @Override
    public String toString() {
        return "Client: "+client + "Doctor:"+medic+"\n" + data + " " + ora +"\n";

    }
    
}
