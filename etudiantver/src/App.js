import React, { Component } from 'react';
import { Container } from 'react-bootstrap'

import { BrowserRouter,Routes,Route} from 'react-router-dom'

import Footer from './component/Footer';
import Header from './component/Header';
import HomeScreen from './screans/HomeScreen';
import VerificationScreen from './screans/VerificationScreen';
import Information from './screans/Information';
import RegisterScreen from './screans/RegisterScreen';


class App extends Component {
  

  render() {
    
    return (
   
      <BrowserRouter>

         <Header/>

        <main className='py-3'>

         <Container>

         <Routes>

          <Route path='/' element={<HomeScreen/>}/>

          <Route path='/verifier' element={<HomeScreen/>}/>
          
          <Route path='/list' element={<Information/>}/>
          <Route path='/inscription' element={<RegisterScreen/>}/>



          </Routes>

          </Container>

        </main>

        <Footer/>

      </BrowserRouter>

    );

  } 

}




export default App;
