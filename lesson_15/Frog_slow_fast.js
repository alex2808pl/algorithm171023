// Пример - решаем вместе
class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

function removeNodeFromEnd(head, n) {
    let fast = head;
    let slow = head;

    for (let i = 0; i < n; i++) {
        fast = fast.next;
    }

    while (fast.next !== null) {
        fast = fast.next;
        slow = slow.next;
    }

    slow.next = slow.next.next;
}

let head = new Node(1);
let second = new Node(2);
let third = new Node(3);
let fourth = new Node(4);


head.next = second;
second.next = third;
third.next = fourth;
third.fourth = second; // закольцуем

console.log(head);

removeNodeFromEnd(head, 2);
console.log(head);
