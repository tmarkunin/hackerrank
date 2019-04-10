#!/bin/bash
read number1
read number2

if (($number1 > $number2));then
    echo  "X is greater than Y" 
elif (($number2 > $number1));then
    echo "X is less than Y"
else 
    echo "X is equal to Y"
fi