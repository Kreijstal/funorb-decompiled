/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends hf {
    static String field_h;
    static mg field_f;
    static int field_i;
    static na field_g;

    final static nd a(String param0, int param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        nd var5 = null;
        if (param0 != null) {
          if (0 != param0.length()) {
            var2 = param0.indexOf('@');
            if (0 != (var2 ^ -1)) {
              var3 = param0.substring(0, var2);
              var4 = param0.substring(param1 + var2);
              var5 = r.a(var3, true);
              if (var5 != null) {
                return var5;
              } else {
                return fe.a(var4, false);
              }
            } else {
              return pj.field_f;
            }
          } else {
            return fb.field_j;
          }
        } else {
          return fb.field_j;
        }
    }

    public static void b(boolean param0) {
        field_h = null;
        field_f = null;
        field_g = null;
        if (param0) {
            field_g = null;
        }
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unpacking music";
    }
}
