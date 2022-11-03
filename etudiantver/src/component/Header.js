import React from 'react'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { LinkContainer } from 'react-router-bootstrap'



function Header() {




  return (

    <header>

<Navbar bg="dark"  variant = "dark" expand="lg" collapseOnSelect>

      <Container>

        <LinkContainer to = '/'>
        <Navbar.Brand>Etudiant DZ</Navbar.Brand>

        </LinkContainer>
        

        <Navbar.Toggle aria-controls="basic-navbar-nav" />

        <Navbar.Collapse id="basic-navbar-nav">

          <Nav className="mr-auto">

          <LinkContainer to = '/verifier'>

            <Nav.Link><i className='fas fa-shopping-cart'></i>Verification</Nav.Link>

            </LinkContainer>
            
 <LinkContainer to = '/inscription'>

            <Nav.Link><i className='fas fa-shopping-cart'></i>Inscription</Nav.Link>
            
            </LinkContainer>


          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
    </header>
  )
}

export default Header