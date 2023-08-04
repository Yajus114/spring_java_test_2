<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.login-form {
	width: 400 px;
	height: 200 px;
	position: absolute;
	top: 50%;
	left: 50%;
	margin-right: -50%;
	transform: translate(-50%, -50%);
	top: 50%;
	background-color: #5B5EA6;
	border-radius: 20px;
}
</style>
</head>
<body>
	<h2>${errorMsg}</h2>
	<div class="login-form">
		<div class="container-fluid">
			<form method="post">

				<div class="mb-3">
					<!-- <label for="exampleFormControlInput1" class="form-label">Email
						address</label> -->
					<input type="text" name="userid" class="form-control" id="Email"
						placeholder="name@example.com">
				</div>
				<!-- input type="email" -->
				<!-- div class="mb-3"-->
				<div class="row g-3 align-items-center">
					<!-- div class="col-auto">
						<label for="inputPassword6" class="col-form-label">Password</label>
					</div> -->
					<input type="password" name="password" id="password"
						class="form-control mt-3" aria-describedby="passwordHelpInline">
					<div class="col-auto">
						<span id="passwordHelpInline" class="form-text"> Must be
							8-20 characters long. </span>
					</div>
				</div>

				<button class="btn btn-block btn-dark mt-3">Login</button>
			</form>
		</div>
	</div>
</body>
</html>