import React, { Component } from "react";
import "../Styles/activity.css";
import NavBar from "./Navbar";
import { NavLink } from "react-router-dom";
import pictoreunion from "../images/picto_reunion.png";
//import axios from 'axios';

class Activity extends Component {
  constructor() {
    super();
    this.state = {
      sentenceNbr: 0
    };
  }
  getRandomInt(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min;
  }
  getActivities = () => {
    let numberActivities = this.getRandomInt(0,4);
    axios("http://localhost:8080/activities/"+ numberActivities).then(res => {
      const sentenceNum = res.data[0].sentence;
      //console.log(candy1)
      this.setState({
        sentenceNbr: sentenceNum
      });
    });
  };
  componentWillMount = () => {
    this.getActivities();
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
            <NavLink to="/countdown">
              <button className="btn-go-orange">GO</button>
            </NavLink>
          </div>
        </div>
      </div>
    );
  }
}

export default Activity;
