Abakar Oumar Tidjane junior
ILSEN
# UCE Génie Logiciel Avancé : Techniques de tests
## MesBadges

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/juniorabakar/ceri-m1-techniques-de-test/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/juniorabakar/ceri-m1-techniques-de-test/tree/master)
[![codecov](https://codecov.io/gh/juniorabakar/ceri-m1-techniques-de-test/branch/master/graph/badge.svg?token=UT2KBPTUOI)](https://codecov.io/gh/juniorabakar/ceri-m1-techniques-de-test)


J'ai décidé de créer les implémentations des interfaces dans le même répertoires que les dites interfaces.
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

## Introduction


Vous allez à travers ces projet mettre en application une partie des aspects évoqués en cours vis à vis des techniques de tests.  
Pour cela nous allons réaliser un projet logiciel de petite taille, en suivant la roadmap suivante : 
- Setup du projet
- Mise en place des outils d’intégration continue
- Écriture des tests unitaires
- Écriture des mocks, et validation des tests
- Développement dirigé par les tests
- Documentation et conventions de style
- Test d'une implémentation donnée


Durant cette série de TPs, le gestionnaire de version Git sera utilisé à foison, à travers la plateforme GitHub. Si vous n’êtes pas à l’aise avec cet outil[^1], [voici](http://rogerdudler.github.io/git-guide/) un petit guide à garder sous la main.

## Sujets

L'ensemble des sujets de TPs peut être trouvé dans le dossier `TPs`.

Le dossier `src` contient la définition de l'ensemble des interfaces qui seront l'objet de vos travaux.

## Rendus

Le rendu des TPs se fait au rythme suivant :

- TP1 : 2ème séance
- TP2 : 2ème séance
- TP3 : 3ème séance
- TP4 : 5ème séance
- TP5 : dernière séance
- TP6 : dernière séance

Pour chaque rendu vous devez créer un tag à partir du commit qui correspond à la complétion du TP.  
Si vous ne spécifiez pas de tag, le dernier commit à la date-heure de la fin de séance sera celui considéré.

[^1]: Si vous n’êtes vraiment pas à l’aise avec cet outil nous vous conseillons quand même vivement de vous y mettre.
