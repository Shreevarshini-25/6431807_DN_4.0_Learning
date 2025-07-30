import './App.css';
import Posts from './Posts';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Blog Application</h1>
      </header>
      <main style={{ padding: '20px' }}>
        <Posts />
      </main>
    </div>
  );
}

export default App;
