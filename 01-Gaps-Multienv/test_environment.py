import pytest
from config import settings

def test_verify_environment_routing():
	"""Test para demostrar que el framework apunta 
	al entorno correcto y lee secretos"""

	print(f"\nCorriendo pruebas en el entorno de: {settings.ENVIRONMENT.upper()}")
	print(f"URL Objetivo: {settings.BASE_URL}")
	print(f"Token cargado en memoria: {settings.API_TOKEN[:5]}*****") #No se imprimen secretos completos en logs

	#Aquí iría la aserción real usando settings.BASE_URL
	assert settings.BASE_URL is not None
	assert "token" and "secreto" in settings.API_TOKEN