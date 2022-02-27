# Print numbers from 0 to 100
# For multiples of 3, print "Fizz"
# For multiples of 5, print "Buzz"
# For multiples of 3 and 5, Print "FizzBuzz"

i <- 1

while(i <= 50) {
  
  if(i %% 3 == 0 & i %% 5 != 0) {
    print("Fizz")
  } else if(i %% 5 == 0 & i %% 3 != 0) {
    print("Buzz")
  } else if(i %% 3 == 0 & i %% 5 == 0) {  
    print("FizzBuzz")
  } else {
    print(i)
  }
  
  i <- i + 1
 
}