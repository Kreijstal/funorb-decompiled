/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uaa {
    static String field_d;
    static jea field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 5193) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static int a(byte param0, gqa param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = sva.field_d;
        if (param1.field_d != 2) {
          if (-5 != (param1.field_d ^ -1)) {
            if ((param1.field_i ^ -1L) == (rb.field_r ^ -1L)) {
              var2 = pm.field_a[param1.field_d];
              var3 = 42 / ((param0 - -71) / 44);
              return var2;
            } else {
              var2 = bma.field_t[param1.field_d];
              var3 = 42 / ((param0 - -71) / 44);
              return var2;
            }
          } else {
            var2 = bma.field_t[param1.field_d];
            var3 = 42 / ((param0 - -71) / 44);
            return var2;
          }
        } else {
          if (!param1.field_m) {
            if (0 == param1.field_c) {
              if (-1 != (param1.field_o ^ -1)) {
                var2 = bma.field_t[param1.field_d];
                var3 = 42 / ((param0 - -71) / 44);
                return var2;
              } else {
                var2 = pm.field_a[param1.field_d];
                var3 = 42 / ((param0 - -71) / 44);
                return var2;
              }
            } else {
              var2 = bma.field_t[param1.field_d];
              var3 = 42 / ((param0 - -71) / 44);
              return var2;
            }
          } else {
            var2 = sva.field_d;
            var3 = 42 / ((param0 - -71) / 44);
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Gold Medal Award";
        field_c = "<%0> wants to join";
    }
}
