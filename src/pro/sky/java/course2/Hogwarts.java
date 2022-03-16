package pro.sky.java.course2;

import java.util.Objects;

public class Hogwarts {

    private String name;
    private String surname;
    private int thePowerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int thePowerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void PrintStudentCharacteristics() {
        System.out.println("\t***\n" + getName() + " " + getSurname() + ":\n"
                + "Сила магии - " + getThePowerOfMagic() + "\n"
                + "Pасстояние трансгресии - " + getTransgressionDistance());
    }

    public String comparison(Hogwarts other) {

        StringBuilder stringBuilder = new StringBuilder();

        if (thePowerOfMagic > other.thePowerOfMagic) {
            stringBuilder.append(name).append(" обладает большей мощностью магии чем ").append(other.name);
        } else if (thePowerOfMagic < other.thePowerOfMagic) {
            stringBuilder.append(other.name).append(" обладает большей мощностью магии чем ").append(name);
        } else {
            stringBuilder.append("Силы магии у ").append(getName()).append(" и ")
                    .append(other.getName()).append(" равны");
        }
        stringBuilder.append("\n");
        if (transgressionDistance > other.transgressionDistance) {
            stringBuilder.append(name).append(" трансгрессирует на большее расстояние чем ").append(other.name);
        } else if (transgressionDistance < other.transgressionDistance) {
            stringBuilder.append(other.name).append(" трансгрессирует на большее расстояние чем ").append(name);
        } else {
            stringBuilder.append("Расстояние трансгресии у ").append(getName()).append(" и ")
                    .append(other.getName()).append(" одинаковое");
        }
        return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(thePowerOfMagic, transgressionDistance);
    }
}
