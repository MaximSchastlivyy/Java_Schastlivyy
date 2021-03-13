package HW7;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {
    public static final int GM_HVH = 0;
    public static final int GM_HVA = 1;

    GameMap() {
        setBackground(Color.BLACK);
    }

    void startGameWithParams(int mapSizeX, int mapSizeY, int winLength, int modeGame) {
        System.out.println("map size " + mapSizeX + "x" + mapSizeY +
                ". WinLength = " + winLength +
                ". You play with mode = " + modeGame);
    }
}

//1. Полностью разобраться с кодом (попробовать полностью самостоятельно переписать одно из окон)
//2. Составить список вопросов и приложить в виде комментария к домашней работе
//3. * Рачертить панель GameMap на поле для игры, согласно mapSizeX
