package ch.ucreek;

import javafx.animation.Transition;

public class SpriteAnim extends Transition {

    @Override
    protected void interpolate(double frac) {
        System.out.println(frac + " ");
    }

}
