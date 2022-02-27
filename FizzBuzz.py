"""
Creating FizzBuzz program with Python
Print numbers of 1 to 100
Multiples of 3 will print "Fizz"
Multiples of 5 will print "Buzz"
Multiples of 3 and 5 will print "FizzBuzz"
"""

# Code started
for i in range(1,101):
  if i % 3 == 0 and i % 5 != 0:
    print('Fizz')
  elif i % 5 == 0 and i % 3 != 0:
    print('Buzz')
  elif i % 3 == 0 and i % 5 == 0:
    print('FizzBuzz')
  else :
    print(i)
