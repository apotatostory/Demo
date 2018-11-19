import React, { Component } from 'react';
import ReactDOM from 'react-dom';

class Sample extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      default: "test"
    };
  }
  render() {
    alert("Welcome!");
    return (
      <div>
        <h1>#$#$!JKLDSFSDHL</h1>
      </div>
    );
  }
}

ReactDOM.render(<Sample />, document.getElementById('main'));
