/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ai {
    static String field_g;
    static int field_h;
    static int field_j;
    static long field_i;

    private qa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 19108) {
            Object var2 = null;
            String discarded$0 = qa.a((CharSequence) null, true);
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        var2 = pa.a(ma.a((byte) 120, param0), 7);
        if (!param1) {
          L0: {
            field_g = null;
            if (var2 != null) {
              break L0;
            } else {
              var2 = "";
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (var2 != null) {
              break L1;
            } else {
              var2 = "";
              break L1;
            }
          }
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Cancel";
        field_h = 0;
        field_j = 0;
    }
}
