/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.*;
import service.*;

import java.util.*;


/**
 *
 * @author Ilinca
 */
public class Application {
    
    public static void main(String[] args) {
        CabinetMedical cabmed = new CabinetMedical();
        Service service = new Service();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please type one of the following commands: add, view or exit");
            String line = scanner.nextLine();
            switch(line) {
                case "add" :
                    System.out.println("Please choose whether you want to add a client, a doctor or an appointment: ");
                    String productType = scanner.nextLine();
                    switch(productType) {
                        case "client" : {
                            System.out.println("Please specify whether the client is a minor or not a minor");
                            String clientType=scanner.nextLine();
                            switch(clientType){
                                case "minor": {
                                    System.out.println("Please specify the client's details: name/cnp/varsta/email/phone number/cnpadult");
                                    service.addClient(cabmed, buildClientMinor(scanner.nextLine()));
                                    break;
                                }
                                case "not a minor": {
                                    System.out.println("Please specify the client's details: name/cnp/varsta/email/phone number");
                                    service.addClient(cabmed, buildClient(scanner.nextLine()));
                                    break;
                                }
                                default: System.out.println("This client type doesn't exist.");
                            }
                         break; 
                        }
                        case "doctor" : {
                            System.out.println("Please specify the doctor's details: " +
                                    "doctor's details: name/cnp/varsta/email/phone number");
                            service.addAngajat(cabmed, buildAngajat(scanner.nextLine()));
                            break;
                        }
                        case "appointment" : {
                            System.out.println("Please specify the appointment type: orl/oft/dermato");
                            String appointmenttype = scanner.nextLine();
                            switch(appointmenttype) {
                                case "orl": {
                                   System.out.println("Please specify the ORL appointment's details: idclient/date/time/idmedic/type");
                                   service.addProg(cabmed, buildProgrORL(scanner.nextLine(),cabmed));
                                   break;
                                }
                                case "oft": {
                                   System.out.println("Please specify the ORL appointment's details: idclient/date/time/idmedic/dioptrii");
                                   service.addProg(cabmed, buildProgrOFT(scanner.nextLine(),cabmed));
                                   break;
                                }
                                case "dermato": {
                                   System.out.println("Please specify the Dermato appointment's details: idclient/date/time/idmedic/acnee");
                                   service.addProg(cabmed, buildProgrDermato(scanner.nextLine(),cabmed));
                                   break;
                                }
                                default:System.out.println("This appointment type doesn't exist.");
                            }
                        break;
                        }
                        default : System.out.println("This type doesn't exist.");
                    }
                    break;
                case "view" : {
                    System.out.println("Please specify whether you want to view the clients, the doctors or the appointments:");
                    String viewtype = scanner.nextLine();
                    switch(viewtype) {
                        case "clients": {
                          service.printClientsDetails(cabmed);
                          break;  
                        }
                        case "doctors": {
                          service.printAngajatiDetails(cabmed);
                          break;  
                        }
                        case "appointments": {
                          service.printProgDetails(cabmed);
                          break;  
                        }
                        default: System.out.println("This type doesn't exist.");
                    }
                    break;
                }
                case "exit" :
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                default : System.out.println("This command doesn't exist.");
            }

        }

    }

    private static Client buildClient(String clientDetails) {
        String[] attributes = clientDetails.split("/");
        String nume = attributes[0];
        String cnp = attributes[1];
        int varsta = Integer.valueOf(attributes[2]);
        String email = attributes[3];
        String nrtelef = attributes[4];
        return new Client(new Random().nextInt(100),
                nume, cnp, varsta, email, nrtelef);
    }
    
    private static Client buildClientMinor(String clientDetails) {
        String[] attributes = clientDetails.split("/");
        String nume = attributes[0];
        String cnp = attributes[1];
        int varsta = Integer.valueOf(attributes[2]);
        String email = attributes[3];
        String nrtelef = attributes[4];
        String CNPAdult = attributes[5];
        return new ClientMinor(new Random().nextInt(100),
                nume, cnp, varsta, email, nrtelef,CNPAdult);
    }
    
    private static Angajat buildAngajat(String angajatDetails) {
        String[] attributes = angajatDetails.split("/");
        String nume = attributes[0];
        String cnp = attributes[1];
        int varsta = Integer.valueOf(attributes[2]);
        String email = attributes[3];
        String nrtelef = attributes[4];
        return new Angajat(new Random().nextInt(100),
                nume, cnp, varsta, email, nrtelef);
    }
    
    private static Programare buildProgrORL(String progrDetails, CabinetMedical cabmed) {
        String[] attributes = progrDetails.split("/");
        int idclient = Integer.valueOf(attributes[0]);
        //Client client = new Client();
        Client client = cabmed.getClientbyId(idclient);
        String data = attributes[1];
        String ora = attributes[2];
        int iddoctor = Integer.valueOf(attributes[3]);
        Angajat medic = cabmed.getAngajatbyId(iddoctor);
        String tipControl = attributes[4];
        return new ProgrORL(new Random().nextInt(100),
                client, data, ora, medic, tipControl);
    }
    
    private static Programare buildProgrOFT(String progrDetails, CabinetMedical cabmed) {
        String[] attributes = progrDetails.split("/");
        int idclient = Integer.valueOf(attributes[0]);
        Client client = cabmed.getClientbyId(idclient);
        String data = attributes[1];
        String ora = attributes[2];
        int iddoctor = Integer.valueOf(attributes[3]);
        Angajat medic = cabmed.getAngajatbyId(iddoctor);
        double dioptrie = Double.valueOf(attributes[4]);
        return new ProgrOFT(new Random().nextInt(100),
                client, data, ora, medic, dioptrie);
    }
    
    private static Programare buildProgrDermato(String progrDetails, CabinetMedical cabmed) {
        String[] attributes = progrDetails.split("/");
        int idclient = Integer.valueOf(attributes[0]);
        Client client = cabmed.getClientbyId(idclient);
        String data = attributes[1];
        String ora = attributes[2];
        int iddoctor = Integer.valueOf(attributes[3]);
        Angajat medic = cabmed.getAngajatbyId(iddoctor);
        boolean acnee = Boolean.valueOf(attributes[4]);
        return new ProgrDermato(new Random().nextInt(100),
                client, data, ora, medic, acnee);
    }

}
