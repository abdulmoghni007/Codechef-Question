for _ in range(int(input())):
    x=int(input())
    arr=list(map(int,input().split()))
    arr.sort()
    arr[0]=0
    print(sum(arr))
