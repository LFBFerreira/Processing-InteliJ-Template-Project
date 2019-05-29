package sketch;

import processing.core.PApplet;

public class AdvancedSketch extends PApplet {

    /**
     * Static Launcher that creates an instance of the sketch and launches it
     *
     * @param text
     */
    public static void createAndLaunch(String text) {
        AdvancedSketch advancedSketch = new AdvancedSketch(text);

        runSketch(new String[]{""}, advancedSketch);
    }

    private String text = "";

    /**
     * Constructor
     *
     * @param text
     */
    public AdvancedSketch(String text) {
        this.text = text;
    }

    // ---------------------------------------------------------------------------------------------------------------

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(random(255), random(255), random(255));
        textAlign(CENTER);
        textSize(32);
        text(text, width / 2, height / 2);
    }

    public void draw() {

    }

}
