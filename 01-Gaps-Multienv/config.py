import os
from dotenv import load_dotenv

# 1. Detectar el entorno desde la variable de sistema 'ENV'. Si no se define, por defecto va a 'qa'
target_env = os.getenv("ENV","qa").lower()

# 2. Construir el nombre del archivo basado en el entorno (ej: env.qa)
BASE_DIR = os.path.dirname(os.path.abspath(__file__))
env_file = os.path.join(BASE_DIR,f".env.{target_env}")

# 3. Cargar el archivo .env específico si existe
if os.path.exists(env_file):
	load_dotenv(dotenv_path=env_file)
elif os.getenv("GITHUB_ACTIONS") == "true":
	print("Corriendo en GitHub Actions")
else:
	raise FileNotFoundError(f"ERROR: El archivo de confguración {env_file} no existe.")

# 4. Exponer las variables de forma estructurada
class Settings:
	BASE_URL = os.getenv("BASE_URL")
	API_TOKEN = os.getenv("API_TOKEN")
	ENVIRONMENT = target_env

settings = Settings()