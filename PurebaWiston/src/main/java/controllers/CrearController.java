package controllers;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import panels.pnlCrear;
import pojo.Activos;

public class CrearController {
    private List<Activos> activosList =new ArrayList<>();
    private final pnlCrear pnlCrear;

    public CrearController(pnlCrear pnlCrear) throws FileNotFoundException {
        this.pnlCrear = pnlCrear;
        initComponent();
    }

    private void btnSaveActionListener(ActionEvent e ) throws IOException ,Exception{
       String Vehiculo , Mobiliria , Computo , Maquinaria , tipo;
       double precio = 0; 
       tipo = pnlCrear.getCmbTYpe().getSelectedItem().toString();
       Activos v = new Activos(tipo,  precio); 
       activosList.add(v);
        JOptionPane.showMessageDialog(null, "Activo Guardado SatisFactoriamente",
                "Information message", JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println(v.toString());
    }   

    private void initComponent() {
      pnlCrear.getBtnCrear().addActionListener(((e) -> {
            try {
                
                btnSaveActionListener(e);
                
                        
            } catch (Exception ex) {
                Logger.getLogger(CrearController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }));
    }
}

    
