def maxProfit(prices):
    buy, profit  = prices[0],0
    for sell in prices:
        if profit < sell - buy:
            profit = sell - buy

        if buy > sell:
            buy = sell

    return profit


prices = [10,1,5,6,7,1]
print(maxProfit(prices))