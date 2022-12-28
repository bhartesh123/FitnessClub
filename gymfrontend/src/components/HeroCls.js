import axios from 'axios'
import React, { Component } from 'react'
import Header from './Header'
import './Hero.css'

// Import images
import hero_image from "../assets/hero_image.png"
import hero_image_back from "../assets/hero_image_back.png"
import Heart from "../assets/heart.png"
import Calories from "../assets/calories.png"

export default class HeroCls extends Component {
    constructor(props) {
        super(props)
        this.state={
            expertCoach: String,
            members: String,
            fittnessPrograms: String
        }
    }
   
    
    componentWillMount(){
        console.log("Calling URL")
       
        axios
            .get("http://localhost:8080/FitnessClub/expertCoaches")
            .then(response=>{
                this.setState(
                    {expertCoach: response.data}
                )
                console.log('Response : ',response)
            })
        
        axios
            .get("http://localhost:8080/FitnessClub/membersCount")
            .then(response=>{
              this.setState({
                members: response.data
              })
            })
        
        axios
            .get("http://localhost:8080/FitnessClub/fitnessPrograms")
            .then(response=>{
              this.setState({
                fittnessPrograms: response.data
              })
            })
    }
  render() {
    return (
      <div className="hero">
        <div className="left-h">
          <Header/>
  
          <div className="bestAdd">
            <div></div>
            <span>The Best Fitness Club in the Town</span>
          </div>
        
        <div className="hero-text">
          <div>
            <span className='stroke-text'>Shape </span>
            <span>Your</span>
          </div>
          <div>
            <span>Ideal </span>
            <span className='stroke-text'>Body</span>
          </div>
          <div><span>In here we will help you to shape and build your 
            ideal body and live up your life to fullest</span></div>
        </div>
  
        <div className="figures">
          <div>
            
            <span>{this.state.expertCoach}</span>
            <span>Expert Coaches</span>
          </div>
          <div>
            <span>{this.state.members}</span>
            <span>Members Joined</span>
          </div>
          <div>
            <span>{this.state.fittnessPrograms}</span>
            <span>Fittness Programs</span>
          </div>
        </div>

        {/* Hero Buttons */}

        <div className='hero-buttons'>
          <button className='btn'>Get Started</button>
          <button className='btn'>Learn More</button>
        </div>

        </div>
        <div className="right-h">
          <button className='btn'>Join Now</button>

          <div className='heart-rate'>
            <img src={Heart} alt=""/>
            <span>Heart Rate</span>
            <span>116 bpm</span>
          </div>

          {/* Hero Images */}

          <img src={hero_image} alt="" className='hero-image'/>
          <img src={hero_image_back} alt="" className='hero-image_back'/> 

          {/* Calories */}

          <div className='calories'>
            <img src={Calories} alt=""/>
            <div>
            <span>
              Calories Burned
            </span>
            <span>
              220 kcal
            </span>
            </div>
          </div>
        </div>
      </div>
    )
  }
}
