***

1. [Which plugins are not going to work with DungeonsXL?](#which-plugins-are-not-going-to-work-with-dungeonsxl)
2. [Integrations](#integrations)
3. [Incompatibilites](#incompatibilities)

***

## Which plugins are not going to work with DungeonsXL?
To instantiate the same world multiple times, DungeonsXL copies the "resource" worlds from _DungeonsXL/maps/_ to the server's world container. The drawback of this system is that plugins that use the world names to make their features persistent, such as custom mob, world border or block protection plugins, are not going to work as intended in instance worlds.

## Integrations
However, it is in many cases possible to create workarounds. The API is designed to be powerful enough to allow developers to integrate with DXL to get their plugins working; DungeonsXL includes support for a good bit of the most popular plugins natively and good pull requests are in general gladly accepted.

List of natively supported plugins:
* [CommandsXL](signs#command): Advanced command execution plugin.
* [Citizens](signs#externalmob): Highly advanced custom mob plugin.
* [MythicMobs](signs#externalmob): Recommended plugin for NPC enemies.
* [InsaneMobs](signs#externalmob): Alternative custom mob plugin.
* [CustomMobs](signs#externalmob): Alternative custom mob plugin.
* [Any other custom mob plugin](signs#externalmob) that has a spawn command with mob type, world and position parameters can be added to the [main config](main-configuration).
* ItemsXL: Custom item and mob manager. All custom item IDs from IXL can be used anywhere where item IDs can be entered (work in progress!)
* [Any permission plugin](main-configuration) that supports Vault. Required for tutorial groups and instance permissions.
* [Any economy plugin](main-configuration) that supports Vault. Required for - well, for all economy features.

## Incompatibilities
These plugins are not compatible with DungeonsXL:

* Corpses
* Towny

In many cases, the issues can be resolved by limiting these plugins to the worlds where you need them with [PerWorldPlugins](http://dev.bukkit.org/bukkit-plugins/perworldplugins/).