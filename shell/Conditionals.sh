#!/bin/bash
read letter

if [ $letter == "Y" ] || [ $letter == "y" ];then
    echo  "YES" 
else 
    echo "NO"
fi