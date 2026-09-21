import { Router, Routes, Route, BrowserRouter } from "react-router-dom";
import Form from "./Form";
import Header from "./Header";

function App() {
  return (
    <div>
      <BrowserRouter>
      <Header/>
        <Routes>
          <Route path="/" element={<Form />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}
export default App;
