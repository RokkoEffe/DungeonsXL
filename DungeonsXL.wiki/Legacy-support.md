If you use DungeonsXL with an older version than Minecraft 1.9, note that some features will not work. Besides that, DungeonsXL is created to work with server softwares that implement the Spigot API, which is slightly extended compared to the pure Bukkit API. Therefore, some features will work with Spigot, but not with CraftBukkit.

## Caliburn integration
DungeonsXL uses the Caliburn API to fetch items from config. This does not work with 1.7.x and 1.8.x, though. These versions use a built-in, less powerful util with a slightly different syntax.

Example for a class script:
```
#Name of the Classes
Warrior:
  #Items the Class has on the beginning
  items:
  #Item-Id/data, count, enchantment name/lvl
  - 268,1,FIRE_ASPECT/1
  - 276,1
  - 302,1
  - 303,1
  - 304,1
  - 305,1
  - 364,1
  - 373/16385,3
```

[List of Bukkit enchantments](https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/enchantments/Enchantment.html)

## Broken features
* The /dxl deleteportal command does not work with 1.7.x.
* Drop signs don't work with 1.7.x and 1.8.x.
* Several performance tweaks do not work with 1.7.x and 1.8.x. They cause severe errors and must be disabled.
* Clickable chat messages work with Spigot, but not with CraftBukkit. DungeonsXL uses this feature for announcers. Announcers will still work with CraftBukkit; the issues are merely cosmetic.
* Resourcepack signs don't work with 1.7.x and 1.8.x.