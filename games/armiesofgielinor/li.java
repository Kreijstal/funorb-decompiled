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
        int var1 = 0;
        wp var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var1 = pr.field_g.field_i >> -1007998672;
          var2 = we.a(var1, true);
          io.a(var2, (byte) -34);
          if ((bv.field_w.field_sb ^ -1) >= 0) {
            stackOut_2_0 = bv.field_w.field_gb;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = bv.field_w.field_sb;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        ne.field_i = stackIn_3_0;
        ic.field_f = (int)(106.0 + Math.sin((double)uk.field_n / 3.141592653589793 / (double)param0) * 50.0);
        if (cu.field_a) {
          var3 = 0;
          L1: while (true) {
            if (-5 < (var3 ^ -1)) {
              kl.field_a.b(var3, param0 + 1745035901);
              var3++;
              continue L1;
            } else {
              return;
            }
          }
        } else {
          kl.field_a.g(200);
          return;
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
        ((li) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8192];
        field_p = "Create a free Account";
        field_n = new Random(6L);
        field_q = -1;
        field_m = "Show lobby chat from my friends";
    }
}
