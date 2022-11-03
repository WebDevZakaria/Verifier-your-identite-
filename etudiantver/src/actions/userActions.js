

import { USER_VERIFICATION_REQUEST } from "../constants/verificationConstants"
import { USER_VERIFICATION_SUCCESS } from "../constants/verificationConstants"
import { USER_VERIFICATION_FAIL } from "../constants/verificationConstants"



import { USER_REGISTER_REQUEST } from "../constants/verificationConstants"
import { USER_REGISTER_SUCCESS } from "../constants/verificationConstants"
import { USER_REGISTER_FAIL } from "../constants/verificationConstants"



import axios from "axios";


export const verification = (matricule) => async(dispatch)=> 

    {

    try{
    
            dispatch({type:USER_VERIFICATION_REQUEST})
    
            const config = {
                headres:{
                    'Content-type':'application/json',
                    "Access-Control-Allow-Origin": "*",
                    "Access-Control-Allow-Methods": "GET,PUT,POST,DELETE,PATCH,OPTIONS",
                    "Access-Control-Allow-Headers": "Content-Type"

                }
            }
    
            const {data } = await axios.post(`http://localhost:8081/Etudiant_Verification/Verification?matricule=${matricule}`,config)
            
            dispatch({type:USER_VERIFICATION_SUCCESS,payload:data.split(' ')})

        }

        catch(error){
            
            dispatch({type:USER_VERIFICATION_FAIL,payload:error.response && error.response.data.detail 
                ? error.response.data.detail
                : error.message,
            })

        }

        }
        


        export const register = (matricule,nom,prenom,sexe,date_naissance,prenom_pere,prenom_mere
            ,nom_mere,faculte,departement,specialite,niveau,formation,anne_inscription) => async(dispatch)=> 

        {
            try{
        
                dispatch({type:USER_REGISTER_REQUEST})
        
                const config = {
                    headres:{
                    'Content-type':'application/json',
                    "Access-Control-Allow-Origin": "*",
                    "Access-Control-Allow-Methods": "GET,PUT,POST,DELETE,PATCH,OPTIONS",
                    "Access-Control-Allow-Headers": "Content-Type"
                    }
                }
        
                const {data } = await axios.post(`http://localhost:8081/Etudiant_Verification/Add?matricule=${matricule}&nom=${nom}&prenom=${prenom}&sexe=${sexe}&date_naissance=${date_naissance}&prenom_pere=${prenom_pere}&prenom_mere=${prenom_mere}&nom_mere=${nom_mere}&faculte=${faculte}&departement=${departement}&specialite=${specialite}&niveau=${niveau}&formation=${formation}&annee_inscription=${anne_inscription}`,config)
                
                dispatch({type:USER_REGISTER_SUCCESS,payload:data})

                             
        

            }

            catch(error){
        
                dispatch({type:USER_REGISTER_FAIL,payload:error.response && error.response.data.detail 
                    ? error.response.data.detail
                    : error.message,
            
                })
            }
    
            }

    

    