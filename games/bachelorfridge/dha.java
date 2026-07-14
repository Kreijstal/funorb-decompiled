/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dha {
    int field_a;
    static kf field_b;
    static String field_d;
    int field_c;

    final static int a(int param0, byte param1, String param2, boolean param3, String param4, int param5, String param6) {
        hh var7 = null;
        hh var8 = null;
        var7 = new hh(param2);
        var8 = new hh(param4);
        if (param1 != 53) {
          return -12;
        } else {
          return iv.a(-15, param5, param0, var7, param6, param3, var8);
        }
    }

    final static boolean a(int param0, bca param1, gj param2) {
        aga var3 = null;
        pp var4 = null;
        ad var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var3 = param1.field_l.a(60, param2.field_h);
        if (!var3.i(-69)) {
          ad discarded$1 = param1.field_l.a(-27449, param2);
          if (param0 > -87) {
            return true;
          } else {
            var4 = (pp) (Object) param1.field_o.b((byte) 90);
            L0: while (true) {
              if (var4 == null) {
                return true;
              } else {
                var5 = var4.field_h.a(-27449, param2);
                var5.b(-1, 6);
                var4.a(var3, param2.field_h, 12);
                var4 = (pp) (Object) param1.field_o.c(0);
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static int a(byte param0, int param1) {
        String var2 = null;
        String var2_ref = null;
        int var3 = 0;
        var3 = 51 % ((param0 - -73) / 34);
        var2 = lka.field_E[param1][16];
        var2_ref = var2.trim();
        var2_ref = var2_ref.toLowerCase();
        if (var2_ref.equals((Object) (Object) "")) {
          return -1;
        } else {
          return ((ji) (Object) cma.field_x.a(true, (long)var2_ref.hashCode())).field_h;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (!param0) {
            int discarded$0 = dha.a((byte) 25, 125);
        }
    }

    final static void a(eaa param0, int param1, Random param2, int param3) {
        int var4 = 0;
        rea var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var4 = 64 / ((param3 - -22) / 47);
        var5 = (rea) (Object) param0.b((byte) 90);
        L0: while (true) {
          if (var5 == null) {
            return;
          } else {
            L1: {
              var5.field_n = var5.field_n + var5.field_h;
              if (0 > var5.field_n + var5.field_h) {
                var5.a(false);
                break L1;
              } else {
                var5.field_l = var5.field_l + var5.field_o;
                int discarded$4 = kla.a(50, param2, -2147483648);
                break L1;
              }
            }
            var5 = (rea) (Object) param0.c(0);
            continue L0;
          }
        }
    }

    dha(int param0, int param1) {
        ((dha) this).field_a = param1;
        ((dha) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Private";
        field_b = new kf();
    }
}
