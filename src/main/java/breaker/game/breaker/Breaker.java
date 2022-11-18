// The package in which the current Java compilation unit is to be found.
package breaker.game.breaker;
// Imports from existing Java libraries, classes and interfaces.
import breaker.game.scenes.game.Game;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// Import from custom libraries, classes and interfaces.
import breaker.game.settings.Settings;


/**
 * @author Andrei-Paul Ionescu
 */
public class Breaker extends Application implements Settings {
    // Static values/constants of the class.

    // Fields/attributes of the class.
    private BorderPane root;

    private AnimationTimer mainLoop;

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.
    @Override
    public void init() throws Exception {
        super.init();

        this.root = new BorderPane();
    }

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages.
     * @throws Exception if something goes wrong
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Game game = new Game(root, DEFAULT_GAME_WINDOW_WIDTH, DEFAULT_GAME_WINDOW_HEIGHT);

        primaryStage.setTitle("Breaker");
        primaryStage.setResizable(true);
        primaryStage.show();
        primaryStage.setScene(game);
        primaryStage.centerOnScreen();

        this.mainLoop = new AnimationTimer() {

            @Override
            public void handle(long now) {


                Scene scene = primaryStage.getScene();

                if(scene instanceof breaker.game.scenes.model.Scene)
                    ((breaker.game.scenes.model.Scene) scene).tick();


            }
        };

        this.mainLoop.start();
    }

    @Override
    public void stop() throws Exception{
        super.stop();
        mainLoop.stop();
    }

    // Public static methods of the unit.
    public static void main(String[] args) {launch(args);}

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
