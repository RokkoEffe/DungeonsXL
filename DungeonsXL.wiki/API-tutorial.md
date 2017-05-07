_Currently very outdated!_

# Introduction
Welcome to the DungeonsXL API tutorial. The API aims to be as powerful and user-friendly as possible. Please submit issues or pull requests if you think that important methods are missing!

_In DungeonsXL 0.11, you'll find many methods without explanation why they are marked as deprecated and without links to supported methods. This is because even though the code has been made a lot more dynamic in 0.10 and 0.11, there is still some work to do. Deprecated methods in DungeonsXL will not stay part of the plugin for legacy reasons. They are still working and in use - the problem is that they are very unlikely to exist or to work the same way in the release version 1.0. This does not mean that methods which are not deprecated are guaranteed to be part of the release, though. Unfortunately, promises are not possible at all, yet._

# Important Objects
This list contains some the most important objects you'll probably have to deal with if you create addons for DungeonsXL.

## DungeonsXL (main class)
DungeonsXL is the main class of the DungeonsXL plugin. It extends [BRPlugin](http://feuerstern.bplaced.net/javadocs/brc/io/github/dre2n/commons/javaplugin/BRPlugin.html) which extends JavaPlugin. Its purpose is to handle things which have to happen when the plugin loads and to initialize and store objects.

## Players
There are some different representations of a player. The _[DPlayers]()_ class handles it.

### [DGlobalPlayer]()
The main representation for all players that are online.

### [DEditPlayer]()
Extends _DGlobalPlayer_.

Represents players who edit a map.

_Currently not in use._

### [DGamePlayer]()
Extends _DGlobalPlayer_.

Represents players who play a dungeon.

_Deprecated: Also represents players who edit a map._

### [DSavePlayer]()
A _DPlayer_ contains a _DSavePlayer_ object.

Represents players saved in the savePlayers.yml file, usually because they are in a dungeon. Therefore, DSavePlayer is a bridge to make a DPlayer persistent.

## [DGroup]()
A collection of _DPlayer_s who are a team in a dungeon.

## [Game]()
Primarily, a _Game_ is a collection of _DGroup_s.

### [GameType]()
A _Game_ also has a _GameType_. GameType is an interface and its implementation is an enum called [GameTypeDefault](). A game type defines some game rules additionally to those configured in the configs. _GameType_s allow admins to easily use a map for different purposes.

### [GameWorld]()
A _GameWorld_ is the representation of a played map. A _GameWorld_ may or may not have a running _Game_.

## Configs
_TO DO_

### [MainConfig]()
_TO DO_

### [DungeonConfig]()
_TO DO_

### [WorldConfig]()
_TO DO_

# Events
DungeonsXL provides a feature-rich event system to allow you to hook into its actions as good as possible.

## DGroup events
_TO DO_

## DMob events
_TO DO_

## DPlayer events
_TO DO_

## DSign events
_TO DO_

## EditWorld events
_TO DO_

## GameWorld events
_TO DO_

## Requirement events
_TO DO_

## Reward events
_TO DO_

## Trigger events
_TO DO_

# Creating custom contents
This topic shows you examples how to create common custom contents with the DXL API.

## Commands
DungeonsXL uses the command API provided by BRCommons. Therefore, creating custom subcommands to /dxl is simple. Just create a new class which extends [BRCommand](http://feuerstern.bplaced.net/javadocs/brc/io/github/dre2n/commons/command/BRCommand.html), like, for example, [this one](../..//blob/master/src/main/java/io/github/dre2n/dungeonsxl/command/EditCommand.java). Then, add this to your onEnable() method in the main class:

```
@Override
public void onEnable() {
    BRCommands dCommands = DungeonsXL.getInstance().getCommands();
    dCommands.addCommand(new MyCommandExtendsBRCommand());
    dCommands.addCommand(new YetAnotherCustomCommand());
}
```

## GameTypes
_GameType_ is an interface sothat you can implement it in a new enum in your addon to add new values. Have a look at the [default implementation](../../blob/master/src/main/java/io/github/dre2n/dungeonsxl/game/GameTypeDefault.java) to see how to do that.

After you created your own implementation of _GameType_, you should add it to the instance of the game type handler class: [GameTypes]().

```
@Override
public void onEnable() {
    GameTypes gameTypes = DungeonsXL.getInstance().getGameTypes();
    for (GameType gameType : MyGameTypeImplementation.values()) {
        gameTypes.addGameType(gameType);
    }
}
```

## GlobalProtections
_TO DO_

## Requirements
_TO DO_

## Rewards
_TO DO_

## DSigns
_TO DO_

## Triggers
_TO DO_