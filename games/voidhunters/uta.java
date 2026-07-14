/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uta extends rqa {
    static int[] field_q;
    static String field_p;
    static String field_o;

    public static void e(byte param0) {
        if (param0 != 112) {
            return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    uta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(69, 62, param0[0].a(116));
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static void a(boolean param0, int param1) {
        pia var2 = null;
        hca.field_o.b(param0, param1 ^ 3970);
        var2 = ada.field_b;
        if (param1 != 4095) {
          L0: {
            uta.a(true, 28);
            if (var2 != null) {
              var2.a(0, hca.field_o.field_u, hca.field_o.field_M);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (var2 != null) {
              var2.a(0, hca.field_o.field_u, hca.field_o.field_M);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Logging in...";
        field_o = "Hide private chat and appear offline to friends";
        field_q = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
