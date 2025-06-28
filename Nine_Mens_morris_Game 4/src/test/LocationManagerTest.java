package test;

import static org.junit.Assert.*;

import nine_mens_morris_game.player_model.user_category.HumanPlayer;
import org.junit.Test;
import nine_mens_morris_game.player_model.LocationManager;
import nine_mens_morris_game.player_model.GamePieces_Creation;

public class LocationManagerTest {

    @Test
    public void testContainsPiece() {
        HumanPlayer player = new HumanPlayer("Player1", "Red");
        // Create two LocationManager objects with labels
        LocationManager location1 = new LocationManager("A");
        LocationManager location2 = new LocationManager("B");

        // Create a GamePieces_Creation object
        GamePieces_Creation piece = new GamePieces_Creation(player.getColor(), player);

        // Add the piece to location1
        location1.setPiece(piece);

        // Test if location1 contains the piece
        assertTrue(location1.ContainsPiece(piece));

        // Test if location2 contains the piece (it shouldn't)
        assertFalse(location2.ContainsPiece(piece));
    }

    @Test
    public void testRemovePiece() {
        // Create a LocationManager object with a label
        LocationManager location = new LocationManager("A");
        HumanPlayer player = new HumanPlayer("Player1", "Red");
        // Create a GamePieces_Creation object
        GamePieces_Creation piece = new GamePieces_Creation(player.getColor(), player);
        // Add the piece to the location
        location.setPiece(piece);

        // Test if location contains the piece
        assertTrue(location.ContainsPiece(piece));

        // Remove the piece from the location
        location.RemovePiece();

        // Test if the location no longer contains the piece
        assertFalse(location.ContainsPiece(piece));
    }

    @Test
    public void testEqual() {
        // Create a LocationManager object with a label
        LocationManager location = new LocationManager("A");

        // Test if the label of the location is equal to 'A'
        assertTrue(location.equal('A'));

        // Test if the label of the location is equal to 'B' (it shouldn't be)
        assertFalse(location.equal('B'));
    }

    // Add more test methods for other functionality in LocationManager
}
