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
// brute force////////////////////////////////// O(n^2) or -> O(a*b)
function containsCommonItem(array1, array2) {
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            if (array1[i] === array2[j]) {
                return true;
            }
        }
    }
    return false;
}


console.log("Brute force: " + containsCommonItem(array1, array2));


const array3 = ['a', 'b', 'c', 'x']
const array4 = ['z', 'y', 'x']
// better solution//////////////////////////////// O(a+b)
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
    let map = {};
    for (let i = 0; i < array1.length; i++) {
        if(!map[array1[i]]) {
            const item = array1[i];
            map[item] = true;
        }
    }
    // loop through second array and check if item in second array exists on created object
    for (let j = 0; j < array2.length; j++) {
        if(map[array2[j]]) {
            return true;
        }
    }
    return false;
}

console.log("Better Solution: " + containsCommonItem2(array3, array4));