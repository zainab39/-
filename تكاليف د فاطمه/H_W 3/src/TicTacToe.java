//The TicTacToe class of Code Fragments 3.9 and 3.10 has a flaw, in that it allows a player to place a mark even after the game has already been won by someone. Modify the class
//so that the putMark method throws an IllegalStateException in that case
public class TicTacToe {
        private char[][] board;
        private char currentPlayerMark;
        private boolean gameWon;

        public TicTacToe() {
            board = new char[3][3];
            currentPlayerMark = 'X';
            gameWon = false;
            initializeBoard();
        }

        private void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
        }

        public void putMark(int row, int col) {
            if (gameWon) {
                throw new IllegalStateException("The game has already been won.");
            }

            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                throw new IllegalArgumentException("Invalid row or column index.");
            }

            if (board[row][col] != '-') {
                throw new IllegalArgumentException("The specified cell is already marked.");
            }

            board[row][col] = currentPlayerMark;

            if (checkWin(row, col)) {
                gameWon = true;
                System.out.println("Player " + currentPlayerMark + " wins!");
            } else if (checkBoardFull()) {
                gameWon = true;
                System.out.println("The game is a tie!");
            } else {
                currentPlayerMark = (currentPlayerMark == 'X') ? 'O' : 'X';
            }
        }

        private boolean checkWin(int row, int col) {
            // Check row
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }

            // Check column
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }

            // Check diagonal
            if (row == col && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                return true;
            }

            // Check anti-diagonal
            if (row + col == 2 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return true;
            }

            return false;
        }

        private boolean checkBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }
    }

