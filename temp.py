import pandas as pd
import requests as rq
import mysql.connector


def main():
    mydb = mysql.connector.connect(
        host="localhost",  # port erbij indien mac
        user="root",
        password="",
        database="Temp",
    )
    datum = pd.Index([1701579120000], dtype="int64")
    print(datum[0])

    mycursor = mydb.cursor()

    mycursor.execute("SELECT * FROM Fiets")

    myresult = mycursor.fetchall()

    for x in myresult:
        print(x[2])
        
    inp  = input(":")
    sql_str = "INSERT INTO Fiets (merk, versnellingen)"


if __name__ == "__main__":
    main()
