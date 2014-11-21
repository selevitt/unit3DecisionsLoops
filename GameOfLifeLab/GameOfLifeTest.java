
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
         *  0 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  1 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  2 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  3 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  4 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  5 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  -  
         *  6 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  7 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  8 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  9 - - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  10- - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  11- - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  12- - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  13- - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  14- - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  15- - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  16- - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  17- - X X - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  18- - - X X - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  19- - X - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         *  20- - - - - - - - - - -  -  -  -  -  -  -  -  -  -  - 
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = 21;
        final int COLS = 21;

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 17 && col == 2) ||
                        (row == 17 && col == 3) ||
                        (row == 18 && col == 3) ||
                        (row == 18 && col == 4) ||
                        (row == 19 && col == 2)) 
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 10 generations         *  
         *
         *    0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20 
         *  0 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  1 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  2 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  3 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  4 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  5 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   -  
         *  6 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  7 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  8 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  9 -  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  10-  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  11-  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  12-  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  13-  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  14-  -  -  -  -  X  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  15-  -  -  -  -  X  X  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  16-  -  -  -  X  -  X  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  17-  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  18-  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  19-  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         *  20-  -  -  -  -  -  -  -  -  -  -   -   -   -   -   -   -   -   -   -   - 
         */
        // ...
        
        GameOfLife game = new GameOfLife();
        final int ROWS = 21;
        final int COLS = 21;
        
        for( int i = 0; i< 10; i++)
        {   
            game.createNextGeneration();
        }
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 14 && col == 5) ||
                        (row == 15 && col == 5) ||
                        (row == 16 && col == 4) ||
                        (row == 15 && col == 6) ||
                        (row == 16 && col == 6)) 
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
}

