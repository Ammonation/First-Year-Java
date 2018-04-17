import java.awt.event.KeyEvent;
/**
 * BreakOut controller, handles user interactions
 * @author Mike Smith University of Brighton
 */


public class Controller
{
  private Model model;   // Model of game
  private View  view;    // View of game
  private GameObj bat;   // The bat

  public Controller(Model aBreakOutModel,
                    View aBreakOutView )
  {
    model  = aBreakOutModel;
    view   = aBreakOutView;
    view.setController( this );    // View could talk to controller
  }

  /**
   * Decide what to do for each interaction from the user
   * Called from the interaction code in the view
   * @param keyCode The key pressed
   */
  public void userKeyInteraction(int keyCode )
  {
    // Key typed includes specials, -ve
    // Char is ASCII value
    bat = model.getBat();
    System.out.println(bat.getX());
    switch ( keyCode )               // Character is
    {
      case -KeyEvent.VK_LEFT:        // Left Arrow
        if(bat.getX()<=9){ // If the left of the bat is touching the left border, the bat won't move
            break;
        }
        model.moveBat( -1);
      
        break;
        
      case -KeyEvent.VK_RIGHT:       // Right arrow
        if(bat.getX()>=445){// If the right of the bat is touching the right border, the bat won't move
            break;
        }
        model.moveBat( +1 );
        break;
        
      case 'f' :
        // Very fast ball movement now
        model.setFast( true );
        break;
        
      case 'n' :
        // Normal speed
        model.setFast( false );
        break;
        
      default :
        Debug.trace( "Ch typed = %3d [%c]", keyCode, (char) keyCode );
    }
  }

 
}
