/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wc extends qk {
    static vn field_Pb;
    private int field_Qb;
    static volatile int field_Ob;
    static int[] field_Nb;
    static int field_Rb;

    private final void x(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var7 = ZombieDawn.field_J;
        if (this.field_yb != null) {
          this.field_yb = null;
        }
        int var5 = -1;
        le var6 = dj.field_e.field_R.b((byte) 26);
        while (var6 instanceof fb) {
          if (var6 instanceof kd &&
            ((kd) (var6)).x(94)) {
            var2 = ((kd) (var6)).a(true) - this.a(true);
            var3 = ((kd) (var6)).f(237239984) - this.f(237239984);
            if (var3 > 0 &&
              var3 > Math.abs(var2)) {
              var4 = var3 * var3 + var2 * var2;
              if (var4 < var5 ||
                -1 == var5) {
                this.field_yb = (kd) (var6);
                var5 = var4;
              }
            }
          }
          var6 = var6.field_b;
        }
        if (param0 != -44) {
          return;
        }
        if (67600 < var5) {
          this.field_yb = null;
        }
        if (null != this.field_yb) {
          this.e(10, -6904);
          this.field_Gb = 10;
          this.field_U = kh.a(44, false);
          this.field_U.h(ge.field_c >> 1);
        } else {
          this.field_Qb = 20;
        }
    }

    public static void o(byte param0) {
        if (param0 != -73) {
          wc.o((byte) -35);
        }
        field_Pb = null;
        field_Nb = null;
    }

    void a(byte param0, wk param1) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (this.field_F == 20) {
            return;
          }
          var3_int = param1.a(this.a(true), (byte) -88);
          var4 = param1.a(this.f(237239984), 0);
          if (10 == this.field_F &&
            this.field_G == 1) {
            stackIn_8_0 = -1 + var4;
          } else {
            stackIn_8_0 = var4;
          }
          var5 = stackIn_8_0;
          var6 = 0;
          if (param0 > -76) {
            this.g(30);
          }
          ld.field_l[this.field_t][var6].b(-24 + var3_int, var5 - 48);
          ag.field_h.b(-24 + var3_int, -44 + var4);
          if (this.field_Gb > 0) {
            this.b(var3_int - 3, (byte) -99, var4);
          }
          if (b.field_h) {
            bi.d(12 + var3_int, var4 + 24, 260, 16711680);
            bi.e(var3_int, var4, var3_int + 260, var4 + 260, 16711680);
            bi.e(var3_int, var4, var3_int - 260, 260 + var4, 16711680);
            bj.field_q.c(Integer.toString(this.field_G), var3_int, var4, 16777215, 0);
            bj.field_q.c(Integer.toString(this.field_N), 20 + var3_int, var4, 16777215, 0);
            bj.field_q.c(Integer.toString(this.field_F), var3_int, var4 - 20, 16777215, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("wc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(re[] param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        re var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ZombieDawn.field_J;
        try {
          var2_int = param0.length;
          for (var3 = 1; var3 < var2_int; var3++) {
            var4 = param0[var3];
            for (var5 = -1 + var3; var5 >= 0; var5--) {
              if (bn.a((byte) 82, param0[var5], var4)) {
                param0[1 + var5] = param0[var5];
                continue;
              }
              break;
            }
            param0[var5 + 1] = var4;
          }
          if (param1 != 0) {
            wc.o((byte) 86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("wc.OA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param1 < 24) {
          return;
        }
    }

    final static void w(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        am var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = ZombieDawn.field_J;
        try {
          var14 = fj.field_g;
          var2 = var14.d((byte) -124);
          var3 = (mg) (bg.field_i.b((byte) 26));
          if (param0 <= 117) {
            return;
          }
          while (var3 != null) {
            if (var2 != var3.field_h) {
              var3 = (mg) (bg.field_i.a(false));
              continue;
            }
            break;
          }
          if (var3 == null) {
            p.a(1);
            return;
          }
          var4 = var14.d((byte) -124);
          if (var4 != 0) {
            bb.field_b[0] = ce.field_r;
            var5 = var3.field_i;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              bb.field_b[var6_int] = var14.a(true);
            }
            jb.a(var4, true, var5);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              aa.a(var14, -121);
              if (var6_intLifetime1 != 0) {
                mp.a(var6_intLifetime1, e.field_H, ii.field_d, 1000, sn.field_e, rj.field_E);
              } else {
                mp.a(var6_intLifetime1, e.field_H, ii.field_d, 1000, sn.field_e, rj.field_E);
              }
            }
            bf.a((byte) -35, var5);
            var6 = new String[2][var5];
            var18 = new int[2][var5 * 4];
            var8 = qn.field_e;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = qd.field_c[var9];
              var6[0][var10] = bb.field_b[var11];
              var18[0][var10 * 4] = dj.field_g[var11];
              var18[0][1 + 4 * var10] = qo.field_r[var11];
              var18[0][2 + var10 * 4] = sg.field_kb[var11];
              var18[0][var10 * 4 + 3] = jd.field_d[var11];
              if (l.a(126, bb.field_b[var11]) &&
                jd.field_d[var11] + (qo.field_r[var11] + sg.field_kb[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = qd.field_c[var9Lifetime1 + var5];
              var6[1][var13] = bb.field_b[var11Lifetime1];
              var18[1][4 * var13] = dj.field_g[var11Lifetime1];
              var18[1][1 + 4 * var13] = qo.field_r[var11Lifetime1];
              var18[1][var13 * 4 + 2] = sg.field_kb[var11Lifetime1];
              var18[1][4 * var13 + 3] = jd.field_d[var11Lifetime1];
              if (l.a(89, bb.field_b[var11Lifetime1]) &&
                sg.field_kb[var11Lifetime1] + (qo.field_r[var11Lifetime1] + jd.field_d[var11Lifetime1]) == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var13++;
              var9Lifetime1++;
            }
            var3.b(-27598);
            return;
          }
          var3.b(-27598);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "wc.PA(" + param0 + ')');
        }
    }

    void g(int param0) {
        int var3;
        var3 = ZombieDawn.field_J;
        if (param0 < 95) {
          field_Ob = 118;
        }
        if (this.field_Gb > 0) {
          this.field_Gb = this.field_Gb - 1;
        }
        if (this.field_F != 0) {
          if (this.field_F == 10) {
            this.field_N = this.field_N + 3;
            if (2 == this.field_G) {
              this.field_yb.z(0);
              this.e(0, -6904);
            }
          }
        } else {
          if (this.field_Qb <= 0) {
            this.x(-44);
          } else {
            this.field_Qb = this.field_Qb - 1;
          }
        }
        this.d(this.field_F, -26109);
    }

    final void a(nc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -63 / ((-53 - param1) / 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("wc.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void f(int param0, int param1) {
        le var2 = null;
        int var3 = 0;
        ep var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ZombieDawn.field_J;
        try {
          if (param0 != 67600) {
            return;
          }
          var4 = (ep) (uk.field_a.b((byte) 26));
          while (var4 != null) {
            sn.a(param1, var4, 0);
            var4 = (ep) (uk.field_a.a(false));
          }
          var2 = jj.field_D.b((byte) 26);
          while (var2 != null) {
            p.a(0, param1);
            var2 = jj.field_D.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "wc.UB(" + param0 + ',' + param1 + ')');
        }
    }

    wc(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Qb = 0;
        this.field_S = 2;
    }

    static {
        field_Pb = new vn(270, 70);
        field_Ob = 0;
        field_Nb = new int[8192];
    }
}
