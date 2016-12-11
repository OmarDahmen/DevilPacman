package tn.enis.omardahmen.devilpacman;

import processing.core.PApplet;

/**
 * Created by Omar Dahmen on 11/12/2016.
 */



public class SketchActivity extends PApplet {
    public void settings() {
        size(600, 600);
    }

    public void setup() { }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
