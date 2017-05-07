_DungeonsXL_ is, after all, a relatively complex plugin. In order to understand it, you should go on step by step, try out the features you're interested in and get a feeling for them.

First of all, you might want to check out the [soft dependencies](plugin-integration) of DXL. Even though DungeonsXL is a standalone plugin and will work perfectly fine without anything else, specialized plugins may be useful additions.

Especially if you're using Minecraft 1.7.x or 1.8.x, you should read the [legacy support page](legacy-support) to avoid confusion as some features might not work with old versions.

# The first dungeon
## Creation
First of all, you should create a first dungeon map to start.

The command _/dxl create {map name}_ will create a new flat world where you can build the structures you desire to be inside your dungeon. The player who created the new map will instantly be teleported to the map spawn.

You can always leave a dungeon map (or, precisely: A dungeon player group) with _/dxl leave_. A player who leaves a dungeon gets his old inventory, potion effects, levels, game mode etc. back.

### Importing maps
Of course, you do not have to build a new map. Just copy any map you want as a DXL map to _DungeonsXL/maps/_; DungeonsXL will find and recognize it.

_Beta 0.14 and higher:_

You can also easily import a map from the world container of the server (the world container of CraftBukkit is the main directory) with _/dxl import {map name}_.

### Editing the map
If you want to work on an existing map, just type in _/dxl edit {map name}_. You can see a list of all existing maps with _/dxl list_. If a player edits a map, he gets creative mode, the inventory is saved and cleared and all commands are denied unless the player has the permission node _dxl.bypass_. Therefore, a player who is editing a dungeon map is **unable to interact with the main worlds of the server**. This is quite useful if you want to provide a possibility to build in creative mode without the need to grant dangerous permissions.

Block structures are not the only thing to prepare in the edit mode. You can also setup the details of the game experience, like where the players spawn, checkpoints, enemy spawn points and so on. This can be done with signs with special codes. The signs will disappear when players play the game, though, so you do not have to worry about hiding them. A list of all sign codes is available [here](signs).

A player is allowed to edit a map if he has the permission node _dxl.edit_ or if he is explicitely invited to work on a map. To invite a player, run the command _/dxl invite {player name} {map}_.

## Setting up the details of the game
### Signs

![Sign concept](http://feuerstern.bplaced.net/ressourcen/DXLSigns/SignConcept.png)

If you have built a map, you will probably want to add some game mechanics like defining spawn points of the players, NPC enemies and maybe the position of the end of the dungeon. Things like that can be done with edit signs.

The concept of edit signs is quite simple if you get used to using them: Their goal is to define:

**...what happens...**

The first line of the sign defines the type of the sign. The second and the third line contain information to handle the details of "what happens". A list of all signs is available [here](signs#edit-signs).

**...where...**

The position where you place the sign is the position where the actions defined by the sign will happen.

**...under which circumstances.**

The fourth line of each sign (except some exceptions ;) ) contains one or more triggers. A trigger is a condition which must be fulfilled before the action defined in the first lines happens. Common examples are distance triggers that trigger their sign if a player walks more or less close to it or mob triggers that require PvE kills. A list of all triggers is available [here](signs#triggers).

## Entering the dungeon
A dungeon can be entered through multiple different ways. The principle is always the same, though:

1. The players setup a group. This may be skipped if one player wants to play the dungeon alone.
2. Multiple groups form a game. This may be skipped if one group wants to play the dungeon without competition.
3. The group(s) enter the dungeon lobby.
4. There, they choose a class and their equipment. If this is done, they enter the actual game area.
5. The game starts.

### Sign and portal
Players can setup their groups with a [group](signs#group) sign in one of the main worlds. Group leaders may use the [game] sign to add their groups to a game with multiple groups. You should also add a [leave](signs#leave) sign, just in case that a player doesn't know the _dxl leave_ command or for reasons of comfort.

The portal does not need any link to the dungeon as this is defined by the signs; just create it with _/dxl portal_ and DungeonsXL will handle the rest.

A correct sign / portal setup should look similar to this:

![Enter with a portal](http://feuerstern.bplaced.net/ressourcen/DXLSigns/EnterPortal.png)

### Command
A game can also be started with the _/dxl play_ command. This is the easiest way to test your dungeons. Groups can be set up with the _/dxl group_ command. Make sure to give players the correct permissions if you want to use this feature - by default, they are disabled.

### Announcer
A global announcer repeatingly continually invites all players or all players who are on a specific map to join a game. Read more [here](scripts#announcements) for details.

### Testing without reward
You can test a dungeon without rewards by using the test game type. A test game can be started with _/dxl test_ while the command sender is in a dungeon lobby.

## ADVANCED: Multi floor dungeons (MFDs)
Creating one is as simple as creating a dungeon configuration. You can then join an MFD with /dxl play d [dungeon] or with a group sign with the + attribute.

## ADVANCED: Game types
_TO DO_

# API