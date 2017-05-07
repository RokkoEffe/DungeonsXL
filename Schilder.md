## Globale Schilder
Bei DungeonsXL gibt es Schilder, die in der Hauptwelt Deines Servers platziert werden und Spielern das Bilden von Partys erlauben, damit sie den Dungeon looten können.

Ein Gruppenschild besteht aus diesen Zeilen:

![[DXL] / Group / TEST / 1,3](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Group.png)

Die dritte Zeile beinhaltet den Namen des Dungeons oder, wenn nur ein Floor gespielt werden soll, der einzigen Map. Die letzte Zeile definiert die Anzahl der Gruppen, die maximal zeitgleich spielen können, die Anzahl der Spieler in einer Gruppe und, wenn man noch eine weitere Variable hinzufügt, ob es sich um einen ganzen Dungeon (Multi-Floor-Dungeon; MFD) oder nur eine Map (Single-Floor-Dungeon; SFD) handelt. Will man also ein Gruppenschild für einen MFD erstellen, so ist die letzte Zeile z.B. "3,4,+", im Falle eines SFDs schlicht "3,4".

Anstatt den Befehl nutzen zu lassen, kann man auch ein Leave-Schild neben das Portal setzen.

![[DXL] / Leave](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Leave.png)

## Edit-Schilder
Im Editiermodus kann man verschiedene Schilder hinsetzen welche verschiedene Funktionen bewirken, wenn sie ausgelöst werden. Sie sind später im Spielmodus nicht mehr sichtbar.  
Die erste Zeile des Schildes beschreibt die Art. In den mittleren beiden Zeilen werden zusätzliche Informationen angegeben. Die untere Zeile beinhaltet die Auslöser, die das Schild auslösen.

Jeder Dungeon braucht mindestens diese Schilder:

* lobby
* ready
* start
* end

***

![Lobby Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Lobby.png)

Dies erstellt den Lobby Spawnpunkt

***

![Ready Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Ready.png)

Dies erstellt ein "Bereit" Schild, welches nach Aussuchen der Klasse in der Lobby zum starten des Dungeons angeklickt/ausgelöst werden muss

***

![Leave Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Leave.png)

Mit diesem Schild kann man den Dungeon und die Gruppe verlassen.

***

![Start Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Stasrt.png)

Dieses Schild definiert den Punkt an welchem der Dungeon startet. Nach dem alle Spieler bereit sind werden sie dort hin teleportiert.

***

![End Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/End.png)

Wird dieses Schild ausgelöst, z.B. durch Berührung durch jeden Spieler, so ist der Dungeon geschafft.

***

![Floor Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Floor.png)

Wird dieses Schild ausgelöst, z.B. durch Berührung durch jeden Spieler, so ist der Floor geschafft und der Spieler wird in den nächsten Floor teleportiert. Wird in der zweiten Zeile kein Floor spezifiziert, so wird der Spieler in einen zufälligen Floor aus der Liste in der Konfigurationsdatei des Dungeons teleportiert, solange die floorCount-Zahl noch über 0 ist.

***

![Classes Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Classes.png)

Dies erstellt die Klassenauswahl Schilder. Man benötigt je Klasse ein Schild.

***  
***

![Cmd Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/Cmd.png)

