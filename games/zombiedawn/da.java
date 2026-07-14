/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends le {
    static dj field_l;
    static sf field_j;
    static String field_i;
    static int field_h;
    static String field_m;
    static int field_n;
    int field_k;

    public static void c(byte param0) {
        field_j = null;
        field_l = null;
        if (param0 <= 55) {
          field_h = -12;
          field_m = null;
          field_i = null;
          return;
        } else {
          field_m = null;
          field_i = null;
          return;
        }
    }

    final static void d(byte param0) {
        am var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        if (param0 != -48) {
          return;
        } else {
          var1 = dp.field_e;
          L0: while (true) {
            if (!jh.a((byte) 103)) {
              return;
            } else {
              var1.j(11, 8);
              var1.field_j = var1.field_j + 1;
              var2 = var1.field_j + 1;
              dn.a(var1, 84);
              dp.field_e.d(-128, var1.field_j + -var2);
              continue L0;
            }
          }
        }
    }

    da(int param0) {
        ((da) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = null;
        field_h = 25;
        field_n = 15;
    }
}
