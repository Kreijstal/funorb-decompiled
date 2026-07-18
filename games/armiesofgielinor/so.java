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
        if (param0 != 256) {
          field_d = null;
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static int a(int param0) {
        return ms.field_r;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 0) {
          if (0 > param0) {
            throw new IllegalArgumentException("");
          } else {
            if (32768 > param0) {
              if (param0 < 128) {
                if (param0 >= 8) {
                  if (param0 < 32) {
                    var2 = 6;
                    param0 = param0 << (var2 << 1);
                    return jn.field_f[param0 - 32768] >> var2;
                  } else {
                    var2 = 5;
                    param0 = param0 << (var2 << 1);
                    return jn.field_f[param0 - 32768] >> var2;
                  }
                } else {
                  if (param0 >= 2) {
                    var2 = 7;
                    param0 = param0 << (var2 << 1);
                    return jn.field_f[param0 - 32768] >> var2;
                  } else {
                    return 256;
                  }
                }
              } else {
                if (param0 >= 2048) {
                  if (8192 <= param0) {
                    var2 = 1;
                    param0 = param0 << (var2 << 1);
                    return jn.field_f[param0 - 32768] >> var2;
                  } else {
                    var2 = 2;
                    param0 = param0 << (var2 << 1);
                    return jn.field_f[param0 - 32768] >> var2;
                  }
                } else {
                  if (512 <= param0) {
                    var2 = 3;
                    param0 = param0 << (var2 << 1);
                    return jn.field_f[param0 - 32768] >> var2;
                  } else {
                    var2 = 4;
                    param0 = param0 << (var2 << 1);
                    return jn.field_f[param0 - 32768] >> var2;
                  }
                }
              }
            } else {
              if (param0 < 131072) {
                return jn.field_f[-32768 + param0];
              } else {
                if (33554432 <= param0) {
                  if (param0 < 536870912) {
                    if (param0 >= 134217728) {
                      var2 = 6;
                      param0 = param0 >> (var2 << 1);
                      return jn.field_f[param0 - 32768] << var2;
                    } else {
                      var2 = 5;
                      param0 = param0 >> (var2 << 1);
                      return jn.field_f[param0 - 32768] << var2;
                    }
                  } else {
                    var2 = 7;
                    param0 = param0 >> (var2 << 1);
                    return jn.field_f[param0 - 32768] << var2;
                  }
                } else {
                  if (param0 >= 2097152) {
                    if (param0 < 8388608) {
                      var2 = 3;
                      param0 = param0 >> (var2 << 1);
                      return jn.field_f[param0 - 32768] << var2;
                    } else {
                      var2 = 4;
                      param0 = param0 >> (var2 << 1);
                      return jn.field_f[param0 - 32768] << var2;
                    }
                  } else {
                    if (param0 >= 524288) {
                      var2 = 2;
                      param0 = param0 >> (var2 << 1);
                      return jn.field_f[param0 - 32768] << var2;
                    } else {
                      var2 = 1;
                      param0 = param0 >> (var2 << 1);
                      return jn.field_f[param0 - 32768] << var2;
                    }
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new gu();
        field_a = new String[]{"Good Learner", "Dawn of Battle", "First Blood", "Saradomin Be With You", "Strength Through Chaos", "Fist of Guthix", "Light of 1,000 Crystals", "Big High War God", "Tumeken Rises This Morn", "Tactically Agnostic", "Bulletproof Monk", "Thinking with Portals", "Armageddon", "Army of Bones", "Got To Get Them All", "Dragonslayer", "Immortal", "Fear of Flying", "Warmonger", "Warlord", "Warmaster", "Tactically Atheistic", "Hail to the Chief", "Fragmentation", "Apocalypse", "Agree to Disagree", "Team Player", "My Sphinx, Therefore, I Can", "Sole Survivor", "Dead Weight", "Multi Faith Society", "Share and Enjoy", "Monster Feast", "Peril of the Plains", "Sire of the Sands", "Wrath of Winter", "Master of the Marshes", "Dread of Destruction", "Zamorak's Supremacy", "Zamorak's Silver", "Zamorak's Gold", "Plucking Feathers", "Push to the East", "Zarosian Purge", "Run, Dwarves, Escape!", "Saradomin's Silver", "Saradomin's Gold", "Peddewa Sieged", "The Brothers March", "Zaros Surrounded", "Beep, Beep", "Guthix's Silver", "Guthix's Gold", "Take a Chair", "Scarecrow", "Twilight of the Gods"};
        field_c = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
