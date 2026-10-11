/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static String field_a;
    static bd field_e;
    static p[] field_b;
    static boolean field_f;
    static fa field_c;
    static nc field_d;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        if (param0 != 0) {
          field_a = (String) null;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        int var1 = lm.e(0);
        int var2 = ti.a((byte) -1);
        ne.field_j.a(var1 + (ac.field_a << 1), s.field_g - ac.field_g, var2 + (ac.field_g << 1), hg.field_f - ac.field_a, 5);
        rh.d((byte) -93);
        if (param0 <= 99) {
          field_e = (bd) null;
        }
    }

    final static void a(boolean param0, int param1) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (ln.field_a.field_c[param1] == 2 ||
            ln.field_a.field_c[param1] == 4) {
            ln.field_a.field_c[param1] = 0;
          }
          if (0 <= ln.field_a.field_o[param1]) {
            if (ck.a(-62, -ln.field_a.field_d + param1)) {
              ln.field_a.field_o[param1 - ln.field_a.field_d] = 664;
            }
            if (ck.a(-74, param1 - 1)) {
              ln.field_a.field_o[-1 + param1] = 679;
            }
            if (ck.a(119, 1 + param1)) {
              ln.field_a.field_o[1 + param1] = 681;
            }
            if (ck.a(-87, ln.field_a.field_d + param1)) {
              ln.field_a.field_o[param1 + ln.field_a.field_d] = 696;
            }
            ln.field_a.field_o[param1] = -1;
          }
          if (ln.field_a.field_c[param1] == 3) {
            for (var2_int = 0; var2_int < el.field_j; var2_int++) {
              if (mm.field_m[var2_int] != null &&
                !mm.field_m[var2_int].field_b &&
                mm.field_m[var2_int].field_i != 0 &&
                mm.field_m[var2_int].field_i != 231 &&
                param1 == mm.field_m[var2_int].field_j.b(-4)) {
                mm.field_m[var2_int].field_I = 0;
                ln.field_a.field_c[param1] = 0;
                break;
              }
            }
          }
          if (ln.field_a.field_f[param1] == 0) {
            ln.field_a.field_f[param1] = 1;
          }
          if (148 == ln.field_a.field_y[param1]) {
            mf.a(!param0, 4);
          }
          if (!param0) {
            return;
          }
          if (ln.field_a.field_y[param1] >= 480 &&
            ln.field_a.field_y[param1] <= 583) {
            return;
          }
          ln.field_a.field_y[param1] = 513;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "wh.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Unpacking music";
        field_c = new fa("usename");
    }
}
