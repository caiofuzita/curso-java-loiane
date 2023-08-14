package aula36;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 9999-9999");

        // criar objeto endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Throne");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("999999-000");

        contato.setEndereco(end);

        //criar objeto telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("995727394");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("11");
        telefone2.setNumero("125125123");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);
        //contato.setTelefone(telefone);

        System.out.println(contato.getNome());
        //System.out.println(contato.getEndereco().getCidade());
        //System.out.println(contato.getTelefone());

        if ((contato != null) && (contato.getEndereco() != null)) {
            System.out.println(contato.getEndereco().getCidade());
        }

//        if ((contato != null) && (contato.getTelefone() != null)) {
//            System.out.println(contato.getTelefone().getDdd() + contato.getTelefone().getNumero());
//        }

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + t.getNumero());
            }
        }
    }
}
