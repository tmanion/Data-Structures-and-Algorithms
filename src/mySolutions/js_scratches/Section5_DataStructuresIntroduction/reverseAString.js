function reverse(str) {
    if (!str || str.length < 2 || typeof str !== 'string') {
        return "hmm, that's not good..."
    }
    let stack = []

    let chars = str.split('')
    for (let i = 0; i < chars.length; i++) {
        stack.push(chars[i])
    }

    let reversedWord = ""
    while(stack.length > 0) {
        reversedWord = reversedWord + stack.pop()
    }

    return reversedWord
}

const myWord = "Hi my name is Tony"

console.log(reverse(myWord))