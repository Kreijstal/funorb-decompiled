/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li extends tc {
    static Random field_n;
    static int[] field_k;
    static String field_p;
    byte[] field_l;
    int field_o;
    static int field_q;
    static String field_m;

    final static void a(int param0) {
        int var1_int = 0;
        wp var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = pr.field_g.field_i >> -1007998672;
              var2 = we.a(var1_int, true);
              io.a(var2, (byte) -34);
              if ((bv.field_w.field_sb ^ -1) >= 0) {
                stackIn_4_0 = bv.field_w.field_gb;
                break L1;
              } else {
                stackIn_4_0 = bv.field_w.field_sb;
                break L1;
              }
            }
            ne.field_i = stackIn_4_0;
            ic.field_f = (int)(106.0 + Math.sin((double)uk.field_n / 3.141592653589793 / (double)param0) * 50.0);
            if (!cu.field_a) {
              kl.field_a.g(200);
              return;
            } else {
              var3 = 0;
              L2: while (true) {
                if (-5 >= (var3 ^ -1)) {
                  break L0;
                } else {
                  kl.field_a.b(var3, param0 + 1745035901);
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "li.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_k = null;
        field_m = null;
        if (param0 != 74) {
            li.a(-95);
            field_n = null;
            return;
        }
        field_n = null;
    }

    li(byte[] param0) {
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new int[8192];
        field_p = "Create a free Account";
        field_n = new Random(6L);
        field_q = -1;
        field_m = "Show lobby chat from my friends";
    }
}
