package Q2;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public ArrayList<Pessoa> getContatos() {
        return contatos;
    }

    public void armazenaPessoa(String name, int idade, double altura) {
        Pessoa newPessoa = new Pessoa(name, idade, altura);
        contatos.add(newPessoa);
    }

    public void removePessoa(String nameToRemove) {
        for (Pessoa pessoa : contatos) {
            if (pessoa.name.equals(nameToRemove)) {
                contatos.remove(pessoa);
            }
        }
    }

    public int buscaPessoa(String nome) {
        for (Pessoa contato : contatos) {
            if (contato.name.equals(nome)) {
                return contatos.indexOf(contato);
            }
        }
        System.out.println("Não encontrado.");
        return -1;
    }

    public void printPessoa(int number) {
        contatos.get(number).printContato();
    }

    public void printAgenda() {
        if (contatos.size() > 0) {
            for (int i = 0; i < contatos.size(); i++) {
                contatos.get(i).printContato();
            }
        }
    }

}
