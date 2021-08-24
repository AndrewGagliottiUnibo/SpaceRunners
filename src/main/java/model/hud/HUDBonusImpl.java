package model.hud;

import java.io.File;
import java.util.HashMap;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.status.StatusEnum;
import view.gameField.GameField;

public class HUDBonusImpl implements IHUDBonus {

    /*
     * HUD parameters
     */
    private final static int SPACING = 30;
    private static final double X_LAYOUT = 450;
    private static final double X_TRANSLATION = 645;

    /*
     * Control fields
     */
    private ImageView[] bonus = new ImageView[HUDParameters.TOTAL_BONUS];
    private HashMap<StatusEnum, Integer> conversionIndex = new HashMap<>();
    private GameField gamefield;

    /*
     * Constructor
     */
    public HUDBonusImpl(final GameField gamefield) {
        this.gamefield = gamefield;

        this.addBonuses();
    }

    @Override
    public ImageView[] getBonusTaken() {
        return this.bonus;
    }

    @Override
    public void addBonuses() {
        int index = HUDParameters.ZERO;
        
        /*
         * Life
         */
        this.bonus[index] = new ImageView(new Image(new File(HUDParameters.PNG_FOLDER + "bonusLife.png").toURI().toString(), SPACING, 
                SPACING, HUDParameters.RATIO, HUDParameters.SMOOTH));
        this.bonus[index].setLayoutX(X_LAYOUT);
        this.bonus[index].setLayoutY(index * -SPACING);
        this.bonus[index].setTranslateY(X_TRANSLATION);
        this.bonus[index].setViewOrder(HUDParameters.VIEW_ORDER);
        index++;
        
        /*
         * Speed bonus
         */
        this.bonus[index] = new ImageView(new Image(new File(HUDParameters.PNG_FOLDER + "BonusSpeed.png").toURI().toString(), SPACING, 
                SPACING, HUDParameters.RATIO, HUDParameters.SMOOTH));
        this.bonus[index].setLayoutX(X_LAYOUT);
        this.bonus[index].setLayoutY(index * -SPACING);
        this.bonus[index].setTranslateY(X_TRANSLATION);
        this.bonus[index].setViewOrder(HUDParameters.VIEW_ORDER);
        index++;
        
        /*
         * Command malus
         */
        this.bonus[index] = new ImageView(new Image(new File(HUDParameters.PNG_FOLDER + "malusCommand.png").toURI().toString(), SPACING, 
                SPACING, HUDParameters.RATIO, HUDParameters.SMOOTH));
        this.bonus[index].setLayoutX(X_LAYOUT);
        this.bonus[index].setLayoutY(index * -SPACING);
        this.bonus[index].setTranslateY(X_TRANSLATION);
        this.bonus[index].setViewOrder(HUDParameters.VIEW_ORDER);
        index++;
        
        /*
         * Fire malus
         */
        this.bonus[index] = new ImageView(new Image(new File(HUDParameters.PNG_FOLDER + "malusFire.png").toURI().toString(), SPACING, 
                SPACING, HUDParameters.RATIO, HUDParameters.SMOOTH));
        this.bonus[index].setLayoutX(X_LAYOUT);
        this.bonus[index].setLayoutY(index * -SPACING);
        this.bonus[index].setTranslateY(X_TRANSLATION);
        this.bonus[index].setViewOrder(HUDParameters.VIEW_ORDER);
        index++;
        
        /*
         * Speed malus
         */
        this.bonus[index] = new ImageView(new Image(new File(HUDParameters.PNG_FOLDER + "malusSpeed.png").toURI().toString(), SPACING, 
                SPACING, HUDParameters.RATIO, HUDParameters.SMOOTH));
        this.bonus[index].setLayoutX(X_LAYOUT);
        this.bonus[index].setLayoutY(index * -SPACING);
        this.bonus[index].setTranslateY(X_TRANSLATION);
        this.bonus[index].setViewOrder(HUDParameters.VIEW_ORDER);
        index++;

//        for (StatusEnum status : StatusEnum.values()) {
//
//            this.bonus[status.ordinal()] = new ImageView(
//            new Image(new File(HUDParameters.PNG_FOLDER + "Bonus"+status.ordinal()+".png").toURI().toString(), DIMENSIONS,
//             DIMENSIONS, HUDParameters.RATIO, HUDParameters.SMOOTH));
//            this.bonus[status.ordinal()].setLayoutX(X_LAYOUT);
//            this.bonus[status.ordinal()].setLayoutY(status.ordinal() * -SPACING);
//            this.bonus[status.ordinal()].setTranslateY(X_TRANSLATION);
//            this.bonus[status.ordinal()].setViewOrder(HUDParameters.VIEW_ORDER);
//
//            this.gamfield.getGameContainer().getChildren().add(this.bonus[status.ordinal()]);
//        }
    }
    
    public void refreshBonus() {
        
        HashMap <StatusEnum, Boolean> activeBonus = this.gamefield.getStatusController().getActiveStatus();
        
        for (final StatusEnum bonus : StatusEnum.values()) {
                if(activeBonus.get(bonus)) {
                    showBonus(this.conversionIndex.get(bonus));
                }
                else {
                    hideBonus(this.conversionIndex.get(bonus));
                }
        }       
    }

    @Override
    public void showBonus(final int index) {
        this.gamefield.getGameContainer().getChildren().add(this.bonus[index]);
    }

    @Override
    public void hideBonus(final int index) {
        this.gamefield.getGameContainer().getChildren().remove(this.bonus[index]);
    }
}
