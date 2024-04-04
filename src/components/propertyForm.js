//import { React } from 'react';
//import { useState } from 'react';
//import Properties from '../database/Properties.json';
//import '../styles/form.css';
//
//
//export default () => {
//
//    let [firstLine, setFirstLine] = useState("");
//    let [description, setDescription] = useState("");
//    let [city, setCity] = useState();
//    let [postCode, setPostCode] = useState();
//    let [bathroom, setBathroom] = useState();
//    let [bedroom, setBedroom] = useState();
//    let [garden, setGarden] = useState();
//    let [price, setPrice] = useState();
//    let [type, setType] = useState();
//
//    function onSubmit() {
//
//        const options = {
//            timeZone : "Europe/London",
//            weekday: "long",
//            year: "numeric",
//            month: "long",
//            day: "numeric",
//            hour: "numeric",
//            minute: "numeric",
//            second: "numeric"
//          }
//
//        let timeUploaded = new Date();
//        timeUploaded = timeUploaded.toLocaleString('en-GB', options)
//
//
//        let propertyLength = Properties.properties.length + 1
//        let properties = {
//            property_id: propertyLength,
//            "address": {
//                "firstLine": firstLine,
//                "city": city,
//                "postcode": postCode
//            },
//            "img": {
//                "thumbnail": "",
//                "img3": "",
//                "img4": "",
//                "img2": "",
//                "img5": "",
//                "img6": "",
//                "img7": "",
//                "img8": "",
//                "img9": ""
//            },
//            "description": description,
//            "price": price,
//            "type": type,
//            "bedrooms": bedroom,
//            "bathrooms": bathroom,
//            "garden": garden,
//            "timeUploaded": timeUploaded
//        }
//
//        postData('http://localhost:8000/properties', properties);
//    }
//
//    // Function to be called for posting data to the json DB, takes paraments url and data (object)
//    async function postData(url = '', data = {}) {
//        const response = await fetch(url, {
//            method: 'POST',
//            headers: {
//                'Content-Type': 'application/json'
//            },
//            body: JSON.stringify(data)
//        })
//        return response.json()
//    }
//
//    return (
//
//
//            <form id="form1" onSubmit={onSubmit}>
//                <fieldset className='wrapper'>
//                    <legend className='title'>Register Property</legend>
//                    <p>Address: </p>
//                    <b className='labels'>First Line: </b>
//                    <br />
//                    <input className="fields" type="text" placeholder="First line of address" required onChange={event => setFirstLine(event.target.value)} name="firstLine" value={firstLine} />
//                    <br></br>
//
//                    <b className='labels'>City:</b>
//                    <br />
//                    <input className="fields" placeholder="Enter City" required name="city" onChange={event => setCity(event.target.value)} value={city} />
//                    <br></br>
//
//                    <b className='labels'>Postcode:</b>
//                    <br />
//                    <input className="fields" placeholder="Enter a valid Postcode" required name="postcode" onChange={event => setPostCode(event.target.value)} value={postCode} />
//                    <br></br>
//                    <br />
//
//                    <b className='labels'>Price: </b>
//                    <br/>
//                    <input className="fields" required placeholder="Enter property price" onChange={event => setPrice(event.target.value)} value={price} />
//                    <br></br>
//
//                    <b className='labels'>Description: </b>
//                    <br />
//                    <input className="fields" placeholder="Enter a description" type="text" name="description" onClick={event => setDescription(event.target.value)}/>
//                    <br></br>
//
//
//                    <b className='labels'>Type: </b>
//                    <input className="fields" required placeholder="Property type" type="search" list="typeList" onChange={event => setType(event.target.value)} value={type} />*
//                    <datalist id="typeList">
//                        <option>Detachted</option>
//                        <option>Semi-detached</option>
//                        <otion>Terrace</otion>
//                        <option>Flat</option>
//                        <option>Bungalow</option>
//                    </datalist>
//                    <br></br>
//
//                    <b className='labels'>Bedrooms: </b>
//                    <input className="fields" placeholder="Enter No of bedrooms" required name="bedrooms" onChange={event => setBedroom(event.target.value)} value={bedroom} />
//                    <br></br>
//
//                    <b className='labels'>Bathrooms: </b>
//                    <br />
//                    <input className="fields" placeholder="Enter No of bathrooms" required name="bathrooms" onChange={event => setBathroom(event.target.value)} value={bathroom} />
//                    <br></br>
//
//                    <b className='labels'>Garden: </b>
//                    <br />
//                    <input className="fields" type="checkbox" name="garden" onClick={event => setGarden(event.target.checked)} />
//                    <br></br>
//
//                    <button type="submit">Register</button>
//                    <br />
//                </fieldset>
//            </form>
//
//    )
//}



import { React } from 'react';
import { useState } from 'react';
import Properties from '../database/Properties.json';
import '../styles/form.css';
import axios from "axios";


