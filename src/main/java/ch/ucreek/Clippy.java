package ch.ucreek;

import javafx.animation.Animation;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Hansfreddy on 28.03.2016.
 */
public class Clippy {

    private final String SPRITE_PATH = "/map_clippy.png";
    private Image sprite;
    private ImageView imageView;

    private int IMAGE_WIDTH = 3348;
    private int IMAGE_HEIGHT = 3162;

    private int OFFSET_X = 0;
    private int OFFSET_Y = 0;
    private int WIDTH = 124;
    private int HEIGHT = 93;
    private int IMAGES = 27;

    private Boundaries okayBoundaries = new Boundaries(0, 19);
    private Boundaries atomBoundaries = new Boundaries(20, 59);

    public Clippy(ImageView imageView){
        this.imageView = imageView;
        sprite = new Image(this.getClass().getResource(SPRITE_PATH).toString());
        imageView.setImage(sprite);
    }
    public Animation congratulate(){
        imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
        final Animation animation = new SpriteAnimation(imageView, 100, 0, 20, 27, OFFSET_X, OFFSET_Y, WIDTH, HEIGHT);
        return animation;
    }

    public Animation atom(){
        imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
        final Animation animation = new SpriteAnimation(imageView, 80, 21, 43, 27, OFFSET_X, OFFSET_Y, WIDTH, HEIGHT);
        return animation;
    }

}
