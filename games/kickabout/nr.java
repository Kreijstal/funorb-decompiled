/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nr extends gn {
    static de field_q;
    private int field_i;
    private eg field_p;
    private int field_n;
    private dd field_h;
    static String field_l;
    private int field_g;
    static int field_j;
    private int field_o;
    private int field_s;
    static long field_r;
    static String field_m;
    static int field_e;
    static vd field_f;
    static String field_k;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, hu param10, hu param11, dg param12, int param13, int param14, int param15, dg param16, int param17, int param18, dg param19, int param20) {
        ew.a(126, param5, param10, param11);
        sb.a(param18, param0, param13, param7, (byte) 5);
        if (param2 <= 25) {
          field_q = null;
          bs.a(param8, 0, param4);
          rn.a(param19, param6, param16, param9, param15, -110);
          tm.a(param3, param1, false, param12);
          bi.a(param20, param14, param17, 20);
          return;
        } else {
          bs.a(param8, 0, param4);
          rn.a(param19, param6, param16, param9, param15, -110);
          tm.a(param3, param1, false, param12);
          bi.a(param20, param14, param17, 20);
          return;
        }
    }

    final void a(int param0, int param1) {
        param0 = (((nr) this).field_o + param0) % 6;
        if (param0 > 3) {
            param0 = 6 + -param0;
        }
        ((nr) this).field_h.a(param0, 111);
        eg var5 = (eg) (Object) ((nr) this).field_h.a((qc) (Object) ((nr) this).field_p, false, true, true);
        nh.a(param1 + ((nr) this).field_g << 1259280100, ((nr) this).field_i << -1168662780, 320, -4 + fd.field_f.length, fd.field_f);
        iw.a(103, ok.field_d);
        on.b();
        t.c();
        int var4 = 950;
        t.b(128, 240);
        var5.a(0, ((nr) this).field_n << -2019565464, 0, 300, 0, 0, 0, var4);
        ta.e(param1 ^ -124);
        ok.field_d.f(-64 + ((nr) this).field_g, ((nr) this).field_i - 120);
    }

    final static int a(int param0, ml param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var6 = param1.l(1, 59);
        if (param3 != var6) {
          if ((var6 ^ -1) != -2) {
            throw new IllegalStateException();
          } else {
            L0: {
              if (0 == param2) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_7_0 = aq.a(param2, param3 ^ -30273, param1);
                stackIn_9_0 = stackOut_7_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_9_0;
              var8 = param4;
              if ((var7 ^ -1) <= -1) {
                stackOut_11_0 = var8 + var7;
                stackIn_12_0 = stackOut_11_0;
                break L1;
              } else {
                stackOut_10_0 = -var8 + var7;
                stackIn_12_0 = stackOut_10_0;
                break L1;
              }
            }
            return stackIn_12_0;
          }
        } else {
          L2: {
            if (param5 != 0) {
              stackOut_3_0 = aq.a(param5, -30273, param1);
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          return stackIn_4_0;
        }
    }

    nr(int param0, int param1, int param2, int param3) {
        ((nr) this).field_i = param1;
        ((nr) this).field_n = param2;
        ((nr) this).field_g = param0;
        ((nr) this).field_s = param3;
        Random var8 = new Random();
        var8 = var8;
        ((nr) this).field_o = dq.a((byte) -34, 6, var8);
        ((nr) this).field_p = ok.a(-49, ((nr) this).field_s, var8);
        ((nr) this).field_h = new dd(1);
        int var6 = dq.a((byte) -48, 5, var8);
        ((nr) this).field_h.a(hq.field_b[var6], (byte) -107);
    }

    public static void a(byte param0) {
        field_k = null;
        field_m = null;
        field_f = null;
        field_q = null;
        field_l = null;
        int var1 = 8 / ((param0 - 73) / 52);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "The Quater Finals start in <%0> seconds...";
        field_q = new de();
        field_m = "This option cannot be combined with the current settings for:  ";
        field_k = "Sprint";
        field_f = new vd();
    }
}
