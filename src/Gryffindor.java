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

    public static int studentScore(Gryffindor student) {
        int studentScore = student.nobility + student.honor + student.bravery;
        return studentScore;
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
