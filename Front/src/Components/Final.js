import React, { Component } from "react";
import "../Styles/final.css";
import NavBar from './Navbar'
import PictoFB from '../images/pictofb.png'
import PictoLinkedin from '../images/pictolinkedin.png'
import PictoMail from '../images/pictomail.png'
import { NavLink } from 'react-router-dom'

class Final extends Component {
  constructor() {
    super();
    this.state = {};
  }

  render() {
    return (
    <div>
      <NavBar />
      <div className="bg-center">
        <h1 className="wellDone">Well Done !</h1>
        <div className="littleModul">
        <p>Vous avez économisé 5000 kW</p>
        <p>Ce qui représente un Lyon-Paris en Camion</p>
          <div>
            <p>Partager votre Résultat</p>
              <div className="iconeModul">
                <div className="arrondi"><a href="https://www.google.fr/" target="blank"><img className="icones" src={PictoMail} alt="mail"/></a></div>
                <div className="arrondi"><a href="https://www.google.fr/" target="blank"><img className="icones" src={PictoFB} alt="fb"/></a></div>
                <div className="arrondi"><a href="https://www.google.fr/" target="blank"><img className="icones" src={PictoLinkedin} alt="mail"/></a></div>
              </div>
          </div>
        </div>
      </div>
    </div>
    )
  }
}

export default Final;
