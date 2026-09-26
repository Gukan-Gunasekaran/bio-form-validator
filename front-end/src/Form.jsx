import axios from "axios";

function Form() {
  async function HandleSubmit(e) {
    e.preventDefault();
    const formdata = new FormData(e.target);

    try {
      const response = await axios.post(
        "https://bio-form-validator.onrender.com/api/save",
        formdata,
      );
      console.log(response.data);
    } catch (error) {
      console.error(error);
      alert(error.response.data);
    }
  }

  function handleClear(e) {
    e.target.form.reset();
  }

  return (
    <div className="d-flex justify-content-center align-items-center vh-100">
      <div className="card">
        <h1 className="card-header bg-primary text-light">BioData</h1>
        <div className="card-body">
          <form onSubmit={HandleSubmit}>
            <center></center>
            <label htmlFor="user">User Id:</label>
            <input
              className="form-control form-control-sm w-75"
              type="number"
              id="user"
              max={9999}
              min={999}
              name="uid"
            />
            <br />
            <label htmlFor="img">Img</label>
            <input
              type="file"
              id="img"
              className="form-control form-control-sm w-75 mb-3"
              name="img"
              required
            />
            <label htmlFor="sign">sign.pdf</label>
            <input
              type="file"
              id="sign"
              className="form-control form-control-sm w-75 mb-3"
              name="sign"
              required
            />

            <div className="d-flex justify-content-center">
              <button
                type="button"
                onClick={handleClear}
                className="btn bg-danger text-light me-2 btn-sm"
              >
                clear
              </button>
              <button type="submit" className="btn btn-success btn-sm ">
                Submit
              </button>
            </div>
          </form>
        </div>
      </div>
    </div>
  );
}
export default Form;
