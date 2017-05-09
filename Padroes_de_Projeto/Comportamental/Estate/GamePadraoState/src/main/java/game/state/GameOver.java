
package game.state;

import game.observer.PersonagemPadrao;
import game.observer.SimpleSlickGame;
import org.newdawn.slick.GameContainer;

/**
 *
 * @author felipe
 */
public class GameOver extends State {

    @Override
    public void doAction(GameContainer gc, SimpleSlickGame sl, int i) {        
        gc.pause();
        
    }

    
    
}
