function isPrime(number) {
    if (number == 0 || number == 1)
        return true;

    return div1(number, 2);
}

function div1(number, divider) {
    if (number == divider)
        return true;

    if (number % divider == 0)
        return false;
    else
        return div2(number, divider + 1);
}

function div2(number, divider) {
    if (number == divider)
        return true;

    if (number % divider == 0)
        return false;
    else
        return div1(number, divider + 1);
}
console.log(isPrime(7));