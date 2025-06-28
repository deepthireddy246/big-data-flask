package test;

import static org.junit.Assert.*;
import org.junit.Test;
import nine_mens_morris_game.player_model.GamePieces_Creation;
import nine_mens_morris_game.player_model.user_category.HumanPlayer;

public class GamePieces_CreationTest {

    @Test
    public void testSelect() {
        // Create a HumanPlayer for testing
        HumanPlayer player = new HumanPlayer("Player1", "Red");

        // Create a GamePieces_Creation object with a color and owner
        GamePieces_Creation piece = new GamePieces_Creation(player.getColor(), player);

        // Test the initial selected state
        assertFalse(piece.getSelected());

        // Select the piece
        piece.select(true);

        // Test if the piece is selected
        assertTrue(piece.getSelected());

        // Deselect the piece
        piece.select(false);

        // Test if the piece is deselected
        assertFalse(piece.getSelected());
    }

    @Test
    public void testIsAlive() {
        // Create a HumanPlayer for testing
        HumanPlayer player = new HumanPlayer("Player1", "Red");

        // Create a GamePieces_Creation object with a color and owner
        GamePieces_Creation piece = new GamePieces_Creation(player.getColor(), player);

        // Test if the piece is initially alive
        assertTrue(piece.IsAlive());

        // Set the status to DEAD
        piece.setStatus(GamePieces_Creation.DEAD);

        // Test if the piece is no longer alive
        assertFalse(piece.IsAlive());
    }

    @Test
    public void testInPlay() {
        // Create a HumanPlayer for testing
        HumanPlayer player = new HumanPlayer("Player1", "Red");

        // Create a GamePieces_Creation object with a color and owner
        GamePieces_Creation piece = new GamePieces_Creation(player.getColor(), player);

        // Test if the piece is initially in play
        assertEquals(false, piece.inPlay());

        // Set the status to UNPLACED
        piece.setStatus(GamePieces_Creation.UNPLACED);

        // Test if the piece is no longer in play
        assertFalse(piece.inPlay());
    }

    // Add more test methods for other functionality in GamePieces_Creation
}
