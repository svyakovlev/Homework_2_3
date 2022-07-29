public class Hufflepuff extends Hogwards{
    //факультет Пуффендуй
    private int diligence; //трудолюбивость
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(String faculty, String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(faculty, name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String toString() {
        return  "факультет " + getFaculty() +
                ", ученик " + getName() +
                ", магия " + getMagic() +
                ", трансгрессия " + getTransgression() +
                ", трудолюбивость " + diligence +
                ", верность " + loyalty +
                ", честность " + honesty;
    }

    public static String compareStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstStudentScore = firstStudent.getMagic() + firstStudent.getTransgression() + firstStudent.diligence + firstStudent.loyalty + firstStudent.honesty;
        int secondStudentScore = secondStudent.getMagic() + secondStudent.getTransgression() + secondStudent.diligence + secondStudent.loyalty + secondStudent.honesty;
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        } else if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " лучший Пуффендуец, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " лучший Пуффендуец, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хорошие Пуффендуйцы";
        }
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
}
