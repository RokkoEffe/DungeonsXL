### How can I link portals and dungeons together?
Portals do not depend on dungeons. Use a group and / or a game sign to specify the dungeon.

### How can I make it so that a player gets teleported to the next floor if x mobs are killed?
Add a mob or a progress trigger to your flior sign. The last line of an edit mode sign contains the trigger, in this case P [wave count] or M [name of the mob to kill].

### How do I setup group sizes and counts per dungeon?
Use group signs.

### Y U no video?
It would take long to create a video with all features. Besides that, the ongoing changes would make a video out of date very fast.

### How do loot chests work?
Any item stack can be put into a chest in edit mode. If you want the items to get added to the loot inventory, just place a [chest] sign next to it (1 block distance).

### How do I create a multi floor dungeon?
Creating one is as simple as creating a [dungeon configuration](dungeon-configuration). You can then join an MFD with /dxl play d [dungeon] or with a [group sign](signs#group) with the + attribute.

### How can I make it so that players play dungeons with their own items?
This and many other settings can be found in the [floor configuration](floor-configuration). Have a look at the keepInventoryOnEnter rule.

### Help! There's no config.yml in my dungeon map folder!
You have to create the file yourself because the floor configuration is optional. Note that the game rules you define in the floor configuration can also be fetched from other sources: If you create a multi floor dungeon with multiple maps, you probably want to have the same config values for all maps. In such a case, it's easier to use the dungeon configuration and to add the values to the defaultValues or to the overrideValues section. Even without a multi floor setup, the default values or the values from the main config or the game type are sometimes sufficient for small projects. Therefore, there's just a file if it is needed either because you've created it or to store the players that are allowed to edit the map without the permission node.

### OMG, this plugin is totally f***ed with errors!
DungeonsXL is still in development and it's up to you to decide if you risk to use it in a production environment or not. [Bug reports](../issues) are always appreciated. Please make sure that you're on a supported server version, that you use the latest release and that you didn't use _/reload_ to restart your server.

### I've created a portal / group sign / game sign / ... - how do I remove it?
Enter the /dxl break command and destroy the block. The save data will be removed automatically.

### My script doesn't work :(
Please check for syntax errors before you ask for support. A parser like [yamllint.com](http://www.yamllint.com/) might help you.

### I get a "Could not pass event ChunkLoadEvent to HolographicDisplays" error when a dungeon is loaded.
This error occurs if you use the performance tweaks. It is not a bug of DungeonsXL and there is no way to fix this as loading worlds and adding entities asynchronously is usually not intended to be done with the Vanilla Minecraft server. There are no known caveats apart from the stacktrace, though, so you can safely ignore it.