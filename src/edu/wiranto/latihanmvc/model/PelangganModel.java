/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wiranto.latihanmvc.model;

import edu.wiranto.latihanmvc.event.PelangganListener;
import edu.wiranto.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * NIM : 10118053
 * NAMA : KEVIN ALVIAN
 * KELAS : IF-2
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String noTelp;
    
    private PelangganListener pelangganlistener;

    public PelangganListener getPelangganlistener() {
        return pelangganlistener;
    }

    public void setPelangganlistener(PelangganListener pelangganlistener) {
        this.pelangganlistener = pelangganlistener;
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganlistener!=null) {
            pelangganlistener.onChange(this);
            
        } 
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
    
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
    
    }

    public void setPelangganListener(PelangganView aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
