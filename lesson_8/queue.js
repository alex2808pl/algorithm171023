/** ЗАДАЧА Q */
class Queue {
    constructor() {
        this.items = [];
    }

    push(element) {
        this.items.push(element);
    }

    pop() {
        if (this.isEmpty()) {
            return "Underflow";
        }
        return this.items.shift();
    }

    peek() {
        if (this.isEmpty()) {
            return "No elements in Queue";
        }
        return this.items[0];
    }

    isEmpty() {
        return this.items.length === 0;
    }

    printQueue() {
        let str = "";
        for (let i = 0; i < this.items.length; i++) {
            str += this.items[i] + ", ";
        }
        return str;
    }
}

let queue = new Queue();
console.log(queue.isEmpty());  // Output: true

queue.push(1);
queue.push(2);
queue.push(3);
console.log(queue.printQueue()); // Output: 1 2 3

console.log(queue.pop());    // Output: 1
console.log(queue.printQueue()); // Output: 2 3

console.log(queue.peek());      // Output: 2
console.log(queue.printQueue()); // Output: 2 3