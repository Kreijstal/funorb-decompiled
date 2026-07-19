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
        int[] array$4 = null;
        String discarded$5 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              array$4 = new int[ah.field_e.field_P[0].length];
              ah.field_e.field_P[param1] = array$4;
              ah.field_e.field_P[param1][ia.field_s] = param0;
              ah.field_e.field_P[param1][rj.field_F] = param3;
              ah.field_e.field_P[param1][wm.field_Q[0]] = param4;
              if (param2 == -17895) {
                break L1;
              } else {
                discarded$5 = ke.a(92, -5L);
                break L1;
              }
            }
            var5_int = 1;
            L2: while (true) {
              if (wm.field_Q.length <= var5_int) {
                break L0;
              } else {
                ah.field_e.field_P[param1][wm.field_Q[var5_int]] = ui.a(ah.field_e.field_P[param1][wm.field_Q[var5_int + -1]], false);
                var5_int++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "ke.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        cp.field_U.setTime(new Date(param1));
        var3 = cp.field_U.get(7);
        var4 = cp.field_U.get(5);
        var5 = cp.field_U.get(2);
        var6 = cp.field_U.get(1);
        var7 = cp.field_U.get(11);
        var8 = cp.field_U.get(12);
        if (param0 != -29971) {
          field_b = -87;
          var9 = cp.field_U.get(13);
          return ud.field_O[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + hm.field_q[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var9 = cp.field_U.get(13);
          return ud.field_O[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + hm.field_q[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_c = null;
        if (param0) {
          return;
        } else {
          field_h = null;
          field_f = null;
          field_j = null;
          field_k = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        field_f = new pi(0);
        field_d = "Accept invitation to <%0>'s game";
        field_k = "There are no valid types of game that match your preferences.";
        field_c = "Concluded";
        field_e = "Played";
        field_a = "Inviting <%0>";
    }
}
