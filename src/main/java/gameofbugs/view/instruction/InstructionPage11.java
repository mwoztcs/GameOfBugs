package gameofbugs.view.instruction;

import gameofbugs.model.Position;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class InstructionPage11 extends InstructionView {
    public InstructionPage11(HBox root) {
        super(root);
    }

    @Override
    protected void drawText() {
        Text text = new Text();
        text.setText(
                "QUE doesn`t have its own moves. It copies moves from his neighbors. Additionally, when QUE is on top, it can move only like MEM and when the only neighbor of QUE is QUE it can`t move anywhere.\n" +
                "\n" +
                "Check how it works!\n");
        text.setFont(new Font(24));
        text.setWrappingWidth(350);
        textPane.setContent(text);
    }

    @Override
    protected VBox setRightBox() {
        VBox controlArea = new VBox();

        Button prevPageButton = new Button("Previous page");
        prevPageButton.setOnMouseClicked(event -> instructionSceneController.triggerPage(10));

        Button backToMenuButton = new Button("Back to menu");
        backToMenuButton.setOnMouseClicked(event -> instructionSceneController.triggerMenu());

        controlArea.getChildren().addAll(textPane, prevPageButton, backToMenuButton);

        return controlArea;
    }

    @Override
    protected HBox setTopBar() {
        HBox topBar = new HBox();
        Label text = new Label("QUE Status");
        topBar.getChildren().clear();
        topBar.getChildren().addAll(text);
        topBar.setAlignment(Pos.CENTER);
        HBox.setHgrow(text, Priority.ALWAYS);
        return topBar;
    }

    @Override
    protected void setBoard() {
        instructionController.triggerAction(new Position(-1, 0));
        instructionController.triggerAction(new Position(16, 16));
        instructionController.triggerAction(new Position(-2, 1));
        instructionController.triggerAction(new Position(15, 17));
        instructionController.triggerAction(new Position(-1, 2));
        instructionController.triggerAction(new Position(16, 15));
        instructionController.triggerAction(new Position(-2, 2));
        instructionController.triggerAction(new Position(15, 18));
        instructionController.triggerAction(new Position(-1, 1));
        instructionController.triggerAction(new Position(15, 15));
        instructionController.triggerAction(new Position(-2, 3));
        instructionController.triggerAction(new Position(16, 18));
        instructionController.triggerAction(new Position(-1, 3));
        instructionController.triggerAction(new Position(17, 16));
        instructionController.triggerAction(new Position(-2, 1));
        instructionController.triggerAction(new Position(-2, 2));
        instructionController.triggerAction(new Position(-2, 3));
        instructionController.triggerAction(new Position(-1, 1));
        instructionController.triggerAction(new Position(-2, 0));
        instructionController.triggerAction(new Position(14, 17));
        instructionController.triggerAction(new Position(-1, 3));
        instructionController.triggerAction(new Position(17, 15));
        instructionController.triggerAction(new Position(-2, 4));
        instructionController.triggerAction(new Position(14, 18));
        instructionController.triggerAction(new Position(17, 15));
        instructionController.triggerAction(new Position(17, 17));
        instructionController.triggerAction(new Position(14, 18));
        instructionController.triggerAction(new Position(15, 17));
        instructionController.triggerAction(new Position(-1, 4));
        instructionController.triggerAction(new Position(14, 15));
        instructionController.triggerAction(new Position(-2, 5));
        instructionController.triggerAction(new Position(14, 18));
        instructionController.triggerAction(new Position(14, 18));
        instructionController.triggerAction(new Position(-1, 6));
        instructionController.triggerAction(new Position(17, 15));
        instructionController.triggerAction(new Position(-2, 6));
        instructionController.triggerAction(new Position(13, 17));
        instructionController.triggerAction(new Position(17, 15));
        instructionController.triggerAction(new Position(17, 15));
        instructionController.triggerAction(new Position(-1, 5));
        instructionController.triggerAction(new Position(16, 14));
        instructionController.triggerAction(new Position(13, 17));
        instructionController.triggerAction(new Position(14, 16));
        instructionController.triggerAction(new Position(-2, 4));
        instructionController.triggerAction(new Position(-1, 4));
        instructionController.triggerAction(new Position(18, 17));
        instructionController.triggerAction(new Position(14, 16));
        instructionController.triggerAction(new Position(15, 15));
        instructionController.triggerAction(new Position(17, 15));
        instructionController.triggerAction(new Position(17, 15));
    }
}
