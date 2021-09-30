import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

class KindergartenGarden {
    String garden;

    KindergartenGarden(String garden) {
        this.garden = garden; ///Give the value to global variable
    }

    List<Plant> getPlantsOfStudent(String student) {
        ///Type  implimentation here
        List<Plant> myPlants = new ArrayList<Plant>();

        student = student.toLowerCase();
        int nSpace = (garden.length() / 2);

        if (student.equals("alice")) {
            char[] myLetters = {garden.charAt(0), garden.charAt(1), garden.charAt(nSpace + 1), garden.charAt(nSpace + 2)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("bob")) {
            char[] myLetters = {garden.charAt(2), garden.charAt(3), garden.charAt(nSpace + 3), garden.charAt(nSpace + 4)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("charlie")) {
            char[] myLetters = {garden.charAt(4), garden.charAt(5), garden.charAt(nSpace + 5), garden.charAt(nSpace + 6)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("david")) {
            char[] myLetters = {garden.charAt(6), garden.charAt(7), garden.charAt(nSpace + 7), garden.charAt(nSpace + 8)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("eve")) {
            char[] myLetters = {garden.charAt(8), garden.charAt(9), garden.charAt(nSpace + 9), garden.charAt(nSpace + 10)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("fred")) {
            char[] myLetters = {garden.charAt(10), garden.charAt(11), garden.charAt(nSpace + 11), garden.charAt(nSpace + 12)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("ginny")) {
            char[] myLetters = {garden.charAt(12), garden.charAt(13), garden.charAt(nSpace + 13), garden.charAt(nSpace + 14)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("harriet")) {
            char[] myLetters = {garden.charAt(14), garden.charAt(15), garden.charAt(nSpace + 15), garden.charAt(nSpace + 16)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("ileana")) {
            char[] myLetters = {garden.charAt(16), garden.charAt(17), garden.charAt(nSpace + 17), garden.charAt(nSpace + 18)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("joseph")) {
            char[] myLetters = {garden.charAt(18), garden.charAt(19), garden.charAt(nSpace + 19), garden.charAt(nSpace + 20)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("kincaid")) {
            char[] myLetters = {garden.charAt(20), garden.charAt(21), garden.charAt(nSpace + 21), garden.charAt(nSpace + 22)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        } else if (student.equals("larry")) {
            char[] myLetters = {garden.charAt(22), garden.charAt(23), garden.charAt(nSpace + 23), garden.charAt(nSpace + 24)};
            for (char x : myLetters) {
                myPlants.add(Plant.getPlant(x));
            }
        }
        return myPlants;
    }

}
