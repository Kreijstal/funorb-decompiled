/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_a;

    final static void a(int param0, boolean param1, int param2) {
        hn var3 = null;
        hn var4 = null;
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (param1) {
          var3 = (hn) (Object) da.field_h.d(-9033);
          L0: while (true) {
            if (var3 != null) {
              if (-10 == (var3.field_i ^ -1)) {
                var3.c((byte) -109);
                var3 = (hn) (Object) da.field_h.d(-9033);
                continue L0;
              } else {
                var4 = ic.field_h.a(param2, -86, param0);
                ii.a(var4, 85);
                return;
              }
            } else {
              var4 = ic.field_h.a(param2, -86, param0);
              ii.a(var4, 85);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -10) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Leagues";
    }
}
