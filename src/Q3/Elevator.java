package Q3;

public class Elevator {
    static int delay = 500;
    int currentFloor;
    int totalFloors;
    int capacity;
    int currentLoad;

    public Elevator(int totalFloors, int capacity) {
        this.currentFloor = 0;
        this.currentLoad = 0;
        this.totalFloors = totalFloors;
        this.capacity = capacity;
    }

    public void addPassenger() throws InterruptedException {
        Thread.sleep(delay);
        if (currentLoad < capacity) {
            System.out.println("Adicionando passageiro...");
            this.currentLoad++;
        } else {
            System.out.println("Não é possível adicionar um passageiro. \nO elevador encontra-se lotado.");
        }
        System.out.println(this.currentLoad + " pessoas no elevador.");
    }

    public void removePassenger() throws InterruptedException {
        Thread.sleep(delay);
        if (currentLoad > 0) {
            System.out.println("Removendo passageiro...");
            this.currentLoad--;
        } else {
            System.out.println("Não é possível remover um passageiro. \nO elevador encontra-se vazio.");
        }
        System.out.println(this.currentLoad + " pessoas no elevador.");
    }

    public void up() throws InterruptedException {
        Thread.sleep(delay);
        System.out.println("Andar atual: " + this.currentFloor);
        if (currentFloor < totalFloors) {
            System.out.println("Subindo um andar...");
            currentFloor++;
        } else {
            System.out.println("Não é possível subir. O elevador já está no último andar.");
        }
    }

    public void down() throws InterruptedException {
        Thread.sleep(delay);
        System.out.println("Andar atual: " + this.currentFloor);
        if (currentFloor > 0) {
            System.out.println("Descendo um andar...");
            currentFloor--;
        } else {
            System.out.println("Não é possível descer. O elevador já se encontra no Térreo.");
        }
    }

    public void goTo(int floor) throws InterruptedException {
        if (floor <= totalFloors && floor >= 0) {
            System.out.printf("Indo até %d...\n", floor);
            while (currentFloor < floor) {
                up();
            }
            while (currentFloor > floor) {
                down();
            }
        }
    }

    public int getTotalCapacity() {
        return this.capacity;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }

    public int getCurrentLoad() {
        return this.currentLoad;
    }

    public int getTotalFloors() {
        return this.totalFloors;
    }

}
