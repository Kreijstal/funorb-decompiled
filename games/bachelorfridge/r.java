/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class r extends pu {
    static kv field_n;
    static lo field_m;
    static sna[] field_l;

    final static void a(int[] param0, int param1, vr param2, String[][] param3, byte[] param4, byte[] param5, String[] param6, int param7, vr param8, vr param9, String[][] param10, kv[][] param11, boolean param12, kv[][] param13, int param14) {
        fd.a(param0, param8, param14, param1 + 1, param5, param9, param12, param2, (int[]) null, param7, (ee[]) null, param11, param13, param4, param3, param10, param6);
        if (param1 != -1) {
            field_m = null;
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_n = null;
        field_l = null;
        if (param0 != -1) {
            r.a((int[]) null, -60, (vr) null, (String[][]) null, (byte[]) null, (byte[]) null, (String[]) null, 7, (vr) null, (vr) null, (String[][]) null, (kv[][]) null, true, (kv[][]) null, 53);
        }
    }

    final static void a(int param0, int param1, Random param2, eaa param3) {
        rea var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var4 = (rea) (Object) param3.b((byte) 90);
        L0: while (true) {
          if (var4 == null) {
            var5 = 47 / ((-36 - param0) / 62);
            return;
          } else {
            L1: {
              var4.field_n = var4.field_n + var4.field_h;
              if ((var4.field_n + var4.field_h ^ -1) > -1) {
                var4.a(false);
                break L1;
              } else {
                var4.field_l = var4.field_l + var4.field_o;
                int discarded$4 = kla.a(50, param2, -2147483648);
                break L1;
              }
            }
            var4 = (rea) (Object) param3.c(0);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new lo();
    }
}
