/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lk extends id {
    private int field_K;
    private int field_M;
    private int field_Q;
    int field_S;
    static int[] field_P;
    static String field_I;
    boolean field_O;
    static int[][] field_G;
    static cj field_J;
    private int field_F;
    private int field_H;
    private int field_N;

    final void f(byte param0) {
        if (param0 >= -79) {
          return;
        }
        int fieldTemp$0 = this.field_H + 1;
        this.field_H = this.field_H + 1;
        if (fieldTemp$0 < 4) {
          return;
        }
        this.field_H = 0;
        int fieldTemp$1 = this.field_M + 1;
        this.field_M = this.field_M + 1;
        if (fieldTemp$1 < od.field_Fb.length) {
          return;
        }
        if (this.field_S != 1) {
          this.h((byte) -11);
          return;
        }
        this.field_O = true;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        this.field_E = param2 << 16;
        this.field_S = 0;
        this.field_N = param2;
        if (param3 == 7457) {
          this.field_O = false;
          this.field_z = param0 << 16;
          this.field_Q = param0;
          this.h((byte) -11);
          var5 = od.field_Fb.length;
          this.field_H = hp.a((byte) 68, g.field_a, 10);
          this.field_K = hp.a((byte) 107, g.field_a, param1);
          this.field_M = hp.a((byte) -68, g.field_a, var5);
          return;
        }
        lk.g((byte) -21);
        this.field_O = false;
        this.field_z = param0 << 16;
        this.field_Q = param0;
        this.h((byte) -11);
        var5Lifetime1 = od.field_Fb.length;
        this.field_H = hp.a((byte) 68, g.field_a, 10);
        this.field_K = hp.a((byte) 107, g.field_a, param1);
        this.field_M = hp.a((byte) -68, g.field_a, var5Lifetime1);
    }

    final void a(int param0, nm param1) {
        int fieldTemp$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -10136) {
            return;
          }
          if (!this.field_O) {
            fieldTemp$2 = this.field_K - 1;
            this.field_K = this.field_K - 1;
            if (fieldTemp$2 <= 0) {
              var3_int = param1.c(this.g(-50), -20126);
              var4 = -24 + param1.d(this.h(-76), param0 + 10242);
              if (!io.a(var3_int, var4, (byte) -112, param1)) {
                return;
              }
              if (!he.field_a &&
                fb.field_e.field_u.field_k[this.h(82) / 24][this.g(-95) / 24]) {
                return;
              }
              od.field_Fb[this.field_M].c(var3_int, var4, this.field_F);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("lk.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void i(int param0) {
        if (param0 == 11041) {
          field_G = (int[][]) null;
          field_J = null;
          field_P = null;
          field_I = null;
          return;
        }
        lk.i(-25);
        field_G = (int[][]) null;
        field_J = null;
        field_P = null;
        field_I = null;
    }

    final static int b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0) {
            lk.b(true);
          }
          nb.field_a.a(hj.field_c, (byte) -27, nk.field_s, true);
          nb.field_a.h((byte) -104);
          while (ba.c(-1)) {
            nb.field_a.a(0, pn.field_d, sj.field_p);
          }
          if (-1 != jk.field_j) {
            var1_int = jk.field_j;
            fb.a(-1, 107);
            stackIn_8_0 = var1_int;
            return stackIn_8_0;
          }
          if (nj.field_f) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (ta.field_hb == dj.field_k) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!tg.field_g.d(-96)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (dj.field_k != id.field_B) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_21_0 = 2;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "lk.L(" + param0 + ')');
        }
    }

    final static void g(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var1Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 >= 36) {
          var1 = b.field_d * b.field_d;
          var2 = -(t.field_e * t.field_e) + var1;
          var3 = vj.field_t + var2 * (-vj.field_t + km.field_cb) / var1;
          dq.field_k.a(120, var3, 640, ck.field_a, -3344);
          eo.a(nj.field_h, ed.field_c, 0, -10, 5, 640, km.field_cb - 24);
          return;
        }
        lk.b(false);
        var1Lifetime1 = b.field_d * b.field_d;
        var2Lifetime1 = -(t.field_e * t.field_e) + var1Lifetime1;
        var3Lifetime1 = vj.field_t + var2Lifetime1 * (-vj.field_t + km.field_cb) / var1Lifetime1;
        dq.field_k.a(120, var3Lifetime1, 640, ck.field_a, -3344);
        eo.a(nj.field_h, ed.field_c, 0, -10, 5, 640, km.field_cb - 24);
    }

    lk() {
        super(0, 0, 0);
        this.field_H = 0;
    }

    final void j(int param0) {
        this.a(true);
        this.a(-4564);
        bo.field_a.a(-25612, (br) (this));
        if (param0 != 23068) {
          this.f((byte) -105);
        }
    }

    private final void h(byte param0) {
        this.field_F = 128 + hp.a((byte) -85, g.field_a, 127);
        this.field_M = 0;
        this.field_z = this.field_Q - 12 + hp.a((byte) -106, g.field_a, 24) << 16;
        this.field_E = this.field_N - 12 + hp.a((byte) 40, g.field_a, 24) << 16;
        if (param0 != -11) {
          this.field_N = 22;
        }
    }

    static {
        field_I = "Kick <%0> from this game";
    }
}
