Abakar Oumar Tidjane junior
ILSEN classique
# Génie Logiciel Avancé : Techniques de tests
## MesBadges

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/juniorabakar/ceri-m1-techniques-de-test/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/juniorabakar/ceri-m1-techniques-de-test/tree/master)
[![codecov](https://codecov.io/gh/juniorabakar/ceri-m1-techniques-de-test/branch/master/graph/badge.svg?token=UT2KBPTUOI)](https://codecov.io/gh/juniorabakar/ceri-m1-techniques-de-test)
![Checkstyle](https://img.shields.io/badge/dynamic/json?label=checkstyle&query=$.errors&suffix=_errors&url=https://raw.githubusercontent.com/juniorabakar/ceri-m1-techniques-de-test/master/checkstyle_resultats.json&color=success)
[![Javadoc](https://img.shields.io/badge/Javadoc-available-brightgreen.svg)](https://juniorabakar.github.io/ceri-m1-techniques-de-test/) 


### Rapport du TP6
La Team Rocket, en parfaits farfadets malicieux qu'ils sont, a concocté une implémentation de RocketPokemonFactory pour le moins originale.Leur version inclut un Pikachu d'Ash surboosté pour les indices négatifs.Puis, il y a "MISSINGNO", une légende urbaine devenant réalité pour tout indice non mappé(0).Cela souligne un comportement intentionnel pour gérer des cas particuliers ou des easter eggs.L'utilisation de UnmodifiableMap assure que la map ne peut pas être modifiée après son initialisation, renforçant l'immuabilité et la sécurité.Le problème est que non seulement les statistique d'attaque,de défense,d'endurance et d'iv sont complètement aléatoires et la map n'étant pas terminé, je ne pourrais pas avoir des Pokémon comme salamèche en nom.

La méthode generateRandomStat quant à elle génère aléatoirement une statistique pour un Pokémon en utilisant une boucle qui tourne un million de fois, ajoutant 0 ou 1 à chaque itération, puis divise le total par 10000 pour obtenir le résultat final. Cette approche semble inutilement complexe et inefficace pour générer une statistique aléatoire simple, pouvant aussi introduire un biais vers des valeurs moyennes. La création de Pokémon par cette usine dépend fortement de ces statistiques aléatoires, sauf pour les cas spéciaux où l'index est inférieur à 0, conduisant à des statistiques fixes et un IV de 0. Cette implémentation pourrait être améliorée en utilisant une méthode de génération aléatoire plus directe et en définissant clairement le comportement et les valeurs attendues pour différentes gammes d'index.

Pour les tests,je me suis basé sur ces cas directement tirés du cours:

Les partitions de comportement de la méthode testée.

Les conditions limites.

La conformité des données de sortie à un format prédéfini.

L'intervalle, notamment les valeurs limites.

En conclusion, l'implémentation de RocketPokemonFactory par la Team Rocket est créative mais présente des lacunes significatives en termes d'efficacité et de prévisibilité. Bien que l'ajout d'easter eggs comme "MISSINGNO" et un Pikachu surpuissant pour des indices spécifiques puisse ajouter un élément ludique, les méthodes utilisées pour générer des statistiques aléatoires sont inefficaces et introduisent un potentiel biais. Une révision de l'approche de génération de statistiques et une extension de la map pour inclure une gamme plus large de Pokémon amélioreraient significativement la robustesse et l'utilité de cette implémentation.



## Implémentations
## Pokedex
La classe Pokedex agit comme un conteneur pour les Pokémon capturés, offrant des fonctionnalités pour ajouter, lister et accéder aux Pokémon. Nous avons opté pour une ArrayList<Pokemon> pour stocker les Pokémon en raison de sa rapidité d'accès et de sa simplicité d'utilisation. Les méthodes permettent d'obtenir une vue immuable de la liste des Pokémon pour prévenir les modifications non contrôlées.

Voici les quelques choix techniques que j'ai décidé d'implémenter:
-Utilisation de Collections.unmodifiableList pour renvoyer les listes de Pokémon, assurant l'immuabilité des collections exposées.
-Implémentation des interfaces IPokemonMetadataProvider et IPokemonFactory directement dans Pokedex pour simplifier la structure et réduire le nombre de dépendances.

## PokemonFactory
La PokemonFactory fournit une méthode pour créer des instances de Pokemon. Chaque Pokémon est créé avec des paramètres spécifiques, permettant une grande flexibilité dans la génération de Pokémon avec différentes caractéristiques.

Voici les quelques choix techniques que j'ai décidé d'implémenter:
-Instantiation directe des objets Pokemon avec des valeurs passées en paramètre, offrant une méthode simple et directe pour créer des Pokémon.

## PokemonMetadataProvider
PokemonMetadataProvider est responsable de la fourniture de métadonnées pour les différents Pokémon. Les métadonnées sont stockées dans une Map<Integer, PokemonMetadata> où la clé est l'index du Pokémon.

Voici les quelques choix techniques que j'ai décidé d'implémenter:
-Utilisation d'une HashMap pour stocker les métadonnées, permettant un accès rapide aux données par index de Pokémon.
-Initialisation manuelle des métadonnées pour des exemples de Pokémon, suggérant la possibilité d'étendre cette initialisation à partir d'une source de données externe ou d'un fichier.

## PokemonTrainerFactory
PokemonTrainerFactory crée des instances de PokemonTrainer, chacune associée à un Pokedex propre. La factory utilise un IPokedexFactory pour créer le Pokedex associé à chaque entraîneur.

Voici les quelques choix techniques que j'ai décidé d'implémenter:
-Injection de dépendance du IPokedexFactory via le constructeur de PokemonTrainerFactory, favorisant l'inversion de contrôle et rendant la création de PokemonTrainer plus flexible et testable.
-Utilisation du pattern Factory pour encapsuler la création de PokemonTrainer et de son Pokedex, suivant le principe de séparation des préoccupations.

