/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ah {
    static int[][] field_bb;
    private pm field_ib;
    private oi field_db;
    static int[][] field_eb;
    static String field_hb;
    static String field_fb;
    static int[] field_cb;
    static int[] field_gb;

    public static void m(int param0) {
        field_fb = null;
        field_bb = (int[][]) null;
        field_cb = null;
        field_eb = (int[][]) null;
        if (param0 != -27552) {
          return;
        }
        field_gb = null;
        field_hb = null;
    }

    final void a(mn param0, byte param1) {
        double[] var13 = null;
        double[] var12 = null;
        double[] var11 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        try {
          var13 = new double[12];
          var12 = var13;
          var11 = var12;
          double[] var3 = var11;
          this.field_ab.a((byte) 54, var13);
          var4 = var13[9];
          var6 = var13[10];
          this.field_db.field_t = -(this.field_C * var4) + this.field_E;
          var8 = var13[11];
          this.field_db.field_o = -(var6 * this.field_C) + this.field_t;
          this.field_db.field_u = 10.0;
          int var10 = 25 / ((param1 + 2) / 62);
          this.field_db.field_p = this.field_D - this.field_C * var8;
          this.field_db.field_v = -var8;
          this.field_db.field_m = -var4;
          this.field_db.field_w = true;
          this.field_db.field_x = -var6;
          param0.a((rk) (this.field_db), (byte) 104);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mm(hn param0, ee param1, da param2, pm param3) {
        super(param0, 0.2, 0.003, 16.0, param1, pl.field_y);
        double[] var39 = null;
        double[] var38 = null;
        double[] var37 = null;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var16 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22Lifetime1;
        double var24Lifetime1;
        double var18Lifetime1;
        double var20Lifetime1;
        double var20Lifetime2;
        this.field_db = new oi((pm) (this));
        try {
          this.field_ab = new da(param2);
          var39 = new double[12];
          var38 = var39;
          var37 = var38;
          double[] var5 = var37;
          this.field_ab.a((byte) 66, var39);
          var6 = var39[9];
          var8 = var39[10];
          var10 = var39[11];
          if (param3 != null) {
            var16 = param3.field_D - this.field_D;
            var12 = param3.field_E - this.field_E;
            var14 = -this.field_t + param3.field_t;
          } else {
            var16 = -0.999 + 1.998 * Math.random();
            var18 = Math.sqrt(-(var16 * var16) + 1.0);
            var20 = 2.0 * (3.141592653589793 * Math.random());
            var12 = var18 * Math.sin(var20);
            var14 = Math.cos(var20) * var18;
          }
          var18Lifetime1 = var10 * var16 + (var6 * var12 + var8 * var14);
          var20Lifetime1 = -(var8 * var16) + var10 * var14;
          var22 = -(var12 * var10) + var16 * var6;
          var24 = var12 * var8 - var6 * var14;
          var26 = Math.sqrt(var20Lifetime1 * var20Lifetime1 + var22 * var22 + var24 * var24);
          if (!(var26 < 0.0001)) {
            var24 = var24 / var26;
            var22 = var22 / var26;
            var20Lifetime1 = var20Lifetime1 / var26;
          } else {
            var24 = var39[8];
            var22 = var39[7];
            var20Lifetime1 = var39[6];
          }
          var28 = Math.atan2(var26, var18Lifetime1);
          hd.field_e.a(-var28, var24, var20Lifetime1, var22, 7);
          this.field_ab.a(-43, hd.field_e);
          var24Lifetime1 = -0.999 + Math.random() * 1.998;
          var30 = Math.sqrt(1.0 - var24Lifetime1 * var24Lifetime1);
          var32 = 2.0 * (Math.random() * 3.141592653589793);
          var20Lifetime2 = Math.sin(var32) * var30;
          var22Lifetime1 = Math.cos(var32) * var30;
          hd.field_e.a(0.1 * Math.random(), var24Lifetime1, var20Lifetime2, var22Lifetime1, 7);
          this.field_ab.a(-60, hd.field_e);
          this.field_ab.a((byte) 30, var39);
          var34 = 0.05 + 0.05 * Math.random();
          this.field_L = var34 * var39[11];
          this.field_ib = param3;
          this.field_G = var34 * var39[10];
          this.field_K = var39[9] * var34;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(mm param0, boolean param1) {
        if (this.field_Y == param0.field_Y) {
          return;
        }
        try {
          this.a(105, param0);
          if (param1) {
            this.field_ib = (pm) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mm.DC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        ka var2 = this.a((byte) -126, kj.field_b, 1.5);
        if (param0 != 26402) {
          mm.m(42);
        }
        var2.field_M.field_w = 0.5;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        try {
          if (this.field_N) {
            return;
          }
          var17 = new double[12];
          var16 = var17;
          var15 = var16;
          var7 = var15;
          this.field_ab.a((byte) 105, var17);
          var8 = var17[9];
          var10 = var17[10];
          var12 = var17[11];
          stackIn_5_0 = (!(var8 * param3.field_P + param3.field_H * var10 + param3.field_N * var12 > 0.0)) ? 0 : 1;
          var14 = stackIn_5_0;
          if (var14 != 0) {
            this.a(tk.field_a, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
          }
          pa.a(this.field_E - var8 * this.field_C, 0.2 * this.field_C, (byte) -11, 256, -(var12 * this.field_C) + this.field_D, this.field_t - this.field_C * var10, wb.field_a, param1, param3);
          if (var14 == 0) {
            this.a(tk.field_a, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
          }
          if (param2 > -5) {
            this.field_ib = (pm) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("mm.QA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, nf[] param2, nf[] param3, nf[] param4, int param5, byte param6, int param7, int param8, int param9, int param10, int param11, ok param12, int param13, ok param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          ai.a(param12, new ji(param3), param15, param9, param5, param17, param8, param0, new ji(param2), param20, param16, param13, -78, new ji(param4), param18, param1, param10, param14, param7, param11, param19);
          var21_int = -122 % ((param6 + 54) / 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("mm.EC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        pm dupTemp$1 = null;
        double var3;
        double var5;
        double var7;
        double var9;
        if (this.field_ib != null) {
          var3 = Math.sqrt(this.field_G * this.field_G + this.field_K * this.field_K + this.field_L * this.field_L);
          if (0.001 > var3) {
            var3 = 0.001;
          }
          var5 = this.field_K / var3;
          var7 = this.field_G / var3;
          var9 = this.field_L / var3;
          if (this.a(var9, this.field_ib, var5, 1, var7)) {
            dupTemp$1 = this.a(var5, var7, var9, false);
            this.field_ib = dupTemp$1;
            if (null != dupTemp$1) {
              this.b(this.field_ib, (byte) 106);
              this.a(this.field_ab, true);
            }
          } else {
            this.b(this.field_ib, (byte) 106);
            this.a(this.field_ab, true);
          }
        }
        if (param0 != 11878) {
          mm.m(-44);
        }
        super.a(param0 ^ 0, param1);
    }

    final void a(pm param0, int param1) {
        try {
          if (param1 > -81) {
            mn var4 = (mn) null;
            this.a((mn) null, (byte) 122);
          }
          param0.a(this, false);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        int var0 = 0;
        int[] array$0 = null;
        int var1 = 0;
        int var2 = 0;
        int var0Lifetime1;
        field_eb = new int[][]{new int[]{0, 0, 6, 0, 6, 3, 4, 3, 4, 2, 2, 2, 2, 3, 3, 4, 3, 6, 4, 6, 4, 5, 6, 5, 6, 8, 0, 8}, new int[]{7, 0, 13, 0, 13, 8, 7, 8}, new int[]{9, 2, 11, 2, 11, 6, 10, 6, 10, 4, 9, 3}, new int[]{14, 0, 16, 0, 18, 2, 18, 0, 20, 0, 20, 8, 18, 8, 18, 5, 16, 3, 16, 4, 17, 5, 17, 8, 14, 8}, new int[]{21, 0, 26, 0, 26, 2, 23, 2, 23, 3, 25, 3, 25, 5, 24, 5, 24, 8, 21, 8}, new int[]{27, 0, 29, 0, 29, 3, 30, 4, 30, 8, 27, 8}, new int[]{31, 0, 33, 0, 35, 2, 35, 0, 37, 0, 37, 8, 35, 8, 35, 5, 33, 3, 33, 4, 34, 5, 34, 8, 31, 8}, new int[]{38, 0, 43, 0, 43, 2, 40, 2, 40, 3, 42, 3, 42, 5, 41, 5, 41, 6, 43, 6, 43, 8, 38, 8}, new int[]{44, 0, 48, 0, 50, 2, 50, 6, 48, 8, 44, 8}, new int[]{46, 2, 47, 2, 48, 3, 48, 5, 47, 6, 47, 4, 46, 3}};
        field_bb = new int[field_eb.length][];
        for (var0 = 0; var0 < field_eb.length; var0++) {
          array$0 = new int[field_eb[var0].length];
          field_bb[var0] = array$0;
        }
        field_fb = "<col=FFFFFF>Cluster missiles:</col> upon impact, these release five shells that aim for and home in on nearby targets. Tap <col=FFFFFF><%0></col> to fire one; hold <col=FFFFFF><%0></col> to fire many. You get four at once but can only carry 10.";
        field_gb = new int[256];
        field_hb = "Play free version";
        field_cb = new int[256];
        for (var0Lifetime1 = 0; var0Lifetime1 < 256; var0Lifetime1++) {
          var1 = var0Lifetime1 * var0Lifetime1 >> 8;
          var2 = var1 * var1 >> 8;
          field_gb[var0Lifetime1] = nl.a(var1, nl.a(var2 << 16, var0Lifetime1 << 8));
          field_cb[var0Lifetime1] = nl.a(nl.a(var0Lifetime1 << 16, var1 << 8), var2);
        }
    }
}
