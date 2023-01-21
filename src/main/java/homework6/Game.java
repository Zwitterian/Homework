package homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        game.writeNumOfPlayersPerTeam(GameType.SOCCER);
        game.writeNumOfPlayersPerTeam(GameType.HOCKEY);
        game.writeNumOfPlayersPerTeam(GameType.RUGBY);
    }

    public enum GameType {

        SOCCER,
        HOCKEY,
        RUGBY

    }
    public static void writeNumOfPlayersPerTeam(GameType game) {
        String soccer = "Soccer.txt";
        String hockey = "Hockey.txt";
        String rugby = "Rugby.txt";
        File file = new File(soccer);
        File file2 = new File(hockey);
        File file3 = new File(rugby);
        switch (game) {
            case SOCCER:
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                FileWriter fileWriter = null;
                try {
                    fileWriter = new FileWriter(file);
                    fileWriter.write("11");
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case HOCKEY:
                try {
                    file2.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                FileWriter fileWriter2 = null;
                try {
                    fileWriter2 = new FileWriter(file2);
                    fileWriter2.write("6");
                    fileWriter2.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case RUGBY:
                try {
                    file3.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                FileWriter fileWriter3 = null;
                try {
                    fileWriter3 = new FileWriter(file3);
                    fileWriter3.write("15");
                    fileWriter3.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


        }
    }


}
