/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static int field_a;
    private static String field_z;

    final static sj a(int param0, int param1, int param2, int param3, int param4) {
        sj var5 = null;
        sj var5_ref = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param1 <= -55) {
          var5 = (sj) (Object) il.field_b.a(true);
          L0: while (true) {
            if (var5 != null) {
              if (param4 == var5_ref.field_h) {
                return var5_ref;
              } else {
                var5 = (sj) (Object) il.field_b.f(2);
                continue L0;
              }
            } else {
              var5_ref = new sj();
              var5_ref.field_h = param4;
              var5_ref.field_m = param0;
              var5_ref.field_o = param2;
              il.field_b.b(116, (kd) (Object) var5_ref);
              uh.a(var5_ref, (byte) -121, param3);
              return var5_ref;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ud.A(";
        field_a = 0;
    }
}
