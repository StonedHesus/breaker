// The package in which the current Java compilation unit is to be found.
package breaker.game.components.paddle;
// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.
import breaker.game.components.model.GameObject;
import breaker.game.settings.Settings;
import javafx.geometry.Point2D;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 * @author Andrei-Paul Ionescu
 */
public class Paddle extends GameObject implements Settings {

    // Static values/constants of the class.
    private static double SPEED = 40.0;

    // Fields/attributes of the class.
    private Rectangle graphics;
    private Point2D coordinates;

    private double deltaX;

    // Constructor(s) of the class.
    Paddle(){

        this.graphics = new Rectangle(DEFAULT_PADDLE_WIDTH, DEFAULT_PADDLE_HEIGHT);
        this.graphics.setFill(DEFAULT_PADDLE_COLOUR);

        this.coordinates = new Point2D
                (
                DEFAULT_GAME_WINDOW_WIDTH / 2 - DEFAULT_PADDLE_WIDTH / 2,
                DEFAULT_GAME_WINDOW_HEIGHT - 2 * DEFAULT_PADDLE_HEIGHT
                );

        this.graphics.setX(this.coordinates.getX());
        this.graphics.setY(this.coordinates.getY());

        this.graphics.setArcWidth(30);
        this.graphics.setArcHeight(20);

        this.deltaX = 0;
    }

    // Getters of the class.
    public static double getSPEED() {return Paddle.SPEED;}

    public double getDeltaX() {return this.deltaX;}

    public Rectangle getGraphics() {return this.graphics;}


    // Setters of the class.

    // Public non-static methods of the unit.
    public void reset() {this.deltaX = 0;}
    public void move(KeyCode keyCode){
        if(keyCode == KeyCode.A)
            this.deltaX -= SPEED;

        if(keyCode == KeyCode.D)
            this.deltaX += SPEED;
    }

    @Override
    public void draw(Pane target) {target.getChildren().add(this.graphics);}

    @Override
    public void update(double deltaTime) {

        this.coordinates.add(this.deltaX * deltaTime, 0);
        this.graphics.setX(this.coordinates.getX());
        this.deltaX = 0;
    }


    // Public static methods of the unit.
    public static Paddle newDefault() {return new Paddle();}

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
