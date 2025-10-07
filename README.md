# Maximum Subarray Sum (Kadane’s Algorithm)

## 🧩 Problem Description
Sami is studying B.Tech in Software Engineering and has been assigned a program by his professor to boost his internal marks.  
He must find the **maximum sum of a contiguous subarray** within a given array of integers.

The task is to implement an efficient algorithm (Kadane’s Algorithm) to solve this problem in **O(n)** time.

---

## 🧠 Functional Description
A subarray is a contiguous part of an array.  
The goal is to find the subarray that gives the **largest possible sum**.

Naive solutions check all subarrays (O(n²)), but Kadane’s Algorithm achieves the same in O(n) by:
1. Scanning through the array once.
2. Tracking the running sum and resetting it when it drops below zero.
3. Maintaining the maximum sum found so far.

---

## ⚙️ Input Format
- The first line contains a single integer `n` — the number of elements.
- The second line contains `n` integers — the array elements.

### Example:
