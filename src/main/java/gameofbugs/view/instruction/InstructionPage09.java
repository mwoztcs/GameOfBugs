package gameofbugs.view.instruction;

import gameofbugs.model.Position;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class InstructionPage09 extends InstructionView {
    public InstructionPage09(HBox root) {
        super(root);
    }

    @Override
    protected void drawText() {
        Text text = new Text();
        text.setText("MEM Status\n" +
                "\n" +
                "MEM is a very powerful piece. It moves one space per turn, but it can get onto the Hive. It means it can cover other piece. That`s why we have a Stack Bar. You can check here, if there are  some pieces covered by MEM. What’s important, a spot shows the same color as its top piece.\n" +
                "\n" +
                "Try to cover some pieces!\n");
        text.setFont(new Font(24));
        text.setWrappingWidth(400);
        textPane.setContent(text);
    }

    @Override
    protected VBox setRightBox() {
        VBox controlArea = new VBox();
        Button nextPageButton = new Button("Next page");
        nextPageButton.setOnMouseClicked(event -> instructionSceneController.triggerPage(10));

        Button prevPageButton = new Button("Previous page");
        prevPageButton.setOnMouseClicked(event -> instructionSceneController.triggerPage(8));

        Button backToMenuButton = new Button("Back to menu");
        backToMenuButton.setOnMouseClicked(event -> instructionSceneController.triggerMenu());

        controlArea.getChildren().addAll(textPane, nextPageButton, prevPageButton, backToMenuButton);

        return controlArea;
    }

    @Override
    protected void setBoard() {
        instructionController.triggerAction(new Position(-1, 1));
        instructionController.triggerAction(new Position(16, 16));
        instructionController.triggerAction(new Position(-2, 2));
        instructionController.triggerAction(new Position(15, 17));
        instructionController.triggerAction(new Position(-1, 1));
        instructionController.triggerAction(new Position(16, 15));
        instructionController.triggerAction(new Position(-2, 3));
        instructionController.triggerAction(new Position(15, 18));
        instructionController.triggerAction(new Position(-2, 4));
        instructionController.triggerAction(new Position(-1, 4));
        instructionController.triggerAction(new Position(17, 16));
        instructionController.triggerAction(new Position(-2, 4));
        instructionController.triggerAction(new Position(16, 18));
        instructionController.triggerAction(new Position(-1, 0));
        instructionController.triggerAction(new Position(15, 15));
        instructionController.triggerAction(new Position(-2, 0));
        instructionController.triggerAction(new Position(14, 17));
        instructionController.triggerAction(new Position(17, 16));
        instructionController.triggerAction(new Position(16, 17));
        instructionController.triggerAction(new Position(16, 18));
        instructionController.triggerAction(new Position(15, 18));
        instructionController.triggerAction(new Position(-1, 1));
        instructionController.triggerAction(new Position(14, 15));
        instructionController.triggerAction(new Position(16, 17));
        instructionController.triggerAction(new Position(-2, 2));
        instructionController.triggerAction(new Position(13, 17));
        instructionController.triggerAction(new Position(16, 17));
        instructionController.triggerAction(new Position(15, 17));
        instructionController.triggerAction(new Position(-2, 4));
        instructionController.triggerAction(new Position(16, 18));
        instructionController.triggerAction(new Position(15, 17));
        instructionController.triggerAction(new Position(14, 17));
        instructionController.triggerAction(new Position(-2, 1));
        instructionController.triggerAction(new Position(12, 18));
        instructionController.triggerAction(new Position(14, 17));
        instructionController.triggerAction(new Position(13, 17));
        instructionController.triggerAction(new Position(-1, 4));
        instructionController.triggerAction(new Position(-1, 4));
        instructionController.triggerAction(new Position(-2, 5));
        instructionController.triggerAction(new Position(14, 18));
        instructionController.triggerAction(new Position(-1, 4));
        instructionController.triggerAction(new Position(17, 15));

    }
}