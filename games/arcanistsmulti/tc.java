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
        if (param0) {
          field_D = null;
          return jo.a(0, '*', param1.field_g.length());
        } else {
          return jo.a(0, '*', param1.field_g.length());
        }
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
        h.field_K[param0] = lf.field_h;
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
        if (param0 < 22) {
          field_A = null;
          field_z = null;
          return;
        } else {
          field_z = null;
          return;
        }
    }

    private tc(dj param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(String param0, int param1) {
        CharSequence var3 = null;
        if (ef.field_r) {
          if ((nj.field_c ^ -1) == -3) {
            if (ua.field_S != null) {
              var3 = (CharSequence) (Object) param0;
              if (ua.field_S.equals((Object) (Object) gk.a(var3, -13))) {
                if (param1 != -31046) {
                  return true;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void b(int param0, int param1) {
        ab var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = he.field_e;
        var2.b((byte) -126, param1);
        var2.field_g = var2.field_g + 1;
        if (param0 != 12657) {
          field_E = null;
          var3 = var2.field_g;
          var2.f(5, (byte) -39);
          var2.f(wi.field_f.field_dc, (byte) -3);
          var4 = wi.field_f.field_Pb - -(wi.field_f.field_Fb << -106845594);
          var2.f(var4, (byte) -97);
          var2.a(wi.field_f.field_Wb, 0, (byte) -86, wi.field_f.field_Wb.length);
          var2.b(var2.field_g + -var3, (byte) 43);
          return;
        } else {
          var3 = var2.field_g;
          var2.f(5, (byte) -39);
          var2.f(wi.field_f.field_dc, (byte) -3);
          var4 = wi.field_f.field_Pb - -(wi.field_f.field_Fb << -106845594);
          var2.f(var4, (byte) -97);
          var2.a(wi.field_f.field_Wb, 0, (byte) -86, wi.field_f.field_Wb.length);
          var2.b(var2.field_g + -var3, (byte) 43);
          return;
        }
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
