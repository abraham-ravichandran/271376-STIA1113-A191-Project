# Group info

Name:PONNRAJ A/L MANCHINI Matric No :264699

Name:ABRAHAM A/L RAVICHANDRAN MATIC NO: 271376

Name:Ahmad ikmah bin sujali MATRIC NO: 264491

# INTRODUCTION
This assignment was completed by 3 member of the group. from this assingment we learn how to use method, array, repetition and many more.
from this assignment we learn how to use method and call method class. 

#PSEUDOCODE

                Pseudocode for main Method

                  Start
                  Call method choice()
                  End

                Pseudocode for main.choice Method

                Start

                Declare classes for GroupProjectA, GroupProjectAB, GroupProjectABC, GroupProjectABCD and assingmentgroup

                Declare variables for choice 

                  Display “Main Menu”

                    Call line()

                    Display “1.	Next-Day Delivery”

                    Display “2.	Same-Day Delivery”

                    Display “3.	Prepaid Box and Envelope”

                    Display “4.	Pos Express”

                    Display “5.	Receipt”

                    Display “6.	Exit”

                    Input choice

                    IF choice is more than six THEN

                      Display “Invalid Input!!! Please key in correct data!!!”

                    Input choice

                      IF choice is less than or equal to six THEN

                      break

                      END IF

                      IF choice is equal to one THEN

                      groupprojectA.choice()

                      IF choice is equal to two THEN

                      groupprojectAB.choice()

                      IF choice is equal to three THEN

                      groupprojectABC.choice()
                    IF
                    choice is equal to four THEN

                    Call groupprojectABCD.choice()

                    IF choice is equal to five THEN

                    Call groupprojectABCDE.receipt()

                    IF choice is equal to six THEN

                    Display “Thank You for Using Our System”

                    END IF

                    End


                Pseudocode for GroupProjectA.choice Method


                  Start

                    Declare class for mainmenu

                    Declare variable for choice

                    Display “Menu”

                      Display “1. Input your data”

                      Display “2. Return to Main Menu”

                    Input choice

                    IF choice is more than two THEN

                      Display “Invalid Input!!! Please key in correct data!!!”

                        Input choice

                    IF choice is less than or equal to two THEN

                      break

                    END IF

                  IF choice is equal to one THEN

                    Call Table()

                    Call Loop()

                  IF choice is more than two THEN

                  Display “Invalid Input!!! Please key in correct data”

                  Input choice

                  IF choice is less than or equal to two THEN

                  break

                  END IF

                  IF choice is equal to two THEN

                  Call main.choice

                  END


                Pseudocode for GroupProjectA.Loop method


                  Start

                  Declare variable for zone, customer, packagetype, weight, charge1 and totalcharge1[3].

                    Initialize customer equal to zero

                    WHILE customer less than totalcharge1[3].

                    Display customer

                    Input first packagetype

                      Convert packagetype to uppercase

                    WHILE packagetype not equal to “X”

                    Input weight

                    Input zone

                    WHILE zone more than five THEN

                    Display “Invalid Input!!! Please key in correct data”

                    Input zone

                    WHILE zone less than or equal to five 

                  THEN

                  break

                    Call calCharge method

                    Display packagetype and charge1

                    totalcharge1[customer]=totalcharge1[customer]+charge1

                    Input next packagetype

                    Convert packagetype to uppercase

                    Display totalcharge1[customer]

                    customer=customer+1

                    End


                Pseudocode for GroupProjectA.calCharge method

                  Start

                  Declare variable for charge1.

                  IF zone is equal to one THEN

                  IF weight is less than two or equal to two thousand THEN

                  IF weight is less than or equal to two thousand THEN

                  charge1=4.90+(weight-500)/250*0.80

                  IF weight is less than or equal to five hundred THEN

                  charge1=4.90

                  IF weight is more than two thousand THEN

                  IF weight is less than or equal to two thousand five hundred 

                  charge1=10.50

                  IF weight is more than two thousand five hundred 

                  charge1=10.50+(weight-2500)/500*0.50

                  IF zone is equal to two THEN

                  IF weight is less than or equal to two thousand THEN

                  IF weight is less than or equal to two thousand THEN

                  charge1=5.40+(weight-500)/250*1.00

                  IF weight is less than or equal to five hundred THEN

                  charge1=5.40

                  IF weight is more than two thousand THEN

                  IF weight is less than or equal to two thousand five hundred 

                  charge1=16.00

                  IF weight is more than two thousand five hundred 

                  charge1=16.00+(weight-2500)/500*2.00


                  IF zone is equal to three THEN

                  IF weight is less than or equal to two thousand THEN

                  IF weight is less than or equal to two thousand THEN

                  charge1=6.90+(weight-500)/250*1.50

                  IF weight is less than or equal to five hundred THEN

                  charge1=6.90

                  IF weight is more than two thousand THEN

                  IF weight is less than or equal to two thousand five hundred THEN

                  charge1=21.00

                  IF weight is more than two thousand five hundred THEN

                  charge1=21.00+(weight-2500)/500*3.00


                IF zone is equal to four THEN

                IF weight is less than or equal to two thousand THEN

                IF weight is less than or equal to two thousand THEN

                charge1=7.40+(weight-500)/250*1.50

                IF weight is less than or equal to five hundred THEN

                charge1=7.40

                IF weight is more than two thousand THEN

                IF weight is less than or equal to two thousand five hundred THEN

                charge1=26.00

                IF weight is more than two thousand five hundred THEN

                charge1=26.00+(weight-2500)/500*3.50

                IF zone is equal to five THEN

                IF weight is less than or equal to two thousand THEN

                IF weight is less than or equal to two thousand THEN

                charge1=7.90+(weight-500)/250*2.00

                IF weight is less than or equal to five hundred THEN

                charge1=7.90

                IF weight is more than two thousand THEN

                IF weight is less than or equal to two thousand five hundred 

                charge1=31.00

                IF weight is more than two thousand five hundred 

                charge1=31.00+(weight-2500)/500*4.00

                END IF

                Return charge1

                End


                Pseudocode for GroupProjectAB.choice Method


                Start

                Declare class for mainmenu

                Declare variable for choice

                Display “Menu”

                Display “1. Input your data”

                Display “2. Return to Main Menu”

                Input choice

                IF choice is more than two THEN

                Display “Invalid Input!!! Please key in correct data!!!”

                Input choice

                IF choice is less than or equal to two THEN

                break

                END IF

                IF choice is equal to one THEN

                Call Table()

                Call Loop()

                IF choice is more than two THEN

                Display “Invalid Input!!! Please key in correct data!!!”

                Input choice

                IF choice is less than or equal to two THEN

                break

                END IF

                IF choice is equal to two THEN

                Call main.choice

                END


                Pseudocode for GroupProjectAB.Loop 


                Start

                Declare variable for towntype, customer, weight, payment and totalcharge2[3].

                Initialize customer equal to zero

                WHILE customer less than totalcharge2[3].

                Display customer

                Input first towntype

                Convert towntype to uppercase

                WHILE towntype not equal to “X”

                Input weight

                WHILE weight more than one thousand THE

                Display “Invalid Input!!! Please key in correct data!!!”

                Input weight

                WHILE weight less than or equal to one thousand THEN

                break

                Call calPayment

                Display payment

                totalcharge2[customer]=totalcharge2[customer]+payment

                Input next towntype

                Convert towntype to uppercase

                Display totalcharge2[customer]

                customer=customer+1

                End		

                Pseudocode for groupassignment2.calPayment 

                Start

                Declare variable for payment, surcharge and domestic_charge.

                IF towntype is equal to “LOCAL” THEN

                IF weight is less than or equal to five hundred THEN

                domestic_charge=4.90

                surcharge=6.00

                IF weight is more than five hundred and weight is less than or equal to seven hundred fifty THEN

                domestic_charge=5.70

                surcharge=6.00

                IF weight is more than seven hundred fifty and weight is less than or equal to one thousand THEN

                domestic_charge=6.50
                surcharge=6.00

                IF towntype is equal to “CROSS” THEN

                IF weight is less than or equal to five hundred THEN

                domestic_charge=5.40

                surcharge=7.50

                IF weight is more than five hundred and weight is less than or equal to seven hundred fifty THEN

                domestic_charge=6.40

                surcharge=7.50

                IF weight is more than seven hundred fifty and weight is less than or equal to one thousand THEN

                domestic_charge=7.40

                surcharge=7.50

                END IF

                payment= domestic_charge+ surcharge

                Return payment

                End


                Pseudocode for GroupProjectABC.choice method


                Start

                Declare class for mainmenu

                Declare variable for choice

                Display “Menu”

                Display “1. Input your data”

                Display “2. Return to Main Menu”

                Input choice

                IF choice is more than two THEN

                Display “Invalid Input!!! Please key in correct data!!!”

                Input choice

                IF choice is less than or equal to two THEN

                break

                END IF

                IF choice is equal to one THEN

                Call Table()

                Call Loop()

                IF choice is more than two THEN

                Display “Invalid Input!!! Please key in correct data!!!”


                Input choice

                IF choice is less than or equal to two THEN

                break

                END IF

                IF choice is equal to two THEN

                Call main.choice

                END


                Pseudocode for GroupProjectABC.Loop 

                Start

                Declare variable for ItemType, customer, weight, quantity, totalprice and totalcharge3[3].

                Initialize customer equal to zero

                WHILE customer less than totalcharge3[3].

                Display customer

                Input first ItemType

                Convert ItemType to uppercase

                WHILE ItemType not equal to “X”

                Input quantity

                Input weight

                WHILE weight more than ten thousand THEN

                Display “Invalid Input!!! Please key in correct data!!!”

                Input weight

                WHILE weight less than or equal to ten thousand THEN

                Break

                Call calTotalPrice

                Display totalprice

                totalcharge3[customer]=totalcharge3[customer]+totalprice

                Input next ItemType

                Convert ItemType to uppercase

                Display totalcharge3[customer]

                customer=customer+1

                End

                Pseudocode for GroupProjectABC.calTotalPrice 


                Start

                Declare variables for price and totalprice

                IF weight less than or equal to five hundred THEN

                price = 7.31

                IF weight more than five hundred and less than or equal to one thousand THEN

                price = 10.49

                IF weight more than one thousand and less than or equal to two thousand THEN

                price = 13.78

                IF weight more than two thousand and less than or equal to five thousand THEN

                price = 21.20

                IF weight more than five thousand and less than or equal to ten thousand THEN

                price = 31.80

                END IF

                totalprice=price*quantity

                Return totalprice

                End


                 Pseudocode for GroupProjectABCD.choice method

                Start

                Declare class for mainmenu

                Declare variable for choice

                Display “Menu”

                Display “1. Input your data”

                Display “2. Return to Main Menu”



                Input choice

                IF choice is more than two THEN

                Display “Invalid Input!!! Please key in correct data!!!”

                Input choice

                IF choice is less than or equal to two THEN

                Break

                END IF

                IF choice is equal to one THEN

                Call Table()

                Call Loop()

                IF choice is more than two THEN

                Display “Invalid Input!!! Please key in correct data!!!”

                Input choice

                IF choice is less than or equal to two THEN

                break

                END IF

                IF choice is equal to two THEN

                Call main.choice

                END


                Pseudocode for GroupProjectABCD.Loop 


                Start

                Declare variables for quantity, customer, ItemType, weight, totalprice and totalcharge4[3]

                Initialize customer equal to zero

                WHILE customer less than totalcharge4[3].

                Display customer

                Input first ItemType


                Convert ItemType to uppercase

                WHILE ItemType not equal to “X”

                Input quantity

                Input weight

                WHILE weight more than one thousand THEN

                Display “Invalid Input!!! Please key in correct data!!!”

                Input weight

                WHILE weight less than or equal to one thousand THEN

                Break

                Call calTotalPrice

                Display totalprice

                totalcharge4[customer]=totalcharge4[customer]+totalprice

                Input next ItemType

                Convert ItemType to uppercase

                Display totalcharge4[customer]

                customer=customer+1

                End


                Pseudocode for GroupProjectABCD.calTotalPrice method


                Start

                Declare variables for price and totalprice

                IF weight less than or equal to one hundred THEN

                price = 3.18

                IF weight more than one hundred and less than or equal to two hundred fifty THEN

                price = 3.71

                IF weight more than two hundred fifty and less than or equal to five hundred THEN

                price = 4.77

                IF weight more than five hundred and less than or equal to one thousand THEN

                price = 7.42

                END IF

                totalprice=price*quantity

                Return totalprice

                End


                Pseudocode for GroupProjectABCDE.receipt 


                Start 

                Declare variable for totalcharge1[3], totalcharge2[3], totalcharge3[3] and totalcharge4[3], customer, choice and grandtotal

                Display “Menu”

                Display “1. Display Receipt”

                Display “2. Return to Main Menu”

                Input choice

                IF choice is more than two THEN

                Display “invalid Input!!! Please key in correct data!!!”

                Input choice

                IF choice is less than or equal to two THEN

                Break

                END IF

                IF choice is equal to one THEN

                customer equal to zero

                WHILE customer less than totalcharge1[3]

                Display customer

                grandtotal= totalcharge1[3] + totalcharge2[3] + totalcharge3[3] + totalcharge4[3]

                Display “Total Charge”

                Display totalcharge1[customer]

                Display totalcharge2[customer]

                Display totalcharge3[customer]

                Display totalcharge4[customer]

                Display grandtotal

                Input choice

                IF choice is more than two THEN

                Display “Invalid Input!!! Please key in correct data!!!”

                Input choice

                IF choice is less than or equal to two THEN

                break

                END IF

                IF choice is equal to two

                Call main.choice

                End

