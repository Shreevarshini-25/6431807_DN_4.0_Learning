import React from 'react';

const T20Players = ['Virat', 'Rohit', 'Gill', 'Hardik', 'Pant', 'Jadeja'];
const RanjiTrophyPlayers = ['Pujara', 'Iyer', 'Rahane', 'Sundar', 'Saha', 'Ashwin'];

const AllIndianPlayers = [...T20Players, ...RanjiTrophyPlayers];


const [p1,, p3,, p5,, p7,, p9,, p11] = AllIndianPlayers;
const [ ,p2,, p4,, p6,, p8,, p10,, p12] = AllIndianPlayers;

function IndianPlayers() {
  return (
    <div>
      <h2>All Indian Players</h2>
      <ul>
        {AllIndianPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Odd Team</h2>
      <ul>
        <li>{p1}</li>
        <li>{p3}</li>
        <li>{p5}</li>
        <li>{p7}</li>
        <li>{p9}</li>
        <li>{p11}</li>
      </ul>

      <h2>Even Team</h2>
      <ul>
        <li>{p2}</li>
        <li>{p4}</li>
        <li>{p6}</li>
        <li>{p8}</li>
        <li>{p10}</li>
        <li>{p12}</li>
      </ul>
    </div>
  );
}

export default IndianPlayers;
