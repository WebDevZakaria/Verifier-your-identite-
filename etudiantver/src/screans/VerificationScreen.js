import React,{useState,useEffect} from 'react'

import { Form,Button} from 'react-bootstrap'


import FormContainer from '../component/FormContainer'


function VerificationScreen() {
    
    const  [name,setName] = useState('')
    
    useEffect(()=>{
        

    
    },[])


    const submitHandler=(e)=>{

        e.preventDefault()
        



    }
    
  return (

    
    <FormContainer>

<Form onSubmit = {submitHandler}>



<Form.Group controlId='name'>
    
        <Form.Label>Name </Form.Label>

        <Form.Control required type= 'name' placeholder='Enter your Name' value = {name} onChange ={(e)=>setName(e.target.value)}>
            
        </Form.Control>

    </Form.Group>

    
   
    

    <Button type='submit' variant = 'primary'  className= 'my-3 width-30'  > Registger </Button>   

    
    </Form> 



  </FormContainer>

  )

}

export default VerificationScreen
