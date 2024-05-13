function firstElement(arr, n, k) {
    // This loop is used for selection
    // of elements
    for (let i = 0; i < n; i++) {
        // Count how many times selected element
        // occurs
        let count = 0;
        for (let j = i; j < n; j++) {
            if (arr[i] === arr[j]) {
                count++;
            }
        }

        // Check, if it occurs k times or not
        if (count === k) {
            return arr[i];
        }
    }

    return -1;
}

let arr = [1, 7, 4, 3, 4, 8, 7];
    let n = arr.length;
    let k = 2;
    console.log(firstElement(arr, n, k));