/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ofb extends rqa {
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          tc.a(70, param0[1].a(7), param0[0].a(14));
          return new nc((Object) (Object) "void");
        }
    }

    ofb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static phb a(int param0, int param1, asb param2, int param3) {
        if (!pa.a(param0, param3, param2, param1)) {
            return null;
        }
        return jgb.a(-91);
    }

    final static lkb a(int param0, String param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        lkb var7 = null;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        var2 = param1.length();
        if (var2 != 0) {
          if ((var2 ^ -1) < -256) {
            return qw.field_j;
          } else {
            var3 = up.a((byte) -67, '.', param1);
            if (2 <= var3.length) {
              var4 = var3;
              var5 = param0;
              L0: while (true) {
                if (var4.length > var5) {
                  var6 = var4[var5];
                  var7 = mqa.a(-23150, var6);
                  if (var7 == null) {
                    var5++;
                    continue L0;
                  } else {
                    return var7;
                  }
                } else {
                  return qj.a((byte) -74, var3[-1 + var3.length]);
                }
              }
            } else {
              return br.field_f;
            }
          }
        } else {
          return br.field_f;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
    }
}
