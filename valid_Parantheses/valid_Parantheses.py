from copy import deepcopy


class Stack:

    def __init__(self) -> None:
        self._values = []

    def __iter__(self):
        for x in self._values[::-1]:
            yield x

    def is_empty(self):
        empty = False

        if len(self._values) == 0:
            empty = True

        return empty
    def push(self, source):

        self._values.append(source)

    def pop(self):

        value = self._values[len(self._values) - 1]

        self._values.pop()
        return value

    def peek(self):

        value = deepcopy(self._values[len(self._values) - 1])
        return value

class Solution:
    def isValid(self, s: str) -> bool:
        leftBrackets = ["(", "{", "["]
        rightBrackets = [")", "}", "]"]
        bracketStack = Stack()
        valid = True
        for char in s:

            if char in leftBrackets:
                bracketStack.push(char)
            
            elif char in rightBrackets:

                if bracketStack.is_empty() == True:
                    valid = False
                    break

                leftPop = bracketStack.pop()

                leftIndex = leftBrackets.index(leftPop)
                rightIndex = rightBrackets.index(char)

                if leftIndex != rightIndex:
                    valid = False

        if bracketStack.is_empty() == False:
            valid = False

        return valid