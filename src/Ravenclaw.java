public class Ravenclaw extends Hogwards{
    //факультет Когтевран
    private int intelligence; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creative; //творчество

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
