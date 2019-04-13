#!/bin/bash
read number

declare -i sum

for i in $(seq 1 $number)
do
    read addend
    sum=sum+$addend
done 

average=$sum/$number
printf %.3f `echo $average | bc -l`
