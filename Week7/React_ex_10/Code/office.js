import React from 'react';

const office = {
  Name: "DBS",
  Rent: 50000,
  Address: "Chennai",
  img: "https://tse3.mm.bing.net/th/id/OIP.gbcEko10Nql-6Hfg6Sc57wHaE8?r=0&w=1024&h=683&rs=1&pid=ImgDetMain&o=7&rm=3"
};

function Office() {
  const rentColor = {
    color: office.Rent <= 60000 ? 'red' : 'green'
  };

  return (
    <div style={{ textAlign: 'center', fontFamily: 'Arial' }}>
      <h1>Office Space , at Affordable Range</h1>


      <img
        src={office.img}
        width="25%"
        height="25%"
        alt="Office Space"
        style={{ margin: '20px 0' }}
      />

      <h2>Name: {office.Name}</h2>
      <h3 style={rentColor}>Rent: Rs. {office.Rent}</h3>
      <h3>Address: {office.Address}</h3>
    </div>
  );
}

export default Office;
