import React from 'react'
import ReactDOM from 'react-dom'
import Admin from '../Admin'

class App extends React.Component {
  static defaultProps = {}
  render() {
    return (
      <>
        <Admin />
      </>
    )
  }
}

ReactDOM.render(<App />, document.getElementById('root'))
