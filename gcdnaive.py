def gcd(a,b):
    assert a >= 0 and b >= 0
	for d in reversed(range(max(a,b) + 1)):
	    if d == 0 or a % d == b % d == 0:
		   return d
