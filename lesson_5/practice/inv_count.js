function getInvCount(arr) {
    let length = arr.length;
    let count = 0;
    for (let i = 0; i < length - 1; i++) {
        for (let j = i + 1; j < length; j++) {
            if (arr[i] > arr[j]) {
                console.log(arr[i] + ","+arr[j]);
                count++;
            }
        }
    }
    return count;
}

console.log('Инверсий - '+getInvCount([8, 4, 2, 1]));