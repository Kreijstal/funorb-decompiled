/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ct extends ml {
    static int field_x;
    static java.applet.Applet field_z;
    static hr[] field_A;
    private byte[] field_y;

    ct() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    final static void a(int param0, ah param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1.field_Q != 0) {
            var2_double = vp.field_d[param1.field_N] * (double)gq.field_q[param1.field_Q];
            var2_double = var2_double + (double)(param1.field_G / 50);
            var2_double = var2_double * (double)pd.field_p;
            cb.a((int)var2_double, -1372239541);
            if ((1 << param1.field_Q & qk.field_T) == 0) {
              qk.field_T = qk.field_T | 1 << param1.field_Q;
              bi.field_c = bi.field_c + 1;
            } else {
              qk.field_T = 0;
              bi.field_c = 1;
              qk.field_T = qk.field_T | 1 << param1.field_Q;
            }
            rn.a(Integer.toString((int)var2_double), param1.field_C >> 8, param1.field_z >> 8, 16777215, 28807);
            if (qk.field_T != 0 &&
              ps.field_e[13] == bi.field_c) {
              th.b(24753, 242, 13);
            }
            if (7 == oh.field_e &&
              0 == an.field_a) {
              if (param1.field_N == 5) {
                ei.field_a = ei.field_a + 1;
              } else {
                ei.field_a = ei.field_a - 1;
              }
              if (ei.field_a == 4) {
                th.b(24753, 240, 15);
              }
            }
          }
          if (param0 != 6510) {
            ct.b(true);
          }
          od.a(param1.field_N, (byte) 73);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ct.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
          this.field_y = new byte[2 * (param0 * param1 * param3)];
          this.a(param3, 206, param1, param0);
          return this.field_y;
        }
        return (byte[]) null;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 2 * param1;
        int var5 = param0 & 255;
        int incrementValue$0 = var4;
        var4++;
        this.field_y[incrementValue$0] = (byte)-1;
        this.field_y[var4] = (byte)(3 * var5 >> 5);
        if (param2 == 4096) {
          return;
        }
        field_x = 71;
    }

    public static void d(byte param0) {
        field_z = null;
        if (param0 >= -15) {
          return;
        }
        field_A = null;
    }

    final static void b(boolean param0) {
        aa.field_a = new ah[100];
        sm.a(72);
        bj.field_b = new jn();
        is.field_c = new jn();
        he.field_o = new Random();
        db.field_l = 1;
        in.field_z = 0;
        nd.field_F = 1;
        iw.field_b = 0;
        td.field_m = false;
        if (param0) {
          ke.a(false);
          oc.field_e = 1000;
          ag.a(0, 8);
          return;
        }
    }

    static {
    }
}
