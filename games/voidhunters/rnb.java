/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rnb extends rqa {
    static String field_o;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        if (param5 == param3) {
          if (param2 == param4) {
            param5++;
            og.field_r.c(param5, 1, param0, param4, param3, param2);
            if (param1 <= 1) {
              rnb.a(59, (byte) -18, 107, 110, 95, -108);
              return;
            } else {
              return;
            }
          } else {
            og.field_r.c(param5, 1, param0, param4, param3, param2);
            if (param1 <= 1) {
              rnb.a(59, (byte) -18, 107, 110, 95, -108);
              return;
            } else {
              return;
            }
          }
        } else {
          og.field_r.c(param5, 1, param0, param4, param3, param2);
          if (param1 <= 1) {
            rnb.a(59, (byte) -18, 107, 110, 95, -108);
            return;
          } else {
            return;
          }
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != 127) {
            field_o = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(90, 62, param0[0].a(83));
        if (param1 >= -119) {
          rnb.e((byte) -13);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    rnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            field_o = null;
            return psb.field_b != null ? true : bsa.field_o;
        }
        return psb.field_b != null ? true : bsa.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> might change the options - wait and see.";
    }
}
