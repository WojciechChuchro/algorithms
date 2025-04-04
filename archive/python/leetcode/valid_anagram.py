class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        m = defaultdict(int)

        if len(s) != len(t):
            return False

        for l in s:
            m[l] += 1

        for l in t:
            if l in m and m[l] > 0:
                m[l]-=1 
            else:
                return False
        return True