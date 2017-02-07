"# gametime" 

gametime
  gametime-api
    com.gametime.common
      interface PlayerService
        Player getPlayer (playerId)
        List<Player> findPlayer (String searchTerm)
        List<Player> getPlayers (Position)
        List<Player> getPlayers (Team)

      interface TeamService
        Team getTeam(teamId)
        List<Team> getAllTeams()
        List<Team> getTeams(Conference)
        List<Team> getTeams(Division)


  gametime-common
    com.gametime.common
      Player
        id
        Person
          name, height, weight,   
        PlayerAttributes
          strength, speed, intelligence
        PlayerSkillSet
          offensive rating, defensive rating

      Coach
        Person
        CoachAttributes
          charisma, inteligence, wisdom
        CoachSkillSet
          offense, defense
      Team
        locale
        logo
        List<Player>
        Coach

      Division
        List<Team>

      Conference
        Division
      

  gametime-service
    getPlayer(id)
      dao.fetchPlayer (id)



  gametime-dao
    Interfaces
      PlayerDAO
        Player getPlayer()
        

  gametime-util
    Utilities
  player-service
  team-service


  Player API

