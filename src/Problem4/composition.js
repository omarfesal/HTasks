const inc = x => x+1;
const square = x => x*x;


const compose = (f, g) => (x) => f(g(x))
const h = compose(square , inc);


console.log(h(6));