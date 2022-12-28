import React, { Component } from 'react'
import './Programs.css'

export class Programs extends Component {
  render() {
    return (
      <div className='Programs' id='programs'>
        {/* <div>Hello</div> */}
        {/* Header  */}
        <div className='programs-header'>
            <span className='stroke-text'>Explore our</span>
            <span className='prg'>Programs</span>
            <span className='stroke-text'>to shape you</span>
        </div>
      </div>
      
    )
  }
}

export default Programs