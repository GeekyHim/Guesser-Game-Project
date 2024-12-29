<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Number Guesser Game Review</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      line-height: 1.6;
      background-color: #f4f4f4;
      margin: 0;
      padding: 0;
    }
    .container {
      max-width: 800px;
      margin: 20px auto;
      background: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }
    h1 {
      color: #333;
      text-align: center;
      margin-bottom: 20px;
    }
    h2 {
      color: #555;
      margin-top: 20px;
      margin-bottom: 10px;
    }
    p, ul {
      color: #666;
    }
    ul {
      list-style-type: disc;
      margin: 10px 0 10px 20px;
    }
    strong {
      color: #000;
    }
    code {
      background: #eee;
      padding: 2px 4px;
      border-radius: 4px;
      font-family: "Courier New", Courier, monospace;
      color: #d6336c;
    }
  </style>
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
