/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up implements lv {
    static String[][] field_b;
    static kl field_e;
    static String[][][][] field_c;
    private int field_a;
    static String[][][] field_g;
    static String field_f;
    private ha field_d;

    public static void d(int param0) {
        field_f = null;
        field_g = (String[][][]) null;
        field_b = (String[][]) null;
        field_e = null;
        if (param0 != -12428) {
            return;
        }
        field_c = (String[][][][]) null;
    }

    final static StringBuilder a(char param0, int param1, StringBuilder param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param2.length();
            param2.setLength(param1);
            if (param3) {
              var5 = var4_int;
              L1: while (true) {
                L2: {
                  if (var5 >= param1) {
                    stackOut_9_0 = (StringBuilder) (param2);
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_6_0 = (StringBuilder) (param2);
                    stackIn_10_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      ((StringBuilder) (Object) stackIn_7_0).setCharAt(var5, param0);
                      var5++;
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (StringBuilder) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("up.E(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    public final String a(int param0) {
        if (param0 > -122) {
            return (String) null;
        }
        return "Defeat: Total Portal Loss";
    }

    final static String a(bv param0, int param1, byte param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 <= -79) {
              if (param1 != 0) {
                param0.n(-2);
                var3 = param0.h((byte) 121);
                param0.o(72);
                stackOut_6_0 = (String) (var3);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("up.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public final boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    public final boolean c(int param0) {
        String discarded$7 = null;
        if (param0 <= -121) {
          if (!this.field_d.b(this.field_a, (byte) -26)) {
            if (this.field_d.a(this.field_a, true)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$7 = this.a(-22);
          if (!this.field_d.b(this.field_a, (byte) -26)) {
            if (this.field_d.a(this.field_a, true)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    up(int param0, ha param1) {
        try {
            this.field_a = param0;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "up.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Movement speed: ";
        field_g = new String[][][]{new String[][]{new String[]{"Welcome to Armies of Gielinor.", null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null, null}}, new String[][]{new String[]{null, "Capturing a village<br><col=DDDDDF>Strength: 10", "Captured tower<br><col=DDDDDF>Strength: 15", "Captured portal<br><col=DDDDDF>Strength: 10", null, null}}, new String[][]{new String[]{null, "Villages<br><col=DDDDDF>25 points", "Portals<br><col=DDDDDF>50 points", "Towers<br><col=DDDDDF>75 points", null}}, new String[][]{new String[]{null, null, null, "Alignments"}}, new String[][]{new String[]{null, "Misthalin<br><col=DDDDDF>(free)", "Frozen Wastes<br><col=DDDDDF>(free)", "Kharidian Desert<br><col=DDDDDF>(members)", "Hallowvale Swamps<br><col=DDDDDF>(members)"}, new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null, null, null, null}}, new String[][]{new String[]{null, "Village<br><col=DDDDDF>Heals by 1 point", "Portal<br><col=DDDDDF>Heals by 1 point", "Tower<br><col=DDDDDF>Heals by 1 point", null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{"'SPACE'", "Arrow keys", "'ESC'"}}, new String[][]{new String[]{null, null, null, null}}, new String[][]{new String[]{null, null, null, null}}};
        field_b = new String[][]{new String[]{"Objectives"}, new String[]{"Unit movement and combat"}, new String[]{null}, new String[]{"Main unit classes"}, new String[]{"Other unit classes"}, new String[]{"Pop-up windows"}, new String[]{"Capturing structures"}, new String[]{"Reinforcements"}, new String[]{"Unit Mana cost and level"}, new String[]{"Map themes", "Terrain types"}, new String[]{null}, new String[]{"Healing and curing"}, new String[]{"God selection and purchasing units"}, new String[]{null}, new String[]{"Keyboard shortcuts:"}, new String[]{"Team game rules"}, new String[]{"Campaign objectives"}};
        field_c = new String[][][][]{new String[][][]{new String[][]{null, new String[]{"Armies of Gielinor is a turn-based strategy game where the objective is to use your army to capture portals, towers and villages, generating both Mana and Victory Points. Your army is comprised of units, each of which has its own strengths and weaknesses. Portals can be used to teleport in reinforcements."}, new String[]{"Games are won by filling your Victory Point bar before your opponents have filled theirs, by eliminating your opponents entirely, or by having the greatest number of Victory Points at the end of the game."}, new String[]{"To eliminate a player entirely, they must have lost all of their units and must not have any portals captured."}}}, new String[][][]{new String[][]{new String[]{"Each turn, a unit may do one of four things: <col=DBB522>move<col=DDDDDF>; <col=DBB522>attack<col=DDDDDF>; <col=DBB522>move and then attack<col=DDDDDF>; <col=DBB522>or perform a special ability<col=DDDDDF>."}, new String[]{"To select a unit, click on the <col=DBB522>tile on which it is standing<col=DDDDDF>. Once selected, the extent of the unit's range of movement will be indicated in green, and its attack range is shown in red. Any enemies that can be attacked will be highlighted with a red icon."}, new String[]{"Selected units can be directed to a particular point within their movement range by clicking on a destination. Click once to select a destination, then once more to move to it."}, new String[]{"If a unit is moved but doesn't attack, the attack range from its current position will be highlighted. If a unit's actions are spent, the movement and attack range will be highlighted in a darker shade."}}}, new String[][][]{new String[][]{new String[]{"Your currently selected unit can be ordered to attack any enemy within its attack range. These enemies will be highlighted with a red icon. To attack, simply click on any one of these highlighted enemies."}, new String[]{"Each unit on the board can only attack once per turn. Some units have a ranged attack, but they still may need to move to get in range of their target."}, new String[]{"When selected, you can see a unit's statistics at the top of the screen. If a unit has a special ability, a button to activate it will appear here."}, null, null}}, new String[][][]{new String[][]{new String[]{"A unit's class affects how that unit moves about the map and the outcome of any battles in which it partakes."}, new String[]{"<col=DBB522>Skirmish<col=DDDDDF> - Skirmish units are fast and can cross rivers. They are less effective in close combat and cannot attack flying units."}, new String[]{"<col=DBB522>Warriors<col=DDDDDF> - Warriors are effective in close combat, but cannot attack flying units and are vulnerable to magical attacks, as their armour magnifies the effect of magic spells."}, new String[]{"<col=DBB522>Rangers<col=DDDDDF> - Rangers attack at long range. They are effective against mages and flying units, but weak in close combat."}, new String[]{"<col=DBB522>Mages<col=DDDDDF> - Mages' spells are powerful and can travel great distances. They are effective against warriors, but are vulnerable to rangers."}}}, new String[][][]{new String[][]{new String[]{"<col=DBB522>Helpers<col=DDDDDF> - Helpers are weaker in combat, but each has a special way of helping other units in the game."}, new String[]{"<col=DBB522>Flying<col=DDDDDF> - Flying units cannot be attacked by ground units, but are easily picked off by ranged and magic attacks."}, new String[]{"<col=DBB522>Plants<col=DDDDDF> - Plants cannot move, but they are hardy and can function as walls to hinder the enemy."}, new String[]{"<col=DBB522>Titans<col=DDDDDF> - Titans are strong enough to inflict maximum damage on all things, but are often slow moving and expensive to teleport in."}, new String[]{"Before engaging in combat, pay close attention to the classes of both the attacking and defending units!"}}}, new String[][][]{new String[][]{new String[]{"When you move your cursor over a unit, the pop-up window shown below will appear over the unit."}, new String[]{"For your units, it displays the unit's name, current strength, its percentage of defensive cover, whether or not it can move or attack this turn, and its class."}, new String[]{"For an enemy unit, it displays the unit's name, current strength, its percentage of defensive cover, and, if targeted for attack, how well it will fare against your currently selected unit."}, null, null, new String[]{"This enemy monk (a helper) will be easily beaten by the player's pyrelord (a titan). The pop-up window over the monk shows that titans (depicted by the fist icon) are effective against helpers (depicted by the red-cross icon)."}}}, new String[][][]{new String[][]{new String[]{"Barbarian units can capture portals, villages and towers (structures). To capture a structure, direct a barbarian unit to the tile containing the structure and leave the unit there for several turns."}, null, null, null, new String[]{"Each structure has a 'capture strength' that is depleted each turn by an amount equal to the current health of the barbarian. Once this capture strength reaches 0, the structure is captured."}, new String[]{"A flag in the player's colour will appear over any captured villages or towers. Streams of magic energy in the player's colour will flow from captured portals."}}}, new String[][][]{new String[][]{new String[]{"At the start of each turn, each player will gain Mana from any structures they have captured."}, null, null, null, new String[]{"In a multiplayer game, ending your turn early will yield additional Mana. Mana can be used to activate captured portals and bring new units into the battle. Each unit has its own Mana cost, which varies depending on the unit's level. When teleporting new units into battle, you can select from either neutral units or units aligned to a particular god. If you repeatedly bring in units aligned to the same god, you will gain favour with that god and access to that god's higher-level units."}}}, new String[][][]{new String[][]{new String[]{"Your favour with each god, and with the neutral units, is ranked from one to five. Your current favour with each god is displayed at the bottom of the game screen."}, new String[]{"Every time you teleport in a unit of a level <b>equal</b> to your favour with that unit's god, your favour with that god increases by one. You cannot teleport in aligned units whose level <b>exceeds</b> your favour with that unit's god. So, for example, if your favour with Guthix was only one, you could not teleport in the level 2 terrorbird aligned to Guthix, but if you teleport in a level 1 druid, your favour with Guthix would then increase to two."}, new String[]{"Your favour with the neutral units is always at least equal to the highest favour you have with any of the gods. Every time you teleport in a neutral unit of a level equal to your favour with the neutral units, your favour with them increases by one."}, null}}, new String[][][]{new String[][]{new String[]{"There are four map themes to choose from:"}, null, null, null, null}, new String[][]{new String[]{"<col=DBB522>Open ground<col=DDDDDF> - All units can cross open ground."}, new String[]{"<col=DBB522>Roads<col=DDDDDF> - All units can travel along roads, with all but flying units travelling slightly faster."}, new String[]{"<col=DBB522>Rivers<col=DDDDDF> - Only flying, skirmish and amphibious units can cross rivers, however, skirmish units move much slower when doing so."}, new String[]{"<col=DBB522>Forests<col=DDDDDF> - All units can pass through forests, but, with the exception of flying and Guthix-aligned units, they will move slower than when crossing open ground. In combat, forests provide a defence bonus; Guthix-aligned units derive a greater defence bonus from forests than other units."}}}, new String[][][]{new String[][]{new String[]{"<col=DBB522>Mountains<col=DDDDDF> - Only flying units can cross mountains."}, new String[]{"<col=DBB522>Swamps<col=DDDDDF> - All units can travel through swamps, but, with the exception of flying units, they will move slower than when crossing open ground."}, new String[]{"<col=DBB522>Seas<col=DDDDDF> - Only flying and amphibious units can cross seas."}, new String[]{"<col=DBB522>Structures<col=DDDDDF> - Villages and towers provide a defence bonus to ground units."}, new String[]{"<col=DBB522>Walls<col=DDDDDF> - Only flying units can cross walls, but ranged attacks can go over them."}, new String[]{"<col=DBB522>Temples<col=DDDDDF> - Temples behave like towers for all intents and purposes."}}}, new String[][][]{new String[][]{new String[]{"Skeletons, mummies, and poisoned units will lose 1 health point at the start of each turn. Other injured units who do not move or engage in battle during a turn will regain 1 health point at the start of the next turn."}, null, null, null, new String[]{"Allied units occupying captured structures will heal at the start of each turn. Skeletons and mummies can only be healed in this way when occupying captured portals. Priests and monks will cure adjacent allied units by 3 health points."}, new String[]{"Poisoned units occupying captured structures will be cured at the start of each turn. Druids, priests and monks will cure adjacent poisoned allied units."}, new String[]{"Units other than barbarians are damaged 3 points per turn whilst occupying enemies' portals."}}}, new String[][][]{new String[][]{new String[]{"As a new player, you have three gods selected for you at the start of the game:"}, new String[]{"<col=DBB522>Saradomin<col=DDDDDF> - Saradomin is the god of good and all that is holy, his followers being the purest of creatures."}, new String[]{"<col=DBB522>Zamorak<col=DDDDDF> - Zamorak is the Mahjarrat-god of chaos, followed by all kinds of wicked, viscious men and beasts."}, new String[]{"<col=DBB522>Guthix<col=DDDDDF> - Guthix is the nature god of balance, shaper of Gielinor. His followers are druids and the flora and fauna of the world."}}}, new String[][][]{new String[][]{new String[]{"When you win Rated games you will be awarded runes, which you can use to gain access to new units and even new gods. If you have gained access to additional gods, you must choose which three you will use at the start of each game."}, new String[]{"<col=DBB522>Seren<col=DDDDDF> - Seren is the crystalline goddess of elfkind and one of the first gods to bring her followers to Gielinor."}, new String[]{"<col=DBB522>Bandos<col=DDDDDF> - Bandos is the god of war, leader of orks, goblins, ogres and the like. He likes to fight for the fun of it."}, new String[]{"<col=DBB522>Menaphite Pantheon<col=DDDDDF> - The Menaphite pantheon consists of the gods Tumeken, Elidinis, Icthlarin, Amascut the Devourer, Het, Apmeken, Crondis and Scabaras."}}}, new String[][][]{new String[][]{new String[]{"Cycle the camera through your active units and portals, and skips battle animations. Also centres the camera on an action playing out on the map."}, new String[]{"Move the camera around the map."}, new String[]{"Show the in-game menu."}}}, new String[][][]{new String[][]{new String[]{"In Team Games, all captured structures belong to the team of the player who captured them. All players on a team gain Mana from all structures belonging to their team."}, new String[]{"Units with special abilities that harm enemies will only harm units on the opposing team. Any special abilities that aid allies will affect the units of their teammates too."}, new String[]{"If a player is knocked out, any remaining teammates will receive a share of that player's Mana income each turn."}, new String[]{"At the start of your turn, any of your teammates' units that have been left on portals will come under your control."}}}, new String[][][]{new String[][]{new String[]{"Some of the campaign missions have special objectives that need to be fulfilled."}, new String[]{"<col=DBB522>Leaders<col=DDDDDF> - Leader units are shown by a leader icon. Some missions will require you to defeat an enemy leader to succeed."}, new String[]{"<col=DBB522>Key Buildings<col=DDDDDF> - Key buildings are shown by a beam of light lighting them up from the sky. Some campaign missions require you to capture a key building to succeed."}, new String[]{"<col=DBB522>Guards<col=DDDDDF> - Guard units are shown by a guard icon. Guard units only attack when units move into their range. Once they take damage, guards will then behave as normal units."}}}};
    }
}
