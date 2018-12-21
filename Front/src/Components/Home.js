import React, { Component } from "react";
import "../Styles/home.css";
import Login from "./Login";

class Home extends Component {
  constructor() {
    super();
    this.state = {};
  }

  render() {
    return (
      <div className="homePage">
        <Login />
      </div>
    );
  }
}

export default Home;
