if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    myarr=list(dict.fromkeys(arr))
    print(myarr[-2])