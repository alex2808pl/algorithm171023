
class Activiny {
    constructor(name, start, finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }
}

class ActiSel {
    selectActivity(list) {
        list.sort((a, b) => a.finish - b.finish);
        let res = [];
        this.print(list);
        console.log("------");
        let first = list[0];
        let last = first.finish;
        res.push(first);

        for(let i = 1; i < list.length; i++) {
            if(list[i].start >= last) {
                last = list[i].finish;
                res.push(list[i]);
            }
        }
        this.print(res);
    }

      print(list) {
        for (let e of list) {
            console.log(e.name + "  "+e.start+"->"+e.finish);
        }
    }
}
// let list = [    new Activiny("a", 1,3),    new Activiny("b", 1,7),    new Activiny("c", 2,4),    new Activiny("d", 5,9),    new Activiny("e", 4,6),    new Activiny("f", 7,8)];
let list = [new Activiny("a", 16,17), new Activiny("b", 15,16), new Activiny("c", 10,15), new Activiny("d", 12,13), 
            new Activiny("e", 14,17), new Activiny("f", 10,11), new Activiny("g", 14,15), new Activiny("i", 11,13)];
let ActiJob = new ActiSel();
ActiJob.selectActivity(list);
