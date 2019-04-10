#!/bin/bash
read sideA
read sideB
read sideC

if (($sideA == $sideB)) && (($sideC == $sideB));then
    echo  "EQUILATERAL" 
elif (($sideA == $sideB)) || (($sideC == $sideB)) || (($sideC == $sideA));then
    echo "ISOSCELES"
else 
    echo "SCALENE"
fi