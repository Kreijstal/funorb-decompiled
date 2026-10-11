/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static ub field_c;
    static String field_b;
    static String field_d;
    static cn field_a;
    static String field_e;

    final static void a(int param0) {
        el.field_h[0] = cm.a(128, 5, 0, 1);
        el.field_h[1] = cm.a(128, 5, 1, 1);
        nh.field_L = cj.a(6, param0);
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -24) {
          return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    final static int a(byte param0, int param1) {
        int stackIn_21_0 = 0;
        int stackIn_37_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        Exception var2 = null;
        try {
          var2_int = ln.field_a.field_u[param1];
          if (ln.field_a.field_r[param1] &&
            pa.field_d &&
            ln.field_a.field_c[param1] == 2) {
            var2_int = 0;
          }
          if (ln.field_a.field_i[param1] < var2_int &&
            r.field_a > 0) {
            var2_int = ln.field_a.field_i[param1];
          }
          if (25 < var2_int) {
            var2_int = 25;
          }
          if (ln.field_a.field_f[param1] == 0) {
            var2_int = 0;
          } else {
            if (bm.field_c == 0 &&
              rl.field_c == 2 &&
              ha.field_t != 14 && (!(ln.field_a.field_y[param1] < 480) ||
              ln.field_a.field_o[param1] >> 8 == 4)) {
              var2_int = 0;
            }
          }
          if (param0 > -103) {
            stackIn_21_0 = 34;
            return stackIn_21_0;
          }
          if (ln.field_a.field_o[param1] > 0 &&
            0 == ak.field_b[ln.field_a.field_o[param1]].field_a) {
            var2_int = 25;
          }
          if ((cj.field_I & 2) == 0) {
            if (0 > var2_int) {
              var2_int = 0;
            }
            return var2_int;
          }
          if (ln.field_a.field_o[param1] != -1 &&
            (ln.field_a.field_o[param1] & 255) != 0 &&
            0 < ak.field_b[ln.field_a.field_o[param1]].field_a) {
            var2_int = 25;
          }
          if (0 > var2_int) {
            var2_int = 0;
          }
          stackIn_37_0 = var2_int;
          return stackIn_37_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
          return 0;
        }
    }

    static {
        field_b = "So many eggs. I should be careful.";
        field_c = new ub();
        field_d = "Main Menu";
        field_e = "This rocket launcher should help clear the way.";
    }
}
