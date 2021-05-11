package GameLoop;


import GameController.*;
import GameField.*;
import MainWindow.*;
import javafx.animation.*;
import javafx.stage.Stage;
import Renderer.*;

public class GameManager extends AnimationTimer {

    private MainWindow mainwindow;

    private GameFieldImpl gamefield;

    private Renderer gameRenderer;
    private GameController gameController;


    public GameManager(Stage stage)
    {

        this.mainwindow = new MainWindowImpl(stage);
        this.gamefield = new GameFieldImpl(1280,720);
        
        
        this.gameController = new GameContollerImpl(this.gamefield);

        this.mainwindow.setWidth(1280);
        this.mainwindow.setHeight(720);
    
        this.mainwindow.addGameField(this.gamefield);

        this.gameRenderer = new RendererImpl(this.gamefield);

        stage.show();
       // this.mainwindow.setVisible(true);
     

    }

 


    @Override
    public void handle(long arg0) {
        
        
        this.gameController.update();

        this.gameRenderer.render();

        
        
        
    }
    
}
