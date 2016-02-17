/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package odroidrovone;


import javax.swing.JPanel;
import org.opencv.core.Mat;

import org.opencv.videoio.VideoCapture;


/**
 *
 * @author Morten
 */
public class UVC {
    
    VideoCapture stdCam;
    
    
    public UVC(){
        
        stdCam = new VideoCapture();
        JPanel j;
        
        
    }
    
    /**
     * 
     */
    public void openCam(){
        stdCam.open(0);
        if(!stdCam.isOpened()){
            System.out.println("Could not open camera");
        }
    }
    
    
    /**
     * 
     * @return 
     */
    public Mat getNextFrame(){
            Mat m = new Mat();
            if(stdCam.isOpened()){
                stdCam.read(m);
                
            }
            else{
                System.out.println("Unable to retrieve next image");
            }
            return m;
    }
    
    /**
     * 
     */
    public void releaseCam(){
        stdCam.release();
    }
}
