/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    private int field_d;
    kv[] field_c;
    private int field_e;
    private boolean field_b;
    private int field_h;
    kv field_g;
    private int field_a;
    private int field_f;

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          gs var5 = (gs) null;
          tc.a(false, (gs) null);
        }
        if (hl.field_I) {
          return ao.field_d.a(dla.field_j, (byte) 7, gf.field_k);
        }
        if (gm.field_k) {
          return wi.a(93, param1, param0);
        }
        if (kf.a(param1, (byte) -89, param0)) {
          return true;
        }
        if (sea.field_j) {
          return false;
        }
        return vaa.a(param2, 1, param1);
    }

    final void a(int param0, tc param1) {
        if (param0 != 8) {
          return;
        }
        try {
          param1.field_g = this.field_g;
          param1.field_a = this.field_a;
          param1.field_b = this.field_b;
          param1.field_c = this.field_c;
          param1.field_f = this.field_f;
          param1.field_e = this.field_e;
          param1.field_d = this.field_d;
          param1.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tc.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final tc a(byte param0, int param1) {
        this.field_d = param1;
        if (param0 != 0) {
          this.field_d = 23;
        }
        return this;
    }

    final tc a(kv[] param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -40) {
            tc.a(-101, -18);
          }
          this.field_c = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tc.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        ma var4_ref_ma = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        ma var17 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = BachelorFridge.field_y;
        try {
          aca.field_g = new int[]{0, 0, param0, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = gaa.field_i.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_ma = gaa.field_i[var3];
            var4_ref_ma.b(108);
            rda.a(var3, 11259);
            var5 = var4_ref_ma.field_u + var4_ref_ma.field_A >> 1;
            var6 = var4_ref_ma.field_B + var4_ref_ma.field_G >> 1;
            var7 = var4_ref_ma.field_I + var4_ref_ma.field_q >> 1;
            var8 = aca.field_g[9] >> 2;
            var9 = aca.field_g[10] >> 2;
            var10_int = aca.field_g[11] >> 2;
            var11 = dl.field_j[3] * var8 + (var9 * dl.field_j[4] + dl.field_j[5] * var10_int) >> 14;
            var12 = var10_int * dl.field_j[8] + dl.field_j[6] * var8 + dl.field_j[7] * var9 >> 14;
            var13 = dl.field_j[11] * var10_int + dl.field_j[9] * var8 + dl.field_j[10] * var9 >> 14;
            var2[var3] = var13 * var7 + var6 * var12 + var11 * var5 >> 16;
          }
          var3Lifetime1 = aca.field_g[9] >> 8;
          var4 = aca.field_g[10] >> 8;
          var5Lifetime1 = aca.field_g[11] >> 8;
          var6Lifetime1 = ur.field_d << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = via.a(var6Lifetime1, (byte) 59) >> 8;
          var9Lifetime1 = ft.a(var6Lifetime1, (byte) -128) >> 8;
          if (-1 != mk.field_p &&
            gd.field_m != -1) {
            var9Lifetime1 = -128;
            var7Lifetime1 = mk.field_p - 320;
            var8Lifetime1 = -gd.field_m + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; gaa.field_i.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < gaa.field_i.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = gaa.field_i[var16];
            rda.a(var16, 11259);
            for (var18 = 0; 3 > var18; var18++) {
              dl.field_j[var18] = dl.field_j[var18] + bd.field_l[var15][var18];
            }
            pt.a(true, aca.field_g, var17, false, (byte) -121, false, dl.field_j);
            cc.a(var7Lifetime1, var9Lifetime1, var13Lifetime1, var8Lifetime1, var17, (byte) -98, var14, var12Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "tc.J(" + param0 + ')');
        }
    }

    final void a(int param0) {
        this.field_h = 0;
        this.field_e = -1;
        this.field_f = 0;
        if (param0 != 11) {
          this.field_g = (kv) null;
        }
        this.field_g = null;
        this.field_c = null;
        this.field_d = 0;
        this.field_a = 256;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          gs var8 = null;
          boolean stackIn_20_0 = false;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = BachelorFridge.field_y;
          try {
            if (wn.field_p) {
              return true;
            }
            try {
              if (param0 != 24215) {
                var8 = (gs) null;
                tc.a(true, (gs) null);
              }
              var2 = "tuhstatbut";
              var3 = (String) (ac.a(param1, "getcookies", (byte) 64));
              var4 = fda.a(-1, ';', var3);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_20_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_20_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var2_ref2;
            stackIn_23_1 = new StringBuilder().append("tc.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, wd param1, wj param2, int param3, int param4) {
        po stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_5 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          hp.a(param2.field_p, param4 + param2.field_s, (byte) -5, param2.field_q, this.field_c, param2.field_v + param0);
          if (null != this.field_g) {
            var6_int = param4 + (param2.field_s + this.field_f);
            var7 = param0 - (-param2.field_v - this.field_d);
            if (param1.field_m == 1) {
              var6_int = var6_int + (-this.field_g.field_n + param2.field_p) / 2;
            }
            if (param1.field_m == 2) {
              var6_int = var6_int + (param2.field_p - this.field_g.field_n);
            }
            if (1 == param1.field_g) {
              var7 = var7 + (param2.field_q - this.field_g.field_o) / 2;
            }
            if (param1.field_g == 2) {
              var7 = var7 + (param2.field_q - this.field_g.field_o);
            }
            this.field_g.e(var6_int, var7);
          }
          if (param3 >= -17) {
            this.field_a = 54;
          }
          var6 = param1.c(param2, 1);
          if (var6 != null &&
            null != param1.field_l) {
            if (this.field_h < 0) {
              return;
            }
            stackIn_21_0 = param1.field_l;
            stackIn_21_1 = var6;
            if (this.field_f == -2147483648) {
              stackIn_22_2 = 0;
            } else {
              stackIn_22_2 = this.field_f;
            }
            stackIn_24_2 = stackIn_22_2 + param1.field_i + param2.field_s + param4;
            stackIn_24_3 = param1.field_j;
            stackIn_24_4 = param2.field_v + param0;
            if (this.field_d != -2147483648) {
              stackIn_25_5 = this.field_d;
            } else {
              stackIn_25_5 = 0;
            }
            stackIn_27_3 = stackIn_24_3 + (stackIn_24_4 + stackIn_25_5);
            stackIn_27_4 = -param1.field_s + param2.field_p - param1.field_i;
            stackIn_27_5 = param2.field_q + (-param1.field_j - param1.field_r);
            stackIn_27_6 = this.field_h;
            stackIn_27_7 = this.field_e;
            if (this.field_a == -2147483648) {
              stackIn_28_8 = 256;
            } else {
              stackIn_28_8 = this.field_a;
            }
            ((po) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param1.field_m, param1.field_g, param1.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("tc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final tc a(boolean param0, int param1) {
        this.field_b = param0 ? true : false;
        if (param1 != -2147483648) {
          this.field_c = (kv[]) null;
        }
        return this;
    }

    final tc b(byte param0, int param1) {
        if (param0 != -88) {
          this.field_f = 97;
        }
        this.field_f = param1;
        return this;
    }

    final void a(wd param0, int param1, wj param2, byte param3, tc param4, int param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          if (this.field_b) {
            param4.a(param5, param0, param2, -118, param1);
            param4.a(11);
          }
          if (this.field_a != -2147483648) {
            param4.field_a = this.field_a;
          }
          if (-1 <= this.field_e) {
            param4.field_e = this.field_e;
          }
          if (this.field_c != null) {
            param4.field_c = this.field_c;
          }
          if (this.field_h >= -1) {
            param4.field_h = this.field_h;
          }
          if (null != this.field_g) {
            param4.field_g = this.field_g;
          }
          if (-2147483648 != this.field_f) {
            param4.field_f = this.field_f;
          }
          if (this.field_d != -2147483648) {
            param4.field_d = this.field_d;
          }
          var7_int = -38 % ((param3 + 21) / 35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("tc.M(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param5).append(')').toString());
        }
    }

    final tc b(int param0, int param1) {
        if (param1 != -25251) {
          this.field_g = (kv) null;
        }
        this.field_h = param0;
        return this;
    }

    final tc c(int param0, int param1) {
        this.field_e = param1;
        if (param0 <= 113) {
          return (tc) null;
        }
        return this;
    }

    final static int a(boolean param0, gs param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = BachelorFridge.field_y;
        try {
          var2_int = vq.field_w;
          if (param1.field_p != 2) {
            if (param1.field_p != 4) {
              if (ge.field_F == param1.field_a) {
                var2_intLifetime1 = jaa.field_u[param1.field_p];
              } else {
                var2_intLifetime1 = wp.field_q[param1.field_p];
              }
            } else {
              var2_intLifetime1 = wp.field_q[param1.field_p];
            }
          } else {
            if (!param1.field_i) {
              if (param1.field_m == 0 &&
                param1.field_j == 0) {
                var2_intLifetime1 = jaa.field_u[param1.field_p];
              } else {
                var2_intLifetime1 = wp.field_q[param1.field_p];
              }
            } else {
              var2_intLifetime1 = vq.field_w;
            }
          }
          if (param0) {
            tc.a(104, 4);
          }
          stackIn_16_0 = var2_intLifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("tc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    tc() {
        this.field_d = -2147483648;
        this.field_c = null;
        this.field_b = false;
        this.field_g = null;
        this.field_a = -2147483648;
        this.field_f = -2147483648;
        this.field_h = -2;
        this.field_e = -2;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        gea var4 = null;
        rg var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BachelorFridge.field_y;
        try {
          var4 = (gea) (wd.field_t.b((byte) 90));
          while (var4 != null) {
            tca.a(var4, 5, param0);
            var4 = (gea) (wd.field_t.c(0));
          }
          if (param1 != -16482) {
            return;
          }
          var5 = (rg) (rp.field_C.b((byte) 90));
          while (var5 != null) {
            kr.a(93, var5, param0);
            var5 = (rg) (rp.field_C.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "tc.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
    }
}
