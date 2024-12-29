<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
  <div class="container">
    <h1>Number Guesser Game</h1>
    <section>
      <h2>Project Review</h2>
      <p>The <strong>Number Guesser Game</strong> is a simple, console-based Java application where a "Guesser" picks a number, and three "Players" attempt to guess it. The game determines the winner(s) based on matching guesses and provides an interactive experience through user input.</p>
    </section>
    <section>
      <h2>What the Code Does</h2>
      <ul>
        <li><strong>Modular Design:</strong> The project is divided into separate classes for better organization and maintainability:
          <ul>
            <li><strong>Guesser:</strong> Handles the input from the guesser.</li>
            <li><strong>Player:</strong> Takes guesses from individual players.</li>
            <li><strong>Umpire:</strong> Manages the game flow by collecting inputs and comparing guesses to determine winners.</li>
            <li><strong>Main:</strong> Controls the game setup and execution.</li>
          </ul>
        </li>
        <li><strong>User Interaction:</strong> The game uses <code>Scanner</code> for console-based input to create an interactive experience.</li>
        <li><strong>Logic:</strong> The Umpire class handles all comparison scenarios, ensuring accurate and fair results.</li>
      </ul>
    </section>
    <section>
      <h2>What I Learned</h2>
      <ul>
        <li>How to structure a program into separate, reusable classes based on their responsibilities.</li>
        <li>Designing and implementing conditional logic to handle multiple outcomes in a game.</li>
        <li>Using <code>Scanner</code> for user input and managing it effectively.</li>
        <li>Collaborative class behavior and encapsulation for cleaner code.</li>
      </ul>
    </section>
  </div>
</body>
</html>
