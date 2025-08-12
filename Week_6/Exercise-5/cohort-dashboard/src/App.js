import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohort = {
    name: "React Bootcamp",
    status: "Ongoing",
    startDate: "2025-08-01",
    endDate: "2025-09-15"
  };

  return (
    <div>
      <CohortDetails cohort={cohort} />
    </div>
  );
}

export default App;