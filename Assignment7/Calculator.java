import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.StageStyle;


public class Calculator extends Application{

	private static final String[][] Calskey = {
			{"7", "8", "9", "C"}, 
			{"4", "5", "6", "+"}, 
			{"1", "2", "3", "-"}, 
			{"0", "*", "/", "="}
	};
	private final Map<String, Button> MyHashMap = new HashMap<>();
	
	private DoubleProperty stack_Value = new SimpleDoubleProperty();
	private DoubleProperty simple_value = new SimpleDoubleProperty();
	
	private enum Operation1 {NoOperation, addition, subtraction, multiplication, division}
	
	private Operation1 cur_Op = Operation1.NoOperation;
	private Operation1 stack_Op = Operation1.NoOperation;
	
	public static void main (String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		final TextField screen = create_Screen();
		final TilePane buttons = create_Buttons();
		
		stage.setTitle("Calculator");
		stage.initStyle(StageStyle.UTILITY);
		stage.setResizable(false);
		stage.setScene(new Scene(createLayout(screen, buttons)));
		stage.show();
	}
	
	private VBox createLayout(TextField screen, TilePane buttons) {
		final VBox Cals_layout = new VBox(21);
		Cals_layout.setAlignment(Pos.CENTER);
		Cals_layout.setStyle("-fx-background-color: pink; -fx-padding: 25; -fx-font-size: 26;");
		Cals_layout.getChildren().setAll(screen, buttons);
		Accelerators_handle(Cals_layout);
		screen.prefWidthProperty().bind(buttons.widthProperty());
		return Cals_layout;
	}
	
	private void Accelerators_handle(VBox layout) {
		layout.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>(){
		@Override
		public void handle(KeyEvent keyEvent) {
			Button activated = MyHashMap.get(keyEvent.getText());
			if (activated != null) {
				activated.fire();
			}
		}
		});
	}
	private TextField create_Screen() {
		// TODO Auto-generated method stub
		final TextField screen = new TextField();
		
		screen.setAlignment(Pos.CENTER_RIGHT);
		screen.setEditable(false);
		screen.textProperty().bind(Bindings.format("%.1f", simple_value));
		return screen;
	}

	private TilePane create_Buttons() {
		// TODO Auto-generated method stub
		TilePane btn = new TilePane();
		btn.setVgap(7);
		btn.setHgap(7);
		btn.setPrefColumns(Calskey[0].length);
		for (String[] r: Calskey) {
			for (String s: r) {
				btn.getChildren().add(create_Button(s));
			}
		}
		
		return btn;
	}

	private Button create_Button(final String s) {
		// TODO Auto-generated method stub
		Button btn = Standard_Button(s);
		
		if (s.matches("[0-9]")) {
			Numeric_Button(s, btn);
			
		}
		else {
			final ObjectProperty<Operation1> trigger_Operation = determine_Operand(s);
			if (trigger_Operation.get() != Operation1.NoOperation) {
				Operand_Button(btn, trigger_Operation);
			}
			else if ("C".equals(s)) {
				Clear_Button(btn);
				
			}
			else if ("=".equals(s)) {
				EqualsButton(btn);
			}
		}
		return btn;
	}
	
	@SuppressWarnings("unused")
	private ObjectProperty<Operation1> determine_Operand(String s){
		final ObjectProperty<Operation1> triggerOp = new SimpleObjectProperty<>(Operation1.NoOperation);
		switch(s) {
		case "+": 
			triggerOp.set(Operation1.addition);
			break;
		case "-":
			triggerOp.set(Operation1.subtraction);
			break;
		case "*":
			triggerOp.set(Operation1.multiplication);
			break;	
		case "/":
			triggerOp.set(Operation1.division);
			break;	
		}
		return triggerOp;
	}

	private void Operand_Button(Button button, final ObjectProperty<Operation1> triggerOp) {
		button.setOnAction(new EventHandler<ActionEvent>() {
	@Override
	public void handle(ActionEvent actionEvent) {
		cur_Op = triggerOp.get();
	}
	});	
}
	private Button Standard_Button(String s) {
		Button button = new Button(s);
		MyHashMap.put(s, button);
		button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		return button;
	}
	
	private void Numeric_Button(final String s, Button button) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				if (cur_Op == Operation1.NoOperation) {
					simple_value.set(simple_value.get() * 10 + Integer.parseInt(s));
				}
				else {
					stack_Value.set(simple_value.get());
					simple_value.set(Integer.parseInt(s));
					stack_Op = cur_Op;
					cur_Op = Operation1.NoOperation;
				}
			}
		});
	}
	private void Clear_Button(Button button) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				simple_value.set(0);
			}
		});
	}
	private void EqualsButton(Button button) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("incomplete-switch")
			@Override
			public void handle(ActionEvent actionEvent) {
				switch(stack_Op) {
				case addition:
					simple_value.set(stack_Value.get() + simple_value.get());
					break;
				case subtraction:
					simple_value.set(stack_Value.get() - simple_value.get());
					break;
				case multiplication:
					simple_value.set(stack_Value.get() * simple_value.get());
					break;
				case division:
					simple_value.set(stack_Value.get() / simple_value.get());
					break;
				}
				
			}
		});
	}
}
