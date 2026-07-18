/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mn extends tc {
    int field_p;
    boolean field_u;
    int field_o;
    static String[][] field_m;
    static long field_s;
    static int field_n;
    static int[] field_t;
    static kk[][] field_k;
    static String field_r;
    static String[] field_l;
    static String field_q;

    final static void a(boolean param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param0) {
            return;
        }
        if (0 > param1) {
            return;
        }
        if (param4 < 0) {
            return;
        }
        if (param1 >= ks.field_y) {
            return;
        }
        if (!(param4 < ef.field_c)) {
            return;
        }
        int var6 = param4 * ks.field_y + param1;
        rv.a(false, param5, param2, var6);
    }

    final String a(int param0, String[] param1, String param2) {
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            L1: {
              var5 = 115 % ((param0 - 77) / 34);
              if (1 == param1.length) {
                stackOut_2_0 = param1[0];
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = pj.a(593277313, (CharSequence[]) (Object) param1);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var4 = stackIn_3_0;
            var4 = "Illegal move (" + param2 + "); player " + ((mn) this).field_p + ": " + var4 + ".";
            stackOut_3_0 = (String) var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("mn.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    abstract bd a(int param0, ha param1);

    public static void a(int param0) {
        field_q = null;
        field_k = null;
        field_l = null;
        field_r = null;
        field_t = null;
        field_m = null;
    }

    protected mn() {
        ((mn) this).field_o = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[][]{new String[3], new String[3], new String[3], new String[1], new String[1], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[1], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[1], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[1], new String[3], new String[3], new String[3], new String[3], new String[3], new String[1], new String[3], new String[3], new String[3], new String[3], new String[1], new String[1], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[3], new String[1], new String[1], new String[1], new String[1], new String[8], new String[3], new String[3], new String[3], new String[3], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1]};
        field_s = 0L;
        field_r = "Battle Viewer";
        field_t = new int[12];
        field_k = new kk[field_m.length][];
        field_l = new String[]{"This spell inflicts 2 points of magic damage to one unit.", "This spell inflicts 5 points of magic damage to one unit.", "This spell inflicts 7 points of magic damage to one unit.", "This spell inflicts 10 points of magic damage to one unit.", "This spell inflicts 15 points of magic damage to one unit.", "This spell inflicts 20 points of magic damage to one unit.", "This spell inflicts 30 points of magic damage to one unit.", "This spell grants 50 extra Mana.", "This spell grants 100 extra Mana.", "This spell grants 150 extra Mana.", "This spell grants 200 extra Mana.", "This spell grants 250 extra Mana.", "This accessory allows a unit to move faster over swamp and through rivers, as if it were amphibious.", "This potion permanently increases one unit's strength by 1.", "This potion permanently increases one unit's strength by 2.", "This potion permanently increases one unit's strength by 3.", "This potion permanently increases one unit's strength by 4.", "This potion permanently increases one unit's strength by 5.", "This potion permanently decreases one unit's strength by 1.", "This potion permanently decreases one unit's strength by 2.", "This potion permanently decreases one unit's strength by 3.", "This potion permanently decreases one unit's strength by 4.", "This potion permanently decreases one unit's strength by 5.", "This spell raises one pile of bones into a skeleton warrior.", "This spell raises all bones within a 3x3 area into an army of skeleton warriors.", "This spell raises a spiritual shield on a single tile, which absorbs 40% of the damage dealt to a unit within it.", "This spell raises a spiritual barrier on a 3x3 area, which absorbs 40% of the damage dealt to units within it.", "This spell causes civil unrest in one structure - peasants overthrow the current occupier, returning the structure to a neutral state.", "This accessory grants one ground unit the ability to combat flying units.", "This potion allows any level 1 unit to make a copy of itself when it next moves.", "This potion allows any unit up to level 2 to make a copy of itself when it next moves.", "This potion allows any unit up to level 3 to make a copy of itself when it next moves.", "This potion allows any unit up to level 4 to make a copy of itself when it next moves.", "This potion allows any unit up to level 5 to make a copy of itself when it next moves.", "This spell teleports one unit to any unoccupied flat dry land within 8 tiles, except for portals.", "This spell teleports one unit to any unoccupied flat dry land on the map, except for portals.", "This spell allows you to issue a single move and/or attack command to an enemy unit.", "This spell raises your favour with Saradomin by 1.", "This spell raises your favour with Zamorak by 1.", "This spell raises your favour with Guthix by 1.", "This spell raises your favour with Seren by 1.", "This spell raises your favour with Bandos by 1.", "This spell raises your favour with the Menaphite pantheon by 1.", "This spell converts one village you occupy into a tower.", "This spell forms a bridge spanning out from any flat piece of riverbank or coastline.", "This spell allows for another King Black Dragon to be teleported into the fight.", "This spell allows one unit that has already moved/attacked to do so again in the same turn.", "This spell covers a 3x3 area in fire, inflicting 2 points of fire damage on all units within it.", "This spell covers a 5x5 area in fire, inflicting 2 points of fire damage on all units within it.", "This spell covers a 3x3 area in fire, inflicting 5 points of fire damage on all units within it.", "This spell covers a 5x5 area in fire, inflicting 5 points of fire damage on all units within it.", "This spell covers a 3x3 area in fire, inflicting 7 points of fire damage on all units within it.", "This spell covers a 5x5 area in fire, inflicting 7 points of fire damage on all units within it.", "This spell covers a 3x3 area in fire, inflicting 10 points of fire damage on all units within it.", "This spell heals one unit by 2 points.", "This spell heals one unit by 5 points.", "This spell heals one unit by 7 points.", "This spell heals one unit by 10 points.", "This spell heals one unit by 15 points.", "This spell heals one unit by 20 points.", "This spell heals one unit by 30 points.", "This spell heals all units in a 3x3 area by 2 points.", "This spell heals all units in a 5x5 area by 2 points.", "This spell heals all units in a 3x3 area by 5 points.", "This spell heals all units in a 5x5 area by 5 points.", "This spell heals all units in a 3x3 area by 7 points.", "This spell heals all units in a 5x5 area by 7 points.", "This spell heals all units in a 3x3 area by 10 points.", "This spell poisons one unit.", "This accessory gives one unit a second chance at life.", "This armour gives one unit +10% defence against melee damage.", "This armour gives one unit +20% defence against melee damage.", "This armour gives one unit +30% defence against melee damage.", "This armour gives one unit +40% defence against melee damage.", "This armour gives one unit +10% defence against ranged damage.", "This armour gives one unit +20% defence against ranged damage.", "This armour gives one unit +30% defence against ranged damage.", "This armour gives one unit +40% defence against ranged damage.", "This armour gives one unit +10% defence against magic damage.", "This armour gives one unit +20% defence against magic damage.", "This armour gives one unit +30% defence against magic damage.", "This armour gives one unit +40% defence against magic damage.", "This armour gives one unit +10% defence against fire damage.", "This armour gives one unit +20% defence against fire damage.", "This armour gives one unit +30% defence against fire damage.", "This armour gives one unit +40% defence against fire damage.", "This armour gives one unit +10% defence against all damage types.", "This armour gives one unit +20% defence against all damage types.", "This armour gives one unit +30% defence against all damage types.", "This armour gives one unit +40% defence against all damage types.", "This armour gives one unit +10% defence against flying units.", "This armour gives one unit +20% defence against flying units.", "This armour gives one unit +30% defence against flying units.", "This armour gives one unit +40% defence against flying units.", "This weapon gives a unit +2 melee damage.", "This weapon gives a unit +5 melee damage.", "This weapon gives a unit +10 melee damage.", "This weapon gives a unit +2 ranged damage.", "This weapon gives a unit +5 ranged damage.", "This weapon gives a unit +10 ranged damage.", "This weapon gives a unit +2 magic damage.", "This weapon gives a unit +5 magic damage.", "This weapon gives a unit +10 magic damage.", "This armour completely protects one unit from one attack (of any type), after which the armour is destroyed. This armour is heavy, halving the unit's speed for as long as it is worn.", "This armour completely protects one unit from two attacks (of any type), after which the armour is destroyed. This armour is very heavy, completely immobilising the unit for as long as it is worn.", "This weapon adds poison to one melee unit's melee attack.", "This weapon adds poison to one ranged unit's ranged attack.", "This weapon adds poison to one magic unit's magic attack.", "This accessory allows any one unit to capture one structure.", "This spell allows one unit to move twice as far as normal on one turn.", "This accessory allows one unit to travel very quickly over water, as if it were an elemental of Elidinis.", "This spell creates a forest on a 3x3 area, but only on open ground or swamped land.", "This spell creates a swamp on a 3x3 area, but only on open ground or forested land.", "This spell creates a 3x3 area of river water, but only on open ground, swamp and forests.", "This spell flattens a 3x3 area of mountains into open ground.", "This potion increases the Kalphite Queen's movement inhibition effect to 3 tiles.", "This potion increases an ogre shaman's ranged attack prevention effect to 3 tiles.", "This potion increases a goblin priest's confusion effect to 3 tiles.", "This potion increases a cyclops's paralysing effect to 3 tiles.", "This potion increases an elf songstress's morale boost effect to 3 tiles.", "This potion gives one unit the ability to drain health from its victims with melee attacks, at the cost of losing a little bit of health every turn.", "This spell immobilises one unit for 1 turn.", "This spell immobilises one unit for 2 turns.", "This spell immobilises one unit for 3 turns.", "This weapon increases a ranged unit's maximum range by 2 tiles.", "This weapon increases a magic unit's maximum range by 3 tiles.", "This weapon increases a dragon's fire attack maximum range by 2 tiles, and can also boost the range of the dwarf cannon", "This weapon gives one unit +2 fire damage. It's good for both dragons and the dwarf cannon.", "This weapon gives one unit +5 fire damage. It's good for both dragons and the dwarf cannon.", "This weapon gives one unit +10 fire damage. It's good for both dragons and the dwarf cannon.", "This weapon adds poison to one unit's fire attacks. It's good for both dragons and the dwarf cannon.", "This weapon gives one flying unit +2 melee damage.", "This weapon gives one flying unit +5 melee damage.", "This weapon gives one flying unit +10 melee damage.", "This weapon adds poison to one flying unit's melee attacks."};
        field_q = "Chemicals that burn faster and hotter to improve fire attacks.";
    }
}
