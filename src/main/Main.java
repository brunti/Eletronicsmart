package main;

import dao.ClienteDAO;
import model.Cliente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //cadastrarCliente();
    }

    /*public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Cliente ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine(); // Alterado para String

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(0, nome, sobrenome, cpf, email);
        ClienteDAO clienteDAO = new ClienteDAO();

        if (clienteDAO.inserir(cliente)) {
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar cliente.");
        }
        scanner.close();
    }*/
}
//