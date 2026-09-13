class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        strs.sort()
        arr = []
        temp = []
        for i in range(len(strs) - 1):
            print(strs[i])
            temp.append(strs[i])
            if sorted(strs[i]) != sorted(strs[i+1]):
                arr.append(temp)
                temp = []
        #print(sorted(s))
        temp.append(strs[len(strs)-1])
        arr.append(temp)

        return arr  
        