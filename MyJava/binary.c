#include <stdio.h>

// Function to perform binary search
int binarySearch(int arr[], int low, int high, int target) {
    while (low <= high) {
        int mid = low + (high - low) / 2;

        // Check if the key is present at the middle
        if (arr[mid] == target)
            return mid;

        // If the key is smaller, ignore the right half
        else if (arr[mid] > target)
            high = mid - 1;

        // If the key is larger, ignore the left half
        else
            low = mid + 1;
    }

    // If the key is not present in the array
    return -1;
}

int main() {
    int arr[] = {2, 4, 7, 10, 15, 20, 25, 30};
    int n = sizeof(arr) / sizeof(arr[0]);
    int target = 15;

    // Perform binary search
    int result = binarySearch(arr, 0, n - 1, target);

    // Print the result
    if (result == -1)
        printf("Element %d is not present in the array\n", target);
    else
        printf("Element %d is present at index %d\n", target, result);

    return 0;
}
