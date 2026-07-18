/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends ib {
    static eg field_x;
    static String[] field_w;
    static String field_z;
    static String field_y;
    static String field_C;
    static dh field_A;
    static String field_F;
    static int[] field_B;
    static String field_E;
    static boolean[] field_D;

    final String a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            stackOut_2_0 = jo.a(0, '*', param1.field_g.length());
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("tc.K(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0) {
        h.field_K = new String[aj.field_g];
        h.field_K[9] = pa.field_c;
        h.field_K[20] = bg.field_b;
        h.field_K[18] = h.field_E;
        h.field_K[19] = ve.field_r;
        h.field_K[15] = gg.field_d;
        h.field_K[17] = lc.field_e;
        h.field_K[5] = aa.field_i;
        h.field_K[6] = lf.field_h;
        h.field_K[13] = wi.field_g;
        h.field_K[7] = jb.field_r;
        h.field_K[16] = kn.field_sb;
        h.field_K[4] = cc.field_c;
        h.field_K[21] = ja.field_w;
        h.field_K[11] = sa.field_Gb;
    }

    tc(int param0) {
        this(ia.field_c, param0);
    }

    public static void b(byte param0) {
        field_w = null;
        field_C = null;
        field_x = null;
        field_A = null;
        field_D = null;
        field_B = null;
        field_y = null;
        field_F = null;
        field_E = null;
        field_z = null;
    }

    private tc(dj param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (ef.field_r) {
              L1: {
                if (nj.field_c != 2) {
                  break L1;
                } else {
                  if (ua.field_S == null) {
                    break L1;
                  } else {
                    var3 = (CharSequence) (Object) param0;
                    if (ua.field_S.equals((Object) (Object) gk.a(var3, -13))) {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("tc.W(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + -31046 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void b(int param0, int param1) {
        ab var2 = he.field_e;
        var2.b((byte) -126, param1);
        var2.field_g = var2.field_g + 1;
        int var3 = var2.field_g;
        var2.f(5, (byte) -39);
        var2.f(wi.field_f.field_dc, (byte) -3);
        int var4 = wi.field_f.field_Pb - -(wi.field_f.field_Fb << 6);
        var2.f(var4, (byte) -97);
        var2.a(wi.field_f.field_Wb, 0, (byte) -86, wi.field_f.field_Wb.length);
        var2.b(var2.field_g + -var3, (byte) 43);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"Arcane Arrow", "Arcane Bomb", "Arcane Tower", "Arcane Energiser", "Arcane Gate", "Arcane Portal", "Summon Imps", "Imp Destruction", "Arcane Glyph", "Arcane Sigil", "Arcane Flash", "Arcane Zero Shield", "Fire Ball", "Fire Arrow", "Lava Bomb", "Magma Bomb", "Flame Shield", "Flame Wall", "Napalm", "Napalm Bomb", "Rain of Fire", "Rain of Arrows", "Volcano", "Summon Flame Dragon", "Pebble Shot", "Scatter Rock", "Quake", "Disruption", "Mud Ball", "Mega Boulder", "Rock Slab", "Fortress", "Summon Dwarf", "Summon Rock Golem", "Meteor", "Fissure", "Thunder Shock", "Chain Lightning", "Wind Shield", "Hurricane", "Shock Bomb", "Storm Shield", "Summon Cyclops", "Conductor Rod", "Summon Storm Spirit", "Flight", "Storm", "Summon Storm Dragon", "Ice Ball", "Ice Bomb", "Frost Shards", "Frost Arrow", "Snow Ball", "Blizzard", "Ice Shield", "Ice Castle", "Summon Sylph", "Summon Frost Giant", "Comet", "Frost Dragon", "Den of Darkness", "Rain of Chaos", "Drain Bolt", "Death Bomb", "Summon Swarm", "Summon Dark Knight", "Raise Dead", "Summon Wraith", "Aura of Decay", "Dark Defences", "Swallowing Pit", "Lichdom", "Protection Shield", "Sky Ray", "Shining Bolt", "Rising Star", "Summon Pegasus", "Summon Paladin", "Forest Seed", "Summon Pixies", "Sphere of Healing", "Castle of Light", "Invulnerability Shield", "Shining Power", "Thorn Ball", "Thorn Bomb", "Vine Whip", "Vine Bridge", "Entangle", "Vine Bomb", "Summon Man-Trap", "Sanctuary", "Summon Elves", "Flurry", "Nature's Wrath", "Vine Bloom", "Water Ball", "Maelstrom", "Summon Water Trolls", "Hydration", "Deluge", "English Summer", "Brine Bolt", "Brine Bomb", "Summon Brine Goblin", "Rain of Clams", "Ocean's Fury", "Summon Water Lord", "Static Ball", "Static Shield", "Mechanical Arrow", "Cog Fall", "Recall Device", "Calling Bell", "Clock Tower", "Cuckoo Clock", "Blast from the Past", "Clockwork Bomb", "Steam Dragon", "Redo", "Self Destruct", "Sylph Arrow", "Frost Giant Ball", "Smash", "Mine", "Kablam!", "Cyclops Shock Attack", "Flame Dragon Breath", "Frost Dragon Breath", "Storm Dragon Breath", "Charge", "Wraith Drain", "Fairy Ring", "Spirit Shield", "Shock Shield", "Protection Shield", "Zombie Breath", "Wallop", "Sunder", "Banish", "Harpy Flame Familiar", "Pet Rock Familiar", "Storm Cloud Familiar", "Frost Sprite Familiar", "Create Soul Jar", "Cherub Familiar", "Fungus Familiar", "Seahorse Familiar", "Volley", "Ent Whip", "Dive", "Disobedience", "Cancel Flight", "Spirit Hurricane", "Recall", "Rake", "Time Familiar", "Arcane Familiar"};
        field_F = "Chosen Spells";
        field_y = "It looks like one of your imps managed to hurt you. Try to avoid this in future, since, outside of this training area, you will not get instantly healed back up to full health.";
        field_z = " charge left";
        field_C = "Click";
        field_B = new int[]{30, 31, 32};
        field_D = new boolean[]{false, false, false, true, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, false, false, false, true, false, true, true, true, true, true, true, false, true, true, true, true, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        field_E = "Now, clicking near the selected Imp will make it blow up! Move to a target and try it out.";
    }
}
