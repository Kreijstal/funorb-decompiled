/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub implements uj {
    static String field_b;
    static String field_c;
    static String[] field_a;

    public static void b(int param0) {
        if (param0 < 16) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    public final void a(boolean param0) {
        wm.field_e = true;
        if (param0) {
          field_a = (String[]) null;
          vi.field_h = true;
          return;
        }
        vi.field_h = true;
    }

    final static boolean a(int param0) {
        int var2 = 0;
        gl var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        gl var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          var4 = (gl) (on.field_t.b(123));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != 14921) {
            ub.b(20);
          }
          for (var2 = 0; var1.field_y > var2; var2++) {
            if (var4.field_r[var2] != null &&
              var4.field_r[var2].field_c == 0) {
              return false;
            }
            if (null != var4.field_q[var2] &&
              var4.field_q[var2].field_c == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "ub.E(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1) {
        if ((long)param1 >= 65536L) {
          if ((long)param1 >= 16777216L) {
            if (268435456L <= (long)param1) {
              if ((long)param1 >= 1073741824L) {
                return kf.field_e[param1 >> 24];
              }
              return kf.field_e[param1 >> 22] >> 1;
            }
            if ((long)param1 < 67108864L) {
              return kf.field_e[param1 >> 18] >> 3;
            }
            return kf.field_e[param1 >> 20] >> 2;
          }
          if ((long)param1 >= 1048576L) {
            if (4194304L > (long)param1) {
              return kf.field_e[param1 >> 14] >> 5;
            }
            return kf.field_e[param1 >> 16] >> 4;
          }
          if ((long)param1 < 262144L) {
            return kf.field_e[param1 >> 10] >> 7;
          }
          return kf.field_e[param1 >> 12] >> 6;
        }
        if ((long)param1 >= 256L) {
          if (4096L > (long)param1) {
            if ((long)param1 >= 1024L) {
              return kf.field_e[param1 >> 4] >> 10;
            }
            return kf.field_e[param1 >> 2] >> 11;
          }
          if ((long)param1 >= 16384L) {
            return kf.field_e[param1 >> 8] >> 8;
          }
          return kf.field_e[param1 >> 6] >> 9;
        }
        if (param1 >= 0) {
          return kf.field_e[param1] >> 12;
        }
        if (param0 == -1237818874) {
          return -1;
        }
        return -44;
    }

    public final String a(byte param0) {
        int var2 = -85 / ((param0 + 33) / 62);
        return "Just render player and light";
    }

    static {
        field_c = "Loading graphics";
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
