package pro.sky.java.course2;

public class Slytherin extends Hogwarts {

    private int cunning, determination, ambition, resourcefulness, thirstForPower;

    public Slytherin(String name, String surname, int thePowerOfMagic, int transgressionDistance,
                     int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, thePowerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public void PrintStudentCharacteristics() {
        super.PrintStudentCharacteristics();
        System.out.printf("Хитрость - %d\nРешительность - %d\nАмбициозность - %d\nНаходчивость - %d\nЖажда власти - %d\n"
                , getCunning(), getDetermination(), getAmbition(), getResourcefulness(), getThirstForPower());
    }

    public String comparisonSlytherin(Slytherin other) {

        StringBuilder stringBuilder = new StringBuilder();

        if (cunning > other.cunning) {
            stringBuilder.append(getName()).append(" хитрее чем ").append(other.getName());
        } else if (cunning < other.cunning) {
            stringBuilder.append(other.getName()).append(" хитрее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень хитрости");
        }

        stringBuilder.append("\n");

        if (determination > other.determination) {
            stringBuilder.append(getName()).append(" решительнее чем ").append(other.getName());
        } else if (determination < other.determination) {
            stringBuilder.append(other.getName()).append(" решительнее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень решительности");
        }

        stringBuilder.append("\n");

        if (ambition > other.ambition) {
            stringBuilder.append(getName()).append(" амбициознее чем ").append(other.getName());
        } else if (ambition < other.ambition) {
            stringBuilder.append(other.getName()).append(" амбициознее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень амбициозности");
        }

        stringBuilder.append("\n");

        if (resourcefulness > other.resourcefulness) {
            stringBuilder.append(getName()).append(" находчивее чем ").append(other.getName());
        } else if (resourcefulness < other.resourcefulness) {
            stringBuilder.append(other.getName()).append(" находчивее чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень находчивости");
        }

        stringBuilder.append("\n");

        if (thirstForPower > other.thirstForPower) {
            stringBuilder.append(getName()).append(" имеет больше жажды власти чем ").append(other.getName());
        } else if (thirstForPower < other.thirstForPower) {
            stringBuilder.append(other.getName()).append(" имеет больше жажды власти чем ").append(getName());
        } else {
            stringBuilder.append("У ").append(getName()).append(" и ").append(other.getName())
                    .append(" одинаковый уровень жажды власти");
        }
        return stringBuilder.toString();
    }
}