Dieses Schild benötigt [CommandsXL](https://github.com/DRE2N/CommandsXL). Dieses Schild führt einen CXL-Command aus, wobei die zweite Zeile den Befehlsnamen spezifiziert und die dritte die Verzögerung bis zur Ausführung und den Modus ausführt: Die Befehle können von der Konsole ("console"), als Operator ("op") oder einfach mit den Rechten des Spielers ("defaukt") ausgeführt werden.

***

![Mob Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Mob.png)
![MM Sign](http://feuerstern.bplaced.net/ressourcen/DXLSigns/MythicMobs.png)

Dies erstellt einen Mob-Spawnpoint. Seit v0.9.5 unterstützt DungeonsXL MythicMobs. Diese werden bezüglich Trigger und Permission genau wie DXLs Custom Mobs und Vanilla Mobs behandelt.

<table>
  <tr>
    <td>1</td><th>[Mob]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>Art</th><td>Die Art des Mobs. Hier können custom mobs aus der config verwendet werden</td>
  </tr>
  <tr>
  <td>3</td><th>Verzögerung,Anzahl</th><td>Die Verzögerung bestimmt, wie lange es dauert, bis der nächste Mob gespawned wird (in sek.). Die Anzahl bestimmt, wie viele Mobs insgesamt gespawned werden</td>
  </tr>
  <td>4</td><th>Auslöser</th><td></td>
  </tr>
</table>

***

![Msg Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Msg.png)

Dies zeigt eine Nachricht, welche vorher festgelegt wurde.

<table>
  <tr>
    <td>1</td><th>[Msg]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>ID</th><td>Die ID der Nachricht. Diese kann man in der config.yml definieren oder per /dxl msg</td>
  </tr>
  <tr>
  <td>3</td><th></th><td></td>
  </tr>
  <td>4</td><th>Auslöser</th><td></td>
  </tr>
</table>

***

![Place Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Place.png)

An diesem Ort kann man Blöcke platzieren.

<table>
  <tr>
    <td>1</td><th>[Place]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>BlockID</th><td>[Optional] Die Block ID des Blockes, der hier gesetzt werden kann.</td>
  </tr>
  <tr>
  <td>3</td><th>?</th><td>[Optional] Die Seite des Blockes, an dem der Block gesetzt werden kann?</td>
  </tr>
  <td>4</td><th></th><td></td>
  </tr>
</table>

***

![Checkpoint Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Checkpoint.png)

Dies erstellt einen Checkpoint.  
Falls man stirbt kommt man automatisch zum letzten Checkpoint, ansonsten zum Startpoint.

***

![Chest Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Chest.png)

Alle Kisten die rund um dieses Schild stehen, werden zu "Belohnungskisten". Falls man diese Kisten im Dungeon öffnet, wird der Inhalt dem "Belohnungsinventar" hinzugefügt welchen man erhält, falls man den Dungeon beendet.

***

![Trigger Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Trigger.png)

Kann andere Schilder auslösen.  
Löst alle Schilder aus, die dieses Schild als Auslöser definiert haben.

<table>
  <tr>
    <td>1</td><th>[Trigger]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>ID</th><td>Die Trigger-ID. Alle Schilder, die dieses Schild mit "T id" als Auslöser festgelegt haben, werden ausgelöst, wenn dieses Schild ausgelöst wird. Wird dieses Feld leergelassen, so wird automatisch die nächste freie ID gefunden und eingesetzt.</td>
  </tr>
  <tr>
  <td>3</td><th></th><td></td>
  </tr>
  <td>4</td><th>Auslöser</th><td></td>
  </tr>
</table>

***

![Redstone Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Redstone.png)

Verwandelt sich in einen Redstone Block, der ein Redstone Signal ausgibt.  
Außerdem kann das Signal verzögert und auch wiederholt werden.

<table>
  <tr>
    <td>1</td><th>[Redstone]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>Verzögerung</th><td>[Optional] Verzögerung der Signalausgabe in Repeaterschritten. 1 = wie normaler Repeater, 4 = wie voller Repeater, 10 = 1 sek, 600 = 1 min</td>
  </tr>
  <tr>
  <td>3</td><th>Wiederholung</th><td>[Optional] Anzahl der Wiederholungen des Signals. Die Verzögerung bestimmt die Zeit zwischen den Wiederholungen. Leer = Kein Wiederholungen (Dauer an), 0 = Unendlich wiederholen</td>
  </tr>
  <td>4</td><th>Auslöser</th><td></td>
  </tr>
</table>

_**Protipp:** Durch anfügen von ",x" an die Verzögerung, kann auch die Signal-An Zeit während der Wiederholungen auf x Repeaterschritte eingestellt werden. Diese ist sonst genau so lang wie die Verzögerung._

***

![Block Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Block.png)

Verwandelt sich in einen Block.

<table>
  <tr>
    <td>1</td><th>[Block]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>Aus-Blockid/Name,Blockdata</th><td>Die Blockid oder Name des Blocks, sowie [Optional] Blockdata des Blocks, der vor dem Auslösen erscheint</td>
  </tr>
  <tr>
  <td>3</td><th>An-Blockid/Name,Blockdata</th><td>Die Blockid oder Name des Blocks, sowie [Optional] Blockdata des Blocks, der nach dem Auslösen erscheint</td>
  </tr>
  <td>4</td><th>Auslöser</th><td></td>
  </tr>
</table>

_**Tipp:** Rechtsklicke mit einem Stock auf einen Block, um dessen BlockId und Blockdata herauszufinden!_

***

![Interact Sign](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Interact.png)

Verwandelt sich in ein anklickbares Schild:

![Interact Sign after](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/InteractShow.png)

<table>
  <tr>
    <td>1</td><th>[Interact]</th><td></td>
  </tr>
  <tr>
    <td>2</td><th>ID</th><td>Schilder die diese ID mit "I id" als Auslöser definiert haben, werden beim anklicken dieses Schildes ausgelöst</td>
  </tr>
  <tr>
  <td>3</td><th>Text</th><td>Text der oben erscheint</td>
  </tr>
  <td>4</td><th>Text</th><td>Text der unten erscheint</td>
  </tr>
</table>

***

# Auslöser

Um die meisten dieser Schilder auszulösen, bedarf es eines Auslösers. Dieser wird in der untersten Zeile eines Schildes festgelegt. Hier werden alle Auslöser erklärt:

***

![Distance Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/Distance.png)

**D**istance  
Schild wird ausgelöst wenn ein Spieler sich in einem Umkreis von einer bestimmten Anzahl von Blöcken aufhält. In diesem Fall 15 Blöcke.

***

![Redstone Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/RedTrigger.png)

**R**edstone  
Schild wird ausgelöst wenn der darunterliegende Block ein Redstone Signal empfängt. Wird das Schild seitlich an einem Block angebracht, so ist dieser der Redstone Empfänger.

***

![Sign Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/SignTrigger.png)

**T**riggersign  
Schild wird ausgelöst wenn das Triggerschild mit der ID 1 ausgelöst wurde.

***

![Interact Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/InteractTrigger.png)

**I**nteract  
Schild wird ausgelöst, wenn das Interact Schild mit der ID 1 mit einem Rechtsklick berührt wurde.

***

![Use Item Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/UseItem.png)

**U**se Item  
Schild wird ausgelöst, wenn ein Spieler das Item "Scroll" mit einem Rechtsklick benutzt. Der Name des Items kann ein englischer Name eines Minecraft Items, der eines Buches, oder der eines umbenannten Items sein.

***

![Mob Death Trigger](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/MobTrigger.png)

**M**ob  
Schild wird ausgelöst, wenn der Mob "Boss" getötet wird. Der Name des Mobs kann die englische Bezeichnung eines Minecraft Mobs sein (z.B. "zombie"), oder der eines custom mobs, aus der config.yml

***
### Mehrere Auslöser

![Multiple Triggers](https://dl.dropboxusercontent.com/u/16240159/Minecraft/DungeonsXL/ManyTriggers.png)

Ein Schild kann mehrere Auslöser haben, getrennt mit einem Komma. Hierbei gilt: Erst wenn alle Auslöser ausgelöst sind, wird dieses Schild aktiv. Bei diesem Beispiel bedeutet das: Erst wenn ein Spieler im Umkreis von 15 Blöcken war, ein Redstone Signal anliegt, der Mob "Boss" tot ist und das Triggerschild 2 ausgelöst wurde, so wird das Schild ausgelöst.

Wird gar kein Auslöser angegeben, so ist das Schild sofort aktiv.  
_Ausnahme_: Die Schilder Ready, Leave und End werden zu Interact Schildern, die durch klicken ausgelöst werden.

### Schilder ausschalten

Schilder mit Redstone und/oder Trigger Auslöser können wieder deaktiviert werden, indem das anliegende Redstone Signal ausgeschaltet wird.
Das Schild ist nun solange inaktiv, bis das Signal wieder anliegt.

### Spielerspezifische Auslöser

Spielerspezifische Auslöser sind die, in die möglicherweise nur ein einzelner Spieler involviert ist. Dazu gehören Distance, Interact und Use Item. Mit einem von diesen als einzigen Auslöser wird ein Schild vorerst nur für den involvierten Spieler ausgelöst. Nur er hat damit z.B. einen Checkpoint erreicht, oder erhält eine Nachricht.  
Beispiel: Eine Nachricht, die in einem bestimmten Umkreis ausgelöst wird. Die Nachricht erscheint nur den Spielern, der sich innerhalb dieses Umkreises befindet.

Natürlich können die anderen Spieler das Schild daraufhin auch auslösen.

_© 2012-2013 Frank Baumann & Milan Albrecht, alle Rechte vorbehalten_