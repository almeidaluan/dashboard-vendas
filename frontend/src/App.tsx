import DataTable from 'components/DataTable';
import Footer from 'components/Footer';
import NavBar from 'components/Navbar';
import React from 'react';

function App() {
  return (

    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Hello World</h1>
      </div>
      <DataTable />
      <Footer />
    </>


  );
}

export default App;
