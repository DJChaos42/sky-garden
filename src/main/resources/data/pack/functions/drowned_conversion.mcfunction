execute as @e[type=minecraft:drowned,tag=!found,predicate=pack:no_held_item] run loot replace entity @s weapon.mainhand loot pack:drowned_conversion
execute as @e[type=minecraft:drowned,tag=!found,predicate=pack:drowned_nautilus] run data modify entity @s HandDropChances[0] set value 1.0f
tag @e[type=minecraft:drowned,tag=!found] add found