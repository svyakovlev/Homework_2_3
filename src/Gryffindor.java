public class Gryffindor extends Hogwards {
    //факультет Гриффиндор
    private int nobility; //благородство
    private int honor; //честь
    private int bravery; //храбрость

    public Gryffindor(String faculty, String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(faculty, name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  "факультет " + getFaculty() +
                ", ученик " + getName() +
                ", магия " + getMagic() +
                ", трансгрессия " + getTransgression() +
                ", благородство " + nobility +
                ", честь " + honor +
                ", храбость " + bravery;
    }

    public static String compareStudents(Gryffindor firstStudent, Gryffindor secondStudent) {
        int firstStudentScore = firstStudent.getMagic() + firstStudent.getTransgression() + firstStudent.nobility + firstStudent.honor + firstStudent.bravery;
        int secondStudentScore = secondStudent.getMagic() + secondStudent.getTransgression() + secondStudent.nobility + secondStudent.honor + secondStudent.bravery;
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        } else if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " лучший Гриффиндорец, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " лучший Гриффиндорец, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хорошие Гриффиндорцы";
        }
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
}
