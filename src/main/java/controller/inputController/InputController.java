package controller.inputController;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import utilities.InputCommand;

public interface InputController {

    /**
     * Change Scene of this InputController.
     * 
     * @param scene where this InputController detect keys.
     */
    void changeScene(Scene scene);

    /**
     * Set states (to not active) of all Key and Commands.
     */
    void resetStates();

    /**
     * Add an association key-command. There can only be one association key-command
     * per command type.
     * 
     * @param key
     * @param command
     */
    void addCommandKeys(KeyCode key, InputCommand command);

    /**
     * Check if a key is pressed or not.
     * 
     * @param key
     * @return status of the key
     */
    boolean isKeyPressed(KeyCode key);

    /**
     * Get the key mapped to the command.
     * 
     * @param command
     * @return the key mapped to the command.
     */
    KeyCode getKeyMapped(InputCommand command);

    /**
     * Check if the player's task is active or not.
     *
     * @param task
     * @return the player's task state
     */
    boolean isTaskActive(InputCommand task);

    /**
     * Set the state of a key.
     * 
     * @param key
     * @param state
     */
    void setKeyState(KeyCode key, boolean state);

    /**
     * Managing tasks. Checking if the state of some of them should be changed or
     * not. This is based on some particular logics.
     */
    void updatePlayerTasks();
}
