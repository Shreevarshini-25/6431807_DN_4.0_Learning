import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const converted = parseFloat(amount) * 80; // 1 Euro = ₹80
    alert(`Converting to ${currency} Amount is ${converted}`);
  };

  return (
    <div style={{ padding: "20px", border: "1px solid gray", marginTop: "20px" }}>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <label>Amount:</label>
        <input
          type="text"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
        <br /><br />
        <label>Currency:</label>
        <textarea
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        ></textarea>
        <br /><br />
        <button type="submit">Convert</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
