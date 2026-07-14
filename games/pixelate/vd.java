/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ak field_a;
    static String[] field_d;
    static String field_b;
    static ak field_c;

    final static byte[] a(String param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return fl.field_b.a((byte) 24, param0, "");
    }

    final static void a(boolean param0, aa param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= sd.field_L) {
                tm.field_O[param1.a((byte) -87)] = tm.field_O[param1.a((byte) -87)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= sd.field_L) {
                    sd.field_L = var2;
                    if (!param0) {
                      sd.field_L = sd.field_L + 1;
                      de.field_e[sd.field_L] = param1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L3: {
                      if (de.field_e[var3].field_j != param1.field_j) {
                        break L3;
                      } else {
                        var4 = de.field_e[var3].a((byte) -27);
                        if (tm.field_O[var4] > ee.field_d) {
                          tm.field_O[var4] = tm.field_O[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2++;
                    de.field_e[var2] = de.field_e[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param1.field_j == de.field_e[var2].field_j) {
                  tm.field_O[de.field_e[var2].a((byte) 123)] = tm.field_O[de.field_e[var2].a((byte) 123)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            tm.field_O[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        int var1 = -58 % ((-2 - param0) / 49);
        field_d = null;
        field_a = null;
    }

    final static void a(boolean param0, int param1, int param2, byte param3) {
        a.a(param0, 99);
        if (param3 != -86) {
            field_d = null;
        }
        ra.a(param2, param1, param0, -32268);
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = Pixelate.field_H ? 1 : 0;
        for (var1 = 0; (var1 ^ -1) > -25; var1++) {
            jm.field_d[var1] = new ck();
        }
        if (!param0) {
            Object var3 = null;
            byte[] discarded$0 = vd.a((String) null, 91);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Show all private chat";
        field_d = new String[]{"The marker at the bottom  of the screen will slide towards the player with the <col=FF9900>highest score</col>. Each match consists of 5, 10, or 20 pictures; the player with the highest score after all pictures are finished is declared the winner.", "You", "Opponent", null};
    }
}
