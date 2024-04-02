import '../styles/signIn.css';
import React, { useState } from 'react';
import Properties from '../database/Properties.json';



export default function(props){


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

        fetch("http://localhost:8000/buyers", {
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
        <form id="form1">
            <fieldset className="wrapper-sign-in">
                
                    <legend className="sign-in-title">Sign in</legend>
                    <br></br>
                    <b className='sign-in-labels'>Email or Username</b>
                    <input className='sign-in-fields' type='text'  name='email'  required="required"></input>
                    <br/>
                    
                    <b className='sign-in-labels'>Password</b>
                    <input className='sign-in-fields' type='password' name='lastName' required="required"></input>
                    <br />
                    <button className='submit-sign-in' type="submit" form="form1">Sign in</button>
                
            </fieldset>
        </form>
    );
};