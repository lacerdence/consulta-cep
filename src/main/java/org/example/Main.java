package org.example;

import model.Endereco;
import service.ViacepService;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ViacepService viacepService = new ViacepService();

        try {
            Endereco endereco = viacepService.getEndereco("13403-000");
            System.out.println(endereco);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}