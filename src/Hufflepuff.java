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
