// brute force
function hasPairWithSum(array, sum) {
    var len = array.length;
    for(var i = 0; i < len - 1; i++) {
        for(var j = i + 1; j < len; j++) {
            if(array[i] + array[j] === sum) {
                return true;
            }
        }
    }
    return false;
}

console.log(hasPairWithSum([6,4,3,2,1,7], 9))


// better solution
function hasPairWithSum2(array, sum) {
    const mySet = new Set()
    const len = array.length
    for(var i = 0; i < len; i++) {
        if(mySet.has(array[i])) {
            return true;
        }
        mySet.add(sum - array[i])
    }
}

console.log(hasPairWithSum2([6,4,3,2,1,7], 9))