#FLOWCHART

main flowchart

![main main](https://user-images.githubusercontent.com/55254441/71199418-e47a8c80-22d0-11ea-94f1-e780d45ea57a.PNG)

flowchart choice

![FLOWCHART AFTER GROUP A](https://user-images.githubusercontent.com/55254441/71199654-636fc500-22d1-11ea-9ca7-125bee6ac5a2.PNG)


![FLOWCHART AFTER GROUP A](https://user-images.githubusercontent.com/55254441/71199654-636fc500-22d1-11ea-9ca7-125bee6ac5a2.PNG)

flowchart table 


![table flowchart](https://user-images.githubusercontent.com/55254441/71199656-64085b80-22d1-11ea-9d4b-9809b577a9b2.PNG)


flowchart loop groupproject A


![flowchart for loop 1](https://user-images.githubusercontent.com/55254441/71199655-64085b80-22d1-11ea-8f6e-5ac4e3005855.PNG)


flowchart calCharge

![calCharge flowchart](https://user-images.githubusercontent.com/55254441/71199658-64085b80-22d1-11ea-8700-452598fe6de8.PNG)

flowchart for choice groupprojectAB

![group ab](https://user-images.githubusercontent.com/55254441/71199959-09233400-22d2-11ea-8c71-dbcb9e632d3b.PNG)


![flowchart 2 ab](https://user-images.githubusercontent.com/55254441/71199960-09233400-22d2-11ea-8940-e3bbaab88ecd.PNG)

flowchart table groupprojectAB

![table ab](https://user-images.githubusercontent.com/55254441/71199962-0a546100-22d2-11ea-9562-bbf14ddee771.PNG)

flowchart LOOP groupprojectAB


![loop for ab](https://user-images.githubusercontent.com/55254441/71199963-0a546100-22d2-11ea-8062-2f307cf075db.PNG)


flowchart CAL groupprojectAB


![cal payment group ab](https://user-images.githubusercontent.com/55254441/71199964-0a546100-22d2-11ea-807b-1f748e06fd1b.PNG)

flowchart CHOICE groupprojectABC

![group abc choice](https://user-images.githubusercontent.com/55254441/71200239-a7af9500-22d2-11ea-9cda-25e7a7e78817.PNG)


![loop table group abc](https://user-images.githubusercontent.com/55254441/71200241-a8482b80-22d2-11ea-9adf-b91b2c07940d.PNG)

FLOWCHART TABLE



![table abc](https://user-images.githubusercontent.com/55254441/71200242-a8482b80-22d2-11ea-982b-62e71342c533.PNG)

FLOWCHART LOOP

![group abc loop](https://user-images.githubusercontent.com/55254441/71200247-a8482b80-22d2-11ea-8b83-59761ef75cbd.PNG)

FLOWCHART CALgroupprojectABC

![cal total price group abc](https://user-images.githubusercontent.com/55254441/71200249-a8e0c200-22d2-11ea-91d0-e04d31428873.PNG)


FLOWCHART FOR CHOICE groupprojectABCD

![choice for abcd](https://user-images.githubusercontent.com/55254441/71200437-02e18780-22d3-11ea-89d1-e3b3a181df50.PNG)


![TABLE LOOP FOR ABCD](https://user-images.githubusercontent.com/55254441/71200438-02e18780-22d3-11ea-911f-fecb74b24904.PNG)

flowchart for table 

![table for abcd](https://user-images.githubusercontent.com/55254441/71200439-037a1e00-22d3-11ea-88ef-379c79e24dc8.PNG)

flowchart for loop groupABCD

![loop for abcd](https://user-images.githubusercontent.com/55254441/71200441-037a1e00-22d3-11ea-9a69-4b759008b0c1.PNG)

FLOWCHART for cal groupABCD

![cal total price abcd](https://user-images.githubusercontent.com/55254441/71200442-037a1e00-22d3-11ea-823a-0e73325054fd.PNG)

FLOWCHART FOR RECEIPT groupprojectABCDE


![receipt abcde](https://user-images.githubusercontent.com/55254441/71200602-4cca6d80-22d3-11ea-8881-e6f75df65b8f.PNG)


![ABCDE A](https://user-images.githubusercontent.com/55254441/71200617-55bb3f00-22d3-11ea-87ae-f47261fc8681.PNG)









![Screenshot (2)](https://user-images.githubusercontent.com/55254441/71200680-7aafb200-22d3-11ea-93cb-caaff6d6bbb5.png)


![Screenshot (3)](https://user-images.githubusercontent.com/55254441/71200681-7b484880-22d3-11ea-94c6-aa55860aa1ad.png)


![Screenshot (6)](https://user-images.githubusercontent.com/55254441/71200684-7b484880-22d3-11ea-9518-5b4e6aa1fd16.png)


![Screenshot (7)](https://user-images.githubusercontent.com/55254441/71200685-7b484880-22d3-11ea-84d4-1f821dfce1ae.png)


![Screenshot (8)](https://user-images.githubusercontent.com/55254441/71200686-7be0df00-22d3-11ea-8ee9-f466aaa0d560.png)



![Screenshot (9)](https://user-images.githubusercontent.com/55254441/71200688-7be0df00-22d3-11ea-87a1-942190681427.png)



![Screenshot (10)](https://user-images.githubusercontent.com/55254441/71200689-7c797580-22d3-11ea-807b-73acaf39cd7a.png)



![Screenshot (11)](https://user-images.githubusercontent.com/55254441/71200690-7c797580-22d3-11ea-84a3-bc84021a5c76.png)


![Screenshot (12)](https://user-images.githubusercontent.com/55254441/71200679-7aafb200-22d3-11ea-8d80-a971778314c9.png)





