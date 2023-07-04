a, b = int(input()), int(input())

while a:
    a, b = b % a, a

print(b)
