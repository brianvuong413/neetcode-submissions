class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)  != len(t):
            return False
        map1 = {}
        map2 = {}
        for i in range(len(s)):
            l1 = s[i]
            l2 = t[i]
            if l1 not in map1:
                map1[l1] = 0
            if l2 not in map2:
                map2[l2] = 0
            map1[l1] += 1
            map2[l2] += 1

        if map1 == map2:
            return True
        return False