public class Hogwards {
    //школа Хогвардс
    private String faculty; //факультет
    private String name;
    private int magic; //магия
    private int transgression; //трансгрессия
    private String scool;

    public Hogwards(String faculty, String name, int magic, int transgression) {
        this.faculty = faculty;
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
        this.scool = "Хогвардс";
    }

    public static String compareStudentsByMagic(Hogwards firstStudent, Hogwards secondStudent) {
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        }
        int firstStudentScore = firstStudent.getMagic();
        int secondStudentScore = secondStudent.getMagic();
        if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " обладает бОльшей мощность магии, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " обладает бОльшей мощность магии, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " обладают равной мощность магии";
        }
    }

    public static String compareStudentsByTransGression(Hogwards firstStudent, Hogwards secondStudent) {
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        }
        int firstStudentScore = firstStudent.getTransgression();
        int secondStudentScore = secondStudent.getTransgression();
        if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " обладает бОльшей трансгрессией, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " обладает бОльшей трансгрессией, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " обладают равной трансгрессией";
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
