/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patolli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import view.tableroChico;

/**
 *
 * @author yepiz
 */
public class servidor {

    private static final int PORT = 3000;  // Puerto del servidor
    private static List<Socket> clients = new ArrayList<>();  // Lista de clientes conectados
    private static tableroChico frame;

    public static void main(String[] args) {
        frame = new tableroChico();
        frame.setVisible(true);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor iniciado en el puerto " + PORT);

            while (true) {
                // Espera conexiones de los clientes
                Socket clientSocket = serverSocket.accept();
                clients.add(clientSocket);
                System.out.println("Cliente conectado desde: " + clientSocket.getInetAddress());

                // Inicia un nuevo hilo para manejar la conexión con cada cliente
                new cliente(clientSocket).start();
            }
        } catch (IOException e) {
            System.err.println("Error en el servidor: " + e.getMessage());
        }
    }

    // Clase para manejar la interacción con cada cliente en un hilo separado
    private static class cliente extends Thread {

        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;

        public cliente(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // Comunicación con el cliente
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Recibido del cliente: " + inputLine);
                    // Aquí puedes añadir lógica de juego y actualizar a los jugadores

                    // Enviar mensaje de vuelta a todos los clientes conectados
                    broadcastMessage("Servidor dice: " + inputLine);
                }

            } catch (IOException e) {
                System.err.println("Error en la conexión con el cliente: " + e.getMessage());
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el socket: " + e.getMessage());
                }
            }
        }

        // Método para enviar un mensaje a todos los clientes conectados
        private void broadcastMessage(String message) {
            for (Socket client : clients) {
                try {
                    PrintWriter clientOut = new PrintWriter(client.getOutputStream(), true);
                    clientOut.println(message);
                } catch (IOException e) {
                    System.err.println("Error al enviar mensaje al cliente: " + e.getMessage());
                }
            }
        }
    }
}
