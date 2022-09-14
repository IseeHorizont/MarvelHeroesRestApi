<p align="center">
  <img src="marvel.png" width="400" height="300">
  <h1 align="center"> "Marvel heroes REST API" </h1>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8%20-red" width="100" height="30"/>
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white"/>
  <img src="https://img.shields.io/badge/Lombok-%20-blue" width="90"/>
</p>



<h2>This is my result of training to create a public REST API where users can request Marvel's heroes data in JSON format</h2>

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

<ul>
  <h3> /api/v1/heroes/ </h3>
  <li>HTTP Requests Supported: POST</li>
  <li>Returns: save new hero</li>
  <li>Request body like:</li>
</ul>

```json
{
  "heroName":"Iron Man",
  "realName":"Tony Stark",
  "hometown":"New York",
  "citizenship":"American","abilities":"Mechanical Engineer, adventurer, inventor, industrialist, founder of the Maria Stark Foundation"
}
```

<ul>
  <h3> /api/v1/heroes/ </h3>
  <li>HTTP Requests Supported: PUT</li>
  <li>Returns: update hero's data </li>
  <li>Request body with json-object</li>
</ul>

<ul>
  <h3> /api/v1/heroes/1 </h3>
  <li>HTTP Requests Supported: DELETE</li>
  <li>Returns: remove hero by its id </li>
</ul>
