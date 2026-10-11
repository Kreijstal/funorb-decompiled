/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ah {
    private oi field_cb;
    static fi field_bb;
    static String field_fb;
    static String field_hb;
    private double field_gb;
    static byte[] field_db;
    static bi field_eb;

    final static vk a(m param0, byte param1, mi param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        vk stackIn_2_0 = null;
        vk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.a(-51, param4);
          var6 = param2.a(var5_int, param3, param1 ^ 126);
          if (param1 == -65) {
            stackIn_4_0 = te.a((byte) -89, var6, param2, var5_int, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (vk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("gi.RA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    gi(hn param0, dj param1) {
        super(param0, param1, 0.5, 0.02, 64.0, pm.field_x);
        this.field_cb = new oi((pm) (this));
        try {
          kj.a(lf.field_i, 96, param1);
          this.field_gb = 64.0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
          this.field_ab.a((byte) 47, var13);
          var4 = var13[9];
          var6 = var13[10];
          this.field_cb.field_t = -(this.field_C * var4) + this.field_E;
          var8 = var13[11];
          int var10 = -127 / ((-2 - param1) / 62);
          this.field_cb.field_o = -(var6 * this.field_C) + this.field_t;
          this.field_cb.field_v = -var8;
          this.field_cb.field_p = -(this.field_C * var8) + this.field_D;
          this.field_cb.field_w = true;
          this.field_cb.field_m = -var4;
          this.field_cb.field_x = -var6;
          this.field_cb.field_u = 50.0;
          param0.a((rk) (this.field_cb), (byte) 123);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "gi.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        int stackIn_8_0 = 0;
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
          if (param2 > -5) {
            field_fb = (String) null;
          }
          if (this.field_N) {
            return;
          }
          var17 = new double[12];
          var16 = var17;
          var15 = var16;
          var7 = var15;
          this.field_ab.a((byte) 43, var17);
          var8 = var17[9];
          var10 = var17[10];
          var12 = var17[11];
          stackIn_8_0 = (!(param3.field_N * var12 + (param3.field_H * var10 + param3.field_P * var8) > 0.0)) ? 0 : 1;
          var14 = stackIn_8_0;
          if (var14 != 0) {
            this.a(u.field_T, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
          }
          pa.a(-(this.field_C * var8) + this.field_E, 0.5 * this.field_C, (byte) -11, 256, -(this.field_C * var12) + this.field_D, -(this.field_C * var10) + this.field_t, wb.field_a, param1, param3);
          if (var14 != 0) {
            return;
          }
          this.a(u.field_T, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("gi.QA(");
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

    public static void m(int param0) {
        field_db = null;
        field_fb = null;
        field_bb = null;
        field_hb = null;
        field_eb = null;
        if (param0 != -11008) {
          String var2 = (String) null;
          gi.a((m) null, (byte) 3, (mi) null, (String) null, (String) null);
        }
    }

    final void g(int param0) {
        int var3;
        gk var5;
        gk var6;
        int var3Lifetime1;
        this.field_A.field_P = false;
        this.field_z = true;
        if (param0 == 26402) {
          this.field_A.field_L = 100;
          this.field_A.field_r = this.field_t;
          this.field_A.field_s = this.field_E;
          this.field_A.field_H = 0.6;
          this.field_A.field_E = this.field_D;
          this.field_A.field_A = 0.5;
          var6 = new gk(this.field_A, (pm) null, vf.field_n, 0, false);
          var6.field_w = 4.0;
          var6.field_m = 255;
          this.field_A.field_n = var6;
          var3 = this.field_A.field_J.field_o;
          if (this.field_A.field_x.field_t > 0 &&
            this.field_A.field_x.field_r[this.field_A.field_x.field_t] > this.field_D) {
            var3--;
            if (var3 >= 4 &&
              var3 <= 20) {
              if (0 != (var3 & 3) &&
                var3 != 23) {
                return;
              }
            } else {
              if (var3 != 23) {
                return;
              }
            }
          } else {
            if (var3 >= 4 &&
              var3 <= 20) {
              if (0 != (var3 & 3) &&
                var3 != 23) {
                return;
              }
            } else {
              if (var3 != 23) {
                return;
              }
            }
          }
          di.a(-30867, 240, 15);
          return;
        }
        field_fb = (String) null;
        this.field_A.field_L = 100;
        this.field_A.field_r = this.field_t;
        this.field_A.field_s = this.field_E;
        this.field_A.field_H = 0.6;
        this.field_A.field_E = this.field_D;
        this.field_A.field_A = 0.5;
        var5 = new gk(this.field_A, (pm) null, vf.field_n, 0, false);
        var5.field_w = 4.0;
        var5.field_m = 255;
        this.field_A.field_n = var5;
        var3Lifetime1 = this.field_A.field_J.field_o;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_A.field_x.field_t <= 0) {
          if ((var3Lifetime1 < 4 ||
            var3Lifetime1 > 20 ||
            0 != (var3Lifetime1 & 3)) &&
            var3Lifetime1 != 23) {
            return;
          }
        } else {
          if (!(this.field_A.field_x.field_r[this.field_A.field_x.field_t] > this.field_D)) {
            if (var3Lifetime1 >= 4 &&
              var3Lifetime1 <= 20) {
              if (0 == (var3Lifetime1 & 3)) {
                di.a(-30867, 240, 15);
              } else {
                if (var3Lifetime1 == 23) {
                  di.a(-30867, 240, 15);
                }
              }
              return;
            }
          } else {
            var3Lifetime1--;
            if (var3Lifetime1 >= 4 &&
              var3Lifetime1 <= 20) {
              if (0 != (var3Lifetime1 & 3) &&
                var3Lifetime1 != 23) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (var3Lifetime1 != 23)) {
            return;
          }
        }
        di.a(-30867, 240, 15);
    }

    final void b(boolean param0, ee param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == this.field_Y && (param1.field_z ||
            !(this.field_S <= 0))) {
            this.field_S = this.field_S + 1;
            return;
          }
          this.field_gb = param1.a(14170, true, this.field_gb);
          if (param0) {
            field_hb = (String) null;
          }
          if (!(0.00001 > this.field_gb)) {
            return;
          }
          this.a(param1, 0.0, -123);
          param1.a(14170, false, this.field_X);
          this.d(10797);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("gi.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static mi a(int param0, boolean param1, boolean param2, int param3, boolean param4) {
        if (!param2) {
          return (mi) null;
        }
        return we.a(param0, false, (byte) -125, param4, param3, param1);
    }

    static {
        field_bb = new fi();
        field_hb = "You already have 4 nuclear missiles";
        field_fb = "Continue";
        field_db = new byte[520];
    }
}
