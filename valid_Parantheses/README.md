#Valid Parantheses in Python

This is the first question where I used a data structure: the stack!

There are three main components to this solution. We need to:

1. Make sure that when a bracket is "opened" with a left variation of any bracket e.g. (, [, {, that we store its instance in the stack.

2. Once we find a "closing" bracket, access the most recent opening bracket and see if they are of the same set. If not, return False!

3. Since the stack stores all instances of opening brackets, it must be EMPTY once the entire string is traversed through. This means that all pairs of brackets
have been found and matched correctly - returning True.