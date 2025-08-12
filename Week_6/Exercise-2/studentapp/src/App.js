import './App.css';
import Home from './Components/Home';
import About from './About';
import Contact from './Contact';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Student Management Portal</h1>
        <Home />
        <About />
        <Contact />
      </header>
    </div>
  );
}

export default App;
