/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;
import config.*;
import model.*;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Ilinca
 */
public class CabinetMedicalrepository {
    
    public void addClient(CabinetMedical cabmed,Client client) {
        String sql = "insert into clients values (?, ?, ?, ?, ?,?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
          statement.setDouble(1, client.getId());
          statement.setString(2, client.getName());
          statement.setString(3, client.getCNP());
          statement.setDouble(4, client.getVarsta());
          statement.setString(5, client.getEmail());
          statement.setString(6, client.getNrTelef());
          statement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
   public Optional<Client> getClientById(int id) {
        String sql = "select * from clients ba where ba.id = ?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                //i have at least one record in the result set
                int clientId = result.getInt(1);
                String nume = result.getString("nume");
                String cnp = result.getString("cnp");
                int varsta = result.getInt("varsta");
                String email = result.getString("email");
                String nrtelef = result.getString("nrtelef");
                return Optional.of(new Client(clientId, nume, cnp, varsta, email, nrtelef));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
   
   public void deleteClientById(int id) {
        String sql = "delete from clients where id = ?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();
            //ResultSet result = statement.executeUpdate(sql);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
   
   public void updateClientById(CabinetMedical cabmed,int id,Client client) {
        String sql = "update clients set nume=?, cnp=?, varsta=?, email=?, nrtelef=? where id=?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
          statement.setString(1, client.getName());
          statement.setString(2, client.getCNP());
          statement.setDouble(3, client.getVarsta());
          statement.setString(4, client.getEmail());
          statement.setString(5, client.getNrTelef());
          statement.setDouble(6, client.getId());
          statement.executeUpdate();
            //ResultSet result = statement.executeUpdate(sql);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void addAngajat(CabinetMedical cabmed,Angajat angajat) {
        String sql = "insert into angajati values (?, ?, ?, ?, ?,?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
          statement.setDouble(1, angajat.getId());
          statement.setString(2, angajat.getName());
          statement.setString(3, angajat.getCNP());
          statement.setDouble(4, angajat.getVarsta());
          statement.setString(5, angajat.getEmail());
          statement.setString(6, angajat.getNrTelef());
          statement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Optional<Angajat> getAngajatById(int id) {
        String sql = "select * from angajati ba where ba.id = ?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setLong(1, id);
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                //i have at least one record in the result set
                int clientId = result.getInt(1);
                String nume = result.getString("nume");
                String cnp = result.getString("cnp");
                int varsta = result.getInt("varsta");
                String email = result.getString("email");
                String nrtelef = result.getString("nrtelef");
                return Optional.of(new Angajat(clientId, nume, cnp, varsta, email, nrtelef));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
    
    public void deleteAngajatById(int id) {
        String sql = "delete from angajati where id = ?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();
            //ResultSet result = statement.executeUpdate(sql);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void updateAngajatById(CabinetMedical cabmed,int id,Angajat client) {
        String sql = "update angajati set nume=?, cnp=?, varsta=?, email=?, nrtelef=? where id=?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
          statement.setString(1, client.getName());
          statement.setString(2, client.getCNP());
          statement.setDouble(3, client.getVarsta());
          statement.setString(4, client.getEmail());
          statement.setString(5, client.getNrTelef());
          statement.setDouble(6, client.getId());
          statement.executeUpdate();
            //ResultSet result = statement.executeUpdate(sql);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void addProgr(CabinetMedical cabmed,Programare prog) {
        String sql = "insert into appts values (?, ?, ?, ?, ?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
          statement.setDouble(1, prog.getId());
          statement.setDouble(2, prog.getClient().getId());
          statement.setString(3, prog.getData());
          statement.setString(4, prog.getOra());
          statement.setDouble(5, prog.getMedic().getId());
          //statement.setDouble(6, prog.getDioptrie());
          statement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void deleteProgr(int id) {
        String sql = "delete from appts where id = ?";
        try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();
            //ResultSet result = statement.executeUpdate(sql);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    

    
    //public void addProgr(CabinetMedical cabmed,ProgrORL prog) {
    //    String sql = "insert into appts2 values (?, ?, ?, ?, ?,?) ";
    //    try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
    //      statement.setDouble(1, prog.getId());
    //      statement.setDouble(2, prog.getClient().getId());
    //      statement.setString(3, prog.getData());
    //      statement.setString(4, prog.getOra());
    //      statement.setDouble(5, prog.getMedic().getId());
    //      statement.setString(6, prog.getTipControl());
    //      statement.executeUpdate();
    //    } catch(SQLException e) {
    //        e.printStackTrace();
    //    }
    //}
    
    //public void deleteProgrORL(int id) {
    //    String sql = "delete from appts2 where id = ?";
    //    try(PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {
    //        statement.setLong(1, id);
    //        statement.executeUpdate();
    //       //ResultSet result = statement.executeUpdate(sql);
    //    } catch(SQLException e) {
    //        e.printStackTrace();
     //   }
    //}
}
