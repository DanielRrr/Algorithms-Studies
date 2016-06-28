cache = {}
def fib2(n):
    assert n >= 0
	in n not in cache:
    	cache[n] = n if n <= 1 else fib(n - 1) + fib2(n - 2)
	return cache[n]
