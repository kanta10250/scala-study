import java.lang.Math.random
import java.util.function.Consumer

import javafx.animation.{KeyFrame, KeyValue, Timeline}
import javafx.application.Application
import javafx.scene.{Group, Node, Scene}
import javafx.scene.paint.Color
import javafx.scene.shape.{Circle, StrokeType}
import javafx.stage.Stage
import javafx.util.Duration

@main def launch(args: String*): Unit = Application.launch(classOf[Main], args*)

class Main extends Application:

  override def start(primaryStage: Stage): Unit =
    val root = Group()
    val scene = Scene(root, 800, 600, Color.BLACK)
    primaryStage.setScene(scene)

    val circles = Group()
    val circleNum = getParameters().getNamed.getOrDefault("num", "30").toInt
    for i <- 1 to circleNum do
      val circle = Circle(150, Color.web("white", 0.05))
      circle.setStrokeType(StrokeType.OUTSIDE)
      circle.setStroke(Color.web("white", 0.16))
      circle.setStrokeWidth(4)
      circles.getChildren().add(circle)

    root.getChildren().add(circles)

    val timeline = Timeline()
    circles.getChildren().forEach(new Consumer[Node]:

      override def accept(circle: Node): Unit =
        timeline.getKeyFrames().addAll(
          KeyFrame(Duration.ZERO,
            KeyValue(circle.translateXProperty(), random() * 800: Number),
            KeyValue(circle.translateYProperty(), random() * 600: Number)
          ),
          KeyFrame(new Duration(40000),
            KeyValue(circle.translateXProperty(), random() * 800: Number),
            KeyValue(circle.translateYProperty(), random() * 600: Number)
          )
        )
    )
    timeline.play()
    primaryStage.show()
