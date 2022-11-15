public class Main {
    public static void main(String[] args) {
        ////////////////////////////// Exercise 1.1 //////////////////////////////
        int age = 16;
        System.out.println("Exercise 1.1");
        if (age >= 18) System.out.println("Поздравляю с совершенолетием!");
        if (age < 18) System.out.println("Подожди немного! Совершенолетие еще не наступило.");

        ////////////////////////////// Exercise 1.2 //////////////////////////////
        System.out.println("\nExercise 1.2");
        age = 16;
        if (age >= 7 && age < 18) System.out.println("Ребенок ходит в школу");
        if (age >= 18 && age < 24) System.out.println("Можно учиться в университете");
        if (age >= 24) System.out.println("Пора работать");

        ////////////////////////////// Exercise 1.3 - initial//////////////////////////////
        int numPeople = 200;
        int coachCapacity = 102;
        int availableSeats = 60;
        System.out.println("\nExercise 1.3 - initial");

        if (coachCapacity % numPeople == coachCapacity) System.out.println("В вагоне нет свободных мест");

        if (coachCapacity % numPeople != coachCapacity && availableSeats % numPeople != availableSeats) {
            System.out.println("В вагоне " + coachCapacity % numPeople + " свободных мест:");
            System.out.println("сидячих " + availableSeats % numPeople + ", стоячих " + (coachCapacity - availableSeats));
        }
        if (coachCapacity % numPeople != coachCapacity && availableSeats % numPeople == availableSeats) {
            System.out.println("В вагоне " + coachCapacity % numPeople + " свободных мест:");
            System.out.println("сидячих 0, стоячих " + coachCapacity % numPeople);
        }

        ////////////////////////////// Exercise 1.3 - rebuild//////////////////////////////
        int Seats = 100;
        int standingSeats = 100;

        coachCapacity = 102;
        availableSeats = 60;
        int availableStandingSeats = coachCapacity - availableSeats;

        System.out.println("\nExercise 1.3 - rebuild");
        if (availableSeats <= Seats) System.out.println("В вагоне нет свободных сидячих мест");
        if (availableSeats > Seats)
            System.out.println("В вагоне " + (availableSeats - Seats) + " свободных сидячих мест:");
        if (availableStandingSeats <= standingSeats) System.out.println("В вагоне нет свободных стоячих мест");
        if (availableStandingSeats > standingSeats)
            System.out.println("В вагоне " + (availableStandingSeats - standingSeats) + " свободных стоячих мест:");

        ////////////////////////////// Exercise 2.1 //////////////////////////////
        age = 25;
        System.out.println("\nExercise 2.1");
        if (age >= 18) System.out.println("Поздравляю с совершенолетием!");
        else System.out.println("Подожди немного! Совершенолетие еще не наступило.");

        ////////////////////////////// Exercise 2.2 //////////////////////////////
        age = 4;
        System.out.println("\nExercise 2.2");
        if (age >= 24) System.out.println("Пора работать");
        else if (age >= 18) System.out.println("Можно учиться в университете");
        else if (age >= 7) System.out.println("Ребенок ходит в школу");


        ////////////////////////////// Exercise 2.3 - initial //////////////////////////////
        numPeople = 54;
        coachCapacity = 102;
        availableSeats = 60;
        System.out.println("\nExercise 2.3 - initial");
        if (coachCapacity % numPeople == coachCapacity) System.out.println("В вагоне нет свободных мест");
        else {
            System.out.println("В вагоне " + coachCapacity % numPeople + " свободных мест:");
            if (availableSeats % numPeople != availableSeats) {
                System.out.println("сидячих " + availableSeats % numPeople + ", стоячих " + (coachCapacity - availableSeats));
            } else System.out.println("сидячих 0, стоячих " + coachCapacity % numPeople);
        }
        ////////////////////////////// Exercise 2.3 - rebuild //////////////////////////////
        Seats = 25;
        standingSeats = 25;

        coachCapacity = 102;
        availableSeats = 60;
        availableStandingSeats = coachCapacity - availableSeats;

        System.out.println("\nExercise 2.3 - rebuild");
        if (availableSeats <= Seats) System.out.println("В вагоне нет свободных сидячих мест");
        else System.out.println("В вагоне " + (availableSeats - Seats) + " свободных сидячих мест:");
        if (availableStandingSeats <= standingSeats) System.out.println("В вагоне нет свободных стоячих мест");
        else System.out.println("В вагоне " + (availableStandingSeats - standingSeats) + " свободных стоячих мест:");
        ////////////////////////////// Exercise 3.1 //////////////////////////////
        age = 25;
        boolean kindergartenAge = age >= 2 && age <= 6;
        boolean schoolAge = age >= 7 && age <= 18;
        boolean universityAge = age > 18 && age <= 24;
        boolean workingAge = age > 24;
        System.out.println("\nExercise 3.1");
        if (kindergartenAge)
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        if (schoolAge) System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        if (universityAge)
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        if (workingAge) System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");

        ////////////////////////////// Exercise 3.2 //////////////////////////////
        age = 18;
        boolean prohibited = age < 5;
        boolean allowedWithAdult = age >= 5 && age < 14;
        boolean allowed = age >= 14;
        System.out.println("\nExercise 3.2");
        if (prohibited) System.out.println("Для возраста " + age + ", запрещено кататься на аттракционе");
        if (allowedWithAdult)
            System.out.println("Для возраста " + age + ", разрешено кататься на аттракционе в сопровождении взрослого");
        if (allowed) System.out.println("Для возраста " + age + ", разрешено кататься на аттракционе без ограничений");

        ////////////////////////////// Exercise 3.3 //////////////////////////////
        int one = 6;
        int two = 5;
        int three = 4;
        System.out.println("\nExercise 3.3");
        if (one > two) {
            if (one > three) System.out.println("Число номер 1 (" + one + ") больше остальных");
            else if (one == three) System.out.println("Числа номер 1 и 3 (" + one + ") больше остальных");
            else System.out.println("Число номер 3 (" + three + ") больше остальных");
        } else if (two > three) {
            if (two > one) System.out.println("Число номер 2 (" + two + ") больше остальных");
            else if (two == one) System.out.println("Числа номер 1 и 2 (" + one + ") больше остальных");
            else System.out.println("Число номер 1 (" + three + ") больше остальных");
        } else if (three > one) {
            if (three > two) System.out.println("Число номер 3 (" + three + ") больше остальных");
            else if (three == two) System.out.println("Числа номер 2 и 3 (" + three + ") больше остальных");
            else System.out.println("Число номер 2 (" + three + ") больше остальных");
        } else System.out.println("Все числа равных");
    }
}