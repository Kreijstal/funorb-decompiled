/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_o;
    double field_a;
    static vh field_g;
    double field_f;
    double field_d;
    static int field_i;
    static String field_l;
    static String field_e;
    double field_m;
    static String[] field_n;
    static dd field_c;
    double field_h;
    static int field_b;
    static dd field_j;
    double field_k;

    final void a(int[] param0, boolean param1) {
        RuntimeException runtimeException = null;
        double var4 = 0.0;
        double[] var6 = null;
        double[] var8 = null;
        double[] var9 = null;
        double[] var16 = null;
        double[] var17 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0[0] = cr.a(4885, this.field_d);
          param0[1] = cr.a(4885, this.field_a);
          param0[2] = cr.a(4885, this.field_h);
          var8 = new double[]{-this.field_d + this.field_f, this.field_m - this.field_a, -this.field_h + this.field_k};
          var4 = Math.atan2(Math.sqrt(var8[1] * var8[1] + var8[0] * var8[0]), var8[2]);
          if (!param1) {
            return;
          }
          n.a(-126, var8);
          var9 = new double[]{-this.field_f + this.field_d, -this.field_m + this.field_a, 0.0};
          var6 = var9;
          if (var4 < 0.04908738521234052) {
            var6[1] = 1.0;
            var6[0] = 0.0;
          } else {
            if (var4 < 0.7853981633974483) {
              var4 = (-Math.cos((var4 - 0.04908738521234052) * 3.141592653589793 / 0.7363107781851077) + 1.0) / 2.0;
              var6[0] = var4 * var9[0];
              var6[1] = 1.0 - var4 + var9[1] * var4;
            }
          }
          var16 = n.a(-128, lf.a(2, var8, var9));
          var17 = n.a(-126, lf.a(2, var16, var8));
          param0[3] = mf.a(16, var16[0]);
          param0[4] = mf.a(16, var16[1]);
          param0[5] = mf.a(16, var16[2]);
          param0[6] = mf.a(16, var17[0]);
          param0[7] = mf.a(16, var17[1]);
          param0[8] = mf.a(16, var17[2]);
          param0[9] = mf.a(16, var8[0]);
          param0[10] = mf.a(16, var8[1]);
          param0[11] = mf.a(16, var8[2]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("mm.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_o = null;
        field_l = null;
        field_c = null;
        field_g = null;
        if (param0 != -13569) {
          field_b = -71;
        }
        field_n = null;
        field_e = null;
    }

    final void a(double param0, int param1, double param2) {
        this.b(param2, param0, this.d(8), -6861);
        if (param1 != 1) {
          this.field_d = -1.1479346614663757;
        }
    }

    final double a(boolean param0) {
        if (!param0) {
          this.b(-0.5323192695781033, 0.018279809852695228, -0.753102219435801, -80);
        }
        if (0.0 != this.field_a - this.field_m ||
          this.field_f != this.field_d) {
          return Math.atan2(this.field_a - this.field_m, this.field_d - this.field_f);
        }
        return 1.5707963267948966;
    }

    final void c(byte param0) {
        kh.field_gc.a(false, this);
        if (param0 != -40) {
          mm.c(26);
        }
    }

    final int b(int param0) {
        if (param0 > -126) {
          mm.c(46);
        }
        double var2 = this.a((byte) 103) - Math.atan(0.625);
        return (int)((-var2 + 1.5707963267948966) / (Math.atan(0.625) * 2.0) * 480.0);
    }

    private final void d(byte param0) {
        if (Double.isNaN(this.field_d)) {
          this.field_d = 0.0;
        }
        if (Double.isNaN(this.field_a)) {
          this.field_a = 0.0;
        }
        if (param0 <= 81) {
          field_n = (String[]) null;
        }
        if (Double.isNaN(this.field_h)) {
          this.field_h = 0.0;
        }
        if (Double.isNaN(this.field_f)) {
          this.field_f = 0.0;
        }
        if (Double.isNaN(this.field_m)) {
          this.field_m = 0.0;
        }
        if (Double.isNaN(this.field_k)) {
          this.field_k = 0.0;
        }
    }

    final double d(int param0) {
        double var2 = this.field_d - this.field_f;
        if (param0 != 8) {
          return 0.04953626904890074;
        }
        double var4 = this.field_a - this.field_m;
        double var6 = -this.field_k + this.field_h;
        return Math.sqrt(var6 * var6 + (var4 * var4 + var2 * var2));
    }

    final void a(int param0) {
        this.field_k = -8.0;
        this.field_m = 144.0;
        int var2 = 114 % ((param0 + 5) / 47);
        this.field_f = 288.0;
    }

    final void a(uf param0, int param1) {
        try {
          this.field_f = (double)pf.b(126, param0.field_I.field_l[0].field_g);
          if (param1 != 1) {
            field_j = (dd) null;
          }
          this.field_m = (double)pf.b(param1 ^ 126, param0.field_I.field_l[0].field_k);
          this.b(3.141592653589793 * (double)param0.field_G.field_h / 1024.0, 3.141592653589793 * (double)(param0.field_G.field_k + 32) / 1024.0, 192.0, -6861);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "mm.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final double a(byte param0) {
        double var2 = this.field_d - this.field_f;
        if (param0 <= 77) {
          return -2.6664810522364304;
        }
        double var4 = -this.field_m + this.field_a;
        double var6 = Math.sqrt(var2 * var2 + var4 * var4);
        return Math.atan2(var6, this.field_h - this.field_k);
    }

    final static ie a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ie var5 = null;
        ie stackIn_4_0 = null;
        ie stackIn_8_0 = null;
        ie stackIn_11_0 = null;
        ie stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (param0 == var2_int) {
              stackIn_8_0 = uj.field_e;
              return stackIn_8_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var5 = vl.a(7, var3);
            if (var5 == null) {
              stackIn_13_0 = jj.a(102, var4);
              return stackIn_13_0;
            }
            stackIn_11_0 = var5;
            return stackIn_11_0;
          }
          stackIn_4_0 = hl.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("mm.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(int param0, mm param1) {
        try {
          this.field_h = param1.field_h;
          if (param0 != 144) {
            field_n = (String[]) null;
          }
          this.field_f = param1.field_f;
          this.field_k = param1.field_k;
          this.field_m = param1.field_m;
          this.field_d = param1.field_d;
          this.field_a = param1.field_a;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "mm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(double[] param0, byte param1) {
        try {
          this.field_m = param0[4];
          this.field_a = param0[1];
          this.field_k = param0[5];
          this.field_d = param0[0];
          if (param1 > -33) {
            mm var4 = (mm) null;
            this.a(-110, (mm) null);
          }
          this.field_h = param0[2];
          this.field_f = param0[3];
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "mm.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, double param1) {
        double var4 = -this.field_f + this.field_d;
        double var6 = this.field_a - this.field_m;
        double var8 = -this.field_k + this.field_h;
        if (!param0) {
          return;
        }
        double var10 = Math.sqrt(var8 * var8 + (var6 * var6 + var4 * var4));
        this.field_d = this.field_f + param1 * var4 / var10;
        this.field_a = this.field_m + param1 * var6 / var10;
        this.field_h = this.field_k + var8 * param1 / var10;
        this.c((byte) -40);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        e.field_a.b(param2, 2147483647, param4, param3, param1);
        if (im.field_Ub != null) {
          im.field_Ub.a(param0, param6, -gj.field_G + param6, (byte) 127, param1, param1);
        }
        if (param5 < 69) {
          mm.c(49);
        }
    }

    private final void a(double param0, double param1, double param2, int param3) {
        if (param3 != 144) {
          return;
        }
        if (2.945243112740431 < param1) {
          param1 = 2.945243112740431;
        }
        if (1.6689710972195777 > param1) {
          param1 = 1.6689710972195777;
        }
        double var8 = Math.sin(param1) * -param2;
        this.field_d = this.field_f - Math.cos(param0) * var8;
        this.field_a = this.field_m - Math.sin(param0) * var8;
        this.field_h = this.field_k + Math.cos(param1) * param2;
    }

    final void b(double param0, double param1, double param2, int param3) {
        if (param3 != -6861) {
          field_c = (dd) null;
        }
        this.a(param0, param1, param2, 144);
        this.c((byte) -40);
    }

    final boolean a(mm param0, byte param1) {
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        double var3_doubleLifetime1;
        double var3_doubleLifetime2;
        double var3_doubleLifetime3;
        double var3_doubleLifetime4;
        double var3_doubleLifetime5;
        var6 = Pool.field_O;
        try {
          var5 = 0;
          if (this.field_d != param0.field_d) {
            var3_double = -this.field_d + param0.field_d;
            if (0.5 > var3_double &&
              var3_double > -0.5) {
              this.field_d = param0.field_d;
            } else {
              this.field_d = this.field_d + var3_double / 8.0;
            }
            var5 = 1;
          }
          if (param0.field_a != this.field_a) {
            var3_doubleLifetime1 = param0.field_a - this.field_a;
            var5 = 1;
            if (0.5 > var3_doubleLifetime1 &&
              var3_doubleLifetime1 > -0.5) {
              this.field_a = param0.field_a;
            } else {
              this.field_a = this.field_a + var3_doubleLifetime1 / 8.0;
            }
          }
          if (this.field_h != param0.field_h) {
            var3_doubleLifetime2 = param0.field_h - this.field_h;
            var5 = 1;
            if (var3_doubleLifetime2 < 0.5 &&
              -0.5 < var3_doubleLifetime2) {
              this.field_h = param0.field_h;
            } else {
              this.field_h = this.field_h + var3_doubleLifetime2 / 8.0;
            }
          }
          if (this.field_f != param0.field_f) {
            var3_doubleLifetime3 = -this.field_f + param0.field_f;
            var5 = 1;
            if (0.5 > var3_doubleLifetime3 &&
              -0.5 < var3_doubleLifetime3) {
              this.field_f = param0.field_f;
            } else {
              this.field_f = this.field_f + var3_doubleLifetime3 / 8.0;
            }
          }
          if (this.field_m != param0.field_m) {
            var3_doubleLifetime4 = -this.field_m + param0.field_m;
            if (var3_doubleLifetime4 < 0.5 &&
              var3_doubleLifetime4 > -0.5) {
              this.field_m = param0.field_m;
            } else {
              this.field_m = this.field_m + var3_doubleLifetime4 / 8.0;
            }
            var5 = 1;
          }
          if (param1 != -78) {
            this.b(-34);
          }
          if (param0.field_k != this.field_k) {
            var3_doubleLifetime5 = -this.field_k + param0.field_k;
            var5 = 1;
            if (var3_doubleLifetime5 < 0.5 &&
              var3_doubleLifetime5 > -0.5) {
              this.field_k = param0.field_k;
            } else {
              this.field_k = this.field_k + var3_doubleLifetime5 / 8.0;
            }
          }
          this.d((byte) 108);
          this.c((byte) -40);
          stackIn_42_0 = var5;
          return stackIn_42_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("mm.G(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, double[][] param1) {
        int var6 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        double var4 = 0.0;
        double[] var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        try {
          var3_int = 0;
          var4 = -1.0;
          for (var6 = 0; var6 < param1.length; var6++) {
            var7 = param1[var6];
            var8 = -this.field_d + var7[0];
            var10 = var7[1] - this.field_a;
            var12 = -this.field_h + var7[2];
            var14 = -this.field_f + this.field_d;
            var16 = -this.field_m + this.field_a;
            var18 = -this.field_k + this.field_h;
            if (!(var8 * var14 + var10 * var16 + var12 * var18 < 0.0)) {
              var20 = var12 * var12 + (var10 * var10 + var8 * var8);
              if (0.0 > var4 ||
                var4 > var20) {
                var3_int = var6;
                var4 = var20;
              }
            }
          }
          if (param0 != -11024) {
            this.c((byte) -115);
          }
          this.a(param1[var3_int], (byte) -86);
          stackIn_13_0 = var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("mm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        this.field_f = 288.0;
        this.field_m = 144.0;
        this.field_d = 288.0;
        this.field_h = -512.0;
        this.field_a = 144.0;
        this.field_k = -8.0;
        if (param0 != -24) {
          mm var3 = (mm) null;
          this.a(13, (mm) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, lr param4, int param5, int param6, int param7, int param8, int param9, nm param10, int param11, int param12, nm param13, lr param14, int param15, int param16, int param17, int param18, nm param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          qp.field_ec = param14;
          qa.field_t = param4;
          el.b(84, param1, param7, param6, param12);
          mp.a(param18, param0, param13, -92);
          if (param16 != 2) {
            return;
          }
          ci.a(param17, 26790, param10, param3, param5, param19);
          w.a(param9, -17, param2);
          qo.a((byte) -82, param11, param8, param15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("mm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param14 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    mm() {
        this.b((byte) -24);
    }

    static {
        field_e = "No players";
        field_l = "Game";
        field_o = "Loading music";
        field_n = new String[]{"By rating", "By win percentage"};
    }
}
