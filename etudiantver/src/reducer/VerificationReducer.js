



import { USER_VERIFICATION_REQUEST } from "../constants/verificationConstants"
import { USER_VERIFICATION_SUCCESS } from "../constants/verificationConstants"
import { USER_VERIFICATION_FAIL } from "../constants/verificationConstants"

import { USER_REGISTER_REQUEST } from "../constants/verificationConstants"
import { USER_REGISTER_SUCCESS } from "../constants/verificationConstants"
import { USER_REGISTER_FAIL } from "../constants/verificationConstants"

export const verifierReducer =(state = {etudiant:[]},action) =>{

    switch(action.type){

        case USER_VERIFICATION_REQUEST:

            return {

                loading:true,etudiant:[]

            }

        case USER_VERIFICATION_SUCCESS:

                return {

                    loading:false,etudiant:action.payload

                }

        case USER_VERIFICATION_FAIL:

                return {

                   loading:false,error:action.payload

                    }

                    
        default: 
                      return state
        
    }

}




export const userRegisterReducer = (state={},action)=>{


    switch(action.type){
        
        case  USER_REGISTER_REQUEST:

        return {
            loading :true
        }

        case USER_REGISTER_SUCCESS:

        return {
            loading:false,userInfo:action.payload
        }



        case USER_REGISTER_FAIL:

            return {
               loading:false,error:action.payload
                }

          
    default: 
                  return state  

    }

}
