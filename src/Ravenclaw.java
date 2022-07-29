public class Ravenclaw extends Hogwards{
    //факультет Когтевран
    public int intelligence; //ум
    public int wisdom; //мудрость
    public int wit; //остроумие
    public int creative; //творчество

    public Ravenclaw(String faculty, String name, int magic, int transgression, int intelligence, int wisdom, int wit, int creative) {
        super(faculty, name, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public String toString() {
        return  "факультет " + getFaculty() +
                ", ученик " + getName() +
                ", магия " + getMagic() +
                ", трансгрессия " + getTransgression() +
                ", ум " + intelligence +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", творчество " + creative;
    }

    public static String compareStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int firstStudentScore = firstStudent.getMagic() + firstStudent.getTransgression() + firstStudent.intelligence + firstStudent.wisdom + firstStudent.wit + firstStudent.creative;
        int secondStudentScore = secondStudent.getMagic() + secondStudent.getTransgression() + secondStudent.intelligence + secondStudent.wisdom + secondStudent.wit + secondStudent.creative;
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        } else if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " лучший Когтевранец, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " лучший Когтевранец, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хорошие Когтевранцы";
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
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

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
