import React, { Component } from 'react';
import { Route, BrowserRouter, Switch, } from 'react-router-dom';
import './App.css';
import Home from './Components/Home';
import SetTime from './Components/SetTime';
import Activity from './Components/Activity';
import CountDown from './Components/CountDown';
import Final from './Components/Final';
import AdminSet from './Components/AdminSet';

class App extends Component {
  constructor() {
    super()
    this.state = {

    }
  }
  render() {
    return (
      <BrowserRouter>
          <Switch>
            <Route exact path="/" component={Home} />
            <Route path="/settime" component={SetTime} />
            <Route path="/activity" component={Activity} />
            <Route path="/countdown" component={CountDown} />
            <Route path="/final" component={Final} />
            <Route path="/adminset" component={AdminSet} />        
          </Switch>
      </BrowserRouter>
    );
  }
}

export default App;
