public void main() {
    int[] testArray = new int[] { 1, 5, 6, 9, 2, 4, 312 };
    // int[] myarr = new int[10];
    IO.println(countPrimes(testArray));
}

/**
 * Counts how many primes are in the array
 * 
 * @param nums Array of numbers to check, assume every number > 0
 * @return number of primes in the nums array
 */
int countPrimes(int[] nums) {
    int counter = 0;
    for (int numsIndex = 0; numsIndex < nums.length; numsIndex++) {
        if (isPrime(nums[numsIndex])) {
            counter++;
        }
    }
    return counter;
}

/**
 * Checks if a number is prime
 * @param num Number to check, assume num > 0
 * @return true if num is prime, false otherwise
 */
boolean isPrime(int num) {
    if (num == 1) {
        return false;
    }
    for (int divisor = 2; divisor < num - 1; divisor++) {
        if (num % divisor == 0) {
            return false;
        }
    }
    return true;
}
