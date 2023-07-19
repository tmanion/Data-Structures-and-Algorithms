var object1 = {value: 10}
var object2 = object1
var object3 = {value: 10}


function b() {
    let a = 4
}

/// classes
class Player {
    constructor(name, type) {
        console.log(this)
        this.name = name
        this.type = type
    }

    introduce() {
        console.log(`Hi I am ${this.name}, I am a ${this.type}`)
    }
}

class Wizard extends Player {
    constructor(name, type) {
        super(name, type)
    }

    play() {
        console.log(`WEEEEEEEEEE I'm a ${this.type}`)
    }
}

const wizard1 = new Wizard('Shelly', 'Healer')
const wizard2 = new Wizard('Shawn', 'Dark Magic')

wizard1.play()
wizard1.introduce()

wizard2.introduce()

// building an array ourself
class MyArray {
    constructor() {
        this.length = 0
        this.data = {}
    }

    get(index) {
        return this.data[index]
    }

    push(item) {
        this.data[this.length] = item
        this.length++
        return this.length
    }

    pop() {
        const lastItem = this.data[this.length - 1]
        delete this.data[this.length - 1]
        this.length--
        return lastItem
    }

    delete(index) {
        const item = this.data[index]
        this.shiftItems(index)
        delete this.data[this.length - 1]
        this.length--
        return item
    }

    shiftItems(index) {
        for (let i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i + 1]
        }
    }
}

const newArray = new MyArray()
newArray.push('hi')
newArray.push('you')
console.log(newArray)
newArray.push('!')
console.log(newArray)
newArray.pop()
console.log(newArray)
newArray.delete(0)
console.log(newArray)