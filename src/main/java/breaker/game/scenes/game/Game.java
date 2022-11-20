// The package in which the current Java compilation unit is to be found.
package breaker.game.scenes.game;
// Imports from existing Java libraries, classes and interfaces.
import javafx.application.Application;
import javafx.beans.NamedArg;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
// Import from custom libraries, classes and interfaces.
import breaker.game.scenes.model.Scene;
import breaker.game.breaker.Breaker;
import breaker.game.components.paddle.Paddle;


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
    public static <Type extends Application> Game newGameSceneFor(@NamedArg("application") Type application) {

        Game game = new Game(new Group(),((Breaker) application).getWidth(), ((Breaker) application).getHeight());

        Parent root = game.getRoot();

        Group rootGroup = (Group) root;
        ObservableList<Node> children = rootGroup.getChildren();

        children.add(game.paddle.getGraphics());
        game.setFill(Color.WHITE);

        return game;
    }

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
