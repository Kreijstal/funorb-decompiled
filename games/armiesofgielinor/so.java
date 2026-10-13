/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static ValidationState validationChecking;
    static String[] field_a;
    static String[] field_c;
    static ClientUiComponent field_d;
    static bi field_b;

    public static void b(int param0) {
        if (param0 == 256) {
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          validationChecking = null;
          return;
        }
        field_d = (ClientUiComponent) null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
        validationChecking = null;
    }

    final static int a(int param0) {
        if (param0 != 25213) {
          return -16;
        }
        return DualLinkedNode.field_r;
    }

    final static int sqrtFixed16(int value, int obfuscationGuard) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (value == 0) {
          return 0;
        }
        if (0 > value) {
          throw new IllegalArgumentException("");
        }
        if (32768 > value) {
          if (value < 128) {
            if (value < 8) {
              if (value < 2) {
                return 256;
              }
              var2 = 7;
            } else {
              var2 = (value >= 32) ? 5 : 6;
            }
          } else {
            if (value >= 2048) {
              var2 = (8192 > value) ? 2 : 1;
            } else {
              var2 = (512 <= value) ? 3 : 4;
            }
          }
          value = value << (var2 << 1);
          return jn.field_f[value - 32768] >> var2;
        }
        if (value < 131072) {
          if (obfuscationGuard == -129) {
            return jn.field_f[-32768 + value];
          }
          so.a(105);
          return jn.field_f[-32768 + value];
        }
        if (33554432 <= value) {
          if (value >= 536870912) {
            var2Lifetime1 = 7;
          } else {
            var2Lifetime1 = (value < 134217728) ? 5 : 6;
          }
        } else {
          if (value >= 2097152) {
            var2Lifetime1 = (value >= 8388608) ? 4 : 3;
          } else {
            var2Lifetime1 = (value < 524288) ? 1 : 2;
          }
        }
        value = value >> (var2Lifetime1 << 1);
        return jn.field_f[value - 32768] << var2Lifetime1;
    }

    static {
        validationChecking = new ValidationState();
        field_a = new String[]{"Good Learner", "Dawn of Battle", "First Blood", "Saradomin Be With You", "Strength Through Chaos", "Fist of Guthix", "Light of 1,000 Crystals", "Big High War God", "Tumeken Rises This Morn", "Tactically Agnostic", "Bulletproof Monk", "Thinking with Portals", "Armageddon", "Army of Bones", "Got To Get Them All", "Dragonslayer", "Immortal", "Fear of Flying", "Warmonger", "Warlord", "Warmaster", "Tactically Atheistic", "Hail to the Chief", "Fragmentation", "Apocalypse", "Agree to Disagree", "Team Player", "My Sphinx, Therefore, I Can", "Sole Survivor", "Dead Weight", "Multi Faith Society", "Share and Enjoy", "Monster Feast", "Peril of the Plains", "Sire of the Sands", "Wrath of Winter", "Master of the Marshes", "Dread of Destruction", "Zamorak's Supremacy", "Zamorak's Silver", "Zamorak's Gold", "Plucking Feathers", "Push to the East", "Zarosian Purge", "Run, Dwarves, Escape!", "Saradomin's Silver", "Saradomin's Gold", "Peddewa Sieged", "The Brothers March", "Zaros Surrounded", "Beep, Beep", "Guthix's Silver", "Guthix's Gold", "Take a Chair", "Scarecrow", "Twilight of the Gods"};
        field_c = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
