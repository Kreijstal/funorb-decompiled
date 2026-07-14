/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends oh {
    static String field_m;
    static int field_j;
    ln field_l;
    fs field_k;
    static pf field_h;
    int field_i;

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var12 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var10 = new char[param1];
        var12 = var10;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (param1 <= var6) {
            if (param3 > -113) {
              qi.a(0);
              return new String(var12, 0, var5);
            } else {
              return new String(var12, 0, var5);
            }
          } else {
            var7 = param0[var6 + param2] & 255;
            if (var7 != 0) {
              L1: {
                if ((var7 ^ -1) > -129) {
                  break L1;
                } else {
                  if (160 <= var7) {
                    break L1;
                  } else {
                    L2: {
                      var8 = tl.field_p[var7 + -128];
                      if (var8 == 0) {
                        var8 = 63;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var7 = var8;
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

    public static void a(int param0) {
        field_m = null;
        field_h = null;
        if (param0 != 0) {
            Object var2 = null;
            String discarded$0 = qi.a((byte[]) null, 50, -16, 91);
        }
    }

    qi(ln param0, fs param1, int param2) {
        ((qi) this).field_k = param1;
        ((qi) this).field_i = param2;
        ((qi) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "ESC - cancel this line";
    }
}
