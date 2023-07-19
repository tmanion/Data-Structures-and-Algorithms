// SECTION 4 LECTURE 53: HOW TO SOLVE CODING PROBLEMS: EXCERCISE - INTERVIEW QUESTION


// Given 2 arrays, create a functgion that lets a user know (true/false) wether these two arrays contain any common items
// For example:
// const array1 = ['a', 'b', 'c', 'x']
// const array2 = ['z', 'y', 'i']
// should return false
// ----------------------------------------------------------------
// const array1 = ['a', 'b', 'c', 'x']
// const array2 = ['z', 'y', 'x']
// should return true

// notes //////////////////////////////////
// 2 paramaters -- arrays - no size limit
// return true or false
// brute force: nexted for loops: O(n^2)




const array1 = ['a', 'b', 'c', 'x']
const array2 = ['z', 'y', 'i']
// brute force////////////////////////////////// Time complexity O(n^2) or -> O(a*b)
function containsCommonItem(array1, array2) {
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            if (array1[i] === array2[j]) {
                return true;
            }
        }
    }
    return false;
} // space complexity O(1)


console.log("Brute force: " + containsCommonItem(array1, array2));


const array3 = ['a', 'b', 'c', 'x']
const array4 = ['z', 'y', 'x']
// better solution//////////////////////////////// Time complexity O(a+b)
// no nested loops
// array1 =converted=to=> obj {
// a: true
// b: true
// c: true
// x: true
// }
//
// array[index] = obj.properties?

function containsCommonItem2(array1, array2) {
    // loop through first array and create object where properties === items in the array

    // can we always assume two parameters?
    // talk about error checking here
    let map = {};
    for (let i = 0; i < array1.length; i++) {
        if(!map[array1[i]]) {
            const item = array1[i];
            map[array1[i]] = true;
        }
    }
    // loop through second array and check if item in second array exists on created object
    for (let j = 0; j < array2.length; j++) {
        if(map[array2[j]]) {
            return true;
        }
    }
    return false;
} // space complexity O(a) where a=lenght of first array

console.log("Better Solution: " + containsCommonItem2(array3, array4));


const array5 = ['a', 'b', 'c', 'x']
const array6 = ['z', 'y', 'x']
// Language specific, more readable method ////////////
function containsCommonItem3(array1, array2) {
    return array1.some(item => array2.includes(item)); // more readable
}

console.log("Language Based Solution: " + containsCommonItem3(array5, array6));


const strings = ['a', 'b', 'c', 'd'];

strings.splice(2, 0, 'alien');

console.log(strings);

strings.push('y')

console.log(strings);

strings.pop()

console.log(strings);

strings.unshift('x')

console.log(strings);

