<p align="center">
  <img src="marvel.png" width="400" height="300">
  <h2 align="center"> "Marvel heroes REST API" </h2>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8%20-red" width="100" height="30"/>
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white"/>
  <img src="https://img.shields.io/badge/Lombok-%20-blue" width="90"/>
</p>



This is training for create a public API where users can request Marvel's heroes data in JSON format.

<p align="center">
  <h3 align="center"> Endpoints </h2>
</p>
<p>

<ul>
  <h3> /api/v1/heroes/ </h3>
  <li>HTTP Requests Supported: GET</li>
  <li>Returns: list of all heroes</li>
  <li>Example Response:</li>
</ul>
 
```json
[   
    {
    "id":1,
    "heroName":"Captain America",
    "realName":"Steven Rogers",
    "hometown":"New York",
    "citizenship":"American",
    "abilities":"Adventurer, federal official, intelligence operative, former soldier"
    },
    {"id":2,
    "heroName":"Hulk",
    "realName":"Dr. Robert Bruce Banner",
    "hometown":"Dayton, Ohio",
    "citizenship":"American",
    "abilities":"Nuclear physicist, former agent of S.H.I.E.L.D., warrior"
    }
]
```

<ul>
  <h3> /api/v1/heroes/5 </h3>
  <li>HTTP Requests Supported: GET</li>
  <li>Returns: getting hero by id</li>
  <li>Example Response:</li>
</ul>
 
```json
{ 
  "id":5,
  "heroName":"Wolverine",
  "realName":"James Howlett",
  "hometown":"Cold Lake, Alberta, Canada",
  "citizenship":"Canadian","abilities":"Mutant, later grafted Adamantium on his skeleton by the Weapon X program"
}
```


