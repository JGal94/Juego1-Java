package main;


import graphics.Assets;
import input.KeyBoard;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import states.GameState;






public class Window extends JFrame implements Runnable{
    
    public static final int WIDTH = 800, HEIGHT = 600;
    private Canvas canvas;
    private Thread thread;
    private boolean running = false;
    
    private BufferStrategy bs;
    private Graphics g;
    
    private final int FPS = 60;
    private double TARGETTIME = 1000000000/FPS;
    private double delta = 0;
    private int AVARAGEFPS = FPS;
    
    private GameState gameState;
    private KeyBoard keyBoard;
    
    
    
    
    
    public Window(){
        setTitle("PERIBIO");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        canvas = new Canvas();
        keyBoard = new KeyBoard();
        
        canvas.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        canvas.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        canvas.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        canvas.setFocusable(true);
        
        
        add(canvas);
        canvas.addKeyListener(keyBoard);
        
        
        setVisible(true);
    }
    public static void main(String[] args){
        
        new Window().start();
        
    }
    
    private void update(){
        keyBoard.update();
        gameState.update();
    }
    
    private void draw(){
        bs = canvas.getBufferStrategy();
        if( bs == null){
            canvas.createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        
        //////////////////////////////////////////
        
        
        
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        gameState.draw(g);
        
        g.drawString(""+ AVARAGEFPS,20,30);
        
        
        //////////////////////////////////////////////
        g.dispose();
        bs.show();
    }
    
    private void init(){
        Assets.init();
        gameState = new GameState();
    }
    

    @Override
    public void run() {
        
        long now = 0;
        long lastTime = System.nanoTime();
        int frames = 0;
        int time = 0;
        init();
        
        while(running){
            now = System.nanoTime();
            delta += (now-lastTime)/TARGETTIME;
            time += (now-lastTime);
            lastTime = now;
            if (delta >= 1 ){
                update();
                draw();
                delta --;
                frames ++;
            }
            if(time >= 1000000000){
                AVARAGEFPS = frames;
                frames = 0;
                time = 0;
            }
            
        }
        
        
        stop();
        running = false;
        
    }
    private void start(){
        thread = new Thread(this);
        thread.start(); 
        running = true;
        
    }
    private void stop(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
    }
}