
***

1. [Global signs](#global-signs)
  * 1. [Group](#group)
  * 2. [Leave](#leave)
  * 3. [Game](#game)

2. [Edit signs](#edit-signs)
  * 1. [Lobby](#lobby)
  * 2. [Ready](#ready)
  * 3. [Leave](#leave-1)
  * 4. [Start](#start)
  * 5. [Floor](#floor)
  * 6. [Classes](#classes)
  * 7. [Command](#command)
  * 8. [Mob](#mob)
  * 9. [ExternalMob](#externalmob)
  * 10. [Message](#message)
  * 11. [Place](#place)
  * 12. [Checkpoint](#checkpoint)
  * 13. [Chest](#chest)
  * 14. [Trigger](#trigger)
  * 15. [Redstone](#redstone)
  * 16. [Block](#block)
  * 17. [Interact](#interact)
  * 18. [Wave](#wave)
  * 19. [Hologram](#hologram)
  * 20. [Drop](#drop)
  * 21. [Lives modifier](#lives-modifier)
  * 22. [Open door](#open-door)
  * 23. [Script](#script)
  * 24. [Teleport](#teleport)
  * 25. [Resource pack](#resource-pack)
  * 26. [BossShop](#bossshop)
  * 27. [Bed](#bed)
  * 28. [Flag](#flag)
  * 29. [Sound message](#sound-message)
  * 30. [Action bar](#action-bar)
  * 31. [Title](#title)

3. [Triggers](#triggers)
  * 1. [Distance](#distance)
  * 2. [Redstone](#redstone)
  * 3. [Trigger](#trigger-sign)
  * 4. [Interact](#interact)
  * 5. [Use item](#use-item)
  * 6. [Mob death](#mob-death)
  * 7. [Wave](#wave-1)
  * 8. [Progress](#progress)

***


## Global signs
DungeonsXL offers signs which can be placed in the main world of your server to allow players to team up in parties, sothat they can loot the dungeon.

***

### Group
You can create a group sign with this lines:

![[DXL] / Group / TEST / 1,3](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Group.png)

The third line equals the name of the dungeon or, if only one floor shall be played, of the map. The last line defines the amount of groups that can play parallelly and the amount of players in one group. The "+" is not necessary anymore as of DungeonsXL 0.15.3.

***

### Leave
You should also add a leave sign as an alternative for the command.

![[DXL] / Leave](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Leave.png)

***

### Game

![[DXL] / Game / TEST / 1,3,+](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Game.png)

A game sign works just like the group sign with the difference that it stores a collection of groups instead of a collection of players. Use a game sign if you want to create an instance for multiple groups. Players have to be the captain of their group to be allowed to punch the sign in order to add their group to the game. The "+" is not necessary anymore as of DungeonsXL 0.15.3.

***

## Edit signs
In the edit mode you can place different signs with different functions executed when they are triggered. They won't appear in game mode.
The first line determines the type. The two lines in the middle contain additional values. The bottommost line contains the triggers executing the sign functions.

Each dungeon needs at least these signs:

* lobby
* ready
* start
* end / floor

***

### Lobby

![Lobby Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Lobby.png)

Creates a lobby spawn point

***

### Ready

![Ready Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Ready.png)

Creates a "Ready" Sign, which, after choosing the class in the lobby, has to be triggered / klicked to start the dungeon. In the second line, you may specify a [game type](game-types).

***

### Leave

![Leave Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Leave.png)

With this Sign you can leave the Dungeon and the Group.

***

### Start

![Start Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Start.png)

This sign sets the start location of the map. When all players are ready, they will get teleported to this point. In MFDs, start signs mark the beginning of each floor. The start floor is the only floor which needs a lobby (unless it is bypassed in the config).

The number in the second line is optional and defines which group will spawn at this location. If you wish to create a PvP map for two groups, create one sign with "0" and one with "1".

***

### End

![End Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/End.png)

When each player of the group triggered this sign, the players finish the dungeon.

***

### Floor

![Floor Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Floor.png)

When triggered, e.g. because a player punchs it, the floor is finished and the player will be teleported to the next one. If there is no floor specified in the second line, the player will be teleported to a random floor from the list inside the [dungeon configuration](dungeon-configuration) as long as the floorCount is higher than 0.

***

### Classes

![Classes Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Classes.png)

Creates a class sign. The name entered in the second line must be the name of a [class script](scripts#classes).

***

### Command

![Command Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Command.png)

This sign requires [CommandsXL](https://github.com/DRE2N/CommandsXL). It executes a CXL command defined by the name specified in the second line, while line three contains the delay and mode: Commands can be executed by the console ("console"), as an operator ("op") or just with the players own permissions ("default").

***

### Mob

![Mob Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Mob.png)

Creates a mob spawn point.

<table>
  <tr>
    <td>1</td><th>[Mob]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>Type</th><td>The type of the Mob. You can use custom mobs from the floor config.
  <tr>
  <td>3</td><th>delay,count</th><td>The Delay determines how long it takes for the next mob to spawn (in sec.). The Count determines how many mobs are spawned altogether.</td>
  </tr>
  <td>4</td><th>Trigger</th><td></td>
  </tr>
</table>

***

### ExternalMob

![Ready Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/ExternalMob.png)

Creates a mob spawn point like the mob sign, but you can use mobs provided by external plugins. DungeonsXL provides built-in support for InsaneMobs, MythicMobs, CustomMobs and Citizens.

<table>
  <tr>
    <th>Plugin</th>
    <th>Provider tag</th>
  </tr>
  <tr>
    <td>Citizens</td>
    <td>CI</td>
  </tr>
  <tr>
    <td>CustomMobs</td>
    <td>CM</td>
  </tr>
  <tr>
    <td>InsaneMobs</td>
    <td>IM</td>
  </tr>
  <tr>
    <td>MythicMobs</td>
    <td>MM</td>
  </tr>
</table>

You can also add other custom mob plugins if they provide a spawn command with a mob identifier and a location (world name and coordinates) in the [main configuration](main-configuration).

<table>
  <tr>
    <td>1</td><th>[ExternalMob]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>Type</th><td>The identifier of the Mob, e.g. the name or in the case of Citizens the numeric ID.
  <tr>
  <td>3</td><th>delay,count,provider</th><td>The additional provider variable can be a value from the table above.</td>
  </tr>
  <td>4</td><th>Trigger</th><td></td>
  </tr>
</table>

***

### Message

![Msg Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Msg.png)

Shows a Message, that was set before.

<table>
  <tr>
    <td>1</td><th>[Msg]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>ID</th><td>The ID of the message. It can be defined in the config.yml or via /dxl msg</td>
  </tr>
  <tr>
  <td>3</td><th></th><td></td>
  </tr>
  <td>4</td><th>Trigger</th><td></td>
  </tr>
</table>

***

### Place

![Place Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Place.png)

Allows placing of Blocks on this position.

<table>
  <tr>
    <td>1</td><th>[Place]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>BlockID</th><td>[Optional] The Block ID of the Block, that can be placed here</td>
  </tr>
  <tr>
  <td>3</td><th>?</th><td>[Optional] The Side of the Block, to that the Block can be placed?</td>
  </tr>
  <td>4</td><th></th><td></td>
  </tr>
</table>

***

### Checkpoint

![Checkpoint Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Checkpoint.png)

Creates a Checkpoint.
If you die, you will automatically get to the latest Checkpoint, otherwise to the Startpoint.

***

### Chest

![Ready Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Chest.png)

All chests in near by a chest sign become reward chests. When a player opens a reward chest in a dungeon, the content will be added to his group's reward inventory which contains items the players get in the main world of the server when they finish the dungeon.


| 1 | Chest |  |
|:-:|:-:|:-:|
| 2 | **money,levels** | [Optional] A money reward (requires Vault) and a EXP level reward |
| 3 | **table name** | [Optional] The name of a [loot table script](scripts#loot-tables). The loot from the table gets, depending on the chance value, added randomly to the rewards. Content from the chest inventory will not get overriden. |
| 4 | **Trigger** | No trigger is needed here because the sign is triggered automatically when the game starts and transforms the chest into a reward chest. |

***

### Trigger

![Trigger Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Trigger.png)

Can Trigger other signs.
Triggers all signs, that have defined this sign as Trigger

<table>
  <tr>
    <td>1</td><th>[Trigger]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>ID</th><td>The Trigger-ID. All Signs, that have set this Sign as Trigger (through "T id"), will be triggered when this sign is triggered. If you leave this line empty, the next available ID will automatically be found.</td>
  </tr>
  <tr>
  <td>3</td><th></th><td></td>
  </tr>
  <td>4</td><th>Trigger</th><td></td>
  </tr>
</table>

***

### Redstone

![Redstone Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Redstone.png)

Turns into a Redstone block, that provides redstone power.  
In addition it can be delayed and also repeated.

<table>
  <tr>
    <td>1</td><th>[Redstone]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>Delay</th><td>[Optional] Delay of the Redstone output in Repeatersteps. 1 = like normal repeater, 4 = like full repeater, 10 = 1 sec, 600 = 1 min</td>
  </tr>
  <tr>
  <td>3</td><th>Repeating</th><td>[Optional] Count of the repeats of the output. The Delay determines the time between the outputs. Empty = No repeats (permanent power), 0 = Infinite repeating</td>
  </tr>
  <td>4</td><th>Trigger</th><td></td>
  </tr>
</table>

_**Protipp:** With adding ",x" to the Delay, you can also set the power-on time while repeating to x repeatersteps. Otherwise it is as long as the Delay._

***

### Block

![Block Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Block.png)

Transforms into a Block.

<table>
  <tr>
    <td>1</td><th>[Block]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>Off-Blockid/Name,Blockdata</th><td>The Blockid or name of the Block, and [optional] blockdata of the Block, that appears before being triggered.</td>
  </tr>
  <tr>
  <td>3</td><th>On-Blockid/Name,Blockdata</th><td>The Blockid or name of the Block, and [optional] blockdata of the Block, that appears after being triggered.</td>
  </tr>
  <td>4</td><th>Trigger</th><td></td>
  </tr>
</table>

_**Tipp:** To find out BlockId and Blockdata of a Block, rightclick it with a stick!_

***

### Interact

![Interact Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Interact.png)

Transforms into a clickable sign:

![Interact Sign after](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/InteractShow.png)

<table>
  <tr>
    <td>1</td><th>[Interact]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>ID</th><td>Signs that have this ID marked as their Trigger through "I id", will be triggered upon clicking this sign.</td>
  </tr>
  <tr>
  <td>3</td><th>Text</th><td>The Text that will appear on Top</td>
  </tr>
  <td>4</td><th>Text</th><td>The Text that will appear on Bottom</td>
  </tr>
</table>

***

### Wave

![Wave Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Wave.png)

Marks the beginning of a new mob wave. When a new wave starts, all triggered mob spawn points will spawn their mobs once again.

<table>
  <tr>
    <td>1</td>
    <td>[Wave]</td>
    <td></td>
  </tr>
  <tr>
    <td>2</td>
    <td>mob increase rate</td>
    <td>A multiplier for the mob count of all signs
  </tr>
  <tr>
    <td>3</td>
    <td>teleport</td>
    <td>Whether the players will get teleported to the start location; "+" or "true" to enable</td>
  </tr>
  <tr>
    <td>4</td>
    <td>Trigger</td>
    <td>In most cases, the wave trigger should be used.</td>
  </tr>
</table>

***

### Hologram

![Hologram sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Hologram.png)

DungeonsXL provides support for [Holographic Displays](http://dev.bukkit.org/bukkit-plugins/holographic-displays/) by filoghost. Hologram signs work as a wrapper to create and spawn holograms.

<table>
  <tr>
    <td>1</td>
    <td>[Hologram]</td>
    <td></td>
  </tr>
  <tr>
    <td>2</td>
    <td>First line/Second line/Item:ItemID/&6Color codes are supported!</td>
    <td>The text. "/" will create a wordwrap, "Item:[ID]" an item line. The ID may be any custom or vanilla item ID.</td>
  </tr>
  <tr>
    <td>3</td>
    <td>2.0</td>
    <td>The height of the hologram - this option is simply for convenience sothat you don't have to temporarily stack blocks to place the signs somewhere the air.</td>
  </tr>
</table>

**Important hint:** A sign has obviously not enough space for text in most cases. You can use as much space as you want if you use a [script](scripts#sign) instead of placing the hologram sign directly.

***

### Drop

![Drop sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Drop.png)

The drop sign will spawn dropped items at its location. The second line may contain any Caliburn item, the third one contains the stack size and the drop rate.

***

### Lives modifier

![Lives modifier sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Lives.png)

<table>
  <tr>
    <td>1</td>
    <td>[Lives]</td>
    <td></td>
  </tr>
  <tr>
    <td>2</td>
    <td>-3</td>
    <td>The amount of lives. May be positive or negative.</td>
  </tr>
  <tr>
    <td>3</td>
    <td>GROUP</td>
    <td>The target. Valid targets are: GAME (=all players in the game), GROUP (=all players in the group) and PLAYER (just the player who triggered the sign).</td>
  </tr>
</table>
***

### Open door

![Open door sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Door.png)

The door sign locks and protects its attached door. If the sign is triggered, the door opens.

***

### Script

![Script sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Script.png)

Script signs represent one or multiple signs at one block location. You can specify what exactly happens in a [script](scripts#signs). The second line is the name of the script without the .yml extension.

***

### Teleport

![Teleport sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Teleport.png)

Teleport signs teleport the player either to the location in the second line or to the location of the sign itself if the second line is empty.

***

### Resource pack

![Resource pack sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/ResourcePack.png)

If a player triggers a resource pack sign, he gets the possibility to download the dungeon resource pack.

Resource pack IDs can be defined in the [main configuration file](main-configuration). Use "reset" instead of an ID to reset the player's resource pack to his default one.

ResourcePack signs get enabled before the game starts and generate an interact trigger by default just like for example lobby, ready or leave signs, but you might want to link one sign to set the pack to your ready sign and one to reset to your end sign.

***

### BossShop

![BossShop sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/BossShop.png)

The BossShop sign provides basic integration with blackixx' [BossShop](https://www.spigotmc.org/resources/bossshop-powerful-and-playerfriendly-chest-gui-shop-menu-plugin.222/) plugin. BossShop is a powerful, free, open source and user-friendly solution to easily script inventory GUIs and shops.

***

### Bed

***

### Flag

***

### Sound message

***

### Action bar

[ActionBar] / Text / More text (optional) / Trigger

***

### Title

[Title] / Title text / Subtitle text / Trigger

***

## Triggers

To trigger most of these signs, they need a Trigger. It is determined in the Bottom line of a sign. This explains all available Triggers:

***

### [D]istance

![Distance Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Distance.png)
 
Sign will be triggered when a player is within the defined radius of Blocks. In this case it would be 15 Blocks.

***

### [R]edstone

![Redstone Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/RedTrigger.png)

Sign will be triggered when the Block below it receives Redstone power. Is the Sign placed on the side of a block, that will be used as receiver.

***

### [T]rigger sign

![Sign Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/SignTrigger.png)

Sign will be triggered upon triggering the Triggersign with the ID 1.

***

### [I]nteract

![Interact Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/InteractTrigger.png)

The sign will be triggered when the interact sign with the ID ( in this case 1) is clicked.

***

### [U]se item

![Use Item Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/UseItem.png)

Sign will be triggered when a player uses the Item "Scroll" with a rightclick. The name of the item may be the name of a minecraft item, of a book, or of a renamed item. 

***

### [M]ob death

![Mob Death Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/MobTrigger.png)

The sign will be triggered when the mob "Boss" is killed. The name of the mob may be the type (e.g. "zombie"), the name of a custom mob from the config.yml or a MythicMobs mob (e.g. SkeletalKnight).

***

### [W]ave

![Wave Trigger](http://feuerstern.bplaced.net/ressourcen/DXLSigns/WaveTrigger.png)

The sign will be triggered when all mobs in the game world are killed. The amount of mobs to to kill can be lowered through the multiplier: While 100/100 mobs have to be killed if the trigger is "W 1", just 95/100 mobs have to be killed if it is "W 0.95".

***

### [P]rogress

![Progress Trigger](http://feuerstern.bplaced.net/ressourcen/DXLSigns/ProgressTrigger.png)

The progress trigger triggers signs when a specific game progress is reached. The first value is the amount of floors and the second value is the amount of waves to finish, for example "P 0/5". You can also use the name of a floor instead of the numbers.

***

### Multiple Triggers

![Multiple Triggers](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/ManyTriggers.png)

A sign can have multiple triggers, seperated with a comma. Important: Only if all Triggers are triggered, the sign becomes active. In this sample that would mean: Only if a player was within the radius of 15 Blocks, redstone power is received, the mob "Boss" is dead and the Triggersign 2 was triggered, this sign becomes active.

If there is no Trigger declared, the sign becomes active instantly.
_Exception_: The signs Ready, Leave and End become Interact signs, that are triggered through clicking.

### Disable signs

Signs with Redstone and/or Triggersign trigger can be disabled, through disabling the redstone power that has triggered it.  
Now the sign is inactive until it receives power again.

### Player specific triggers

Player specific triggers are those, in that only a single player may be involved. They include Distance, Interact and Use Item triggers. With one of these as only trigger, the sign will only be triggered for the involved player. Only he has reached that Checkpoint or receives that message.
Sample: A message, that will be triggered through distance. The message appears only for the players, that ar within the given radius.

Of course the other players can still trigger that sign afterwards.

_© 2012-2013 Milan Albrecht, all rights reserved_