package Q1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String name;
    private LocalDate birthDate;
    private double height;

    public Pessoa(String name, LocalDate birthDate, double height) {
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void printData() {
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf(
                "Data de nascimento: %s/%s/%s\n",
                this.birthDate.getDayOfMonth(),
                this.birthDate.getMonthValue(),
                this.birthDate.getYear());
        System.out.printf("Altura: %s\n", this.height);
    }

    public int getAge() {
        long yearsElapsed = ChronoUnit.YEARS.between(this.birthDate, LocalDate.now());
        int personAge = (int) yearsElapsed;
        return personAge;
    }

}
