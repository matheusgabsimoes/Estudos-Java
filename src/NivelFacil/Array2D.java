package NivelFacil;

public class Array2D {
    public static void main(String[] args) {
        String[][] aldeiasENinjas = {
                {"Aldeia da Folha", "Naruto", "Sasuke", "Sakura"},
                {"Aldeia da Areia", "Gaara", "Kankuro", "Temari"},
                {"Aldeia da Névoa", "Zabuza", "Haku"},
                {"Aldeia da Nuvem", "Darui", "C"},
                {"Aldeia da Pedra", "Kurotsuchi", "Akatsuchi"}
        };

        for (int i = 0; i < aldeiasENinjas.length; i++)
        { System.out.println("\n" + "Aldeia: " + aldeiasENinjas[i][0]);
            for (int j = 1; j < aldeiasENinjas[i].length; j++)
            { System.out.println("Ninja: " + aldeiasENinjas[i][j]); } }
    }
}