public class Slytherin extends Hogwards {
    //факультет Слизерин
    private int trick; //хитрость
    private int decisiveness; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int authority; //жажда власти

    public Slytherin(String faculty, String name, int magic, int transgression, int trick, int decisiveness, int ambition, int resourcefulness, int authority) {
        super(faculty, name, magic, transgression);
        this.trick = trick;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public String toString() {
        return  "факультет " + getFaculty() +
                ", ученик " + getName() +
                ", магия " + getMagic() +
                ", трансгрессия " + getTransgression() +
                ", хитрость " + trick +
                ", решительность " + decisiveness +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + authority;
    }

    public static String compareStudents(Slytherin firstStudent, Slytherin secondStudent) {
        int firstStudentScore = firstStudent.getMagic() + firstStudent.getTransgression() + firstStudent.trick + firstStudent.decisiveness + firstStudent.ambition + firstStudent.resourcefulness + firstStudent.authority;
        int secondStudentScore = secondStudent.getMagic() + secondStudent.getTransgression() + secondStudent.trick + secondStudent.decisiveness + secondStudent.ambition + secondStudent.resourcefulness + secondStudent.authority;
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        } else if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " лучший Слизеринец, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " лучший Слизеринец, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хорошие Слизеринцы";
        }
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
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

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}
