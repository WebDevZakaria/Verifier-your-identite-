import { createStore,combineReducers,applyMiddleware  } from 'redux'
import thunk from 'redux-thunk'
import { composeWithDevTools } from 'redux-devtools-extension'
import { verifierReducer } from './reducer/VerificationReducer'


import { userRegisterReducer } from './reducer/VerificationReducer'


const reducer = combineReducers({
    
    etudiantList: verifierReducer,
    userRegister:userRegisterReducer,


})

//const cartItemFromStorage = localStorage.getItem('cartItems') ?
//JSON.parse(localStorage.getItem('cartItems')):[]






const initalState = {

    // cart:{

    //     cartItems:cartItemFromStorage,

    // },

}

const middleware = [thunk]

const store = createStore(reducer,initalState,composeWithDevTools(applyMiddleware(...middleware)))

export default store





