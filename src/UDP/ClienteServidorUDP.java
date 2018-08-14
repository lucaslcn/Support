/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteServidorUDP {

    public static final int PORTA = 5000;
    public static final int TAM_BUFFER = 1024;

    public static void main(String[] args) {
        try {

            byte[] bufferEntrada = new byte[TAM_BUFFER];
            byte[] bufferSaida = new byte[TAM_BUFFER];

            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress IpServidor = InetAddress.getByName("127.0.0.1");

            String sentence = "Como está a vaca???";
            bufferSaida = sentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(bufferSaida, bufferSaida.length, IpServidor, PORTA);
            clientSocket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(bufferEntrada, bufferEntrada.length);
            clientSocket.receive(receivePacket);

            String respostaServidor = new String(receivePacket.getData());
            System.out.println("Servidor respondeu:" + respostaServidor);
            clientSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}