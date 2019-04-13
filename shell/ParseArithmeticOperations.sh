#We provide you with expressions containing +,-,*,^, / and parenthesis. None of the numbers in the expression involved will exceed . 
#Your task is to evaluate the expression and display the correct output rounding upto  decimal places.

#Sample Input 1
#5+50*3/20 + (19*2)/7


read expression
printf %.3f `echo $expression | bc -l`
