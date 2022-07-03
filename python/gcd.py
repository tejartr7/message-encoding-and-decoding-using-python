a=int(input("enter first number"))
b=int(input("enter second numeber"))
if a>b:
    m=b
else:
    m=a
    for i in range(1,m+1):
if (a%i)==0 and (b%i)==0 :
        hcf=i
        print("the gcf is {hcf}")