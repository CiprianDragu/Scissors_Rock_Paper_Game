p1 = input("Player 1 input a character, this must be: P, H, F\n").upper()
p2 = input("Player 2 input a character, this must be: P, H, F\n").upper()

valid = {'P', 'H', 'F'}

if p1 not in valid:
    print("Invalid Character at player 1")
elif p2 not in valid:
    print("Invalid Character at player 2")
elif p1 == p2:
    print("Draw")
elif p1 == 'P':
    if p2 == 'F':
        print("Player 2 won! Scissors cut paper")
    else:
        print("Player 1 won! Paper covers rock")
elif p1 == 'F':
    if p2 == 'P':
        print("Player 1 won! Scissors cut paper")
    else:
        print("Player 2 won! Rock beats scissors")
elif p1 == 'H':
    if p2 == 'F':
        print("Player 1 won! Rock beats scissors")
    else:
        print("Player 2 won! Paper covers rock")
