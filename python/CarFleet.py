def car_fleet(target, position, speed):
    cars =[]
    stack = []
    for i in range(len(position)):
        cars.append([position[i], speed[i]])
    cars.sort(key=lambda x: x[0], reverse=True)

    for i in cars:
        stack.append((target-i[0])/i[1])
        if len(stack) >= 2 and stack[-1]<=stack[-2]:
            stack.pop()

    return len(stack)




# target, position, speed = 12, [10,8,0,5,3], [2,4,1,1,3]
# target=10
# position=[4,1,0,7]
# speed=[2,2,1,1]
target = 10
position =[6,8]
speed =[3,2]
print(car_fleet(target, position, speed))
