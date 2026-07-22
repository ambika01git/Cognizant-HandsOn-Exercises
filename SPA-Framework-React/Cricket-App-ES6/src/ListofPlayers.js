import React from "react";

export function ListofPlayers({ players }) {
  return (
    <div>
      {players.map((item, index) => (
        <li key={index}>
          Mr. {item.name} <span>{item.score}</span>
        </li>
      ))}
    </div>
  );
}

export function Scorebelow70({ players }) {
  return (
    <div>
      {players
        .filter((item) => item.score <= 70)
        .map((item, index) => (
          <li key={index}>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        ))}
    </div>
  );
}