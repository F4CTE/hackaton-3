import React, { Component } from "react";
import "../Styles/activity.css";
import NavBar from "./Navbar";
import { NavLink } from 'react-router-dom'
import pictoreunion from "../images/picto_reunion.png";

class Activity extends Component {
  constructor() {
    super();
    this.state = {};
  }

  render() {
    return (
      <div className="homePage">
        <NavBar />
        <div className="container">
          <div className="bg-center">
            <p className="activite">Time to share !</p>
            <div className="bg-center-grey">
              <div className="bg-middle-white">
                <img
                  className="pictoreunion"
                  src={pictoreunion}
                  width="80px"
                  height="100px"
                  alt="Picto activité réunion"
                />
                <p className="texte">Réunion bien-être au travail</p>
                <button className="btn-nxt-orange">NEXT</button>
              </div>
            </div>
            <NavLink to="/countdown"><button className="btn-go-orange">GO</button></NavLink>
          </div>
        </div>
      </div>
    );
  }
}

export default Activity;
