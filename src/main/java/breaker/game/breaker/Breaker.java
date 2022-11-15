// The package in which the current Java compilation unit is to be found.
package breaker.game.breaker;
// Imports from existing Java libraries, classes and interfaces.
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// Import from custom libraries, classes and interfaces.
import breaker.game.components.paddle.Paddle;
import breaker.game.settings.Settings;

/**
 * @author Andrei-Paul Ionescu
 */
public class Breaker extends Application implements Settings {
    // Static values/constants of the class.

    // Fields/attributes of the class.
    private Paddle paddle;
    private double deltaTime = 0;
    private BorderPane root;

    // Constructor(s) of the class.

    // Getters of the class.

    // Setters of the class.

    // Public non-static methods of the unit.


    @Override
    public void init() throws Exception {
        super.init();

        this.paddle = new Paddle();
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
        this.root = new BorderPane();

        Scene scene = new Scene(root, DEFAULT_GAME_WINDOW_WIDTH, DEFAULT_GAME_WINDOW_HEIGHT);

        scene.setOnKeyPressed((key) -> {
            paddle.move(key.getCode());
        });

        scene.setOnKeyReleased((key) ->{

            if(key.getCode() == KeyCode.A || key.getCode() == KeyCode.D)
                paddle.update(this.deltaTime);
        });


        this.paddle.draw(root);

        primaryStage.setTitle("Breaker");
        primaryStage.setResizable(true);
        primaryStage.setScene(scene);
        primaryStage.show();
        this.animate();
    }

    public void animate() {
        new AnimationTimer() {
            long last = 0;

            @Override
            public void handle(long now) {
                if (last == 0) { // ignore the first tick, just compute the first deltaT
                    last = now;
                    return;
                }
                deltaTime = ((now - last) * 1.0e-9); // convert nanoseconds to seconds
                last = now;
            }
        }.start();
    }



    // Public static methods of the unit.

    // Private methods of the unit.

    // Nested class(es)/membered type(s).
}
