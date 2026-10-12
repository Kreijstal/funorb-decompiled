/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static gu field_e;
    static String[] field_a;
    static String[] field_c;
    static je field_d;
    static bi field_b;

    public static void b(int param0) {
        if (param0 == 256) {
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
        field_d = (je) null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_e = null;
    }

    final static int a(int param0) {
        if (param0 != 25213) {
          return -16;
        }
        return ms.field_r;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 0) {
          return 0;
        }
        if (0 > param0) {
          throw new IllegalArgumentException("");
        }
        if (32768 > param0) {
          if (param0 < 128) {
            if (param0 < 8) {
              if (param0 < 2) {
                return 256;
              }
              var2 = 7;
            } else {
              var2 = (param0 >= 32) ? 5 : 6;
            }
          } else {
            if (param0 >= 2048) {
              var2 = (8192 > param0) ? 2 : 1;
            } else {
              var2 = (512 <= param0) ? 3 : 4;
            }
          }
          param0 = param0 << (var2 << 1);
          return jn.field_f[param0 - 32768] >> var2;
        }
        if (param0 < 131072) {
          if (param1 == -129) {
            return jn.field_f[-32768 + param0];
          }
          so.a(105);
          return jn.field_f[-32768 + param0];
        }
        if (33554432 <= param0) {
          if (param0 >= 536870912) {
            var2Lifetime1 = 7;
          } else {
            var2Lifetime1 = (param0 < 134217728) ? 5 : 6;
          }
        } else {
          if (param0 >= 2097152) {
            var2Lifetime1 = (param0 >= 8388608) ? 4 : 3;
          } else {
            var2Lifetime1 = (param0 < 524288) ? 1 : 2;
          }
        }
        param0 = param0 >> (var2Lifetime1 << 1);
        return jn.field_f[param0 - 32768] << var2Lifetime1;
    }

    static {
        field_e = new gu();
        field_a = new String[]{"Good Learner", "Dawn of Battle", "First Blood", "Saradomin Be With You", "Strength Through Chaos", "Fist of Guthix", "Light of 1,000 Crystals", "Big High War God", "Tumeken Rises This Morn", "Tactically Agnostic", "Bulletproof Monk", "Thinking with Portals", "Armageddon", "Army of Bones", "Got To Get Them All", "Dragonslayer", "Immortal", "Fear of Flying", "Warmonger", "Warlord", "Warmaster", "Tactically Atheistic", "Hail to the Chief", "Fragmentation", "Apocalypse", "Agree to Disagree", "Team Player", "My Sphinx, Therefore, I Can", "Sole Survivor", "Dead Weight", "Multi Faith Society", "Share and Enjoy", "Monster Feast", "Peril of the Plains", "Sire of the Sands", "Wrath of Winter", "Master of the Marshes", "Dread of Destruction", "Zamorak's Supremacy", "Zamorak's Silver", "Zamorak's Gold", "Plucking Feathers", "Push to the East", "Zarosian Purge", "Run, Dwarves, Escape!", "Saradomin's Silver", "Saradomin's Gold", "Peddewa Sieged", "The Brothers March", "Zaros Surrounded", "Beep, Beep", "Guthix's Silver", "Guthix's Gold", "Take a Chair", "Scarecrow", "Twilight of the Gods"};
        field_c = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
