package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        Socket s = new Socket("172.16.125.59" , 3000);
        System.out.println("Connessione al server stabilita");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);

        String numero1 = " ";
        String numero2 = " ";
        String operazione = " ";
        String risultato = " ";

        while (true) {
            System.out.print("Inserisci il primo numero: ");
            numero1 = scanner.nextLine();

            System.out.print("Inserisci il primo numero: ");
            numero2 = scanner.nextLine();

            System.out.print("Inserisci quale operazione vuoi eseguire: ");
            operazione = scanner.nextLine();

            out.println(numero1);
            out.println(numero2);
            out.println(operazione);

            risultato = in.readLine();

            System.out.println("Il risultato dell'operazione è: " + risultato);
        }
    }
}