/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qf {
    static byte[] field_j;
    private int field_m;
    static int field_i;
    static int field_f;
    private int[] field_g;
    private eg field_n;
    private int field_q;
    private hm field_e;
    private nc field_o;
    static String field_l;
    private int field_c;
    private int field_b;
    private int field_a;
    private hm field_p;
    static dd field_k;
    private int field_h;
    static ai field_d;

    final void a(int param0) {
        this.field_a = this.field_a + this.field_h;
        this.field_q = this.field_q + this.field_b;
        this.field_m = this.field_m + this.field_c;
        if (this.field_q >= 167772160) {
          this.field_q = -167772159;
          this.field_g[0] = this.field_q >> 13;
          this.field_g[1] = this.field_m >> 13;
          this.field_g[2] = this.field_a >> 13;
          if (param0 == 2115785453) {
            this.field_p.a(3, this.field_e);
            this.field_o = null;
            return;
          }
          return;
        }
        if (-167772160 < this.field_q) {
          this.field_g[0] = this.field_q >> 13;
          this.field_g[1] = this.field_m >> 13;
          this.field_g[2] = this.field_a >> 13;
          if (param0 == 2115785453) {
            this.field_p.a(3, this.field_e);
            this.field_o = null;
            return;
          }
          return;
        }
        this.field_q = 167772159;
        this.field_g[0] = this.field_q >> 13;
        this.field_g[1] = this.field_m >> 13;
        this.field_g[2] = this.field_a >> 13;
        if (param0 == 2115785453) {
          this.field_p.a(3, this.field_e);
          this.field_o = null;
          return;
        }
    }

    final void a(int[] param0, gh param1, int param2) {
        int var5 = 0;
        dd[] var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pool.field_O;
        try {
          if (param2 <= 79) {
            var6 = (dd[]) null;
            qf.a(48, -85, 56, (byte) 112, -17, (dd[]) null);
          }
          if (null == this.field_o) {
            this.field_p.a(this.field_g, -125);
            if (this.field_q > 134217728) {
              this.field_n.field_f = hi.field_h[this.field_q - 134217728 >> 20];
            } else {
              if (this.field_q >= -134217728) {
                this.field_n.field_f = null;
              } else {
                this.field_n.field_f = hi.field_h[-134217728 - this.field_q >> 20];
              }
            }
            this.field_o = (nc) (this.field_n.a(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, this.field_g));
          }
          this.field_o.b(param0, this.field_g);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("qf.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
          field_d = null;
          field_j = null;
          field_l = null;
          return;
        }
        field_l = (String) null;
        field_d = null;
        field_j = null;
        field_l = null;
    }

    final int a(int[] param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -101 % ((param1 + 31) / 38);
          stackIn_1_0 = (-param0[1] + this.field_g[1]) * param0[10] + (param0[9] * (this.field_g[0] - param0[0]) + (this.field_g[2] - param0[2]) * param0[11]);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("qf.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, dd[] param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dd[] var12 = null;
        var11 = Pool.field_O;
        try {
          if (param5 != null &&
            param4 > 0) {
            var6_int = param5[0].field_w;
            var7 = param5[2].field_w;
            var8 = param5[1].field_w;
            param5[0].e(param2, param0, param1);
            param5[2].e(-var7 + (param2 + param4), param0, param1);
            qh.a(sq.field_a);
            qh.d(var6_int + param2, param0, param4 + (param2 - var7), param0 + param5[1].field_y);
            var9 = param2 + var6_int;
            var10 = param2 + param4 - var7;
            if (param3 != 18) {
              var12 = (dd[]) null;
              qf.a(-32, 78, -31, (byte) 16, 88, (dd[]) null);
            }
            for (param2 = var9; param2 < var10; param2 = param2 + var8) {
              param5[1].e(param2, param0, param1);
            }
            qh.b(sq.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("qf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    qf(eg param0) {
        int var2_int = 0;
        int var3 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        this.field_n = null;
        this.field_o = null;
        try {
          this.field_n = param0;
          var2_int = ga.a(8192, true, ea.field_r);
          var3 = 1024;
          dupTemp$0 = -134217728 + ga.a(268435456, true, ea.field_r);
          this.field_q = dupTemp$0;
          dupTemp$1 = af.c((byte) -128, var2_int) * var3;
          this.field_m = dupTemp$1;
          dupTemp$2 = o.a(var2_int, (byte) 77) * var3;
          this.field_a = dupTemp$2;
          this.field_g = new int[]{dupTemp$0 >> 13, dupTemp$1 >> 13, dupTemp$2 >> 13, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          this.field_b = -(65536 + ga.a(131072, true, ea.field_r));
          this.field_c = ga.a(9, true, ea.field_r) - 5;
          this.field_h = -5 + ga.a(9, true, ea.field_r);
          this.field_p = new hm(ga.a(32768, true, ea.field_r) - 16384, ga.a(32768, true, ea.field_r) - 16384, ga.a(32768, true, ea.field_r) - 16384, -16384 + ga.a(32768, true, ea.field_r));
          this.field_p.b(true);
          this.field_e = new hm();
          this.field_e.a(60, ga.a(32768, true, ea.field_r) - 16384, -16384 + ga.a(32768, true, ea.field_r), -16384 + ga.a(32768, true, ea.field_r), 1 + ga.a(8, true, ea.field_r));
          this.field_e.b(true);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Enter name of player to add to list";
    }
}
