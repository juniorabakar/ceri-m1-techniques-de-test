import xml.etree.ElementTree as ET
import sys

def analyse(xml_file_path):
    try:
        tree = ET.parse(xml_file_path)
        root = tree.getroot()

        # Compter le nombre d'erreurs
        error_count = sum(1 for _ in root.iter('error'))

        # Déterminer l'état de succès ou d'échec
        status = 'Success' if error_count == 0 else 'Failure'

        print(f"Checkstyle Status: {status}")
        print(f"Total Errors Found: {error_count}")

        # Ici, vous pourriez écrire le résultat dans un fichier JSON ou prendre d'autres actions
        # Exemple : écrire dans un fichier JSON (optionnel)
        with open('checkstyle_resultats.json', 'w') as f:
            f.write(f'{{"status": "{status}", "errors": {error_count}}}')

    except ET.ParseError as e:
        print("Error parsing XML file:", e)
        sys.exit(1)
    except Exception as e:
        print("An error occurred:", e)
        sys.exit(1)

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Utilisation attendue: python Analyseur_checkstyle.py <Chemin vers le rapport>")
        sys.exit(1)

    xml_file_path = sys.argv[1]
    analyse(xml_file_path)
