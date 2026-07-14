/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pe {
    static tf field_b;
    static Calendar field_a;
    static int field_c;

    public static void a(int param0) {
        if (param0 != 7) {
            boolean discarded$0 = pe.a(true);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(fm param0, byte param1) {
        if (param1 > -82) {
            return true;
        }
        return param0.a((byte) 92);
    }

    final static void a(int param0, int param1, long param2) {
        pc var4 = aa.field_f;
        var4.g(param1, 15514);
        var4.field_m = var4.field_m + 1;
        int var5 = var4.field_m;
        var4.e(160, param0);
        var4.a(false, param2);
        var4.f(var4.field_m - var5, -1);
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        am.field_e = true;
        if (param0) {
          L0: {
            pe.a(-106, 76, -70L);
            mc.field_q = 15000L + hm.a(64);
            if ((el.field_b ^ -1) != -12) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            mc.field_q = 15000L + hm.a(64);
            if ((el.field_b ^ -1) != -12) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new tf(640, 480);
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
