package pro.sky.java.course2;

public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int thePowerOfMagic,
                     int transgressionDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public void PrintStudentCharacteristics() {
        super.PrintStudentCharacteristics();
        System.out.printf("Ум - %d\nМудрость - %d\nОстроумие - %d\nТворчество - %d\n"
                , getMind(), getWisdom(), getWit(), getCreativity());
    }

    public String comparisonRavenclaw(Ravenclaw other) {

        StringBuilder stringBuilder = new StringBuilder();

        if (mind > other.mind) {
            stringBuilder.append(getName()).append(" умнее чем ").append(other.getName());
        } else if (mind < other.mind) {
            stringBuilder.append(other.getName()).append(" умнее чем ").append(getName());
        } else {
            stringBuilder.append(getName()).append(" и ").append(other.getName()).append(" одинаково умные");
        }

        stringBuilder.append("\n");

        if (wisdom > other.wisdom) {
            stringBuilder.append(getName()).append(" мудрее чем ").append(other.getName());
        } else if (wisdom < other.wisdom) {
            stringBuilder.append(other.getName()).append(" мудрее чем ").append(getName());
        } else {
            stringBuilder.append(getName()).append(" и ").append(other.getName()).append(" одинаково мудрые");
        }

        stringBuilder.append("\n");

        if (wit > other.wit) {
            stringBuilder.append(getName()).append(" остроумнее чем ").append(other.getName());
        } else if (wit < other.wit) {
            stringBuilder.append(other.getName()).append(" остроумнее чем ").append(getName());
        } else {
            stringBuilder.append(getName()).append(" и ").append(other.getName()).append(" одинаково остроумные");
        }

        stringBuilder.append("\n");

        if (creativity > other.creativity) {
            stringBuilder.append(getName()).append(" более творческий чем ").append(other.getName());
        } else if (creativity < other.creativity) {
            stringBuilder.append(other.getName()).append(" более творческий чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень творчества");
        }
        return stringBuilder.toString();
    }
}
