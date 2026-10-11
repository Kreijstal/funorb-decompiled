/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_n;
    private int field_d;
    private int field_m;
    static int field_e;
    private int field_k;
    private oi field_g;
    private int field_j;
    private boolean field_r;
    private int field_p;
    private float field_t;
    private int field_b;
    private int field_s;
    private int field_h;
    private int field_f;
    private int field_i;
    private int field_o;
    private int field_l;
    static String field_q;
    private int field_a;
    private int field_c;

    final void d(int param0) {
        int fieldTemp$0 = 0;
        if (ff.field_b != null) {
          return;
        }
        if (jd.field_c <= 0) {
          this.field_r = false;
        }
        if (this.field_r) {
          fieldTemp$0 = this.field_n - 1;
          this.field_n = this.field_n - 1;
          if (~fieldTemp$0 < param0) {
            return;
          }
          this.field_n = this.field_j;
          if (ia.field_C >= this.field_p) {
            this.c(115);
          } else {
            this.field_r = false;
          }
          return;
        }
        if (u.field_sb < this.field_f) {
          ef.field_e = (this.field_f - u.field_sb) / 2;
        } else {
          if (this.field_f > 0) {
            ef.field_e = 0;
          }
        }
        if (u.field_sb == this.field_s &&
          bk.field_d == this.field_c) {
          return;
        }
        this.field_g.a(-26278, this.field_s, this.field_c);
    }

    public static void b(int param0) {
        if (param0 >= -46) {
          field_q = (String) null;
        }
        field_q = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_16_0 = false;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Lexicominos.field_L ? 1 : 0;
          try {
            if (pf.field_m) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (oa.a(true, param1, "getcookies"));
              var4 = dc.a(var3, ';', (byte) -125);
              for (var5 = param0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_16_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref2;
            stackIn_19_1 = new StringBuilder().append("gf.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ra b(byte param0) {
        if (param0 != -74) {
          this.c(-88);
        }
        this.field_b = bk.field_d;
        this.field_k = u.field_sb;
        this.field_g.a(-26278, this.field_i, this.field_a);
        rl.field_O = false;
        ra var2 = sg.a(0, this.field_i, this.field_a, 0, 0, jh.field_a);
        if (var2 == null) {
          this.a((byte) -110);
        }
        return var2;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 103) {
          this.field_m = -89;
        }
        var2 = this.field_f;
        var3 = this.field_l;
        if (!this.a(0)) {
          this.field_r = false;
          return;
        }
        if (var3 > this.field_m) {
          var3 = this.field_m;
        } else {
          if (this.field_d > var3) {
            var3 = this.field_d;
          }
        }
        if (this.field_h < var2) {
          var2 = this.field_h;
        } else {
          if (var2 < this.field_o) {
            var2 = this.field_o;
          }
        }
        if (0.0f < this.field_t) {
          var4 = (int)(0.5f + (float)var3 * this.field_t);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_t);
          } else {
            if (var4 < var2) {
              var2 = var4;
            }
          }
        }
        if (var2 != u.field_sb ||
          var3 != bk.field_d) {
          this.field_g.a(-26278, var2, var3);
        }
        if (this.field_f > 0) {
          ef.field_e = (this.field_f - u.field_sb) / 2;
        }
    }

    final boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_6_0 = (ia.field_C >= this.field_p) && (jd.field_c > 0);
        return stackIn_6_0;
    }

    final void a(byte param0) {
        this.field_g.a(param0 ^ 26312, this.field_k, this.field_b);
        if (param0 != -110) {
          this.a(107);
        }
    }

    final static void a(int param0, int param1, db[] param2, int param3, int param4, byte param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 == null) {
            return;
          }
          if (param3 > 0 &&
            param1 > 0) {
            if (param2[3] == null) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param2[3].field_r;
            }
            var6_int = stackIn_10_0;
            if (null == param2[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param2[5].field_r;
            }
            var7 = stackIn_13_0;
            if (null != param2[1]) {
              stackIn_16_0 = param2[1].field_x;
            } else {
              stackIn_16_0 = 0;
            }
            var8 = stackIn_16_0;
            if (param2[7] == null) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param2[7].field_x;
            }
            var9 = stackIn_19_0;
            var10 = param0 + param3;
            var11 = param1 + param4;
            var12 = var6_int + param0;
            var13 = -var7 + var10;
            var14 = var8 + param4;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param0 + var6_int * param3 / (var7 + var6_int);
              var16 = param0 + var6_int * param3 / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            lf.b(ji.field_a);
            if (var18 > var19) {
              var19 = param4 + param1 * var8 / (var9 + var8);
              var18 = param4 + param1 * var8 / (var9 + var8);
            }
            if (null != param2[0]) {
              lf.f(param0, param4, var16, var18);
              param2[0].d(param0, param4);
              lf.a(ji.field_a);
            }
            if (param5 <= 77) {
              return;
            }
            if (param2[2] != null) {
              lf.f(var17, param4, var10, var18);
              param2[2].d(var13, param4);
              lf.a(ji.field_a);
            }
            if (param2[6] != null) {
              lf.f(param0, var19, var16, var11);
              param2[6].d(param0, var15);
              lf.a(ji.field_a);
            }
            if (null != param2[8]) {
              lf.f(var17, var19, var10, var11);
              param2[8].d(var13, var15);
              lf.a(ji.field_a);
            }
            if (null != param2[1] &&
              0 != param2[1].field_r) {
              lf.f(var16, param4, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param2[1].field_r) {
                param2[1].d(var20, param4);
              }
              lf.a(ji.field_a);
            }
            if (null != param2[7] &&
              0 != param2[7].field_r) {
              lf.f(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param2[7].field_r) {
                param2[7].d(var20Lifetime1, var15);
              }
              lf.a(ji.field_a);
            }
            if (null != param2[3] &&
              param2[3].field_x != 0) {
              lf.f(param0, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param2[3].field_x) {
                param2[3].d(param0, var20Lifetime2);
              }
              lf.a(ji.field_a);
            }
            if (param2[5] != null &&
              param2[5].field_x != 0) {
              lf.f(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param2[5].field_x) {
                param2[5].d(var13, var20Lifetime3);
              }
              lf.a(ji.field_a);
            }
            if (param2[4] != null &&
              0 != param2[4].field_r &&
              param2[4].field_x != 0) {
              lf.f(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param2[4].field_x) {
                for (var21 = var12; var21 < var13; var21 = var21 + param2[4].field_r) {
                  param2[4].d(var21, var20Lifetime4);
                }
              }
              lf.a(ji.field_a);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("gf.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wf var16 = null;
        wf var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          var16 = new wf(param1);
          var17 = var16;
          var17.field_h = param1.length - 2;
          th.field_t = var17.b(-1698573656);
          mg.field_x = new int[th.field_t];
          hl.field_o = new byte[th.field_t][];
          me.field_w = new boolean[th.field_t];
          rg.field_c = new int[th.field_t];
          pb.field_h = new int[th.field_t];
          be.field_f = new byte[th.field_t][];
          bd.field_m = new int[th.field_t];
          var17.field_h = -(8 * th.field_t) - 7 + param1.length;
          uc.field_fb = var17.b(-1698573656);
          eh.field_b = var17.b(-1698573656);
          var3 = (var17.d(true) & 255) + 1;
          for (var4 = 0; th.field_t > var4; var4++) {
            mg.field_x[var4] = var16.b(-1698573656);
          }
          for (var4Lifetime1 = 0; th.field_t > var4Lifetime1; var4Lifetime1++) {
            rg.field_c[var4Lifetime1] = var17.b(-1698573656);
          }
          for (var4Lifetime2 = 0; th.field_t > var4Lifetime2; var4Lifetime2++) {
            pb.field_h[var4Lifetime2] = var17.b(param0 - 1698573762);
          }
          if (param0 != 106) {
            field_q = (String) null;
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < th.field_t; var4Lifetime3++) {
            bd.field_m[var4Lifetime3] = var17.b(-1698573656);
          }
          var17.field_h = -(th.field_t * 8) - 7 + (param1.length - 3 * (var3 - 1));
          ci.field_b = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            ci.field_b[var4Lifetime4] = var17.a(84);
            if (ci.field_b[var4Lifetime4] == 0) {
              ci.field_b[var4Lifetime4] = 1;
            }
          }
          var17.field_h = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < th.field_t; var4Lifetime5++) {
            var5 = pb.field_h[var4Lifetime5];
            var6 = bd.field_m[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            be.field_f[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            hl.field_o[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.d(true);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.e(true);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.e(true);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_32_0 = var10;
                  if (var13 == -1) {
                    stackIn_33_1 = 0;
                  } else {
                    stackIn_33_1 = 1;
                  }
                  var10 = stackIn_32_0 | stackIn_33_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var12 + var13 * var5] = var17.e(true);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.e(true);
                    var9[var5 * var13 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_47_0 = var10;
                    if (-1 == var14) {
                      stackIn_48_1 = 0;
                    } else {
                      stackIn_48_1 = 1;
                    }
                    var10 = stackIn_47_0 | stackIn_48_1;
                  }
                }
              }
            }
            me.field_w[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("gf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    final static db a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -76) {
          java.applet.Applet var6 = (java.applet.Applet) null;
          gf.a(107, (java.net.URL) null, (java.applet.Applet) null);
        }
        db var7 = new db(param1, param1);
        db var3 = var7;
        for (var4 = 0; var4 < var3.field_y.length; var4++) {
          var7.field_y[var4] = param2;
        }
        return var3;
    }

    final void a(int param0, byte param1, int param2) {
        this.field_l = param0;
        if (param1 != -65) {
          return;
        }
        this.field_f = param2;
    }

    private gf() throws Throwable {
        throw new Error();
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (param0 != 3) {
            field_e = 14;
          }
          if (mb.field_a != null &&
            !mb.field_a.equals(param2.getParameter("settings"))) {
            var3 = mb.field_a;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (null != ta.field_d &&
            !ta.field_d.equals(param2.getParameter("session"))) {
            var4Lifetime1 = ta.field_d;
          }
          stackIn_9_0 = rf.a(-1, param1, (String) (var4Lifetime1), 0, (String) (var3));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_q = "Unpacking graphics";
    }
}
