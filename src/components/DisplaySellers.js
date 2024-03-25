import { React, useState, useEffect } from 'react';
import '../styles/displayUsers.css';
import data from '../database/Properties.json';

const DisplaySellers = (props) => {
    const [userData, setUserData] = useState([]);

    // Checking which page we are on to display either buyer or seller

    let display;

    if (props.user == "Seller") {
        display = data.sellers;
    }

    else if (props.user == "Buyer") {
        useEffect(() => {
               const fetchData = async () => {
                   try {
                       const response = await fetch('http://localhost:8080/buyers');
                       if (!response.ok) {
                           throw new Error('Failed to fetch data');
                       }
                       const jsonData = await response.json();
                       console.log(jsonData);
                       setUserData(jsonData);
                   } catch (error) {
                       console.error('Error fetching data:', error);
                   }
               };

               fetchData();
        }, []);
    }


    return (
        <div className="total">
            
            <h1>Find A {props.user}</h1>
            <br />

            <div className = "scroll">
                <table  name="sellerData">
                    <thead>
                        <tr className='headingHover'>
                            {/* <th>{props.user}: </th> */}
                            <th>Forename </th>
                            <th>Surname </th>
                            <th className='smallScreen' >Email </th>
                        </tr>
                    </thead>
                    <tbody>
                        {userData.map((details) => {
                            return (
                                <tr key={details.id}>
                                    <td>{details.first_name}</td>
                                    <td>{details.last_name}</td>
                                    <td className='smallScreen'>{details.email}</td>
                                </tr>
                            )
                        })}
                    </tbody>
                </table>
            </div>
            
        </div>
    );
}

export default DisplaySellers;