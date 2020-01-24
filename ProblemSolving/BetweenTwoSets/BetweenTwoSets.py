#!/bin/python3

import os
import sys

#
# Complete the getTotalX function below.
#
def getTotalX(a, b):
    #
    # Write your code here.
    #
    count = 0
    for i in range(1, 101):
        atrue = True
        btrue = True
        for num1 in a:
            if i > num1 and i%num1 ==0:
                atrue = True
            elif i%num1 !=0:
                atrue = False
                break
        if atrue:
             for num2 in b:
                 if num2%i!=0:
                        btrue = False
             if btrue:
                 count+=1
    return count
if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    a = list(map(int, input().rstrip().split()))

    b = list(map(int, input().rstrip().split()))

    total = getTotalX(a, b)

    f.write(str(total) + '\n')

    f.close()
