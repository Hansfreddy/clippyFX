package ch.ucreek;

import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * Created by Hansfreddy on 28.03.2016.
 */
public class SpriteAnimation extends Transition {

    private final ImageView imageView;
    private final int startIndex;
    private final int count;
    private final int columns;
    private final int offsetX;
    private final int offsetY;
    private final int width;
    private final int height;

    private int counter = 0;
    private int lastN = -1;

    /**
     *
     * @param imageView The imageView on the sprite image file.
     * @param duration Display duration of a single frame.
     * @param startIndex The nth frame in the image file where the animation starts.
     * @param count Of how many images the animation consists.
     * @param columns How many columns are in the image file in total.
     * @param offsetX
     * @param offsetY
     * @param width Width for every frame.
     * @param height Height for every frame.
     */
    public SpriteAnimation(
            ImageView imageView,
            int duration,
            int startIndex,
            int count,   int columns,
            int offsetX, int offsetY,
            int width,   int height) {
        this.imageView = imageView;
        this.startIndex = startIndex;
        this.count     = count;
        this.columns   = columns;
        this.offsetX   = offsetX;
        this.offsetY   = offsetY;
        this.width     = width;
        this.height    = height;
        setCycleDuration(new Duration(duration * count));
        setInterpolator(Interpolator.LINEAR);
    }

    @Override
    protected void interpolate(double fraction) {
        final int n = Math.round(count * (float) fraction);
        if (n != lastN) {
            final int x = ((startIndex + n) % columns) * width  + offsetX;
            final int y = ((startIndex + n) / columns) * height + offsetY;
            imageView.setViewport(new Rectangle2D(x, y, width, height));

            System.out.println("Image number: " + n + " is at x: " + x + " and y: " + y);

        }
    }
}
