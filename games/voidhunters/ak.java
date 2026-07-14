/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends rqa {
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((ak) this).a((nc[]) null, 27);
          si.a(214, 62, param0[0].a(113));
          return new nc((Object) (Object) "void");
        } else {
          si.a(214, 62, param0[0].a(113));
          return new nc((Object) (Object) "void");
        }
    }

    ak(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int e(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (null != fwa.field_g) {
          var1 = 0;
          var2 = 3;
          L0: while (true) {
            if (12 <= var2) {
              return var1;
            } else {
              var3 = fwa.field_g.field_c[var2];
              if (!fwa.field_g.a(var3, true, false)) {
                if (!fwa.field_g.c(var3, 78)) {
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  var1++;
                  var2++;
                  var2++;
                  continue L0;
                }
              } else {
                var1++;
                var2++;
                var2++;
                continue L0;
              }
            }
          }
        } else {
          var1 = 107 % ((param0 - -59) / 38);
          return 9;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
    }
}
