// The package in which the current Java compilation unit is to be found.
package breaker.game.scenes.game;
// Imports from existing Java libraries, classes and interfaces.
import breaker.game.components.ball.Ball;
import javafx.application.Application;
import javafx.beans.NamedArg;
import javafx.collections.ObservableList;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
// Import from custom libraries, classes and interfaces.
import breaker.game.scenes.model.Scene;
import breaker.game.breaker.Breaker;
import breaker.game.components.paddle.Paddle;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * @author Andrei-Paul Ionescu
 */
public class Game extends Scene {
    // Static values/constants of the class.
    private static final HashSet<KeyCode> inputMap = new HashSet<>();

    // Fields/attributes of the class.
    private final Paddle paddle;

    private final Ball ball;


    // Instance-side initialisation block.
    {
        this.paddle = Paddle.newDefault();
        this.ball   = Ball.newDefault();
    }

    // Constructor(s) of the class.
    public Game(@NamedArg("root") Parent root, @NamedArg("width") double width, @NamedArg("height")double height) {
        super(root, width, height);
    }

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.
    private static int I = 1;
    @Override
    public void tick (double deltaTime) {
        inputMap.forEach(this.paddle::move);
        this.ball.update(deltaTime);
    }

    // Public static methods of the unit.
    public static <Type extends Application> Game newGameSceneFor(@NamedArg("application") Type application) {

        Game game = new Game(new Group(),((Breaker) application).getWidth(), ((Breaker) application).getHeight());

        Parent root = game.getRoot();

        Group rootGroup = (Group) root;
        ObservableList<Node> children = rootGroup.getChildren();

        children.add(game.paddle.getGraphics());
        children.add(game.ball.getGraphics());
        game.setFill(Color.WHITE);

        game.setOnKeyPressed(event -> inputMap.add(event.getCode()));
        game.setOnKeyReleased(event -> inputMap.remove(event.getCode()));

        return game;
    }

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
