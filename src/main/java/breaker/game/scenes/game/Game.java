// The package in which the current Java compilation unit is to be found.
package breaker.game.scenes.game;
// Imports from existing Java libraries, classes and interfaces.
import breaker.game.components.paddle.Paddle;
import javafx.beans.NamedArg;
import javafx.scene.Parent;
// Import from custom libraries, classes and interfaces.
import breaker.game.scenes.model.Scene;



/**
 * @author Andrei-Paul Ionescu
 */
public class Game extends Scene {
    // Static values/constants of the class.

    // Fields/attributes of the class.
    private final Paddle paddle;

    // Instance-side initialisation block.
    {
        this.paddle = Paddle.newDefault();
    }

    // Constructor(s) of the class.
    public Game(@NamedArg("root") Parent root, @NamedArg("width") double width, @NamedArg("height")double height) {
        super(root, width, height);


    }

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.
    @Override
    public void tick (){


    }

    // Public static methods of the unit.

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
