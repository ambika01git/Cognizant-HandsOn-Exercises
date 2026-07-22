import { useState } from "react";
import "./App.css";


function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}


function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}


function UserGreeting() {
  return (
    <div>
      <h1>Welcome back</h1>

      <h3>Flight Booking Available</h3>

      <p>
        You can book your flight tickets now.
      </p>
    </div>
  );
}


function GuestGreeting() {
  return (
    <div>
      <h1>Please sign up.</h1>

      <h3>
        Available Flights
      </h3>

      <p>
        Delhi → Mumbai
      </p>

      <p>
        Chennai → Bangalore
      </p>
    </div>
  );
}


function Greeting(props) {

  const isLoggedIn = props.isLoggedIn;

  if(isLoggedIn) {
    return <UserGreeting />;
  }

  return <GuestGreeting />;
}


function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);


  const handleLogin = () => {
    setIsLoggedIn(true);
  };


  const handleLogout = () => {
    setIsLoggedIn(false);
  };


  return (
    <div>

      <h1>React App</h1>

      <Greeting isLoggedIn={isLoggedIn} />


      {
        isLoggedIn ?

        <LogoutButton onClick={handleLogout} />

        :

        <LoginButton onClick={handleLogin} />

      }


    </div>
  );
}


export default App;