import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import java.util.*;

public class Animation extends Application {
private ArrayList<Color> palette = new ArrayList<Color>(Arrays.asList(Color.PINK,Color.MAGENTA, Color.CORAL, Color.BLACK,
		Color.CYAN, Color.BROWN,Color.BLUE, Color.ORANGE, Color.GREEN, Color.YELLOW, Color.LAVENDER));

public void start(Stage stage) {
	 Sphere sphere = new Sphere();
	 sphere.setRadius(40.0f);
	 PhongMaterial phMaterial = new PhongMaterial();
	 phMaterial.setDiffuseColor(Color.RED);
	 sphere.setMaterial(phMaterial);
	 sphere.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
		 @Override
		 public void handle(MouseEvent event) {
			 PhongMaterial phMaterial = new PhongMaterial();
			 phMaterial.setDiffuseColor(palette.get(new Random().nextInt(palette.size())));
		 }
	 });
	Cylinder cylinder = new Cylinder();
	cylinder.setRadius(30.0f);
	cylinder.setHeight(70.0f);
	PhongMaterial phMaterial1 = new PhongMaterial();
	phMaterial1.setDiffuseColor(Color.ORANGE);
	cylinder.setMaterial(phMaterial1);
	cylinder.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
			PhongMaterial phMaterial1 = new PhongMaterial();
			phMaterial1.setDiffuseColor(palette.get(new Random().nextInt(palette.size())));
			cylinder.setMaterial(phMaterial1);
		}
	});
	
	Box box = new Box();
	box.setHeight(50.0f);
	box.setWidth(70.0f);
	box.setDepth(30.0f);
	PhongMaterial phMaterial2 = new PhongMaterial();
	phMaterial2.setDiffuseColor(Color.PINK);
	box.setMaterial(phMaterial2);
	box.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
			PhongMaterial phMaterial2 = new PhongMaterial();
			phMaterial2.setDiffuseColor(palette.get(new Random().nextInt(palette.size())));
			box.setMaterial(phMaterial2);
		}
	});
	
    //	RotateTransition
	
	Polygon hexagon = new Polygon();  
	hexagon.getPoints().addAll(new Double[]{        
	         200.0, 50.0, 
	         400.0, 50.0, 
	         450.0, 150.0,          
	         400.0, 250.0, 
	         200.0, 250.0,                   
	         150.0, 150.0, 
	      }); 
	hexagon.setFill(Color.CYAN); 
	RotateTransition rotateTransition = new RotateTransition(); 
	rotateTransition.setDuration(Duration.millis(10000)); 
	rotateTransition.setNode(hexagon);    
	rotateTransition.setByAngle(360); 
	rotateTransition.setCycleCount(50); 
	rotateTransition.setAutoReverse(false); 
	rotateTransition.play(); 

    // ScaleTransition	
	
	Circle circle = new Circle();
	circle.setCenterX(100.0f); 
    circle.setCenterY(100.0f); 
    circle.setRadius(100.0f); 
    circle.setFill(Color.MAGENTA); 
    circle.setStrokeWidth(20); 
    ScaleTransition scaleTransition = new ScaleTransition(); 
    scaleTransition.setDuration(Duration.millis(10000)); 
    scaleTransition.setNode(circle); 
    scaleTransition.setByY(1.0); 
    scaleTransition.setByX(1.0); 
    scaleTransition.setCycleCount(50); 
    scaleTransition.setAutoReverse(false); 
    scaleTransition.play(); 
    
    // SequentialTransition
    
    Circle circle1 = new Circle(); 
    circle1.setCenterX(150.0f); 
    circle1.setCenterY(135.0f); 
    circle1.setRadius(100.0f); 
    circle1.setFill(Color.BURLYWOOD); 
    circle1.setStrokeWidth(20);
    Path path = new Path(); 
    MoveTo moveTo = new MoveTo(100, 150); 
    CubicCurveTo cubicCurveTo = new CubicCurveTo(400, 40, 175, 250, 500, 150); 
    path.getElements().add(moveTo); 
    path.getElements().add(cubicCurveTo);  
    PathTransition pathTransition = new PathTransition(); 
    pathTransition.setDuration(Duration.millis(100000)); 
    pathTransition.setNode(circle1); 
    pathTransition.setPath(path); 
    pathTransition.setOrientation(
    PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT); 
    pathTransition.setCycleCount(5); 
    pathTransition.setAutoReverse(false); 
    pathTransition.play();   
    TranslateTransition translateTransition = new TranslateTransition(); 
    pathTransition.setDuration(Duration.millis(1000)); 
    pathTransition.setNode(circle1); 
    translateTransition.setByX(300); 
    translateTransition.setCycleCount(5); 
    translateTransition.setAutoReverse(false);  
    ScaleTransition scaleTransition1 = new ScaleTransition();  
    pathTransition.setDuration(Duration.millis(10000)); 
    pathTransition.setNode(circle1); 
    scaleTransition1.setByY(1.5); 
    scaleTransition1.setByX(1.5);  
    scaleTransition1.setCycleCount(5); 
    scaleTransition1.setAutoReverse(false);   
    SequentialTransition sequentialTransition = new SequentialTransition(circle1, 
            pathTransition, translateTransition, scaleTransition ); 
    sequentialTransition.play(); 
    
    
    
	
	FlowPane center = new FlowPane();
	center.setPadding(new Insets (10, 10, 10, 10));
	center.setVgap(4);
	center.setHgap(4);
	center.getChildren().addAll(sphere, cylinder, box, hexagon, circle, circle1);
	
	BorderPane root = new BorderPane();
	root.setCenter(center);
	
	Scene scene = new Scene(root);
	stage.setScene(scene);
	
	stage.setX(200);
	stage.setY(300);
	stage.setMinHeight(300);
	stage.setMinWidth(300);
	stage.setTitle("Test JavaFX app");
	stage.show();
	}
public static void main(String[] args) {
	Application.launch(args);
	
	}

}
