package pro.sky.java.course2;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int thePowerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public void PrintStudentCharacteristics() {
        super.PrintStudentCharacteristics();
        System.out.printf("Благородство - %d\nЧесть - %d\nХрабрость - %d\n"
                , getNobility(), getHonor(), getBravery());
    }

    public String comparisonGryffindor(Gryffindor other) {

        StringBuilder stringBuilder = new StringBuilder();

        if (nobility > other.nobility) {
            stringBuilder.append(getName()).append(" благороднее чем ").append(other.getName());
        } else if (nobility < other.nobility) {
            stringBuilder.append(other.getName()).append(" благороднее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень благородства");
        }

        stringBuilder.append("\n");

        if (honor > other.honor) {
            stringBuilder.append(getName()).append(" имеет больше чести чем").append(other.getName());
        } else if (honor < other.honor) {
            stringBuilder.append(other.getName()).append(" имеет больше чести чем").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append("в одинаковый уровень чести");
        }

        stringBuilder.append("\n");

        if (bravery > other.bravery) {
            stringBuilder.append(getName()).append(" храбрее чем ").append(other.getName());
        } else if (bravery < other.bravery) {
            stringBuilder.append(other.getName()).append(" храбрее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень храбрости");
        }
        return stringBuilder.toString();
    }
}
