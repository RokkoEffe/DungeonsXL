This changelog covers changes as of DungeonsXL Beta 0.8.2. [Earlier versions](https://github.com/DieReicheErethons/DungeonsXL) were maintained by the developers of _Die Reiche Erethons_.

# Upcoming
## Unconfirmed
* New features:
  * Integrations:
    * XServer
    * [Heroes](../issues/91)
    * RPGMe
  * MySQL support
  * [More pets](../issues/108)


## Planned for the [DungeonsXXL](../milestone/8) addon
* New features:
  * [Edit GUIs](../issues/22)
  * [Settings GUIs](../issues/83)
  * [Script GUIs](../issues/110)
  * [Scoreboards](../issues/64)
  * [Statistics](../issues/65)
  * [Holographic menus](../issues/6)

## Release
### [1.0](../milestones/Release%201.0) or earlier
* Code changes:
  * Style improvements
  * [Clean up messy listener code](../issues/93)
  * [Protections OOP improvements](../issues/122)
* New features:
  * Integrations:
    * [MCMMO](../issues/100)
    * [FactionsXL](../issues/129)
    * [BetonQuest](..issues/5)
  * [Mobs with attributes](../issues/45)
  * Caliburn 1.0
  * Implement unimplemented events
* Bugfixes:
  * [Fix global sign multiple column bugs](../issues/77)
* Removed features:
  * [Remove legacy support](../issues/123)

# History
## Beta
### 0.15.7
* Code changes:
  * Refactored listeners
  * [Recoded chat system](../issues/207)
  * ...and more
* New features:
  * Made a few buttons translatable
  * Groups now have the name of their color instead of an ID name
  * Group tags flying over the head if enabled
* Bugfixes:
  * Fixed BossShop integration
  * [Fixed that tems in hand are lost when a player creates a portal](../issues/209)
  * [Fixed CustomMobs incompatibility](../issues/204)
  * [Fixed death messages and keepInventoryOnDeath issue](../issues/210)

### 0.15.6
* New features:
  * Added 1.11-1.11.2 support module for ResourcepackAPI

### 0.15.5
* New features:
  * /dxl test now works in edit worlds
* Code changes:
  * Recoded /dxl play command
  * Recoded floor / finish system (should be more reliable now)
  * Compiled against BRCommons 1.0.6
* Bugfixes:
  * The console may now execute /dxl kick; dxl.kick node now works as it should
  * Fixed some bugs with multi floor dungeons
  * [Fixed dungeon config initialization bug](../issues/192)
  * Fixed /dxl test command
  * Game types without rewards now don't give rewards anymore
  * ...and a few minor things

### 0.15.4
* New features:
  * ActionBar sign
  * Title sign

### 0.15.3
* Code changes:
  * Compiled against BRCommons 1.0.5
  * ...and some improvements which are linked to the bugfixes
* Bugfixes:
  * Fixed a minor shading bug
  * [Fixed /dxl reload breaking games](../issues/185)
  * [Made DXL player representation getters more robust](../issues/181)
  * [Fixed end sign NPE](../issues/177)
  * Announcers are not sent to players in an instance anymore
  * Fixed rename command not updating sign data

### 0.15.2
* New features:
  * [Rename command that allows you to rename floors without breaking dungeons, signs etc.](../issues/41)
  * [Delete command](../issues/41)
* Bugfixes:
  * [Fixed incompatibility with some plugins that forcefully set a gamemode after teleporting into a world](../issues/184)
  * Fixed /dxl lives NPE
  * [Fixed /dxl invite NPE](../issues/186)
  * Blocked PlugMan (just for DungeonsXL)

### 0.15.1
* Code changes:
  * Compiled against BRCommons 1.0.3 and Caliburn 0.2.3
  * Removed performance debug
* New features:
  * Custom ready titles
* Bugfixes:
  * [Fixed cloned Citizens](../issues/166)
  * Fixed that Citizens were regarded as players in some cases
  * [Fixed bug with overscaled health](../issues/175)
  * [Fixed bug when a player tries to loot a chest for the second time](../issues/177)
  * [Fixed erroneous MFD check](../issues/183)
  * [groupColorPriority list is now fixed automatically if it's wrong / in the old format](../issues/174)

### [0.15](../milestones/Beta%200.15)
* Code changes:
  * [Recoded player persistence system](../issues/117)
  * [Clean up API](../issues/102)
  * Recoded tutorial system
  * Compiled against BRCommons 1.0.2 and Caliburn 0.2.2 for Minecraft 1.11
  * ...and more.
* New features:
  * Improve treasure inventory
  * [More configurable block protection system](../issues/116)
  * [New game block system](../issues/125)
    * Team bed
    * Team flag
    * Protection
    * Locked door
  * [Group colors](../issues/127)
  * [Group lives](../issues/128)
  * [Allow other materials for portals](../issues/9)
  * [BossShop integration](../issues/126)
  * Allow player instead of group for /dxl group show and /dxl enter
  * Game goal system to handle win / finish conditions
  * Improved game type system
  * [Per dungeon resource packs](../issues/154)
* Bugfixes:
  * [Fixed /dxl reload](../issues/121)
  * Fixed /dxl lives receiver bug
  * [Fixed portal facing bug](../issues/9)
  * [Fixed portal chat spam](../issues/9)
  * [Fixed portal teleportation bug](../issues/119)
  * Fixed open door sign
  * Fixed /dxl list NPE
  * Use double jump bugfix only when placeBlocks is false
  * [Fixed compatibility issue with health scale lower than 20](../issues/137)
  * Fixed games not marked as started (resolves friendly fire and pvp rule bugs and maybe more unknown problems)
  * [Fixed /dxl msg command if no floor config exists](../issues/144)
  * [Fixed ghost sign bug](../issues/147)
  * [Fixed play command in edit mode](../issues/151)
  * [Fixed edit invitations](../issues/141)
  * [Fixed PvE exception in 1.8.x and lower](../issues/162)

### 0.14.4
* New features:
  * [Enhanced loot chests / loot tables](../issues/104)
* Bugfixes:
  * /dxl reload now works with all reloadable features

### 0.14.3
* Code changes:
  * Compiled against Caliburn 0.2
* New features:
  * Disabled block burning in instances (except because of flint and steel)
* Bugfixes:
  * Create .raw only when needed

### 0.14.2
* Code changes / bugfixes:
  * [Recoded reward chest / item reward system](../issues/113)
* New features:
  * Erroneous chest signs are now marked in game and cause a log message

### 0.14.1
* Bugfixes:
  * Made some classes public to allow JavaDoc generation
  * Fixed NullPointerException with sign data
  * [Fixed ready signs without floor config](../issues/111)

### 0.14
* Code changes:
  * Created fake registry to resolve Citizens save file spam and ID bumping
  * [Recoded world system](../issues/94)
  * Compiled against BRCommons 1.0.1 for Minecraft 1.10.2
  * Minor changes to the command system
  * [Experimental performance tweaks](../issues/39)
    * Files are now copied asynchronously in many cases
    * Instances are now loaded asynchronously
    * Tweaks can be enabled / disabled in the main config
  * Switched to multi module project setup
  * Compiled against Caliburn and IXL 0.1.8
* New features:
  * [Commands](../issues/41):
    * Kick command
    * Import command
    * Status command
  * [Fortune trigger](../issues/105)
  * [Backup system](../issues/103)
* Bugfixes:
  * Fixed ClassCastException with WaveTrigger
  * Teleport signs now work correctly with scripts
  * Fixed message sign and secure objects
  * Fixed ItemsXL integration
  * ...and more

### [0.13](../milestones/Beta%200.1)
* Code changes
  * Improved trigger code
* New features
  * Signs:
    * [Start sign enhancements](../issues/16)
    * [Drop](../issues/14)
    * Lives modifier
    * Timer for ready signs
    * Open door
    * [Hologram sign](../issues/4)
  * Permission requirement
  * Signs now also accept right clicks instead of sending a message that the player has to left-click the sign
* Bugfixes:
  * Compiled against Caliburn 0.1.6 (resolves classes bug)
  * Fixed game sign exception
  * Fixed a few exceptions

### [0.12](../milestones/Beta%200.12)
* Code changes:
  * Compiled against BRCommons 1.0 for Minecraft 1.10
  * [Complete player handling rewrite](../issues/63)
* New features:
  * [Permission bridge](../issues/42)
  * [Config value priority system](../issues/61)
  * [Globally announce games](../issues/40)
  * [Script system](../issues/48)
    * Announcements
    * Classes
    * Mobs
    * Signs
  * Group size requirement
  * Disabled weather in edit worlds
  * [Support for ItemsXL](../issues/15) / [CaliburnAPI](../issues/74)
  * [Added maxInstances config value to prevent overloading](../issues/86)
  * [Added teleport sign](../issues/85)
* Bugfixes:
  * DPlayerUpdateEvent is now fired correctly
  * [Fixed all dungeons being ended when an end sign is triggered](../pull/82)
  * [Fixed NullPointerException with redstone signs](../pull/82)
  * [Fixed ConcurrentModificationException with trigger signs](../pull/82)
  * Fixed language file serialization
  * [Fixed arrows treated as MythicMobs](../issues/88)
  * [Fixed finishing dungeon when a player leaves the group](../issues/80)
  * [Better wave mob count calculation](../issues/89)
  * [Overhauled messages](../issues/90)
  * ...and more
* Removed or deprecated features:
  * Extended support only for Minecraft 1.7.x and 1.8.x

### 0.11.4
* Bugfixes:
  * [Fixed a serialization bug with higher custom health values](../issues/78).

### 0.11.3
* Bugfixes:
  * Fixed dungeon entering issues.

### 0.11.2
* Bugfixes:
  * Forbid some abusable group commands while in dungeon
  * Fixed death console error

### 0.11.1
* Code changes:
  * Compiled against BRCommons 0.5.2 for Minecraft 1.9.4
* Bugfixes:
  * Fixed /dxl lives command message

### [0.11](../milestones/Beta%200.11)
* Code changes:
  * Events: Created and implemented a whole bunch of events
  * Trigger API
  * Reward API
  * Custom sign API improvements
  * Requirement API
  * Game type API
  * Global protected blocks API
  * Restructure packages
  * Rewrite task handling
  * Use Maven
  * Use BR-Commons
  * [Rewrite portals: Use PlayerMoveEvent instead to support different portal types in the future](../issues/9)
  * Rewrote permission system
  * Miscellaneous improvements
* New features:
  * Metrics integration
  * Command white / blacklist in dungeon
  * Advanced groups:
    * Different groups in one dungeon
    * Advanced group support for signs
    * Group command
    * Group names
    * Group captains
    * Enter command
  * Advanced game types:
    * Adventure
    * Adventure - Time is Running
    * Apocalypse - Last Man Standing
    * Apocalypse - Limited Mobs
    * Apocalypse - Time is Running
    * Player versus Environment - Last Man Standing
    * Player versus Environment- Limited Mobs
    * Player versus Environment- Time is Running
    * Player versus Player - Last Man Standing
    * Player versus Player - Factions Battlefield
    * Quest
    * Quest - Time is Running
    * Test
    * Tutorial
    * Default
  * Block modification and gamemode rules
  * PvP rules
  * Reworked test command
  * Secure mode
  * Time is running mode
  * Title messages can now be disabled through the main config
  * Level requirements and rewards
  * Wave trigger and sign
  * External mob sign
  * Integrations:
    * Citizens
    * Integration with any custom mob plugin that provides a spawn command with world and coordinates (built-in: MythicMobs, InsaneMobs & CustomMobs)
  * Progress trigger
* Bugfixes:
  * Fixed chest signs
  * Fixed /dxl play|test bug when the map isn't saved yet
  * Fixed /dxl list bug if no floor config exists
  * Fixed DXL data save bug
  * Fixed exception if no DXL data file exists
  * Fixed /dxl edit not working without permission even if the player is invited
  * Fixed keepInventoryOnDeath
  * Fixed /dxl test requirement check
  * Fixed that only wall signs worked as DXL signs
  * Fixed lives in tutorial and test mode
  * [Fixed inventory bugs](../issues/19)
  * [Fixed error handling when dungeons are set up incorrectly](/issues/35)
  * Fixed [loot inventory bug](../issues/19)
  * Fixed M trigger for MythicMobs
  * Fixed natural mob spawning in edit / game worlds
* Removed or deprecated features:
  * Deprecated the MythicMobs sign
  * Deprecated the /dxl deleteportal command

### [0.10](../milestones/Beta%200.10)
* Major part of a major code cleanup
  * Variable, class and package names
  * Package structure
  * Replace static fields with variables of an instance of the main class
  * Replace field references with getters and setters
  * Replace if { if { if { blocks with returns
* Command signs with CommandsXL
* Rewrite sign system with an API to add custom signs
* Use SuperPerms instead of Vault when possible
* Rewrite lives system
* Link maps together to create dungeons with multiple floors
* Added permission node "dxl.bypass" to use beds, enderchests, commands etc. in dungeons
* Rewrote the message system
* Config files (config.yml and languages/en.yml) now generate automatically on server start
* Floor signs to join the next floor
* Beautified a lot:
  * Command system rewrite (similar to ItemsXL)
  * Send screen messages containing dungeon and floor
* Fix DSavePlayer inventory bug (fixed it provisionally, enough for a Beta build :p )
* Added /dxl break command sothat it's finally possible to get rid of DXL signs and portals outside dungeons
* Deprecated /dxl deleteportal command. It'll get removed sooner or later
* ...and more :)

### 0.9.6
* Money as a reward: Add one line to your [chest] sign that contains a number.
* Money fees: All you need to do: Put "fee: <amount>" to your dungeon config.
* Optimization for 1.8.8: Nothing noticable.
* Command to play dungeons without portal: _/dxl play_.
* Split keepInventory to keepInventoryOnEnter, OnEscape, OnFinish and OnDeath: keepInventoryOnEscape means whether or not you keep your inventory if you leave the dungeon without an end sign, e.g. with /dxl leave. The old "keepInventory" still works, it contains Enter, Escape and Finish.
* Added MythicMobs support to mob trigger: Just use the same name that you put into your MM config file.
* Bugfixes: No motivation to list them :P

### 0.9.5
* Added MythicMobs support: Added a new sign that works exactly like the [Mobs] sign, but it spawns MythicMobs.
* Fixed edit mode
* Players didn't get creative mode in edit mode.

### 0.9.4
* Some more UUID compatibility
* Forgot about some situations where player data is stored. Fixed it.
* Fixed portal bug
* DXL portals are now usable, again!

### 0.9.3
* Wrote an NMS handler: Adds backwards compatibility to 1.7.8 and higher.

### 0.9.2
* Updated a lot of deprecated code
* This will guarantee it to work with future updates without huge changes.
* Added UUID support
* Invited players are now stored by their UUID.

### 0.9.1
* Emergency fix: /dxl edit was broken in 0.9

### 0.9
* Removed Spoutcraft support: Spoutcraft hasn't been updated since 1.6.4, so it's useless to support it.
* Added lives: Players had infinite tries to succeed in a dungeon, so I added a way to make them fail. Check it with /dxl lives <player> and configure it with initialLives: <int>.
* Added possibility to keep inventory in dungeons: You can now configure whether players keep their inventory and play a dungeon with their own stuff or if they get classes. Just change keepInventory: <boolean>.

### 0.8.4
* Update to CraftBukkit 1.8.4-1.8.7.

### 0.8.3
* Update to CraftBukkit 1.8.3.

### 0.8.2
* Update to CraftBukkit 1.8.