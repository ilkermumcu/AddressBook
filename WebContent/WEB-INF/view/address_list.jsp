<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		
	</div>
	</nav>
	<br>
		<div class="container">
			<div class="jumbotron jumbotron-fluid">
				<div class="container">
					<h1 class="display-4">Adressliste</h1>
					<hr class="my-4">
						<p class="lead">MT-AG Interview Beispiel Projekt</p>
						<p class="lead">Ilker Mumcu</p>
				</div>
			</div>

			<div>
				<table class="table table-striped">
					<tr>
					    <th>Vorname</th>
						<th>Nachname</th>
						<th>Beruf</th>
						<th>E-Mail</th>
						<th>Telefon</th>
						<th>Mobil</th>
						<th>Adresse</th>
						<th>Löschen</th>
						

					</tr>

					<c:forEach var="tempAddresses" items="${addresses}">
						<tr>
							
								
								  <td>${tempAddresses.contacts.firstName}</td>
								  <td>${tempAddresses.contacts.lastName}</td>
								  <td>${tempAddresses.contacts.profession}</td>
								  <td>${tempAddresses.contacts.email}</td>
								   <td>${tempAddresses.contacts.homePhone}</td>
								    <td>${tempAddresses.contacts.mobile}</td>
								   <td>${tempAddresses.address}</td>
							    
							 <td><a class ="btn btn-danger" href="${pageContext.request.contextPath }/addresses/deleteAddress?addressId=${tempAddresses.id}"
							    onclick="if(!(confirm('Möchten Sie diese Adresse wirklich löschen?')))return false;">Löschen</a></td>
							
						</tr>
					</c:forEach>
				</table>
			</div>
			<p>
					<a href="${pageContext.request.contextPath }/contacts/list">Zurück
						Kontakte</a>

				</p>
		</div>
</body>
</html>