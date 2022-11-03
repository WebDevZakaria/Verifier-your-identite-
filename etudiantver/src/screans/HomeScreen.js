import React,{useState,useEffect} from 'react'

import { Form,Button} from 'react-bootstrap'

import { useDispatch } from 'react-redux'

import FormContainer from '../component/FormContainer'

import { verification } from '../actions/userActions'

import { useNavigate} from 'react-router-dom'





function HomeScreen() {

    const dispatch = useDispatch()
    let history = useNavigate()



    const  [matricule,setMatricule] = useState('')
    

    useEffect(()=>{


    },[])


    const submitHandler=(e)=>{

        e.preventDefault()

        console.log('verifier')
    
        dispatch(verification(matricule))

        history('/list')
        
    }
    

  return (

<div>

        <h1> Welcome<hr></hr>

            Verifier your identite now </h1>

        <FormContainer>
            
<Form onSubmit = {submitHandler}>

<Form.Group controlId='matricule'>
    
        <Form.Label>Enter Your Matricule </Form.Label>
        
        <Form.Control required type= 'number' placeholder='Enter your Matricule' value = {matricule} onChange ={(e)=>setMatricule(e.target.value)}>

        </Form.Control>

    </Form.Group>

    <Button type='submit' variant = 'primary'  className= 'my-3 width-30'  > Verifier </Button>   

    </Form> 

  </FormContainer>


</div>


        
  )

}


export default HomeScreen