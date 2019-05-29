package launcher;

import processing.core.PApplet;
import sketch.AdvancedSketch;
import sketch.StandardSketch;

import static processing.core.PApplet.concat;

public class Main {
    static public void main(String[] args) {
        // example of arguments
        String[] moreArgs = new String[]{"--window-color=#666666", "--stop-color=#cccccc"};

        // join arguments if necessary
        if (args != null) {
            // start the standard sketch
            PApplet.main(StandardSketch.class, concat(moreArgs, args));

            // start the advanced sketch
            AdvancedSketch.createAndLaunch("Hello World");

        } else {
            // start the standard sketch
            PApplet.main(StandardSketch.class, moreArgs);

            // start the advanced sketch
            AdvancedSketch.createAndLaunch("Hello World");
        }
    }
}

