
class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        nonalphanum = '''"!@#$%^&*()_+=-[}{]'?/.,>;:<|`~ '''
        palinString = ''
        compString = ''
        palinStack = []

        s = s.lower()

        for c in s:
            if c not in nonalphanum:
                palinStack.append(c)
                compString += c
        
        while len(palinStack) != 0:
            palinString += palinStack.pop()

        if palinString == compString:
            return True
        else:
            return False