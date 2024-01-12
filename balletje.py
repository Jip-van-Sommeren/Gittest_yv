print("Welkom bij raad het balletje")

from random import shuffle

def shuffle_list(mylist):
    shuffle(mylist)
    return mylist


mylist = [' ', 'O', ' ']
shuffle_list(mylist)
print(mylist)

def player_guess():

    guess=''

    while guess not in ['0', '1', '2']:
        guess = input("Pick a number: 0, 1, or 2")
    if guess == "0":
        print("Balletje gevonden")
    else:
        print("Balletje niet gevonden")

    return mylist[int(guess)]

print(player_guess())

    

