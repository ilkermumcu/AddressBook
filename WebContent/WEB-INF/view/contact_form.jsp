<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
	<title>Adressbuch</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar navbar-dark bg-primary">
	<a class="navbar-brand" href="#">Adressbuch</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
		<div class="navbar-nav">
			<a class="nav-item nav-link active"
				href="${pageContext.request.contextPath}/contacts/list">Dashboard
				<span class="sr-only">(current)</span>
			</a> <a class="nav-item nav-link"
				onclick="window.location.href='showContactsForm'; return false;"
				type="" button role="button" href="#">Neues Kontakt</a>

		</div>
	</div>
	</nav>
	<br>
		<div class="container">
			<div class="jumbotron jumbotron-fluid">
				<div class="container">
					<h1 class="display-4">Neue Kontakt</h1>
					<hr class="my-4">
						<p class="lead">MT-AG Interview Beispiel Projekt</p>
						<p class="lead">Ilker Mumcu</p>
				</div>
			</div>

			<div>
				<form:form class="form-horizantal" modelAttribute="contacts"
					action="saveContact" method="POST">
					<form:hidden path="id" />
					<div class="form-group">
						<label for="firstName" class="col-sm-10 control-label">Vorname</label>
						<div>
							<form:input type="text" class="form-control" id="firstName"
								placeholder="Vorname" path="firstName"></form:input>
						</div>
					</div>

					<div class="form-group">
						<label for="lastName" class="col-sm-10 control-label">Nachname</label>
						<div>
							<form:input type="text" class="form-control" id="lastName"
								placeholder="Nachname" path="lastName"></form:input>
						</div>
					</div>

					<div class="form-group">
						<label for="profession" class="col-sm-10 control-label">Beruf</label>
						<div>
							<form:input type="text" class="form-control" id="profession"
								placeholder="Beruf" path="profession"></form:input>
						</div>
					</div>

					<div class="form-group">
						<label for="email" class="col-sm-10 control-label">Email</label>
						<div>
							<form:input type="text" class="form-control" id="email"
								placeholder="Email" path="email"></form:input>
						</div>
					</div>


					<div class="form-group">
						<div class="col-sm-10">
							<button type="submit" class="btn btn-primary">Speichern</button>
						</div>
					</div>
				</form:form>
			</div>

			<br>
				<p>
					<a href="${pageContext.request.contextPath }/contacts/list">Zurück
						Kontakte</a>

				</p>
		</div>
</body>
</html>