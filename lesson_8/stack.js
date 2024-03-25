/** Реализация СТЕКА */
class Stack {
    constructor() {
        this.MAX = 10;
        this.top = -1;
        this.a = new Array(this.MAX);
    }

    isEmpty() {
        return (this.top < 0);
    }

    push(x) {
        if (this.top >= (this.MAX - 1)) {
            console.log("Stack Overflow");
            return false;
        } else {
            this.a[++this.top] = x;
            console.log(x + " pushed into stack");
            return true;
        }
    }

    pop() {
        if (this.top < 0) {
            console.log("Stack Underflow");
            return 0;
        } else {
            return this.a[this.top--];
        }
    }

    peek() {
        if (this.top < 0) {
            console.log("Stack Underflow");
            return 0;
        } else {
            return this.a[this.top];
        }
    }

    print() {
        for (let i = this.top; i > -1; i--) {
            console.log(" " + this.a[i]);
        }
    }
}

// Driver code
let stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
console.log("Elements present in stack :");
stack.print();

console.log(stack.pop() + " - popped from stack");
console.log("Elements present in stack :");
stack.print();

console.log("Top element (peek) is :" + stack.peek());
console.log("Elements present in stack :");
stack.print();