/* http://hr.gs/babead */

'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the isBalanced function below.
function isBalanced(s) {
    
var stack = [];

var one = 0;
var two = 0;
var three = 0;

for (var i = 0; i < s.length; i++) {
  if (s.charAt(i) == '{') stack.push('}');
  else if (s.charAt(i) == '[') stack.push(']');
  else if (s.charAt(i) == '(') stack.push(')');
  else {
      var close = stack[stack.length - 1];

      if ((stack.length == 0) || (close != s.charAt(i))) return 'NO';

      stack.pop();
  }

  if ((one < 0) || (two < 0) || (three < 0)) return 'NO';
}

return (stack.length == 0)?'YES':'NO';

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const t = parseInt(readLine(), 10);

    for (let tItr = 0; tItr < t; tItr++) {
        const s = readLine();

        let result = isBalanced(s);

        ws.write(result + "\n");
    }

    ws.end();
}
