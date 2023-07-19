function merge(ary1, ary2) {
    let merged = []
    let index1 = 0
    let index2 = 0
    let currentIndex = 0

    while ( currentIndex < (ary1.length + ary2.length) ) {
        let isAry1Empty = index1 >= ary1.length
        let isAry2Empty = index2 >= ary2.length

        if (!isAry1Empty &&( isAry2Empty || ary1[index1] < ary2[index2])) {
                merged[currentIndex] = ary1[index1]
                index1++
        } else {
            merged[currentIndex] = ary2[index2]
            index2++
        }
        currentIndex++
    }
    return merged

}

function merge2(ary1, ary2) {
    let merged = [...ary1, ...ary2]
    return merged.sort((a,b) => a - b)
}

let ary1 = [1, 3 ,5 ,7 ,9]
let ary2 = [2, 4, 6, 8]

let merged = merge(ary1, ary2)

console.log(merged)
console.log(merge2(ary1, ary2))