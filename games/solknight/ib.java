/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ib extends gg {
    static Random field_i;
    int[] field_n;
    int field_m;
    boolean field_k;
    static boolean field_o;
    static int field_h;
    static dh field_l;
    static int field_j;

    public static void a(int param0) {
        field_i = null;
        if (param0 == 0) {
            return;
        }
        field_i = (Random) null;
    }

    final static o a(int param0, boolean param1, int param2) {
        o var3 = null;
        int var4 = 0;
        int var5 = 0;
        o stackIn_5_0 = null;
        o stackIn_6_0 = null;
        o stackOut_4_0 = null;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          var3 = new o(param0, param0);
          var4 = 0;
          if (param1) {
            break L0;
          } else {
            field_j = -85;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 < var3.field_v.length) {
            stackOut_4_0 = (o) (var3);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              stackIn_6_0.field_v[var4] = param2;
              var4++;
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return var3;
          }
        }
    }

    ib() {
        this.field_k = false;
    }

    static {
        field_i = new Random();
        field_l = null;
        field_j = 0;
    }
}
