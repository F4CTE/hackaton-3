import React, { Component } from "react";
import { NavLink } from "react-router-dom";
import "../Styles/countdown.css";
import NavBar from "./Navbar";

class CountDown extends Component {
  constructor(props) {
    super(props);
    this.state = {
      deadline: "December, 21, 2018, 10 11:13:00",
      hours: 0,
      minutes: 0,
      seconds: 0,
      timeoff: false
    };
  }
  componentWillMount() {
    this.getTimeUntil(this.state.deadline);
  }
  componentDidMount() {
    setInterval(() => this.getTimeUntil(this.state.deadline), 1000);
  }
  leading0(num) {
    return num < 10 ? "0" + num : num;
  }
  getTimeUntil(deadline) {
    const time = Date.parse(deadline) - Date.parse(new Date());
    if (time <= 0) {
      this.setState({ hours: 0, minutes: 0, seconds: 0, timeoff: true });
    } else {
      const seconds = Math.floor((time / 1000) % 60);
      const minutes = Math.floor((time / 1000 / 60) % 60);
      const hours = Math.floor((time / (1000 * 60 * 60)) % 24);
      this.setState({ hours, minutes, seconds });
    }
  }

  render() {
    return (
      <div>
        <NavBar />
        <div className="bg-center">
          <div className="countdown">
            <div className="count_title">Fin dans : </div>
            <div>
              <div className="clock-hours">
                {this.leading0(this.state.hours)}:
              </div>
              <div className="clock-minutes">
                {this.leading0(this.state.minutes)}:
              </div>
              <div className="clock-seconds">
                {this.leading0(this.state.seconds)}
              </div>
            </div>
            {this.state.timeoff === true ? (
              <NavLink to="/final">
                <button className="Fin"> Fin</button>
              </NavLink>
            ) : null}
          </div>
        </div>
      </div>
    );
  }
}

export default CountDown;
