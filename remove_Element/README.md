For this question, it is asked to remove all elements from an array, given its value.

Well, some constraints and questions need to be brought into consideration:

1. How are we able to iterate through an array while its indices are modified?

2. How do we directly modify the array, without allocating any extra memory?

We know that if we were to iterate through a loop normally, that popping any values 
out will result in the indices of any elements placed above that value shifted down.

Obviously, this is not an ideal scenario to iterate through, as the length of the array
constantly changes.

The solution is to then iterate top-down. Note:

[3,1,2,2,3,3,3]

removing all instances of 3 from the top-down will not change indices of anything below it.

--> [3,1,2,2]

--> [1,2,2]

The indices of the other elements still shift, however it does not matter as we do not need to SEARCH through them anymore;
we already passed it.