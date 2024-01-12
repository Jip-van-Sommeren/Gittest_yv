def evennumber(number):
    if number % 2 == 0:
        return "Dit is een even nummer."
    else:
        return "Dit is een oneven nummer."


number_input = input('Welke nummer wil je checken? ')

number = int(number_input)

print(evennumber(number))

