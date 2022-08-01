public class Service {
    public static String compareStudents(Gryffindor firstStudent, Slytherin secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Gryffindor firstStudent, Hufflepuff secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Gryffindor firstStudent, Ravenclaw secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Slytherin firstStudent, Gryffindor secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Slytherin firstStudent, Hufflepuff secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Slytherin firstStudent, Ravenclaw secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Hufflepuff firstStudent, Gryffindor secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Hufflepuff firstStudent, Slytherin secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Hufflepuff firstStudent, Ravenclaw secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Ravenclaw firstStudent, Gryffindor secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Ravenclaw firstStudent, Slytherin secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Ravenclaw firstStudent, Hufflepuff secondStudent) {
        return "Сравнение невозможно";
    }
    public static String compareStudents(Gryffindor firstStudent, Gryffindor secondStudent) {
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        }
        int firstStudentScore = firstStudent.getMagic() + firstStudent.getTransgression() + firstStudent.getNobility() + firstStudent.getHonor() + firstStudent.getBravery();
        int secondStudentScore = secondStudent.getMagic() + secondStudent.getTransgression() + secondStudent.getNobility() + secondStudent.getHonor() + secondStudent.getBravery();
        if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " лучший Гриффиндорец, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " лучший Гриффиндорец, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хорошие Гриффиндорцы";
        }
    }
    public static String compareStudents(Slytherin firstStudent, Slytherin secondStudent) {
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        }
        int firstStudentScore = firstStudent.getMagic() + firstStudent.getTransgression() + firstStudent.getTrick() + firstStudent.getDecisiveness() + firstStudent.getAmbition() + firstStudent.getResourcefulness() + firstStudent.getAuthority();
        int secondStudentScore = secondStudent.getMagic() + secondStudent.getTransgression() + secondStudent.getTrick() + secondStudent.getDecisiveness() + secondStudent.getAmbition() + secondStudent.getResourcefulness() + secondStudent.getAuthority();
        if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " лучший Слизеринец, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " лучший Слизеринец, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хорошие Слизеринцы";
        }
    }
        public static String compareStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        }
        int firstStudentScore = firstStudent.getMagic() + firstStudent.getTransgression() + firstStudent.getDiligence() + firstStudent.getLoyalty() + firstStudent.getHonesty();
        int secondStudentScore = secondStudent.getMagic() + secondStudent.getTransgression() + secondStudent.getDiligence() + secondStudent.getLoyalty() + secondStudent.getHonesty();
        if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " лучший Пуффендуец, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " лучший Пуффендуец, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хорошие Пуффендуйцы";
        }
    }
        public static String compareStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        if (firstStudent == null || secondStudent == null) {
            return "Сравнение невозможно";
        }
        int firstStudentScore = firstStudent.getMagic() + firstStudent.getTransgression() + firstStudent.getIntelligence() + firstStudent.getWisdom() + firstStudent.getWit() + firstStudent.getCreative();
        int secondStudentScore = secondStudent.getMagic() + secondStudent.getTransgression() + secondStudent.getIntelligence() + secondStudent.getWisdom() + secondStudent.getWit() + secondStudent.getCreative();
        if (firstStudentScore > secondStudentScore) {
            return firstStudent.getName() + " лучший Когтевранец, чем " + secondStudent.getName();
        } else if (firstStudentScore < secondStudentScore) {
            return secondStudent.getName() + " лучший Когтевранец, чем " + firstStudent.getName();
        } else {
            return secondStudent.getName() + " и " + firstStudent.getName() + " одинаково хорошие Когтевранцы";
        }
    }
}
