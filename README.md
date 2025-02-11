# Consigne

Un enclos doit pouvoir contenir plusieurs animaux. On doit pouvoir lui
demander :

- ajouter et supprimer des animaux d'un enclos
- lui demander la liste des animaux qu'il contient (pas de vides dans la
liste retournée)

Dans le main() créez des animaux divers et variés et ajoutez-les à des
enclos.  
N.B. Pas d'animaux dans plusieurs enclos (ils n'ont pas le don d'ubiquité).

Créez un service avec lequel on devra pouvoir indexer tour à tour chacun des
enclos (donc depuis le main tour à tour les indexer). Ce service devra permettre ensuite de rapidement
(=pas de boucles, la réponse doit être préparée d'avance) répondre aux questions suivantes :

1) le nombre total d'animaux (tous enclos confondus)
2) le nombre total d'animaux d'un certain type (tous enclos confondus)
3) pour un animal spécifique, retrouver rapidement dans quel enclos il se
trouve
4) pour un type d'animal spécifique, retrouver rapidement la liste de tous
les animaux de ce type-là

Dans le main(), affichez chaque enclos et son contenu de manière lisible.

Ensuite, indexez tour à tour chacun des enclos crées et utilisez
ensuite vos 4 méthodes pour vérifier qu'elles fonctionnent correctement.
