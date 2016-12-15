package eventHandlers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Ayettey on 06/12/2016.
 */
@ManagedBean(name = "randomHandler",eager = true)
@RequestScoped
public class RandomHandler {

   private Random seed;
    private JLabel label=new JLabel();
   private int getRandomSeed;
   private final int TIME_INTERVAL=1000;

    public void setRandomSeed(int getRandomSeed) {
        this.getRandomSeed = getRandomSeed;
    }


    int setRandomSeed() {
    ActionListener run=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            getSeed();

            label.setText(""+getSeed());
            setRandomSeed(getSeed());
            getGetRandomSeed();
            getSeed();
        }

    };new Timer(TIME_INTERVAL,run).start();







        return getRandomSeed;
    }

    public int getSeed(){
        for(int x=0;x<6;x++){


            seed=new Random();
            getRandomSeed=seed.nextInt(6)+1;
            setRandomSeed(getRandomSeed);

        }
        return getRandomSeed;
    }

    public int getGetRandomSeed() {
        return getRandomSeed;
    }

    public int runnerSeed;
    public int runner(){
        for(int i=0;i<27;i++){
            runnerSeed=i;
        }

        return runnerSeed;
    }




}

