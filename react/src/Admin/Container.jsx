import React from 'react'

function Container(props) {
  return (
    <div className="main-container">
      <img
        src="https://admin.skavacommerce.com/admin/studio/customlib/img/loginBanner.jpg"
        alt=" Business related photo"
        className="business-picture"
      />
      <div className="form-wrapper">
        <h1 className="form-title">Sign In</h1>
        <form className="form-signin">
          <div icontype="mail" className="form-fields">
            <label className="form-label" htmlFor="maillabel">
              Your Email
            </label>
            <input type="text" id="maillabel" name="maillabel" />
          </div>
          <div icontype="lock" className="form-fields">
            <label className="form-label" htmlFor="passowrdlabel">
              Your Password
            </label>
            <input type="password" id="passowrdlabel" name="passowrdlabel" />
          </div>
          <div className="button-group">
            <div className="loggedin-wrapper">
              <div className="form-checkbox">
                <input defaultChecked type="checkbox" id="loggedin-checked" />
                <label
                  className="checkbox-support"
                  htmlFor="loggedin-checked"
                />
              </div>
              <label className="loggedin-label" htmlFor="loggedin-checked">
                Keep me logged in
              </label>
            </div>
            <button className="form-button">submit</button>
          </div>
          <a
            href="#"
            className="form-forgot-password"
            aria-label="get reset password"
          >
            Forgot Password?
          </a>
        </form>
      </div>
    </div>
  )
}

export { Container }
export default Container
