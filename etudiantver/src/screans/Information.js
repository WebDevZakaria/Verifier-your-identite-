import React, { useEffect } from 'react'


import { Row,Col ,ListGroup,Card} from 'react-bootstrap'

import { useSelector } from 'react-redux'

import Loader from '../component/Loader'

import Message from '../component/Message'

function Information() {


  const etudiantinfo = useSelector(state => state.etudiantList)

  const { loading, error, etudiant } = etudiantinfo


  
  
  useEffect(() => {

    console.log(etudiant)

  }, [])
  
  return (
    <div>


      {loading ? (<Loader />)
        : error
          ? (<Message variant='danger'>{error}</Message>)
          : (
            
               <Row>
            <Col md={5}>
  
          </Col>
          <Card>
          <Col md= {3}>

                <ListGroup variant='flush'>
            <ListGroup.Item>

              <h3 style={{width:"330px"}}> {etudiant}</h3>

            </ListGroup.Item>

          </ListGroup>
          </Col>
          </Card>


          </Row>

          )
          }


    </div>
  )
}

export default Information
