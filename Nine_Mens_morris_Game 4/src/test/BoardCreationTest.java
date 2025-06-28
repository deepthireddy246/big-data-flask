package test;
import org.testng.annotations.Test;
import nine_mens_morris_game.player_model.user_category.AI_ComputerPlayer;
import nine_mens_morris_game.player_model.user_category.HumanPlayer;
import nine_mens_morris_game.player_model.BoardCreation;
import nine_mens_morris_game.view.MainUIWindow;
import static org.junit.Assert.assertEquals;

public class BoardCreationTest {

    @Test
    public void testGetCurrentPhase() {
        // Create required objects for testing
        MainUIWindow mw = new MainUIWindow();

        HumanPlayer player1 = new HumanPlayer("Player1", "red");
        AI_ComputerPlayer player2 = new AI_ComputerPlayer("computer", "blue");
        BoardCreation board = new BoardCreation(mw);


        // Replace with your specific test case
        int expectedPhase = BoardCreation.PLACEMENT_PHASE;
        int actualPhase = board.GetCurrentPhase(player1);
        assertEquals(expectedPhase, actualPhase);

        int actualPhase1 = board.GetCurrentPhase(player2);
        assertEquals(expectedPhase, actualPhase1);

    }

    // Add more test methods for other functionality in BoardCreation
}
