package pro.sky.java.course2;

public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int thePowerOfMagic, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public void PrintStudentCharacteristics() {
        super.PrintStudentCharacteristics();
        System.out.printf("Трудолюбие - %d\nВерность - %d\nЧестность - %d\n"
                , getDiligence(), getLoyalty(), getHonesty());
    }

    public String comparisonHufflepuff(Hufflepuff other) {

        StringBuilder stringBuilder = new StringBuilder();

        if (diligence > other.diligence) {
            stringBuilder.append(getName()).append(" трудолюбивее чем ").append(other.getName());
        } else if (diligence < other.diligence) {
            stringBuilder.append(other.getName()).append(" трудолюбивее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень трудолюбия");
        }

        stringBuilder.append("\n");

        if (loyalty > other.loyalty) {
            stringBuilder.append(getName()).append(" вернее чем ").append(other.getName());
        } else if (loyalty < other.loyalty) {
            stringBuilder.append(other.getName()).append(" вернее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень верности");
        }

        stringBuilder.append("\n");

        if (honesty > other.honesty) {
            stringBuilder.append(getName()).append(" честнее чем ").append(other.getName());
        } else if (honesty < other.honesty) {
            stringBuilder.append(other.getName()).append(" честнее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ")
                    .append(other.getName()).append(" одинаковый уровень честности");
        }
        return stringBuilder.toString();
    }
}

