/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odroidrovone;

import java.io.*;
import java.net.*;
/**
 *
 * @author Morten
 */
public class UDPClient {
    //FIELD
    private InetAddress IPAddressLocal;
    private InetAddress IPAddressExternal;
    private int port;
    byte[] recievedData = new byte[1024];
    byte[] sendData = new byte[1024];
    DatagramSocket clientSocket;
    DatagramPacket receivedPacket;
    DatagramPacket sendPacket;
    
    //Constructor
    public UDPClient()throws Exception{
            clientSocket = new DatagramSocket();
            IPAddressLocal = InetAddress.getByName("localhost");
            
    }
    //Run
    public void run(){
        while(true){
            receivedPacket = new DatagramPacket(
                    recievedData,
                    recievedData.length);
            
        }
    }
    
    //Methods

    public InetAddress getIPAddressLocal() {
        return IPAddressLocal;
    }

    public void setIPAddressLocal(InetAddress IPAddressLocal) {
        this.IPAddressLocal = IPAddressLocal;
    }

    public InetAddress getIPAddressExternal() {
        return IPAddressExternal;
    }

    public void setIPAddressExternal(InetAddress IPAddressExternal) {
        this.IPAddressExternal = IPAddressExternal;
    }

}
