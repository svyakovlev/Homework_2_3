public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гриффиндор", "Гарри Поттер", 100, 100, 100, 100, 100);
        Gryffindor germiona = new Gryffindor("Гриффиндор", "Гермиона Грейнджер", 90, 90, 90, 100, 100);
        Gryffindor ron = new Gryffindor("Гриффиндор", "Рон Уизли", 90, 80, 90, 100, 90);
        Slytherin draco = new Slytherin("Слизерин", "Драко Малфой", 91, 81, 91, 91, 91,81,91);
        Slytherin graham = new Slytherin("Слизерин", "Грэхэм Монтегю", 81, 81, 81, 81, 81,81,81);
        Slytherin gregory = new Slytherin("Слизерин", "Грегори Гойл", 71, 81, 61, 81, 61,91,81);
        Hufflepuff zachariah = new Hufflepuff("Пуффендуй", "Захария Смит", 72, 82, 62, 82, 62);
        Hufflepuff cedric = new Hufflepuff("Пуффендуй", "Седрик Диггори", 92, 82, 72, 82, 82);
        Hufflepuff justin = new Hufflepuff("Пуффендуй", "Джастин Финч-Флетчли", 92, 82, 72, 82, 82);
        Ravenclaw zhou = new Ravenclaw("Когтевран", "Чжоу Чанг", 93, 83, 73, 83, 83,93);
        Ravenclaw padma = new Ravenclaw("Когтевран", "Падма Патил", 83, 73, 63, 83, 73,53);
        Ravenclaw marcus = new Ravenclaw("Когтевран", "Маркус Белби", 83, 73, 63, 83, 73,53);

        System.out.println(harry);
        System.out.println(draco);
        System.out.println(justin);
        System.out.println(zhou);

        System.out.println(Gryffindor.compareStudents(ron, germiona));
        System.out.println(Slytherin.compareStudents(graham, gregory));
        System.out.println(Hufflepuff.compareStudents(zachariah, cedric));
        System.out.println(Ravenclaw.compareStudents(marcus, padma));

        System.out.println(Hogwards.compareStudentsByMagic(harry, zhou));
        System.out.println(Hogwards.compareStudentsByTransGression(ron, cedric));
    }
}