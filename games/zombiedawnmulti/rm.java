/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static StringBuilder field_a;
    static gp field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 80) {
            return;
        }
        field_b = null;
    }

    final static wf a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        wf var8 = null;
        wf var8_ref = null;
        if (param6 != 8128) {
          L0: {
            wf discarded$1 = rm.a(-118, -128, 102, -103, 69, 9, 118, -123);
            var8 = (wf) (Object) dg.field_K.g(41);
            if (var8 == null) {
              var8_ref = new wf();
              break L0;
            } else {
              break L0;
            }
          }
          var8_ref.a(param2, param0, -32, param4, param1, param7, param3, param5);
          return var8_ref;
        } else {
          L1: {
            var8 = (wf) (Object) dg.field_K.g(41);
            if (var8 == null) {
              var8_ref = new wf();
              break L1;
            } else {
              break L1;
            }
          }
          var8_ref.a(param2, param0, -32, param4, param1, param7, param3, param5);
          return var8_ref;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new StringBuilder(80);
    }
}