export default () => {

    let [address, setAddress] = useState("");
    let [description, setDescription] = useState("");
    let [postCode, setPostCode] = useState("");
    let [bathroom, setBathroom] = useState();
    let [bedroom, setBedroom] = useState();
    let [garden, setGarden] = useState();
    let [price, setPrice] = useState();
    let [type, setType] = useState();
    let [thumbnail, setThumbnail] = useState();
    let [img2, setImg2] = useState();
    let [img3, setImg3] = useState();
    let [img4, setImg4] = useState();
    let [img5, setImg5] = useState();
    let [img6, setImg6] = useState();
    let [img7, setImg7] = useState();
    let [img8, setImg8] = useState();
    let [img9, setImg9] = useState();
    let [status, setStatus] = useState();

    function handleSubmit(event){
        event.preventDefault();

//        console.log(event.target.status.value);
//        const aStatus = event.target.status.value;
//        setStatus(aStatus);

//        const options = {
//            timeZone : "Europe/London",
//            weekday: "long",
//            year: "numeric",
//            month: "long",
//            day: "numeric",
//            hour: "numeric",
//            minute: "numeric",
//            second: "numeric"
//          }
//
//        let timeUploaded = new Date();
//        timeUploaded = timeUploaded.toLocaleString('en-GB', options)


        let propertieslist = Properties.properties;
        let propertieslength = propertieslist.length;
        let id = propertieslength + 1;

        const intPrice = parseInt(event.target.price.value);
        console.log(typeof(intPrice));

        let propertyDataItem = {
            ID: id,
            address: address,
            postcode: postCode,
            thumbnail: thumbnail,
            img2: img2,
            img3: img3,
            img4: img4,
            img5: img5,
            img6: img6,
            img7: img7,
            img8: img8,
            img9: img9,
            description: description,
            price: intPrice,
            type: event.target.type.value,
            status: event.target.status.value,
            bedrooms: bedroom,
            bathrooms: bathroom,
            garden: garden
        }
        console.log(propertyDataItem);

        fetch("http://localhost:8080/create-property", {
            method: "post",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(propertyDataItem)
            })

//        axios.post("http://localhost:8080/create-property",
//        {
//                    ID: id,
//                    address: address,
//                    postcode: postCode,
//                    thumbnail: thumbnail,
//                    img2: img2,
//                    img3: img3,
//                    img4: img4,
//                    img5: img5,
//                    img6: img6,
//                    img7: img7,
//                    img8: img8,
//                    img9: img9,
//                    description: description,
//                    price: intPrice,
//                    type: event.target.type.value,
//                    status: event.target.status.value,
//                    bedrooms: bedroom,
//                    bathrooms: bathroom,
//                    garden: garden
//                }
//        )

    }



    return (
        
            
            <form id="form1" onSubmit={(event) => {handleSubmit(event)}}>
                <fieldset className='wrapper'>
                    <legend className='title'>Register Property</legend>
                    <br/>
                    <br/>


                    <b className='labels'>Address: </b>
                    <br />
                    <input className="fields" type="text" placeholder="First line of address" required onChange={event => setAddress(event.target.value)} name="address" value={address} />
                    <br></br>



                    <b className='labels'>Postcode:</b>
                    <br />
                    <input className="fields" placeholder="Enter a valid Postcode" required name="postcode" onChange={event => setPostCode(event.target.value)} value={postCode} />
                    <br></br>

                    <b className='labels'>Price: </b>
                    <br/>
                    <input className="fields" type='text' required placeholder="Enter property price" name='price'  />
                    <br></br>

                    <b className='labels'>Description: </b>
                    <br />
                    <input className="fields" placeholder="Enter a description" required type="text" name="description" onChange={event => setDescription(event.target.value)} />
                    <br></br>


                    <b className='labels'>Type: </b>
                    <br/>
                    <select className="fields" name='type' required placeholder="Property type" >
                        <option>DETACHED</option>
                        <option>SEMI</option>
                        <option>APARTMENT</option>
                    </select>
                    <br></br>

                    <b className='labels'>Status:</b>
                    <select className="fields" required name='status' placeholder="Property status"  >
                    }

                        <option>FORSALE</option>
                        <option>SOLD</option>
                        <option>WITHDRAWN</option>
                    </select>

                    <datalist id="typeList">

                    </datalist>
                    <br></br>

                    <b className='labels'>Bedrooms: </b>
                    <br/>

                    <input className="fields" type='text' placeholder="Enter No of bedrooms" required name="bedrooms" onChange={event => setBedroom(event.target.value)} value={bedroom} />
                    <br></br>

                    <b className='labels'>Bathrooms: </b>
                    <br />
                    <input className="fields" type='text' placeholder="Enter No of bathrooms" required name="bathrooms" onChange={event => setBathroom(event.target.value)} value={bathroom} />
                    <br></br>

                    <b className='labels'>Garden: &nbsp; <input className="fields" type="checkbox" name="garden" onClick={event => setGarden(event.target.checked)} /></b>

                    <br></br>
                    <br/>

                    <b className='labels' ><span>Thumbnail Image: </span><input className="fields" placeholder=""  name=""  value={thumbnail} type='file' /></b>

                    <br></br>

                    <b className='labels' ><span>Image 2: </span><input className="fields" placeholder=""  name=""  value={img2} type='file'/></b>
                    <br></br>

                    <b className='labels'>Image 3: <input className="fields" placeholder=""  name=""  value={img3} type='file'/></b>
                    <br></br>

                    <b className='labels'>Image 4: <input className="fields" placeholder=""  name=""  value={img4} type='file'/></b>
                    <br></br>

                    <b className='labels'>Image 5: <input className="fields" placeholder=""  name=""  value={img5} type='file'/></b>
                    <br></br>

                    <b className='labels'>Image 6: <input className="fields" placeholder=""  name=""  value={img6} type='file'/></b>
                    <br></br>

                    <b className='labels'>Image 7: <input className="fields" placeholder=""  name=""  value={img7} type='file'/></b>
                    <br></br>

                    <b className='labels'>Image 8: <input className="fields" placeholder=""  name=""  value={img8} type='file'/></b>
                    <br></br>

                    <b className='labels'>Image 9: <input className="fields" placeholder=""  name=""  value={img9} type='file'/></b>
                    <br></br>


                    <button className = 'submit' type="submit" form='form1'><b>Register</b></button>
                    <br />
                </fieldset>
            </form>

    )
}