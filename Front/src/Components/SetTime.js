import React from 'react';
import "../Styles/settime.css";
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import { NavLink } from 'react-router-dom'
import NavBar from './Navbar';


const styles = theme => ({
  container: {
    display: 'flex',
    flexWrap: 'wrap',
  },
  textField: {
    marginLeft: theme.spacing.unit,
    marginRight: theme.spacing.unit,
    width: 200,
  },
});

const styles2 = theme => ({
  container: {
    display: 'flex',
    flexWrap: 'wrap',
  },
  textField: {
    marginLeft: theme.spacing.unit,
    marginRight: theme.spacing.unit,
    width: 200,
  },
});

function DatePickers(props) {
  const { classes } = props;

  return (
    <div>
      <NavBar />
      <div className="bg-center">
      <p className="coupureText">Time To Disconnect !</p>
        <div>
            <form>
              <div className="date">
              <div><h5>Date</h5></div>
                <TextField className="justDate"
                  id="date"
                  type="date"
                  defaultValue="2017-05-24"
                  InputLabelProps={{
                    shrink: true,
                  }}
                />
              </div>
              <div className="heures">
                <div className="decollage">
                  <div><h5>Heure de<br></br> Decollage</h5></div>
                  <TextField className="heureDebut"
                    id="time"
                    type="time"
                    defaultValue="07:30"
                    InputLabelProps={{
                      shrink: true,
                    }}
                    inputProps={{
                      step: 300, // 5 min
                    }}
                  />
                </div>
              <div classname="atterissage">
                <div><h5>Heure <br></br>d'atterissage</h5></div>
                <TextField className="heureFin"
                  id="time"
                  type="time"
                  defaultValue="07:30"
                  InputLabelProps={{
                    shrink: true,
                  }}
                  inputProps={{
                    step: 300, // 5 min
                  }}
                />
                </div>
              </div>
              <NavLink to="/activity"><button className="buttonContinuer">LANCER</button></NavLink>
            </form>
        </div>
      </div>
    </div>
  );
}
DatePickers.propTypes = {
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(DatePickers);