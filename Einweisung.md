# Installation

## SHADED oder ORIGINAL?
First of all, you should decide which version of DungeonsXL you would like to use. There are two:

### SHADED
* Standard distribution version
* Contains [BRCommons](https://github.com/DRE2N/BRCommons)
* Standalone
* Available at [SpigotMC.org](https://www.spigotmc.org/resources/dungeonsxl.9488) and at the [build server](http://feuerstern.bplaced.net/repo/io/github/dre2n/dungeonsxl)

Use the shaded version if you do not need the benefits of the original version.

### ORIGINAL
* The pure DungeonsXL without any dependencies shaded into the jar
* Requires [BRCommons](https://github.com/DRE2N/BRCommons)
* Available at the [build server](http://feuerstern.bplaced.net/repo/io/github/dre2n/dungeonsxl)

Use the original version if you want to run DungeonsXL with a Minecraft version which is not supported by DungeonsXL or if you use another plugin by DRE2N.

## Addons und verknüpfte Plugins
Even though DungeonsXL is standalone, you will achieve the best experiences if you use some of this plugins:

### [CommandsXL](https://github.com/DRE2N/CommandsXL)
CommandsXL unleashes a lot of the potential of DungeonsXL through the possibility to create command signs that use the CXL API to execute commands.

### [MythicMobs](https://www.spigotmc.org/resources/mythicmobs.5702)
MythicMobs allows you to create much more sophisticated mobs than DungeonsXL is able to provide itself.

### [RPGMe](https://www.spigotmc.org/resources/rpgme.7857)
_Upcoming_

### [BetonQuest](https://www.spigotmc.org/resources/betonquest.2117)
_Upcoming_

### [Factions](https://www.spigotmc.org/resources/factionsone.9249)
_Upcoming_

### Integrationen
Besides that, DungeonsXL integrates with [Vault](http://dev.bukkit.org/bukkit-plugins/vault) to support the permission system of [PermissionsEx](http://dev.bukkit.org/bukkit-plugins/permissionsex) and the economy system of [CraftConomy](https://www.spigotmc.org/resources/craftconomy.2395). Other permission or economy plugins might work if they support Vault, but they are completely unsupported.

# Der erste Dungeon

## Erstellen
_TO DO_

### Welten importieren
Of course, you do not have to build a new map. Just copy any map you want as a DXL map to _DungeonsXL/maps/_; DungeonsXL will find and recognize it.

### Bearbeiten der Map
If you want to work on an existing map, just type in _/dxl edit <map name>_. If a player edits a map, he gets creative mode, the inventory is saved and cleared and all commands are denied unless the player has the permission node _dxl.bypass_. Therefore, a player who is editing a dungeon map is **unable to interact with the main worlds of the server**. This is quite useful if you want to provide a possibility to build in creative mode without the need to grant dangerous permissions.

A player is allowed to edit a map if he has the permission node _dxl.edit_ or if he is explicitely invited to work on a map. To invite a player, run the command /dxl invite <player name> <map>_.

You can always leave a dungeon map (or, precisely: A dungeon player group) with _/dxl leave_. A player who leaves a dungeon gets his old inventory, potion effects, levels, game mode etc. back.

## Die Ebenenkonfiguration aufsetzen
_TO DO_

## Den Dungeon betreten
_TO DO_

### Gruppen aufsetzen
_TO DO_

### Ohne Belohnungen testen
_TO DO_

## FORTGESCHRITTEN: Multi floor dungeons (MFDs)
_TO DO_

### Aufsetzen der Dungeonkonfiguration
_TO DO_

### Ebenen verknüpfen
_TO DO_

## FORTGESCHRITTEN: Spielmodi
_TO DO_

# API
