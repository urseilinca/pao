/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.*;
import repository.*;
import java.util.*;

/**
 *
 * @author Ilinca
 */
public class Service {
    //angajat
    
     private CabinetMedicalrepository CabinetMedicalrepository;
     
     public Service() {
        this.CabinetMedicalrepository = new CabinetMedicalrepository();
    }
     
    public void addAngajat(CabinetMedical cabmed, Angajat angajat) {
        //int nr;
        //nr=getNumberOfAngajati(cabmed);
        //angajat.setId(nr);
        //int nextAvailableIndex = getNumberOfAngajati(cabmed);
        //cabmed.getAngajati()[nextAvailableIndex] = angajat;
        CabinetMedicalrepository.addAngajat(cabmed,angajat);
    }
    
    public void updateAngajat(CabinetMedical cabmed, int id,Angajat client) {
        //int nr;
        //nr=getNumberOfClients(cabmed);
        //client.setId(nr);
        //int nextAvailableIndex = getNumberOfClients(cabmed);
        //cabmed.getClients()[nextAvailableIndex] = client;
        CabinetMedicalrepository.updateAngajatById(cabmed,id, client);
    }
    
    
    public void addClient(CabinetMedical cabmed, Client client) {
        //int nr;
        //nr=getNumberOfClients(cabmed);
        //client.setId(nr);
        //int nextAvailableIndex = getNumberOfClients(cabmed);
        //cabmed.getClients()[nextAvailableIndex] = client;
        CabinetMedicalrepository.addClient(cabmed,client);
    }
    
    public void updateClient(CabinetMedical cabmed, int id,Client client) {
        //int nr;
        //nr=getNumberOfClients(cabmed);
        //client.setId(nr);
        //int nextAvailableIndex = getNumberOfClients(cabmed);
        //cabmed.getClients()[nextAvailableIndex] = client;
        CabinetMedicalrepository.updateClientById(cabmed,id, client);
    }
    
    //public void addProg(CabinetMedical cabmed, Programare prog) {
        //int nr;
        //nr=getNumberOfProg(cabmed);
        //prog.setId(nr);
        ///int nextAvailableIndex = getNumberOfProg(cabmed);
        //cabmed.getProg()[nextAvailableIndex] = prog;
        
    //}
    
    public void addProg(CabinetMedical cabmed,Programare prog) {
        //int nr;
        //nr=getNumberOfProg(cabmed);
        //prog.setId(nr);
        ///int nextAvailableIndex = getNumberOfProg(cabmed);
        //cabmed.getProg()[nextAvailableIndex] = prog;
        CabinetMedicalrepository.addProgr(cabmed,prog);
    }
    
    //public void deleteProgrOFT(CabinetMedical cabmed, int id){
    //    CabinetMedicalrepository.deleteProgrOFT(id);
    //}
    
    public void addProgORL(CabinetMedical cabmed, ProgrORL prog) {
        //int nr;
        //nr=getNumberOfProg(cabmed);
        //prog.setId(nr);
        ///int nextAvailableIndex = getNumberOfProg(cabmed);
        //cabmed.getProg()[nextAvailableIndex] = prog;
        CabinetMedicalrepository.addProgr(cabmed,prog);
    }
    
    public void deleteProgr(CabinetMedical cabmed,int id){
        CabinetMedicalrepository.deleteProgr(id);
    }

    public void printAngajatiDetails(CabinetMedical cabmed) {
        for(Angajat a : cabmed.getAngajati()) {
            if(a != null) {
                System.out.println(a);
            }
        }
    }
    
    
     public Optional<Client> getClientById(CabinetMedical cabmed,int id) {
        return CabinetMedicalrepository.getClientById(id);
    }
     
     public Optional<Angajat> getAngajatById(CabinetMedical cabmed,int id) {
        return CabinetMedicalrepository.getAngajatById(id);
    }
     
     public void deleteClientById(CabinetMedical cabmed,int id) {
        CabinetMedicalrepository.deleteClientById(id);
    }
     
      public void deleteAngajatById(CabinetMedical cabmed,int id) {
        CabinetMedicalrepository.deleteAngajatById(id);
    }
    
    public void printProgDetails(CabinetMedical cabmed) {
        for(Programare a : cabmed.getProg()) {
            if(a != null) {
                System.out.println(a);
            }
        }
    }

    private int getNumberOfProg(CabinetMedical cabmed) {
        int numberOfProg = 0;
        for(Programare a : cabmed.getProg()) {
            if(a != null) {
                numberOfProg++;
            }
        }
        return numberOfProg;
    }
    
    private int getNumberOfAngajati(CabinetMedical cabmed) {
        int numberOfAngajati = 0;
        for(Angajat a : cabmed.getAngajati()) {
            if(a != null) {
                numberOfAngajati++;
            }
        }
        return numberOfAngajati;
    }
    
    public int getNumberOfClients(CabinetMedical cabmed) {
        int numberOfClients = 0;
        for(Client a : cabmed.getClients()) {
            if(a != null) {
                numberOfClients++;
            }
        }
        return numberOfClients;
    }
    
//    public Client getClientbyId(int id,CabinetMedical cabmed) {
//        Client a = new Client();
//        for (Client c : cabmed.getClients()){
//             if(c.getId()==id){
//                a=c;
//            }
//        }
//        return a;
//    }
    
}
