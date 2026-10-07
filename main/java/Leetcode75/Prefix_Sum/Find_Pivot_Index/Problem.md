# 724. Find Pivot Index

Given an integer array `nums`, find its **pivot index**.

The pivot index is the index where the sum of all numbers strictly to the left equals the sum of all numbers strictly to the right. If the index is at either edge of the array, the sum on that side is `0`.

Return the **leftmost** pivot index. If no such index exists, return `-1`.

[View the problem on LeetCode](https://leetcode.com/problems/find-pivot-index/).

## Examples

### Example 1

```text
Input: nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: The left sum and right sum are both 11.
```

### Example 2

```text
Input: nums = [1, 2, 3]
Output: -1
Explanation: No index has equal left and right sums.
```

### Example 3

```text
Input: nums = [2, 1, -1]
Output: 0
Explanation: The left sum and right sum are both 0.
```

## Constraints

- `1 <= nums.length <= 10^4`
- `-1000 <= nums[i] <= 1000`
