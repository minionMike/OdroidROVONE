/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odroidrovone;
import org.opencv.core.Core;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Morten
 */
public class OdroidROVONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        ImageViewer v = new ImageViewer();
        UVC c = new UVC();
        c.openCam();
        v.show(c.getNextFrame());
        
        InetAddress IPAddress;
        try {
            IPAddress = InetAddress.getByName("localhost");
            System.out.println(IPAddress);
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(OdroidROVONE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
