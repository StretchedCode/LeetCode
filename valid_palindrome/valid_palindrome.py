from copy import deepcopy

class Stack:

    def __init__(self) -> None:
        self._values = []
    
    def push(value):

        self._values.push(deepcopy(value))

        return
    
    def pop():

        value = self._values.pop()

        return value

    def peek():

        value = deepcopy(self._values(len(self._values) - 1))

        return value

    def __iter__(self):

        for value in self._values:
            yield value
        
        return