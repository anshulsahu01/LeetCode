#  Intuition
****To find if a kid with extraCandies can have the greatest number of candies among all the kids, we need to first find the maximum number of candies among all the kids, and then check if adding extraCandies to the candies of a kid results in a value greater than or equal to the maximum number of candies. If it does, then the kid can have the greatest number of candies among all the kids.
​
​
​
# Approach
1. Find the maximum number of candies among all the kids by iterating through the candies array.
​
* . Iterate through the candies array again and check for each kid if they can have the greatest number of candies by adding extraCandies to their candies and comparing it to the maximum number of candies.
​
If it is greater than or equal to the maximum number of candies, add true to the result list, else add false to the result list.
​
​
Return the result list
​
​
Complexity
Time complexity:
The time complexity of the algorithm is O(n) since we iterate through the candies array twice.
​
Space complexity:
The space complexity of the algorithm is O(n) since we store the result in a list of length n.