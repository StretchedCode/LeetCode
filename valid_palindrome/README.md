<h1>Solution for valid Palindrome, in Python</h1>

This has been one question that I've been trying to solve since Summer of 2022. After learning about the Stack data structure, and more importantly the FIFO property, I was able to create a solution that would satisfy all the test cases for this problem.

There are 3 key components to solving this solution:

1. Stripping the string of all non-alphanumeric characters, and converting to lowercase.

2. Appending string contents to array with <bold>FIFO</bold> properties.

3. Popping contents out of array and comparing with string, returning True or False depending on equivalency.

With this solution I was able to average a runtime of about ~60ms and 15 mb of memory usage, a vast improvement from my first implementation which had a runtime of 700 ms and 34 mb memory usage.