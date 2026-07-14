/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends rqa {
    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(154, 85));
    }

    sk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static le a(ds param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        if (param1 < 50) {
            return null;
        }
        int discarded$0 = param0.e((byte) -96);
        int var2 = param0.e((byte) -108);
        le var3 = hr.a(false, var2);
        var3.field_h = param0.e((byte) -114);
        int var4 = param0.e((byte) -117);
        for (var5 = 0; var5 < var4; var5++) {
            var6 = param0.e((byte) -118);
            var3.a(var6, -116, param0);
        }
        var3.c((byte) -67);
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (param1 > param3) {
            var7 = param3;
            var5 = var7;
            L1: while (true) {
              if (param1 <= var7) {
                break L0;
              } else {
                rba.field_b[var7][param2] = param4;
                var7++;
                continue L1;
              }
            }
          } else {
            var5 = param1;
            L2: while (true) {
              if (param3 <= var5) {
                break L0;
              } else {
                rba.field_b[var5][param2] = param4;
                var5++;
                continue L2;
              }
            }
          }
        }
        if (param0 < -96) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
