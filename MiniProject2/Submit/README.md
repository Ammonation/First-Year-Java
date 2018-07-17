# BreakOut

This is a take on the Atari Game BreakOut

For this piece of coursework a framework was provided by the university which needed completing in order to be successful.

There where for main sections that needed completing:
- model.createGameObjects
- model.moveBat
- collision detection
- view.drawActualPicture

## model.createGameObjects
It was required, as part of the coursework to create the bricks that would be part of the game. To achieve this I used a for loop with an array list. The array list would store new GameObjects (the bricks). I used variables to change the conditions that each brick would have (mainly the starting location). This also involved understanding the GameObj class.

I used a second array list that would store if the brick had been hit before or not.
## model.moveBat
It was required to ensure that the bat was not able to move off the screen. It was advised to make changes to the model.moveBat method. Instead I made changes to the controller class. I checked the position of the bat currently and if the next move would put the bat even partially off the screen I broke out of the switch statement.
## Collision detection
The collision detection I used I feel is the least impressive part of my work. Two if statements inside a for loop is used to check if any visible bricks have been hit. Two statements are used as the first one checks if the brick has been hit before and the other checks if it was has the first time the brick has been hit.
## view.draw
For this I used a for loop with an if statement that checked if a brick was visible. If so the brick was drawn. 
