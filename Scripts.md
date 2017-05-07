A *script* is a [YAML](https://en.wikipedia.org/wiki/YAML) file located at _plugins/DungeonsXL/scripts/[type]/[identifier].yml_.

***

1. [Announcements](#announcements)
2. [Classes](#classes)
3. [Mobs](#mobs)
4. [Signs](#signs)
5. [Loot tables](#loot-tables)

***

## Announcements
Announcements are chat messages that pop up from time to time (you can adjust the interval in the main config). If a player clicks at the message, a menu pops up.

![Announcer GUI](http://feuerstern.bplaced.net/ressourcen/DXLSigns/AnnouncerGUI.png)

The player can join a group by clicking at its button. If enough players join the announced game, it gets scheduled. The players see a progress bar and can join and leave at will until the time is over.

![ProgressBar](http://feuerstern.bplaced.net/ressourcen/DXLSigns/ProgressBar.png)

```
description:
  - "&6====================================================="
  - "&2Insert witty text to explain the announced game here..."
  - "&6====================================================="
# The name of a map if multiFloor is false, the name of a dungeon if multiFloor is true.
identifier: TEST
# If the dungeon to play has multiple floors.
multiFloor: false
# The game starts automatically thirty seconds after the minimum requirements are fulfilled.
minGroupsPerGame: 2
minPlayersPerGroup: 1
maxGroupsPerGame: 4
maxPlayersPerGroup: 4

```

## Classes
If players should not play the dungeon with their own items but with a set inventory, class scripts are the way to go. Thanks to the [CaliburnAPI](https://github.com/DRE2N/CaliburnAPI) / [ItemsXL](https://github.com/DRE2N/ItemsXL) integration, DungeonsXL supports three different ways to store items in configuration files.

In a dungeon, a class can be selected with a [classes sign](signs#classes).
```
items:
# This is the simple way to store items.
# Valid input:
# The first value may be any ID (be it a Vanilla ID or an ID of an ItemsXL item),
# the second value is the amount
# and the third, optional value is the durability value.
  - 261,1
  - 262,64
  - 268,1
  - 298,1
  - 299,1
  - 300,1
  - 301,1
  - 364,3
  - 363,10
  - 261,1,16
# The Caliburn API also supports the usual Bukkit ItemStack deserialization format.
# If you don't know how to use this and have ItemsXL installed,
# put the item stack into your main hand and enter the "/ixl serialize" command.
# You will find a valid, automatically generated YAML representation of your item
# in the ItemsXL/serialized.yml file.
  - ==: org.bukkit.inventory.ItemStack
    type: IRON_SWORD
    damage: 55
    amount: 1
# For more information about the Caliburn item serialization format,
# please have a look at the Caliburn wiki:
# https://github.com/DRE2N/CaliburnAPI/wiki/Custom-item-script
  - ==: io.github.dre2n.caliburn.item.UniversalItemStack
    type: "CUSTOM_DEFAULT"
    material: "IRON_SWORD"
    durability: 35
    name: "&4CustomName"
    amount: 1
    lores:
     - "&4This is the first line."
     - "&6This is the second line."
    enchantments:
      "PROTECTION_ENVIRONMENTAL": 4
      "THORNS": 1
    attributes:
      name:
        type: "GENERIC_ATTACK_DAMAGE"
        slots:
          - "MAIN_HAND"
          - "HEAD"
        operation: "ADD_NUMBER"
        amount: 8.5

# Whether the class should have a dog as a pet.
dog: true
```

## Mobs
Besides support for multiple external custom mob plugins, _DungeonsXL_ also has its own custom mob system. Just create a script and the identifier can be used at a mob sign instead of the vanilla mob name.

_The custom mob feature currently does not use the Caliburn format because it is not mature enough at the moment._

```
# Type of the Mob
type: Skeleton
# Health
maxHealth: 100
# Head-item
itemHelmet: 310
# Chest-item
itemChestplate: 310
# Legging-item
itemLeggings: 310
#Feet-item
itemBoots: 310
# Hand-item
itemHand: 310
# If the Mob is a Wither skeleton (only available if Type: Skeleton)
isWitherSkeleton: true
# Which type of Ocelot an Ocelot is (only available if Type: Ocelot) // BLACK_CAT, RED_CAT, SIAMESE_CAT, WILD_OCELOT
ocelotType: BLACK_CAT
# Items that are dropped by the Mob upon death
drops:
  1:
    # Item-Id
    id: 35
    # Item-Data (As sample for colored wool)
    data: 9 
    # Count (default 1)
    amount: 2
    # Enchantments
    enchantments:
      # Enchantment + Level
      - DAMAGE_ALL 2
      - DURABILITY 10
      # Item name
    name: 'The wool'
    # Item description (Split multiple lines with '//')
    lore: 'Finest wool!//Very fine!'
    # Drop Chance (0-100) (default 100)
    chance: 50
  2:
    id: 276
    enchantments:
      - DAMAGE_ALL 5
      - DURABILITY 10
    name: 'Destroyer'
    lore: '10 Dmg'

```

## Signs
Sometimes, it is hard to put all the triggers at one tiny line of a sign. And sometimes, there might not be enough space for multiple signs in a tiny room. The solution for this problem is called [script sign](signs#script). A script sign does everything that its script tells it to do.

```
0:
  - "[Mob]"
  - "Zombie"
  - "4,4"
  - "D 4"
1:
  - "[Mob]"
  - "Spider"
  - "0,1"
  - "D 4"
```

## Loot tables
Loot tables can be used to add chance values for items in [reward chests](signs#chest).

In future versions, they will also be used for mob drops.

```
0:
  # For more information about the Caliburn item serialization format,
  # please have a look at the Caliburn wiki:
  # https://github.com/DRE2N/CaliburnAPI/wiki/Custom-item-script
  item:
    ==: io.github.dre2n.caliburn.item.UniversalItemStack
    type: "CUSTOM_DEFAULT"
    material: "IRON_SWORD"
    durability: 35
    name: "&4CustomName"
    amount: 1
    lores:
     - "&4This is the first line."
     - "&6This is the second line."
    enchantments:
      "PROTECTION_ENVIRONMENTAL": 4
      "THORNS": 1
    attributes:
      name:
        type: "GENERIC_ATTACK_DAMAGE"
        slots:
          - "MAIN_HAND"
          - "HEAD"
        operation: "ADD_NUMBER"
        amount: 8.5
  # The loot chance in percent
  chance: 75.0

1:
  # This is the simple way to store items.
  # Valid input:
  # The first value may be any ID (be it a Vanilla ID or an ID of an ItemsXL item), 
  # the second value is the amount
  # and the third, optional value is the durability value.
  item: "261,1,16"
  chance: 100.0

2:
  # The Caliburn API also supports the usual Bukkit ItemStack deserialization format.
  # If you don't know how to use this and have ItemsXL installed,
  # put the item stack into your main hand and enter the "/ixl serialize" command.
  # You will find a valid, automatically generated YAML representation of your item
  # in the ItemsXL/serialized.yml file.
  item:
    ==: org.bukkit.inventory.ItemStack
    type: IRON_SWORD
    damage: 55
    amount: 1
  chance: 37.5
```
