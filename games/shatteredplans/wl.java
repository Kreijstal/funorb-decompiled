/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static String field_e;
    static bi field_d;
    static String field_b;
    static String field_c;
    static vi field_a;
    static vd field_f;

    final static void a(int param0, int param1, ag[] param2) {
        ag var3 = null;
        int var4 = 0;
        int var5 = 0;
        ag var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 > 22) {
          var6 = param2[param0];
          var3 = var6;
          var4 = param0 + -1;
          L0: while (true) {
            if (var4 >= 0) {
              if (-1 >= (param2[var4].a(var3, -101) ^ -1)) {
                param2[1 + var4] = param2[var4];
                var4--;
                continue L0;
              } else {
                param2[var4 - -1] = var6;
                return;
              }
            } else {
              param2[0] = var6;
              return;
            }
          }
        } else {
          field_d = null;
          var6 = param2[param0];
          var3 = var6;
          var4 = param0 + -1;
          L1: while (true) {
            if (var4 >= 0) {
              if (-1 >= (param2[var4].a(var3, -101) ^ -1)) {
                param2[1 + var4] = param2[var4];
                var4--;
                continue L1;
              } else {
                param2[var4 - -1] = var6;
                return;
              }
            } else {
              param2[0] = var6;
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != 85) {
          var2 = null;
          wl.a(-6, -65, (ag[]) null);
          field_c = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Log in";
        field_b = "Players";
        field_c = "<%1> fleets have retreated to <%0>";
    }
}
