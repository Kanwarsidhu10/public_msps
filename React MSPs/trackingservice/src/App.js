import { useState } from 'react';
import './App.css';

// const Names = (props) => {
//   return (
//     <>
//     <h1>FirstName = {props.FirstName}</h1>
//     <h2>LastName = {props.LastName}</h2>
//     <h2>Age = {props.Age}</h2>
//     </>
//   );
// }

const App = () => {
  
  const [counter,setCounter] = useState(0); 

  return (
    <div className='app'>
      <button onClick={() => setCounter((prev) => prev - 1 )}> click - increment</button>
      <h1>{counter}</h1>
      <button onClick={() => setCounter((prev) => prev + 1 )}> click + increment</button> 
    </div>
  );
}

export default App;
