import React, { Component } from "react";
import {
  Collapse,
  Navbar,
  NavbarToggler,
  NavbarBrand,
  Nav,
  NavItem,
  NavLink
} from "reactstrap";
import "../Styles/navbar.css";
import logo from "../images/logo.png";

class NavBar extends Component {
  constructor(props) {
    super(props);
    this.toggle = this.toggle.bind(this);
    this.state = {
      isOpen: false
    };
  }
  toggle() {
    this.setState({
      isOpen: !this.state.isOpen
    });
  }
  // isauth = () => {
  //   if (localStorage.getItem("id") !== null) {
  //     // Vous étes authentifié
  //     <div>
  //       <p>Bonjour Carla</p>
  //     </div>
  //   } else {
  //     <div>
  //       <NavItem className="navb">
  //         <NavLink href="/">Home</NavLink>
  //       </NavItem>
  //       <NavItem className="navb">
  //         <NavLink className="navbid" href="/">
  //           {this.props.name || "Identifiant"}
  //         </NavLink>
  //       </NavItem>
  //     </div>
  //   }
  // };

  render() {
    return (
      <div>
        <Navbar className="na" expand="md xs">
          <NavbarBrand className="nav">
            <img className="logo" src={logo} width="250px" height="100px" />
          </NavbarBrand>
          <NavbarToggler onClick={this.toggle} />
          <Collapse isOpen={this.state.isOpen} navbar>
            <Nav className="ml-auto" navbar>
              <div>
                <p className="bienvenue">Bonjour Carla</p>
              </div>
              {/* isauth() */}
            </Nav>
          </Collapse>
        </Navbar>
      </div>
    );
  }
}

export default NavBar;
