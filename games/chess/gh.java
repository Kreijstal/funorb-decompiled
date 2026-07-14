/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static km[] field_b;
    static tk field_c;
    static int[] field_a;
    static String field_e;
    static String field_d;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 != -1) {
            Object var2 = null;
            String discarded$0 = gh.a((byte[]) null, 100, 123, -101);
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        qa.a((byte) 122, "", param0);
        jd.a((byte) -117, param0);
        if (param1 != -161) {
            field_a = null;
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        var9 = Chess.field_G;
        if (param2 != -161) {
          return null;
        } else {
          var12 = new char[param3];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          var6 = 0;
          L0: while (true) {
            if (param3 <= var6) {
              return new String(var12, 0, var5);
            } else {
              var7 = param0[param1 + var6] & 255;
              if (-1 != var7) {
                L1: {
                  if (-129 > var7) {
                    break L1;
                  } else {
                    if (-161 < (var7 ^ -1)) {
                      L2: {
                        var8 = jn.field_M[var7 + -128];
                        if (var8 != 0) {
                          break L2;
                        } else {
                          var8 = 63;
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                var5++;
                var10[var5] = (char)var7;
                var6++;
                var6++;
                continue L0;
              } else {
                var6++;
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tk();
        field_e = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_d = "Mouse over an icon for details";
    }
}
