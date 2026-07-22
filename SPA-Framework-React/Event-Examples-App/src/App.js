import "./App.css";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

  const [count, setCount] = require("react").useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello! Counter Increased");
  };

  const increase = () => {
    increment();
    sayHello();
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const onPress = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: "20px" }}>

      <h1>React Event Examples</h1>

      <h2>Counter : {count}</h2>

      <button onClick={increase}>
        Increment
      </button>

      {" "}

      <button onClick={decrement}>
        Decrement
      </button>

      <br /><br />

      <button
        onClick={() => sayWelcome("Welcome")}
      >
        Say Welcome
      </button>

      <br /><br />

      <button onClick={onPress}>
        OnPress
      </button>

      <hr />

      <CurrencyConvertor />

    </div>
  );
}

export default App;