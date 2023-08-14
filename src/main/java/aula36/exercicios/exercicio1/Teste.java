package aula36.exercicios.exercicio1;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o nome da agenda: ");
        String nome = scan.nextLine();
        Agenda agenda = new Agenda(nome);

        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();

        for (int i = 0; i < 3; i++) {
            System.out.println("Contato " + (i + 1));
            System.out.println("Nome: ");
            String nomeContato = scan.nextLine();

            System.out.println("Telefone: ");
            String telefoneContato = scan.nextLine();

            System.out.println("Email: ");
            String emailContato = scan.nextLine();

            switch (i) {
                case 0 -> {
                    contato1.setNome(nomeContato);
                    contato1.setEmail(telefoneContato);
                    contato1.setTelefone(emailContato);
                }
                case 1 -> {
                    contato2.setNome(nomeContato);
                    contato2.setEmail(telefoneContato);
                    contato2.setTelefone(emailContato);
                }
                case 2 -> {
                    contato3.setNome(nomeContato);
                    contato3.setEmail(telefoneContato);
                    contato3.setTelefone(emailContato);
                }
            }

        }

        Contato[] contatos = new Contato[3];
        contatos[0] = contato1;
        contatos[1] = contato2;
        contatos[2] = contato3;

        agenda.setContatos(contatos);

        System.out.println("Nome da agenda: " + agenda.getNome());

        for (Contato c : agenda.getContatos()) {
            System.out.println(c.getNome() + " " + c.getEmail() + " " + c.getTelefone());
        }
    }
}
