package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Blank widget, super class of all classes
        Region r = new Region();

        GridPane root = new GridPane();
        root.setHgrow(r, Priority.ALWAYS);

        primaryStage.setTitle("Homework 1 - CheckBoxes, RadioButtons, Buttons");
        primaryStage.setScene(new Scene(root, 400, 400));

        // TOGGLE GROUPS FOR RADIO BUTTONS
        ToggleGroup tg1 = new ToggleGroup();
        ToggleGroup tg2 = new ToggleGroup();

        // ARRAYLIST INITIALIZED TO STORE RADIO BUTTON VALUES TO MESSAGE LIST
        ArrayList arrayList = new ArrayList();

        // RADIO BUTTONS

        //1-3 (COLUMN 1)
        RadioButton rb1 = new RadioButton("Sansa");
        root.add(rb1, 0, 1);
        rb1.setToggleGroup(tg1);
        rb1.setDisable(true);

        RadioButton rb2 = new RadioButton("Bran");
        root.add(rb2, 0, 2);
        rb2.setToggleGroup(tg1);
        rb2.setDisable(true);

        RadioButton rb3 = new RadioButton("Arya");
        root.add(rb3, 0, 3);
        rb3.setToggleGroup(tg1);
        rb3.setDisable(true);

        //4-6 (COLUMN 2)
        RadioButton rb4 = new RadioButton("Joffrey");
        root.add(rb4, 1, 1);
        rb4.setToggleGroup(tg2);
        rb4.setDisable(true);

        RadioButton rb5 = new RadioButton("Tommen");
        root.add(rb5, 1, 2);
        rb5.setToggleGroup(tg2);
        rb5.setDisable(true);

        RadioButton rb6 = new RadioButton("Myrcella");
        root.add(rb6, 1, 3);
        rb6.setToggleGroup(tg2);
        rb6.setDisable(true);


        // TOGGLE GROUP #1
        tg1.selectedToggleProperty().addListener(
                (observable, old_toggle, new_toggle) -> {
                    if (new_toggle == rb1) {

                        System.out.println("Sansa selected to be added to message list. Click submit to finalize.");
                        //arrayList.add(rb1.getText());

                    } else if (new_toggle == rb2) {

                        System.out.println("Bran selected to be added to message list.  Click submit to finalize.");
                        //arrayList.add(rb2.getText());

                    } else if (new_toggle == rb3) {

                        System.out.println("Arya selected to be added to message list.  Click submit to finalize.");
                        //arrayList.add(rb3.getText());

                    }
                }
        );


        // TOGGLE GROUP #2
        tg2.selectedToggleProperty().addListener(
                (observable, old_toggle, new_toggle) -> {
                    if (new_toggle == rb4) {
                        System.out.println("Joffrey selected to be added to message list.  Click submit to finalize.");
                        //arrayList.add(rb4.getText());
                    } else if (new_toggle == rb5) {
                        System.out.println("Tommen selected to be added to message list.  Click submit to finalize.");
                        //arrayList.add(rb5.getText());
                    } else if (new_toggle == rb6) {
                        System.out.println("Myrcella selected to be added to message list.  Click submit to finalize.");
                        //arrayList.add(rb6.getText());
                    }
                }
        );


        // CHECKBOX #1 TO CONTROL FIRST COLUMN OF RADIO BUTTONS
        CheckBox box = new CheckBox("Hello");
        root.add(box, 0, 0);
        box.setAllowIndeterminate(false);

        box.selectedProperty().addListener(
                (observable, oldval, newval) -> {
                    if (newval) {
                        System.out.println("Check box 1 : Checked");
                        rb1.setDisable(false);
                        rb2.setDisable(false);
                        rb3.setDisable(false);
                    } else {
                        System.out.println("Check box 1 : Unchecked");
                        rb1.setDisable(true);
                        rb2.setDisable(true);
                        rb3.setDisable(true);
                    }
                }
        );


        // CHECKBOX #2 TO CONTROL FIRST COLUMN OF RADIO BUTTONS
        CheckBox box2 = new CheckBox("Good-bye");
        root.add(box2, 1, 0);
        box.setAllowIndeterminate(false);

        box2.selectedProperty().addListener(
                (observable, oldval, newval) -> {
                    if (newval) {
                        System.out.println("Check box 2 : Checked");
                        rb4.setDisable(false);
                        rb5.setDisable(false);
                        rb6.setDisable(false);
                    } else {
                        System.out.println("Check box 2 : Unchecked");
                        rb4.setDisable(true);
                        rb5.setDisable(true);
                        rb6.setDisable(true);
                    }
                }
        );


        // 2 BUTTONS - FAR RIGHT -----------------------------------------------
        Button button = new Button("Submit");
        root.add(button, 4, 0);
        button.setOnAction(
                (event) -> {
                    if(box.isSelected() == true) {
                        tg1.selectedToggleProperty().addListener(
                                (observable, old_toggle, new_toggle) -> {
                                    if (old_toggle == rb1) {

                                        System.out.println("Sansa successfully added. ");
                                        arrayList.add(rb1.getText());
                                        rb1.disableProperty();

                                    } else if (old_toggle == rb2) {

                                        System.out.println("Bran successfully added.");
                                        arrayList.add(rb2.getText());
                                        rb2.disableProperty();

                                    } else if (old_toggle == rb3) {

                                        System.out.println("Arya successfully added.");
                                        arrayList.add(rb3.getText());
                                        rb3.disableProperty();

                                    }
                                }
                        );
                    }
                    if(box2.isSelected() == true) {
                        tg2.selectedToggleProperty().addListener(
                                (observable, old_toggle, new_toggle) -> {
                                    if (new_toggle == rb4) {

                                        System.out.println("Joffrey successfully added.");
                                        arrayList.add(rb4.getText());
                                        rb4.disableProperty();

                                    } else if (old_toggle == rb5) {

                                        System.out.println("Tommen successfully added.");
                                        arrayList.add(rb5.getText());
                                        rb5.disableProperty();

                                    } else if (old_toggle == rb6) {

                                        System.out.println("Myrcella successfully added.");
                                        arrayList.add(rb6.getText());
                                        rb6.disableProperty();

                                    }
                                }
                        );
                    }

//                    tg1.getSelectedToggle().setSelected(false);
//                    tg2.getSelectedToggle().setSelected(false);
                    tg1.selectToggle(null);
                    tg2.selectToggle(null);
                    box.setSelected(false);
                    box2.setSelected(false);
                    button.disableProperty();
                }
        );

        Button button2 = new Button("Print");
        root.add(button2, 4, 1);
        button2.setOnAction(

                (event) ->{
                    System.out.println();
                    System.out.println("------- Message list output ------- ");
                    System.out.println();
                    for(int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                    }
                }
        );

        // CREATING REGIONS TO CREATE SPACING AND SEPERATIONS
        root.add(r, 3, 0);

        // SHOW THE WIDGETS
        primaryStage.show();


    }


    public static void main(String[] args)  {

        launch(args);

    }
}

