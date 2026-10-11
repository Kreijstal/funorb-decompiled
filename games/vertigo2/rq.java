/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends sn {
    static String field_x;
    private db field_s;
    static String field_A;
    nj field_w;
    static int field_B;
    fp field_z;
    static cr field_t;
    static int field_u;
    static String field_v;
    static boolean field_y;
    static lg field_r;

    final static void a(cc param0, int param1, r param2) {
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ud var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        int[] var15 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          var3_int = np.field_Lb;
          ql.field_L = new cr(0L, (cr) null);
          if (param2 == null) {
            var10 = (Throwable) null;
            ke.a((Throwable) null, "QC1", 0);
            return;
          }
          param2.field_b = false;
          param2.field_d = 0;
          ni.field_d = new uo(var3_int, param2, param2);
          wm.field_k = new jn(var3_int, param2, param2, new qf());
          var4 = sp.e((byte) -113);
          if (var4 == null) {
            var11 = (Throwable) null;
            ke.a((Throwable) null, "QC2", 0);
            return;
          }
          pe.a(var4, 97);
          mp.field_g = nq.a(5138823, 0, 1513239, 2245737, 4020342, 1513239, 1127256, (cc) null, 65793, 65793, param1 ^ 94, 65793, 8947848);
          fo.field_c = nq.a(0, 16764006, 0, 0, 0, 0, 0, param0, 0, 0, 88, 0, 0);
          va.field_h = nq.a(0, 16777215, 0, 0, 0, 0, 0, param0, 0, 0, 125, 0, 0);
          var5 = bi.field_e;
          var6 = bi.field_j;
          var15 = bi.field_l;
          fm.field_g = new er(10, 14);
          fm.field_g.d();
          for (var8 = param1; var8 < 7; var8++) {
            bi.e(var8, 1 + var8, -(var8 << 1) + 14, 16777215);
          }
          bi.a(var15, var5, var6);
          lr.field_H = fj.a(va.field_h, fo.field_c, var4, 10, mp.field_g);
          ql.field_L.field_M = new nj();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("rq.L(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static er a(r param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        er stackIn_2_0 = null;
        er stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 98) {
            stackIn_2_0 = (er) null;
            return stackIn_2_0;
          }
          var4_int = param0.a((byte) 120, param2);
          var5 = param0.a(var4_int, param1, 96);
          stackIn_4_0 = mf.a(param0, var5, (byte) -94, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("rq.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2;
        pe var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        this.field_z.a(param0);
        var3 = (pe) (this.field_w.a((byte) 100));
        while (var3 != null) {
          if (!this.field_s.a(-1, var3)) {
            var2 = param0;
            do {
              if (var2 <= var3.field_H) {
                this.a(-1, var2, var3);
                var3.field_H = var3.field_H - var2;
                break;
              }
              this.a(-1, var3.field_H, var3);
              var2 = var2 - var3.field_H;
            } while (!this.field_s.a(0, var3, var2, (int[]) null, (byte) 121));
          }
          var3 = (pe) (this.field_w.b(43));
        }
    }

    private final void a(int param0, int param1, pe param2) {
        db stackIn_6_0 = null;
        pe stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        boolean stackIn_7_3;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (~(4 & this.field_s.field_N[param2.field_q]) != param0 &&
            param2.field_E < 0) {
            var4_int = this.field_s.field_B[param2.field_q] / dd.field_u;
            var5 = (1048575 + (var4_int - param2.field_o)) / var4_int;
            param2.field_o = 1048575 & var4_int * param1 + param2.field_o;
            if (param1 >= var5) {
              if (0 == this.field_s.field_H[param2.field_q]) {
                param2.field_J = ra.a(param2.field_z, param2.field_J.g(), param2.field_J.h(), param2.field_J.e());
              } else {
                param2.field_J = ra.a(param2.field_z, param2.field_J.g(), 0, param2.field_J.e());
                stackIn_6_0 = this.field_s;
                stackIn_6_1 = (pe) (param2);
                stackIn_6_2 = 92;
                stackIn_7_3 = !(param2.field_K.field_n[param2.field_B] >= 0);
                ((db) (Object) stackIn_6_0).a(stackIn_6_1, (byte) stackIn_6_2, stackIn_7_3);
              }
              if (param2.field_K.field_n[param2.field_B] < 0) {
                param2.field_J.i(-1);
              }
              param1 = param2.field_o / var4_int;
            }
          }
          param2.field_J.a(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("rq.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_x = null;
        field_r = null;
        field_v = null;
        field_A = null;
        field_t = null;
        if (param0 != 0) {
          field_y = true;
        }
    }

    private final void a(int param0, int[] param1, int param2, byte param3, pe param4, int param5) {
        db stackIn_12_0 = null;
        pe stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        boolean stackIn_13_3;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ra var11 = null;
        int var12 = 0;
        r var13 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          if (0 != (4 & this.field_s.field_N[param4.field_q]) &&
            param4.field_E < 0) {
            var7_int = this.field_s.field_B[param4.field_q] / dd.field_u;
            while (true) {
              var8 = (1048575 - (-var7_int + param4.field_o)) / var7_int;
              if (param2 < var8) {
                param4.field_o = param4.field_o + param2 * var7_int;
                break;
              }
              param4.field_J.b(param1, param0, var8);
              param4.field_o = param4.field_o + (var8 * var7_int - 1048576);
              param0 = param0 + var8;
              param2 = param2 - var8;
              var9 = dd.field_u / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param4.field_J;
              if (this.field_s.field_H[param4.field_q] != 0) {
                param4.field_J = ra.a(param4.field_z, var11.g(), 0, var11.e());
                stackIn_12_0 = this.field_s;
                stackIn_12_1 = (pe) (param4);
                stackIn_12_2 = 87;
                stackIn_13_3 = !(param4.field_K.field_n[param4.field_B] >= 0);
                ((db) (Object) stackIn_12_0).a(stackIn_12_1, (byte) stackIn_12_2, stackIn_13_3);
                param4.field_J.b(var9, var11.h());
              } else {
                param4.field_J = ra.a(param4.field_z, var11.g(), var11.h(), var11.e());
              }
              if (0 > param4.field_K.field_n[param4.field_B]) {
                param4.field_J.i(-1);
              }
              var11.h(var9);
              var11.b(param1, param0, -param0 + param5);
              if (!var11.l()) {
                continue;
              }
              this.field_z.a(var11);
            }
          }
          param4.field_J.b(param1, param0, param2);
          if (param3 < 49) {
            var13 = (r) null;
            rq.a((cc) null, 118, (r) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("rq.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, int param2, boolean param3, String param4) {
        String stackIn_4_0 = null;
        int stackIn_25_0 = 0;
        String stackIn_25_1 = null;
        boolean stackIn_26_2 = false;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          hr.field_D = param2;
          ii.field_z = true;
          var7 = 55 / ((23 - param1) / 41);
          var12 = param4;
          if (param0) {
            stackIn_4_0 = sp.field_Q;
          } else {
            stackIn_4_0 = dc.field_M;
          }
          var6 = stackIn_4_0;
          if (hr.field_D == 0) {
            var8 = dc.a(480, var12, (byte) 79, or.field_n, oc.field_s);
            var9 = 3 + var8;
            al.field_y = new String[var9];
            dg.field_f = new int[var9];
            for (var10 = 0; var9 > var10; var10++) {
              dg.field_f[var10] = -1;
            }
            rc.field_c = new int[2];
            for (var10 = 0; var8 > var10; var10++) {
              al.field_y[var10] = or.field_n[var10];
            }
            al.field_y[var9 - 3] = "";
            al.field_y[var9 - 2] = var6;
            dg.field_f[-2 + var9] = 0;
            rc.field_c[0] = 1;
            al.field_y[-1 + var9] = lr.field_N;
            dg.field_f[-1 + var9] = 1;
            rc.field_c[1] = 2;
          } else {
            if (hr.field_D != 1) {
              throw new IllegalArgumentException();
            }
            var8 = dc.a(480, var12, (byte) 99, or.field_n, oc.field_s);
            var9 = 2 + var8;
            al.field_y = new String[var9];
            dg.field_f = new int[var9];
            for (var10 = 0; var10 < var9; var10++) {
              dg.field_f[var10] = -1;
            }
            rc.field_c = new int[1];
            for (var10 = 0; var8 > var10; var10++) {
              al.field_y[var10] = or.field_n[var10];
            }
            al.field_y[-2 + var9] = "";
            al.field_y[-1 + var9] = lr.field_N;
            dg.field_f[var9 - 1] = 0;
            rc.field_c[0] = 2;
          }
          kg.field_G.field_b = rc.field_c.length;
          var8Lifetime1 = 0;
          for (var9Lifetime1 = 0; al.field_y.length > var9Lifetime1; var9Lifetime1++) {
            stackIn_25_0 = 121;
            stackIn_25_1 = al.field_y[var9Lifetime1];
            stackIn_26_2 = !(dg.field_f[var9Lifetime1] < 0);
            var10Lifetime1 = ao.a(stackIn_25_0, stackIn_25_1, stackIn_26_2);
            if (dg.field_f[var9Lifetime1] != -1) {
              var10Lifetime1 = var10Lifetime1 + hc.field_a * 2;
            }
            if (var10Lifetime1 > var8Lifetime1) {
              var8Lifetime1 = var10Lifetime1;
            }
          }
          qp.field_d = -(var8Lifetime1 >> 1) + var8Lifetime1 + ni.field_a;
          pk.field_o = -(var8Lifetime1 >> 1) + ni.field_a;
          sf.field_d = kg.field_G.field_b * (vo.field_y + eb.field_h << 1);
          for (var9Lifetime2 = 0; var9Lifetime2 < al.field_y.length; var9Lifetime2++) {
            stackIn_36_0 = sf.field_d;
            if (dg.field_f[var9Lifetime2] >= 0) {
              stackIn_37_1 = ml.field_v;
            } else {
              stackIn_37_1 = cd.field_a;
            }
            sf.field_d = stackIn_36_0 + stackIn_37_1;
          }
          ui.field_d = -(sf.field_d >> 1) + kf.field_b;
          kg.field_G.a(param3, we.a(gb.field_d, true, ed.field_n), 0, (byte) 80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_42_0 = var5;
          stackIn_42_1 = new StringBuilder().append("rq.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        er var6 = new er(param1, param0);
        int var7 = 47 % ((3 - param4) / 57);
        var6.d();
        bi.f(0, 0, param1, param0, 12, 5921370);
        bi.f(4, 4, -8 + param1, -8 + param0, 8, 0);
        ro.field_g.a(-125);
        bi.b(param3, param2, param1, param0, 12, 0, param5);
        var6.e(param3, param2);
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        pe var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          this.field_z.b(param0, param1, param2);
          var6 = (pe) (this.field_w.a((byte) 100));
          while (var6 != null) {
            stackIn_4_0 = this.field_s.a(-1, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var5 > var6.field_H) {
                this.a(var4_int, param0, var6.field_H, (byte) 73, var6, var5 + var4_int);
                var5 = var5 - var6.field_H;
                var4_int = var4_int + var6.field_H;
                if (this.field_s.a(var4_int, var6, var5, param0, (byte) 114)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var4_int, param0, var5, (byte) 120, var6, var5 + var4_int);
                var6.field_H = var6.field_H - var5;
              }
            }
            var6 = (pe) (this.field_w.b(35));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("rq.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final sn c() {
        pe var1 = (pe) (this.field_w.a((byte) 100));
        if (var1 == null) {
          return null;
        }
        if (var1.field_J != null) {
          return (sn) ((Object) var1.field_J);
        }
        return this.a();
    }

    rq(db param0) {
        this.field_w = new nj();
        this.field_z = new fp();
        try {
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final sn a() {
        pe var1_ref = null;
        int var2 = Vertigo2.field_L ? 1 : 0;
        do {
          var1_ref = (pe) (this.field_w.b(119));
          if (var1_ref == null) {
            return null;
          }
        } while (var1_ref.field_J == null);
        return (sn) ((Object) var1_ref.field_J);
    }

    final static boolean a(byte param0) {
        if (param0 <= 13) {
          field_x = (String) null;
        }
        return ab.field_b;
    }

    final int d() {
        return 0;
    }

    static {
        field_A = "Purple";
        field_B = 0;
        field_x = "Blue";
        field_v = "Players";
        field_y = false;
    }
}
