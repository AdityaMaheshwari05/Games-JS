let playScore = [0, 0];
let currScore = 0;
let activePlayer = 0;
let gameActive = true;

const diceImgs = [
  "src/img/dice1.png",
  "src/img/dice2.png",
  "src/img/dice3.png",
  "src/img/dice4.png",
  "src/img/dice5.png",
  "src/img/dice6.png",
];

function rollTheDice() {
  if (!gameActive) return;

  let randomNumber = Math.floor(Math.random() * 6);
  //   console.log("Rolled:", randomNumber + 1);

  document.getElementById("dice-img").src = diceImgs[randomNumber];

  if (randomNumber === 0) {
    currScore = 0;
    switchPlayer();
  } else {
    currScore += randomNumber + 1;
    updateCurrentScore();
  }
}

function switchPlayer() {
  currScore = 0;
  activePlayer = activePlayer === 0 ? 1 : 0;
  updateCurrentScore();
}

function updateCurrentScore() {
  document.getElementById("p1current").innerText =
    activePlayer === 0 ? currScore : 0;
  document.getElementById("p2current").innerText =
    activePlayer === 1 ? currScore : 0;
}

function saveTheScore() {
  if (!gameActive) return;

  playScore[activePlayer] += currScore;
  updateSavedScore();

  if (playScore[activePlayer] >= 100) {
    document.getElementById("winner").innerText =
      document.getElementById(`player${activePlayer + 1}-name`).value +
      " Wins!";
    gameActive = false;
  } else {
    currScore = 0;
    switchPlayer();
  }
}

function updateSavedScore() {
  document.getElementById("p1score").innerText = playScore[0];
  document.getElementById("p2score").innerText = playScore[1];
}

function resetTheGame() {
  playScore = [0, 0];
  currScore = 0;
  activePlayer = 0;
  gameActive = true;
  document.getElementById("winner").innerText = "";

  updateSavedScore();
  updateCurrentScore();
  document.getElementById("dice-img").src = "src/img/dice1.png";
}
