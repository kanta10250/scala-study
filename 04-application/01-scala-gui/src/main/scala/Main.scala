import javafx.application.Application
import javafx.event.{ActionEvent, EventHandler}
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

@main def launch(args: String*): Unit = Application.launch(classOf[Main], args*)

class Main extends Application :
  override def start(primaryStage: Stage): Unit =
    val btn = Button("おしてください")

    btn.setOnAction(new EventHandler[ActionEvent]:
      override def handle(event: ActionEvent): Unit =
        println("こんにちは")
      )

    val root = StackPane()
    root.getChildren.add(btn)

    val scene = Scene(root, 300, 250)
    primaryStage.setTitle("コンソールにこんにちはと出力")
    primaryStage.setScene(scene)
    primaryStage.show()
