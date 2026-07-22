import "./App.css";
import office from "./images/office.jpg";

function App() {

  const heading = "Office Space";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "WeWork",
      Rent: 90000,
      Address: "Hyderabad"
    }
  ];

  return (
    <div style={{ margin: "20px" }}>

      <h1>{heading}, at Affordable Range</h1>

      <img
        src={office}
        alt="Office Space"
        width="400"
      />

      <hr />

      {officeList.map((item, index) => (

        <div key={index}>

          <h2>Name: {item.Name}</h2>

          <h3
            className={
              item.Rent <= 60000
                ? "textRed"
                : "textGreen"
            }
          >
            Rent: Rs. {item.Rent}
          </h3>

          <h3>
            Address: {item.Address}
          </h3>

          <hr />

        </div>

      ))}

    </div>
  );
}

export default App;