/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package micontrol;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

/**
 *
 * @author Guillermo
 */
public class MiControl extends Region {
    
    public MiControl(){
    super();
    // marca la zona donde hacer click
    
    setStyle("-fx-border-color:red;");
    setPrefSize(100, 100);
    this.setOnMouseClicked(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            onActionProperty().get().handle(event);
        }
    });
    }
    private ObjectProperty<EventHandler<MouseEvent>> OnAction = new SimpleObjectProperty<EventHandler<MouseEvent>>();
    public final ObjectProperty<EventHandler<MouseEvent>> onActionProperty() {
        return OnAction;
    }
    public final void setOnAction(EventHandler<MouseEvent> handler) {
        OnAction.set(handler);
    }
    public final EventHandler<MouseEvent> getOnAction() {
        return OnAction.get();
    }   
}
