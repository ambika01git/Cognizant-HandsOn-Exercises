import { useState } from "react";

function CurrencyConvertor() {
  const [amount, setAmount] = useState(80);
  const [result, setResult] = useState("");

  const handleSubmit = () => {
    const euro = (amount / 90).toFixed(2);
    setResult(`${amount} INR = ${euro} Euro`);
  };

  return (
    <div>
      <h2>Currency Convertor!!!</h2>

      <label>Amount: </label>

      <input
        type="number"
        value={amount}
        onChange={(e) => setAmount(e.target.value)}
      />

      <br />
      <br />

      <label>Currency: Euro</label>

      <br />
      <br />

      <button onClick={handleSubmit}>Submit</button>

      <h3>{result}</h3>
    </div>
  );
}

export default CurrencyConvertor;