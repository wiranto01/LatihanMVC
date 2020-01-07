/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wiranto.latihanmvc.controller;

import edu.wiranto.latihanmvc.model.PelangganModel;
import edu.wiranto.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * NIM : 10118056
 * NAMA : MIRRAZ IBRAHIM
 * KELAS : IF-2
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
    
        if (nama.equals("")&& email.equals("")&& noTelp.equals("")) {
            
        }else{
        
            model.resetForm();
            
        }
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        }else if (noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
        }else{
            model.simpanForm();
        }
        
    }
}
