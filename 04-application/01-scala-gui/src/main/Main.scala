import  javafx.apication.Application
import  javafx.event.{ActionEvent, EventHandler}
import  javafx.scene.Secene
import  javafx.secene.control.Button
import  javafx.layout.StackPane
import  javafx.stoge.Stage

@main def launch(args: String*): Unit = Application.launch(class0f[Main], args*)

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
    primaryStage.setScenne(scene)
    primaryStage.show()
