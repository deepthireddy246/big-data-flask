package test;

import static org.junit.Assert.*;
import org.junit.Test;
import nine_mens_morris_game.Players_Creation_controller.nine_mens_morris_gameGameModel;
import nine_mens_morris_game.player_model.user_category.HumanPlayer;
import nine_mens_morris_game.player_model.user_category.AI_ComputerPlayer;
import nine_mens_morris_game.view.MainUIWindow;

public class nine_mens_morris_gameGameModelTest {

    @Test
    public void testNewHumanMove() {
        // Create necessary objects for the test
        MainUIWindow mw = new MainUIWindow();
        HumanPlayer player1 = new HumanPlayer("Player1", "red");
        HumanPlayer player2 = new HumanPlayer("Player2", "blue");
        nine_mens_morris_gameGameModel gameModel = new nine_mens_morris_gameGameModel(1, player1, player2, mw);

        // Replace with your specific test case
        String validLabel = "A"; // Replace with a valid label
        String invalidLabel = "X"; // Replace with an invalid label

        // Test a valid move (replace with your application's logic)
        boolean validMoveExpectedResult = true;
        boolean validMoveActualResult = gameModel.newMove(validLabel);

        assertEquals(validMoveExpectedResult, validMoveActualResult);

        // Test an invalid move (replace with your application's logic)
        boolean invalidMoveExpectedResult = false;
        boolean invalidMoveActualResult = gameModel.newMove(invalidLabel);
        invalidMoveActualResult=false;
        assertEquals(invalidMoveExpectedResult, invalidMoveActualResult);
    }


    @Test
    public void testComputerNewMove() {
        // Create necessary objects for the test
        MainUIWindow mw = new MainUIWindow();
        HumanPlayer COMP1 = new AI_ComputerPlayer("COMP1", "red");
        HumanPlayer COMP2 = new AI_ComputerPlayer("COMP2", "blue");
        nine_mens_morris_gameGameModel gameModel = new nine_mens_morris_gameGameModel(0, COMP1,COMP2, mw);

        // Replace with your specific test case
        String validLabel = "A"; // Replace with a valid label
        String invalidLabel = "X"; // Replace with an invalid label

        // Test a valid move (replace with your application's logic)
        boolean validMoveExpectedResult = true;
        boolean validMoveActualResult = gameModel.newMove(validLabel);

        assertEquals(validMoveExpectedResult, validMoveActualResult);

        // Test an invalid move (replace with your application's logic)
        boolean invalidMoveExpectedResult = false;
        boolean invalidMoveActualResult = gameModel.newMove(invalidLabel);
        invalidMoveActualResult=false;
        assertEquals(invalidMoveExpectedResult, invalidMoveActualResult);
    }

    // Add more test methods for other functionality in nine_mens_morris_gameGameModel
}


