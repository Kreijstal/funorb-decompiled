/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt {
    static iu[] field_c;
    static String field_b;
    static fpa field_d;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 <= 105) {
            wt.a((byte) -46);
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        var2 = sv.a((byte) -38, jm.a(param1, -127));
        if (param0 != 30433) {
          L0: {
            field_a = -2;
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (var2 == null) {
              var2 = "";
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        ej.field_a.e(true);
        if (null == ena.field_p) {
          ena.field_p = new vs(ej.field_a, sea.field_o);
          ej.field_a.c((ae) (Object) ena.field_p, 87);
          var1 = 44 % ((param0 - -68) / 49);
          return;
        } else {
          ej.field_a.c((ae) (Object) ena.field_p, 87);
          var1 = 44 % ((param0 - -68) / 49);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Waiting for extra data";
    }
}
