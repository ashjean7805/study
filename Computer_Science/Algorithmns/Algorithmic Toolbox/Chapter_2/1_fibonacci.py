def fibonacci_number(n):
    damn = []
    for i in range(n+1):
        if i <= 1:
            damn.append(i)
        else:
            damn.append(damn[i-1]+damn[i-2])
    return damn.pop()

if __name__ == '__main__':
    print(fibonacci_number(int(input())))

