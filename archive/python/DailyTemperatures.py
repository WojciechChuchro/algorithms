def daily_temperatures(temps):
    stack = []
    res = [0] * len(temps)

    for i, a in enumerate(temps):
        while stack and stack[-1][1] < a:
            pop = stack.pop()[0]
            res[pop] = i - pop
        stack.append([i, a])

    return res



temps = [30, 38, 30, 36, 35, 40, 28]
print(daily_temperatures(temps))