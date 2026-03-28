player1 = input("Player 1 input a character, this must be: P, H, F\n").upper()
player2 = input("Player 2 input a character, this must be: P, H, F\n").upper()

valid = {'P', 'H', 'F'}

if player1 not in valid:
    print("Invalid Character at Player 1")
elif player2 not in valid:
    print("Invalid Character at Player 2")
elif player1 == player2:
    print("Draw!")
elif (player1 == 'P' and player2 == 'H') or \
     (player1 == 'F' and player2 == 'P') or \
     (player1 == 'H' and player2 == 'F'):
    messages = {
        ('P', 'H'): "Player 1 won! Paper covers rock",
        ('F', 'P'): "Player 1 won! Scissors cut paper",
        ('H', 'F'): "Player 1 won! Rock beats scissors",
    }
    print(messages[(player1, player2)])
else:
    messages = {
        ('P', 'F'): "Player 2 won! Scissors cut paper",
        ('F', 'H'): "Player 2 won! Rock beats scissors",
        ('H', 'P'): "Player 2 won! Paper covers rock",
    }
    print(messages[(player1, player2)])
