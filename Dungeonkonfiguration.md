Bitte beachte, dass dies ein <b>BEISPIEL-FILE</b> ist. Es lässt sich nicht ohne editiert zu werden kopieren und benutzen.

<pre><code>#Die erste Ebene, die die Spieler betreten. Benötigt mindestens lobby-, ready-, start- und floor-Schilder.
startFloor: MyDungeon_floor_01
#Die letzte Ebene, die die Spieler betreten.Benötigt mindestens start- und end-Schilder.
endFloor: MyDungeon_floor_12
#Eine Liste aller anderen Ebenen in dem Dungeon. Benötigen mindestens start- und floor-Schilder.
floors:
  - MyDungeon_floor_02
  - MyDungeon_floor_03
  - MyDungeon_floor_04
  - MyDungeon_floor_05
  - MyDungeon_floor_06
  - MyDungeon_floor_07
  - MyDungeon_floor_08
  - MyDungeon_floor_09
  - MyDungeon_floor_10
  - MyDungeon_floor_11

#Wie viele Ebenen sollen zufällig aus der Liste gewählt werden, bevor die Spieler zum endFloor teleportiert werden?
floorCount: 7

#Wenn auf true gestellt, werden die Ebenen aus der Liste herausgenommen, wenn sie gespielt sind, damit eine Ebene nicht mehrmals in einem Dungeon ausgewählt werden kann.
removeWhenPlayed: false
</code></pre>