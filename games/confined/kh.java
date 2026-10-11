/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends dc {
    static bi field_fb;
    static jg field_gb;
    static String field_W;

    final boolean a(int param0, boolean param1, pm param2) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        try {
          if (this.field_T == param2) {
            return false;
          }
          if (!param2.c(5)) {
            return false;
          }
          var4_double = -this.field_cb + param2.field_E;
          var6 = param2.field_t - this.field_L;
          var8 = -this.field_X + param2.field_D;
          var10 = this.field_x * var4_double + var6 * this.field_P + var8 * this.field_K;
          if (var10 >= (double)param0) {
            var12 = var4_double - var10 * this.field_x;
            var14 = var6 - var10 * this.field_P;
            var16 = var8 - var10 * this.field_K;
            var18 = var16 * var16 + (var14 * var14 + var12 * var12);
            var20 = param2.field_C * param2.field_C;
            if (!(var18 < var20)) {
              return false;
            }
            var22 = Math.sqrt(var20 - var18);
            var24 = var10 - var22;
            if (!param1 ||
              this.field_y > var24) {
              this.field_R = this.field_cb + this.field_x * var24;
              this.field_y = var24;
              this.field_s = this.field_L + this.field_P * var24;
              this.field_S = param2;
              this.field_eb = var24 * this.field_K + this.field_X;
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("kh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void i(int param0) {
        lc var3 = this.field_T.field_A.field_x;
        lc var2 = var3;
        this.field_S = null;
        this.field_eb = var2.field_r[var3.field_a - param0];
        this.field_y = (this.field_eb - this.field_X) / this.field_K;
        this.field_R = this.field_cb + this.field_x * this.field_y;
        this.field_s = this.field_P * this.field_y + this.field_L;
    }

    private final boolean a(int param0, boolean param1, boolean param2) {
        int var6 = 0;
        int var5;
        double[] var7;
        double[] var8;
        double[] var9;
        double var10;
        double var12;
        double var14;
        double var16;
        double var18;
        double var20;
        double var22;
        int var24;
        lc var25;
        lc var26;
        var24 = Confined.field_J ? 1 : 0;
        var25 = this.field_T.field_A.field_x;
        var26 = var25;
        var5 = var26.field_f - 1;
        if (!param2) {
          field_fb = (bi) null;
        }
        for (var6 = 0; var6 < var26.field_f; var6++) {
          boolean decompiledFrameRemainder0 = true;
          var7 = new double[]{var25.field_v[param0][var6], var25.field_v[1 + param0][var6], var25.field_v[param0 + 1][var5], var25.field_v[param0][var5]};
          var8 = new double[]{var25.field_n[param0][var6], var25.field_n[1 + param0][var6], var25.field_n[param0 + 1][var5], var25.field_n[param0][var5]};
          var9 = new double[]{var25.field_r[param0], var25.field_r[1 + param0], var25.field_r[1 + param0], var25.field_r[param0]};
          var10 = -var7[1] + var7[2];
          var12 = var8[2] - var8[1];
          var14 = -var7[3] + var7[2];
          var16 = -var8[3] + var8[2];
          var18 = var9[2] - var9[3];
          var20 = var7[0] - var7[1];
          var22 = var8[0] - var8[1];
          if (0.0 <= (-(var10 * (var22 + var16)) + (var14 + var20) * var12) * var18) {
            if (this.a(var9[2], (byte) -32, param1, var9[0], var7[1], var7[2], var8[1], var8[2], var9[1], var8[0], var7[0])) {
              param1 = true;
            }
            if (this.a(var9[0], (byte) -32, param1, var9[2], var7[3], var7[0], var8[3], var8[0], var9[3], var8[2], var7[2])) {
              param1 = true;
            }
          } else {
            if (this.a(var9[1], (byte) -32, param1, var9[3], var7[0], var7[1], var8[0], var8[1], var9[0], var8[3], var7[3])) {
              param1 = true;
            }
            if (this.a(var9[3], (byte) -32, param1, var9[1], var7[2], var7[3], var8[2], var8[3], var9[2], var8[1], var7[1])) {
              param1 = true;
              var5 = var6;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            var5 = var6;
          }
        }
        return param1;
    }

    final void f(byte param0) {
        lc var3 = this.field_T.field_A.field_x;
        lc var2 = var3;
        if (param0 >= -117) {
          field_fb = (bi) null;
        }
        this.field_S = null;
        this.field_eb = var3.field_r[0];
        this.field_y = (-this.field_X + this.field_eb) / this.field_K;
        this.field_s = this.field_P * this.field_y + this.field_L;
        this.field_R = this.field_cb + this.field_y * this.field_x;
    }

    public static void g(byte param0) {
        field_fb = null;
        field_gb = null;
        if (param0 <= 13) {
          return;
        }
        field_W = null;
    }

    kh(pm param0, bi param1, int param2) {
        super(param0, param1, param2);
    }

    final boolean b(boolean param0, int param1, int param2) {
        lc var13 = this.field_T.field_A.field_x;
        lc var14 = var13;
        double var5 = var13.field_r[param2];
        if (param1 != 28) {
          return true;
        }
        if (0.001 * (var5 - this.field_X) > this.field_K) {
          return this.a(param2 - 1, param0, true);
        }
        double var7 = (-this.field_X + var5) / this.field_K;
        double var9 = this.field_x * var7 + this.field_cb;
        double var11 = var7 * this.field_P + this.field_L;
        if (var14.a(var11, var9, (byte) 29, param2)) {
          return this.a(-1 + param2, param0, true);
        }
        return false;
    }

    final static void a(byte param0, boolean param1) {
        vg.field_Z.a((byte) -47, 0, 0);
        if (param0 != 35) {
          kh.a((byte) -77, false);
        }
    }

    final static void h(int param0) {
        int var1 = 57 % ((0 - param0) / 62);
        tj.field_z[45] = 26;
        tj.field_z[46] = 72;
        tj.field_z[44] = 71;
        tj.field_z[91] = 42;
        tj.field_z[92] = 74;
        tj.field_z[59] = 57;
        tj.field_z[520] = 59;
        tj.field_z[222] = 58;
        tj.field_z[192] = 28;
        tj.field_z[61] = 27;
        tj.field_z[93] = 43;
        tj.field_z[47] = 73;
    }

    private final boolean a(double param0, byte param1, boolean param2, double param3, double param4, double param5, double param6, double param7, double param8, double param9, double param10) {
        if (param1 != -32) {
          field_fb = (bi) null;
        }
        param5 = param5 - param10;
        param7 = param7 - param9;
        param8 = param8 - param3;
        param0 = param0 - param3;
        param4 = param4 - param10;
        param6 = param6 - param9;
        double var21 = param6 * param0 - param8 * param7;
        double var23 = -(param4 * param0) + param5 * param8;
        double var25 = -(param5 * param6) + param4 * param7;
        double var27 = var25 * var25 + (var21 * var21 + var23 * var23);
        if (0.000001 > var27) {
          return false;
        }
        var27 = 1.0 / Math.sqrt(var27);
        var23 = var23 * var27;
        var25 = var25 * var27;
        var21 = var21 * var27;
        var27 = param10 - this.field_cb;
        double var29 = param9 - this.field_L;
        double var31 = param3 - this.field_X;
        double var33 = var25 * var31 + (var27 * var21 + var23 * var29);
        if (var33 >= 0.0) {
          return false;
        }
        double var35 = this.field_K * var25 + (var21 * this.field_x + var23 * this.field_P);
        if (0.0001 * var33 < var35) {
          return false;
        }
        double var37 = var33 / var35;
        if (!param2 ||
          var37 < this.field_y) {
          this.field_s = this.field_P * var37 + this.field_L;
          this.field_S = null;
          this.field_y = var37;
          this.field_eb = this.field_X + this.field_K * var37;
          this.field_R = this.field_x * var37 + this.field_cb;
          return true;
        }
        return false;
    }

    final void a(double param0, int param1, double param2, double param3, double param4, double param5, double param6, double param7, boolean param8, double param9) {
        this.field_x = param7;
        this.field_L = param0;
        this.field_K = param2;
        this.field_P = param9;
        if (param8) {
          return;
        }
        this.field_H = param1;
        this.field_cb = param6;
        this.field_u = param3;
        this.field_B = param4;
        this.field_X = param5;
    }

    final boolean a(int param0, byte param1, boolean param2) {
        int var5 = 14 % ((param1 - 63) / 56);
        lc var14 = this.field_T.field_A.field_x;
        lc var15 = var14;
        double var6 = var14.field_r[param0];
        if (this.field_K > 0.001 * (-this.field_X + var6)) {
          return this.a(param0, param2, true);
        }
        double var8 = (-this.field_X + var6) / this.field_K;
        double var10 = this.field_cb + var8 * this.field_x;
        double var12 = this.field_L + var8 * this.field_P;
        if (!var15.a(var12, var10, (byte) 55, param0)) {
          return false;
        }
        return this.a(param0, param2, true);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          var4 = new char[param1];
          var5 = param2;
          for (var6 = 0; param1 > var6; var6++) {
            var7 = 255 & param0[param3 + var6];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = cd.field_m[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_13_0 = new String(var4, 0, var5);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("kh.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_W = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
