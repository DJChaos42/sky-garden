advancement revoke @a only pack:util/recipes
execute unless data storage pack:data master.loaded run gamerule commandModificationBlockLimit 999999999
execute unless data storage pack:data master.loaded run place template pack:sky_island 0 50 0
execute unless data storage pack:data master.loaded run fillbiome -30 -64 -30 30 319 30 minecraft:plains
execute unless data storage pack:data master.loaded run place template pack:desert_island 60 50 0
execute unless data storage pack:data master.loaded run fillbiome 40 -64 -20 80 319 20 minecraft:desert
execute unless data storage pack:data master.loaded run place template pack:cherry_island -90 80 -40
execute unless data storage pack:data master.loaded run fillbiome -100 -64 -70 -60 319 -10 minecraft:taiga
execute unless data storage pack:data master.loaded run forceload add -150 150 -150 150
execute unless data storage pack:data master.loaded run place template pack:end_portal -150 0 150
execute unless data storage pack:data master.loaded run fillbiome -140 -64 140 -160 319 160 pack:the_portal
execute unless data storage pack:data master.loaded in minecraft:the_nether run forceload add -4 -4 4 4
execute unless data storage pack:data master.loaded in minecraft:the_nether run place template pack:nether_island 0 50 0
execute unless data storage pack:data master.loaded in minecraft:the_end run forceload add -4 -4 4 4
execute unless data storage pack:data master.loaded in minecraft:the_end run setblock 0 2 0 minecraft:end_stone
execute unless data storage pack:data master.loaded in minecraft:the_end run setblock 10 1 0 minecraft:end_stone
execute unless data storage pack:data master.loaded in minecraft:the_end run setblock 10 2 0 minecraft:chorus_flower
execute unless data storage pack:data master.loaded run worldborder set 120 0

execute unless data storage pack:data master.loaded run setworldspawn 4 54 6
execute unless data storage pack:data master.loaded run forceload remove all
execute unless data storage pack:data master.loaded run gamerule commandModificationBlockLimit 32768
execute unless data storage pack:data master.loaded run data modify storage pack:data master.loaded set value true