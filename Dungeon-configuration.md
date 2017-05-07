Note that this is an <b>EXAMPLE FILE</b>. You can't just grab it and assume that it works as is.

The name of the dungeon is defined by the name of the file (without the .yml file extension). A dungeon name must be unique and must not equal the name of a map.

<pre><code>#The first floor the players enter. Needs at least lobby, ready, start and floor signs.
startFloor: MyDungeon_floor_01
# The last floor the players enter. Needs at least start and end signs.
endFloor: MyDungeon_floor_12
# A list of all other floors in the dungeon. Needs at least lobby, ready, start and floor signs.
floors:
  - MyDungeon_floor_02
  - MyDungeon_floor_03
  - MyDungeon_floor_04
  - MyDungeon_floor_05
  - MyDungeon_floor_06
  - MyDungeon_floor_07
  - MyDungeon_floor_08
  - MyDungeon_floor_09
  - MyDungeon_floor_10
  - MyDungeon_floor_11

# How many floors shall be selected randomly from the list before the player gets teleported to the endFloor?
floorCount: 7

# If true, the floors will get removed from the list when finished
# sothat one floor cannot be selected multiple times.
removeWhenPlayed: false

# These values override the values of the
# main configuration file default section and the floor configuration files.
overrideValues:
  # Optionally all game rules of a floor config, like:
  keepInventoryOnEnter: true

# These values override the values of the
# main configuration file default section, but get overridwn by the floor configuration values.
defaultValues:
  # Optionally all game rules of a floor config, like:
  keepInventoryOnEnter: true
</code></pre>