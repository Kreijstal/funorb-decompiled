/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aab extends rqa {
    static hbb field_o;

    aab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(tsa[] param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param1 == -25223) {
          var3 = 0;
          L0: while (true) {
            if (param0.length - 1 > var3) {
              if (param0[var3 + 1].field_g <= param2 - 1) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return -1 + param0.length;
            }
          }
        } else {
          return -105;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          return null;
        } else {
          si.a(72, 62, param0[0].a(46));
          return new nc((Object) (Object) "void");
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            aab.b(true);
        }
    }

    static {
    }
}
