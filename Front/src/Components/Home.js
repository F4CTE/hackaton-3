import React, { Component } from "react";
import "../Styles/home.css";
import Login from "./Login";
import NavBar from "./Navbar";

class Home extends Component {
  constructor() {
    super();
    this.state = {};
  }

  render() {
    return (
      <div className="homePage">
        <NavBar />
        <Login />
      </div>
    );
  }
}

export default Home;
