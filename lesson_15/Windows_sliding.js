// Окно из k элементов, где сумма максимальная

// Стандарный перебор
function maxSumNaiveApproach(arr, k) {
    let length = arr.length;
    let max = 0;

    for (let i = 0; i < length - k + 1; i++) {
        let current = 0;
        for (let j = 0; j < k; j++) {
            current = current + arr[i + j];
            max = Math.max(current, max);
        }
    }
    return max;
}

// Подход скользящее окно
function maxSumSlidingWindow(arr, k) {
    let length = arr.length;
    if (length < k) {
        console.log("wrong size of array");
        return -1;
    }

    let max = 0;
    for (let i = 0; i < k; i++)
        max += arr[i];

    let windowSum = max;
    for (let i = k; i < length; i++) {
        windowSum += arr[i] - arr[i - k];
        max = Math.max(max, windowSum);
    }

    return max;
}


let arr = [1, 55, 2, 10, 2, 13, 66, 0, 3];
let k = 3;
console.log(maxSumNaiveApproach(arr, k));
console.log(maxSumSlidingWindow(arr, k));