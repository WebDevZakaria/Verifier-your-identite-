import React,{useState,useEffect} from 'react'
 import { Form,Button,Row,Col} from 'react-bootstrap'

import { Link,useNavigate} from 'react-router-dom'


import { useDispatch } from 'react-redux'

 //import { register } from '../actions/userActions'
 
import FormContainer from '../component/FormContainer'

import { register } from '../actions/userActions'




function RegisterScreen() {

    let history = useNavigate();
    
    const  [matricule,setMatricule] = useState('')
    const  [nom,setNom] = useState('')
    const  [prenom,setPrenom] = useState('')
    const  [sexe,setSexe] = useState('')
    const  [date_naissance,setDate_naissance] = useState('')
    const  [prenom_pere,setPrenom_pere] = useState('')
    const  [prenom_mere,setPrenom_mere] = useState('')

    const  [nom_mere,setNom_mere] = useState('')
    const  [faculte,setNom_faculte] = useState('')
    const  [departement,setNom_departement] = useState('')
    const  [specialite,setSpecialite] = useState('')
    const  [niveau,setNiveau] = useState('')
    const  [formation,setFormation] = useState('')
    const  [anne_inscription,setAnne_inscription] = useState('')
    
    const dispatch = useDispatch()

    useEffect(()=>{

       
    },[])


    const submitHandler=()=>{
        

            dispatch(register(matricule,nom,prenom,sexe,date_naissance,prenom_pere,prenom_mere
                ,nom_mere,faculte,departement,specialite,niveau,formation,anne_inscription))

            history('/')
            

    }
    
  return (

    
    <FormContainer>
 <h1> Register page</h1>
 
<Form onSubmit = {submitHandler}>

<Form.Group controlId='matricule'>
    
        <Form.Label>Matricule </Form.Label>
    
        <Form.Control required type= 'number' placeholder='Enter your Matricule' value = {matricule} onChange ={(e)=>setMatricule(e.target.value)}>
            
        </Form.Control>

    </Form.Group>
    
<Form.Group controlId='nom'>
        <Form.Label>Name</Form.Label>

        <Form.Control required type= 'name' placeholder='Enter Your Name' value = {nom} onChange ={(e)=>setNom(e.target.value)}>

        </Form.Control>

    </Form.Group>


    
    <Form.Group controlId='prenom'>
        <Form.Label> Prenom </Form.Label>
        <Form.Control required type= 'name' placeholder='Enter Your Prenom' value = {prenom} onChange ={(e)=>setPrenom(e.target.value)}>
        </Form.Control>

    </Form.Group>

    
    <Form.Group controlId='sexe'>

        <Form.Label> Sexe </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your Sexe' value = {sexe} onChange ={(e)=>setSexe(e.target.value)}>

        </Form.Control>

    </Form.Group>


    




    
    <Form.Group controlId='date_naissance'>
        
        <Form.Label> date_naissance </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your date_naissance' value = {date_naissance} onChange ={(e)=>setDate_naissance(e.target.value)}>

        </Form.Control>

    </Form.Group>



    
    <Form.Group controlId='prenom_pere'>
        
        <Form.Label> prenom_pere </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your prenom_pere' value = {prenom_pere} onChange ={(e)=>setPrenom_pere(e.target.value)}>

        </Form.Control>

    </Form.Group>



    <Form.Group controlId='prenom_mere'>
        
        <Form.Label> prenom_mere </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your prenom_mere' value = {prenom_mere} onChange ={(e)=>setPrenom_mere(e.target.value)}>

        </Form.Control>

    </Form.Group>
    
    <Form.Group controlId='nom_mere'>
        
        <Form.Label> nom_mere </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your nom_mere' value = {nom_mere} onChange ={(e)=>setNom_mere(e.target.value)}>

        </Form.Control>

    </Form.Group>


    
    <Form.Group controlId='nom_faculte'>
        
        <Form.Label> nom_faculte </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your nom_faculte' value = {faculte} onChange ={(e)=>setNom_faculte(e.target.value)}>

        </Form.Control>

    </Form.Group>


    
    <Form.Group controlId='nom_departement'>
        
        <Form.Label> nom_departement </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your nom_departement' value = {departement} onChange ={(e)=>setNom_departement(e.target.value)}>

        </Form.Control>

    </Form.Group>



    <Form.Group controlId='specialite'>
        
        <Form.Label> specialite </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your specialite' value = {specialite} onChange ={(e)=>setSpecialite(e.target.value)}>

        </Form.Control>

    </Form.Group>


    <Form.Group controlId='niveau'>
        
        <Form.Label> niveau </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your niveau' value = {niveau} onChange ={(e)=>setNiveau(e.target.value)}>

        </Form.Control>

    </Form.Group>


    
    <Form.Group controlId='formation'>
        
        <Form.Label> formation </Form.Label>

        <Form.Control required type= 'name' placeholder=' Enter Your formation' value = {formation} onChange ={(e)=>setFormation(e.target.value)}>

        </Form.Control>

    </Form.Group>

    
    <Form.Group controlId='anne_inscription'>
        
        <Form.Label> anne_inscription </Form.Label>

        <Form.Control required type= 'number' placeholder=' Enter Your anne_inscription' value = {anne_inscription} onChange ={(e)=>setAnne_inscription(e.target.value)}>

        </Form.Control>

    </Form.Group>


        








    <Button type='submit' variant = 'primary'  className= 'my-3 width-30'  > Register </Button>   

    
    </Form> 



  </FormContainer>

  )

}

export default RegisterScreen
