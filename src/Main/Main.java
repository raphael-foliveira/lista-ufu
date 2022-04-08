package Main;

import java.time.LocalDate;

import Interface.Input;
import Q1.Pessoa;
import Q2.Agenda;
import Q3.Elevator;
import Q4.RemoteControl;
import Q4.Television;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        testQ3();
    }

    static void testQ1() {
        String newName = Input.getString("Nome: ");
        LocalDate newBirthDate = Input.getDate();
        double newHeight = Input.getDouble("Altura: ");
        Pessoa newPerson = new Pessoa(newName, newBirthDate, newHeight);

        newPerson.printData();

        System.out.println(newPerson.getAge());
    }

    static void testQ2() throws AssertionError {

        Agenda agenda = new Agenda();
        agenda.armazenaPessoa("João", 20, 1.70);
        agenda.armazenaPessoa("Pedro", 27, 1.80);

        agenda.printAgenda();

    }

    static void testQ3() throws InterruptedException {
        Elevator elevador = new Elevator(20, 12);
        elevador.goTo(5);

    }

    static void testQ4() {
        Television television = new Television();
        RemoteControl remoteC = new RemoteControl(television);

        System.out.println("Dados da tv inicializada:");

        remoteC.displayCurrentInfo();

        for (int i = 0; i < 50; i++) {
            remoteC.increaseVolume();
        }

        System.out.println("Após aumentar volumme: ");

        remoteC.displayCurrentInfo();

        for (int i = 0; i < 20; i++) {
            remoteC.increaseChannel();
        }

        System.out.println("Após aumentar canal: ");
        remoteC.displayCurrentInfo();
    }
}