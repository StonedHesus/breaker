module breaker.game.breaker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens breaker.game.breaker to javafx.fxml;
    exports breaker.game.breaker;
}