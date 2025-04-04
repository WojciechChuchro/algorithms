class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        map = {}

        for s in magazine:
            map[s] = map.get(s, 0) + 1

        for s in ransomNote:
            if s in map and map[s] > 0:
                map[s] = map[s] - 1
            else:
                return False

        return True
