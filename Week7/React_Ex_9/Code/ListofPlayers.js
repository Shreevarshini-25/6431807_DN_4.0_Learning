import React from 'react';

const players = [
  { name: 'Virat', score: 85 },
  { name: 'Rohit', score: 65 },
  { name: 'Gill', score: 78 },
  { name: 'Rahul', score: 60 },
  { name: 'Hardik', score: 90 },
  { name: 'Jadeja', score: 55 },
  { name: 'Shami', score: 45 },
  { name: 'Bumrah', score: 75 },
  { name: 'Kuldeep', score: 50 },
  { name: 'Siraj', score: 69 },
  { name: 'Ashwin', score: 80 }
];

const filteredPlayers = players.filter(player => player.score <= 70);

function ListofPlayers() {
  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>Score: {item.score}</span>
          </li>
        ))}
      </ul>

      <h2>Players with Score ≤ 70</h2>
      <ul>
        {filteredPlayers.map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>Score: {item.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
