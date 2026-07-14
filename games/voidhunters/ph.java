/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends rqa {
    static int field_o;

    ph(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        var2 = param1 % 1000;
        if (param0 == 10) {
          L0: {
            var3 = param1 / 1000;
            var4 = var3 / 60;
            var3 = var3 % 60;
            var5 = "";
            if (var4 <= 0) {
              break L0;
            } else {
              var5 = var5 + var4 + iw.field_D + ":";
              break L0;
            }
          }
          if (0 >= var4) {
            if (0 < var3) {
              var5 = var5 + var3 + htb.field_v;
              return var5;
            } else {
              var5 = var5 + var2 + scb.field_p;
              return var5;
            }
          } else {
            var5 = var5 + var3 + htb.field_v;
            return var5;
          }
        } else {
          return null;
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(128, 62, param0[0].a(28));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
