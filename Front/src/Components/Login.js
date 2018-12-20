import React, { Component } from "react";
import "../Styles/login.css";
import { Button, Form, FormGroup, Label, Input } from "reactstrap";
import { Link } from "react-router-dom";

class Login extends Component {
  constructor() {
    super();
    this.state = {
      name: ""
    };
  }

  handleNameChange = event => {
    this.setState({ name: event.target.value });
  };

  render() {
    return (
      <div className="container">
        <div className="formulaire">
          <Form className="form">
            <div>
              <FormGroup className="form1 mb-2 mr-sm-2 mb-sm-0">
                <div className="row justify-content-center">
                  <div className="col-6 offset-4">
                    <Label for="exampleName" className="mr-sm-2">
                      Name
                    </Label>
                  </div>
                </div>
                <div className="field ml-4">
                  <Input
                    type="text"
                    name="name"
                    id="name"
                    placeholder="pseudo"
                    value={this.state.name}
                    onChange={this.handleNameChange}
                  />
                </div>
              </FormGroup>
            </div>
            <br />
            <div>
              <FormGroup className="form2 mb-2 mr-sm-2 mb-sm-0">
                <div className="row justify-content-center">
                  <div className="col-6 offset-3">
                    <Label for="examplePassword" className="mr-sm-2">
                      Password
                    </Label>
                  </div>
                </div>
                <div className="field ml-4">
                  <Input
                    type="password"
                    name="password"
                    id="examplePassword"
                    placeholder="password"
                  />
                </div>
              </FormGroup>
            </div>

            <Link
              to={{
                pathname: "/GiveMeCandy",
                state: { name: this.state.name }
              }}
            >
              <div className="row justify-content-center">
                <div className="col-6 offset-3 mt-2">
                  <Button className="button">Submit</Button>
                </div>
              </div>
            </Link>
          </Form>
        </div>
      </div>
    );
  }
}

export default Login;
