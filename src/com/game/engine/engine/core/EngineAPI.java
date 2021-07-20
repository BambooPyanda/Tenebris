package com.game.engine.engine.core;

import com.game.engine.engine.states.Game;
import com.game.engine.engine.ui.UI;
import com.game.engine.engine.ui.UIComponent;
import com.game.engine.engine.util.EngineSettings;

import java.util.ArrayList;

public class EngineAPI {

    private GameEngine engine;

    public EngineAPI() {}

    public void init(Game game, EngineSettings engineSettings) {
        this.engine = new GameEngine(game, engineSettings);
        this.engine.setAPI(this);
    }

    public void start() {
        this.engine.start();
    }

    public void stop() {
        this.engine.stop();
    }

    /**
     * <p><font color=#b13b3f> Warning: <br> </font>
     * This function does not call dispose() methods, <br> therefore the engine will abruptly halt.
     */
    public void forceStop() {
        this.engine.forceStop();
    }


    // API Methods

    public int getWidth() { return engine.getSettings().getWidth(); }
    public void setWidth(int width) { engine.getSettings().setWidth(width); }

    public int getHeight() { return engine.getSettings().getHeight(); }
    public void setHeight(int height) { engine.getSettings().setHeight(height); }

    public String getTitle() { return engine.getSettings().getTitle(); }
    public void setTitle(String title) { engine.getSettings().setTitle(title); }

    public float getScale() { return engine.getSettings().getScale(); }

    public Window getWindow() { return engine.getWindow(); }

    public Input getInput() { return engine.getInput(); }

    public int getFps() { return engine.getFps(); }

    public Renderer getRenderer() { return engine.getRenderer(); }

    public EngineSettings getSettings() { return engine.getSettings(); }

    public Game getGame() { return engine.getGame(); }

    public void setClearColour(int clearColour) { engine.setClearColour(clearColour); }

    public UI getUI() {
        return engine.getUI();
    }

}