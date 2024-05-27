// Техника двух указателей
function findPairSumTwoPoint(arr, sum) {
    let length = arr.length;
    let i = 0; // first pointer
    let j = length - 1; // second pointer

    while (i < j) {
        if (arr[i] + arr[j] == sum) { // If we find a pair
            console.log("Yes - "+arr[i]+" <=> "+arr[j]);
            return;
        } else if (arr[i] + arr[j] < sum) {
            i++;
        } else {
            j--;
        }
    }
    console.log("No");
}

let arr = [1, 2, 3, 4, 5];
let sum = 4;
findPairSumTwoPoint(arr, sum);