Feature: Affichage des détails d'un film avec un footballeur principal
	
	User story : Affichage des détails d'un film
	
	En tant qu'utilisateur,
	Je veux pouvoir afficher les détails d'un film,
	Afin de connaître le titre et le footballeur principal associés.

	Critères d'acceptation :

	Le film doit être intitulé "Le Match".
	Le footballeur principal du film doit être "David Beckham".
	Lorsque le film est joué, un message doit être affiché.
	Le message affiché doit inclure le titre du film ("Le Match") et le nom du footballeur principal ("David Beckham").
	
	User story : Affichage des cinémas pour un film
	
	En tant qu'utilisateur,
	Je veux pouvoir afficher les cinémas où le film "Le Match" avec le footballeur principal "David Beckham" est projeté,
	Afin de savoir où je peux le regarder.
	
	Critères d'acceptation :

	Le film doit être intitulé "Le Match".
	Le footballeur principal du film doit être "David Beckham".
	Lorsque le film est joué, une liste de cinémas doit être affichée.
	La liste des cinémas doit être : [A, B, C].	
	
	User story : Affichage des détails d'un film
	En tant qu'utilisateur,
	Je veux pouvoir afficher les détails d'un film spécifique,
	Afin de connaître le titre et le footballeur principal associés à ce film.

	Critères d'acceptation :

	Un film spécifique doit être fourni avec un titre ("<titre>") et un footballeur principal ("<nom>").
	Lorsque ce film est joué, un message doit être affiché.
	Le message affiché doit inclure le titre du film ("<titre>") et le nom du footballeur principal (“<nom>").
	
	User story : 
	Affichage des cinémas pour un film
	En tant qu'utilisateur,
	Je veux pouvoir afficher les cinémas où un film spécifique est projeté,
	Afin de savoir où je peux le regarder.

	Critères d'acceptation :

	Un film spécifique doit être fourni avec un titre ("<titre>") et un footballeur principal ("<nom>").
	Lorsque ce film est joué, une liste de cinémas doit être affichée.
	La liste de cinémas est la suivante : [A, B, C].
	
	User Story : 
	En tant qu'utilisateur, je souhaite pouvoir ajouter un deuxième film à un cinéma spécifique et vérifier que la concurrence des autres films présents dans ce cinéma est mise à jour correctement.
  
  Critères d'acceptation :
  
  Les films "El Grande" et "Le ballon" existent.
	Un cinéma nommé "CinemaAmineRomain" existe.
	Le premier film est diffusé dans ce cinéma.
	Le premier film, "El Grande", a une concurrence initiale de 0.
	Lorsque le deuxième film, "Le ballon", est ajouté au cinéma "CinemaAmineRomain" : La concurrence du film "El Grande" est mise à jour à 1.
	
	User Story : 
	En tant qu'utilisateur, je souhaite pouvoir ajouter un deuxième film à un cinéma spécifique et vérifier que la concurrence des autres films présents dans ce cinéma est mise à jour correctement.
  
  Critères d'acceptation :
  
  Deux films doivent être fourni avec deux titres.
  Un cinéma doit être fourni avec son nom.
	Le premier film est diffusé dans ce cinéma.
	Le premier film a une concurrence initiale de 0.
	Lorsque le deuxième film est ajouté au cinéma : La concurrence du premier film est mise à jour à 1.
  
  Scenario: Affichage des détails d'un film
    Given un film "Le Match" avec un footballeur principal "David Beckham"
    When le film est joué
    Then le message affiché doit inclure "Le Match" et "David Beckham"
  

  Scenario: Affichage des cinémas pour un film
    Given un film "Le Match" avec un footballeur principal "David Beckham"
    When le film est joué
    Then les cinémas suivants sont affichés:
      | A   |
      | B   |
      | C   |
  
  Scenario Outline: Affichage des détails d'un film
    Given un film "<titre>" avec un footballeur principal "<nom>"
    When le film est joué
    Then le message affiché doit inclure "<titre>" et "<nom>"

    Examples:
      | Les rois du foot       | CR7           |
      | El grande    | Messi  |
      

  Scenario Outline: Affichage des cinémas pour un film
    Given un film "<titre>" avec un footballeur principal "<nom>"
    When le film est joué
    Then les cinémas suivants sont affichés:
      | A |
      | B |
      | C |

    Examples:
      | El       |  Messi           |
      | Le Match    | David Beckham |
      
  Scenario: Ajouter un deuxième film au cinéma et vérifier que la concurrence pour l'autre film a été mise à jour.

    Given Deux films "El Grande" et "Le ballon"
    And Un cinéma "CinemaAmineRomain"
    When j'ajoute le deuxième film au cinéma
    Then la concurrence du film 1 est mise à jour
    
  Scenario Outline: Ajouter un deuxième film au cinéma et vérifier que la concurrence pour l'autre film a été mise à jour.

    Given Deux films "<titre1>" et "<titre2>"
    And Un cinéma "<nomCinema>"
    When j'ajoute le deuxième film au cinéma
    Then la concurrence du film 1 est mise à jour

	Examples:
	
    | Amine       |  Romain     | Cinema1       |
    | El Grande    | Le ballon   | Cinema2 |
    | Film A       | Film B      | Cinema3          |
    | Movie One    | Movie Two   | Cinema4          |
  
  