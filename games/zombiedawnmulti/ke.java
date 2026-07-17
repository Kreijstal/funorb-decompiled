/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke {
    static int field_b;
    static pi field_f;
    static cj field_j;
    static fm field_h;
    static String field_k;
    static String field_d;
    static String field_e;
    static ra field_g;
    static String field_a;
    static String field_c;
    static ja[] field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            ah.field_e.field_P[param1] = new int[ah.field_e.field_P[0].length];
            ah.field_e.field_P[param1][ia.field_s] = param0;
            ah.field_e.field_P[param1][rj.field_F] = param3;
            ah.field_e.field_P[param1][wm.field_Q[0]] = param4;
            var5_int = 1;
            L1: while (true) {
              if (wm.field_Q.length <= var5_int) {
                break L0;
              } else {
                ah.field_e.field_P[param1][wm.field_Q[var5_int]] = ui.a(ah.field_e.field_P[param1][wm.field_Q[var5_int + -1]], false);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var5, "ke.A(" + param0 + 44 + param1 + 44 + -17895 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static String a(int param0, long param1) {
        cp.field_U.setTime(new Date(param1));
        int var3 = cp.field_U.get(7);
        int var4 = cp.field_U.get(5);
        int var5 = cp.field_U.get(2);
        int var6 = cp.field_U.get(1);
        int var7 = cp.field_U.get(11);
        int var8 = cp.field_U.get(12);
        int var9 = cp.field_U.get(13);
        return ud.field_O[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + hm.field_q[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    public static void a() {
        field_i = null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_j = null;
        field_k = null;
        field_e = null;
        field_g = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new pi(0);
        field_d = "Accept invitation to <%0>'s game";
        field_k = "There are no valid types of game that match your preferences.";
        field_c = "Concluded";
        field_e = "Played";
        field_a = "Inviting <%0>";
    }
}
