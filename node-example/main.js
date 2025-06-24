const fs = require('fs');
const path = require('path');
const { load } = require("./compiler.wasm-runtime.js");

(async () => {
    const wasmPath = path.join(__dirname, "foo.wasm");
    const wasmBuffer = fs.readFileSync(wasmPath);

    const outputTeaVM = await load(wasmBuffer);
    outputTeaVM.exports.main(["arg1", "arg2"]);
  
    // // Access the exports
    // const { instance } = wasmModule;
    
    // // Example: call an exported function named 'add'
    // if (instance.exports.add) {
    //   console.log("2 + 3 =", instance.exports.add(2, 3));
    // } else {
    //   console.log("No 'add' function found in module exports.");
    // }
  })();
  