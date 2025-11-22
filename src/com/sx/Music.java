package com.sx;

/**
 * @author: KaiyanWang
 * @version: 1.0
 * @DateTime: 2025-11-22 21:45
 */
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Music {
    public Music() throws FileNotFoundException, JavaLayerException {
        Player player;
        String str = "music.wav"; //相对路径
        BufferedInputStream name = new BufferedInputStream(new FileInputStream(str));
        player = new Player(name);
        player.play();
    }
}

