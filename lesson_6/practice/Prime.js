function isPrime(number) {
    if (number == 0 || number == 1)
        return true;

    return div(number, 2);
}

function div(number, divider) {
    if (number == divider)
        return true;

    if (number % divider == 0)
        return false;
    else
        return div(number, divider + 1);
}
console.log(isPrime(10));