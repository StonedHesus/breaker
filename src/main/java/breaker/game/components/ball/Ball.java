// The package in which the current Java compilation unit is to be found.
package breaker.game.components.ball;
// Imports from existing Java libraries, classes and interfaces.

// Import from custom libraries, classes and interfaces.
import breaker.game.components.model.GameObject;
import breaker.game.settings.Settings;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.util.Random;

/**
 * @author Andrei-Paul Ionescu
 */
public final class Ball extends GameObject implements Settings {
    // Static values/constants of the class.

    // Fields/attributes of the class.
    private final Circle graphics;

    private double deltaX;
    private double deltaY;

    // Constructor(s) of the class.
    private Ball(){

        this.graphics = new Circle
                (
                DEFAULT_GAME_WINDOW_WIDTH / 2,
                DEFAULT_GAME_WINDOW_HEIGHT / 2,
                DEFAULT_BALL_RADIUS
                );

        this.graphics.setFill(DEFAULT_PADDLE_COLOUR);

        this.deltaX = 0;
        this.deltaY = 0;

        Random random = new Random();

        this.deltaX = (Math.random() * 2 == 1 ) ? -250 : 250;
        this.deltaY = (Math.random() * 2 == 1 ) ?
                (new Random().nextDouble(-300)) : (new Random().nextDouble(300));
    }

    // Getters of the class.

    public Circle getGraphics() {return this.graphics;}


    // Setters of the class.

    // Public non-static methods of the unit.
    @Override
    public void draw(Pane target) {}

    @Override
    public void update(double deltaTime) {

        if(this.graphics.getCenterY() <= 0){
            this.graphics.setCenterY(0);
            this.deltaY = -this.deltaY;
        } else
            if(this.graphics.getCenterY() >= DEFAULT_GAME_WINDOW_WIDTH - this.graphics.getRadius()){
                this.graphics.setCenterY(DEFAULT_GAME_WINDOW_WIDTH - this.graphics.getRadius());
                this.deltaY = -this.deltaY;
            }

        this.graphics.setCenterX(this.graphics.getCenterX() + this.deltaX * deltaTime);
        this.graphics.setCenterY(this.graphics.getCenterY() + this.deltaY * deltaTime);
    }


    // Public static methods of the unit.
    public static Ball newDefault(){
        return new Ball();
    }

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
