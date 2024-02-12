import '../styles/form.css';
import React, { useState } from 'react';
import Properties from '../database/Properties.json';



export default function(props){

    // setting functions to store data inputted in form

    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [telephone, setTelephone] = useState("");

    function handleSubmit(event){
        event.preventDefault();

        
        // Gathering length of buyers data to populate ID number
        let buyerslist = Properties.buyers;
        let buyerlength = buyerslist.length;
        let id = buyerlength + 1;
        

        // Create the object from the form input data

        let dataItem = {
            ID: id,
            firstName: firstName,
            lastName: lastName,
            email: email,
            telephone: telephone
        }

        // sending new buyer details to be stored in database

        fetch("http://localhost:3000/buyers", {
        method: "post",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(dataItem)
        })
    }

    return (
        // creating actual form
        <form id="form1" onSubmit={(event) => {handleSubmit(event)}}>
            <fieldset className="wrapper">
                <legend className="title">Register As A New Buyer</legend>

                <b>First Name</b>
                <input type='text' value={firstName} name='firstName' onChange={(event => setFirstName(event.target.value))} required="required"></input>
                <br/>
                
                <b>Last Name</b>
                <input type='text' name='lastName' value={lastName} onChange={(event => setLastName(event.target.value))} required="required"></input>
                <br />

                <b>Email</b>
                <input type='email' name='email' value={email} onChange={(event => setEmail(event.target.value))} required="required"></input>
                <br />

                <b>Telephone</b>
                <input type='text' name='telephone' value={telephone} onChange={(event => setTelephone(event.target.value))} required="required"></input>
                <br />

                <button type="submit" form="form1">Save</button>

            </fieldset>
        </form>
    );
};


