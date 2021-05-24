import React from 'react';
import vaccineservice from '../services/VaccineServices';
import {Navbar, Nav,Form,FormControl,Button}  from 'react-bootstrap';

class VaccineComponents extends React.Component{

    constructor(props){
        super(props)
        this.state ={
            vaccines:[]
        }
        
    }
    componentDidMount(){
        vaccineservice.getVaccines().then((Response) =>{
            this.setState({vaccines:Response.data})
        });
    }
    render(){
        return(
            <div>
                <Navbar bg="blue" variant="dark">
                  <Navbar.Brand href="#home">COVID-19 VACCINES</Navbar.Brand>
                        <Nav className="mr-auto">
                            <Nav.Link href="#home">Home</Nav.Link>
                            <Nav.Link href="#book">Book a Slot</Nav.Link>
                            <Nav.Link href="#about">About</Nav.Link>
                        </Nav>
                        <Form inline>
                            <FormControl type="text" placeholder="Search" className="mr-sm-2" />
                            <Button variant="outline-info">Search</Button>
                        </Form>
                </Navbar>
                <h1 className = "text-left">Vaccines List</h1>
                <table className = "table table-hover">
                    <thead>
                        <tr>
                            <th>Vaccine ID</th>
                            <th>Vaccine Name</th>
                            <th>Status</th>
                            <th>Number Of Vaccines</th>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            this.state.vaccines.map(
                                vaccine =>
                                <tr key = {vaccine.id}>
                                    <td>{vaccine.id}</td>
                                    <td>{vaccine.vaccinename}</td>
                                    <td>{vaccine.status}</td>
                                    <td>{vaccine.numberofVaccines}</td>
                                </tr>
                            )
                            }
                    </tbody>
                </table>
            </div>
        )
    }
}
export default VaccineComponents