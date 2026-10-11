/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends wf {
    static int field_t;
    static int field_o;
    static bc field_s;
    static bi[] field_q;
    boolean field_p;
    static String field_r;

    kl(ln param0, pf param1, int[][] param2, fs param3, me param4, int param5, dc param6) {
        super(param0);
        int var19 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        sd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln[] var12_ref_ln__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ln var14_ref_ln = null;
        sd var15 = null;
        Object var16 = null;
        int var17 = 0;
        int var18_int = 0;
        ln[] var18 = null;
        ln var20 = null;
        int var22 = 0;
        int var23 = 0;
        sd[] var24 = null;
        ln[] var25 = null;
        ln var26 = null;
        ln[] var27 = null;
        ln var28 = null;
        int var10Lifetime1;
        int var13Lifetime1;
        int var17Lifetime1;
        this.field_p = false;
        try {
          var24 = new sd[param0.field_D.length];
          var8 = var24;
          var9 = 0;
          var12_ref_ln__ = param0.field_D;
          for (var13 = 0; var13 < var12_ref_ln__.length; var13++) {
            var14_ref_ln = var12_ref_ln__[var13];
            if (var14_ref_ln.field_y == param3) {
              var11 = 0;
              for (var10 = 0; var10 < var9; var10++) {
                if (var24[var10] != var14_ref_ln.field_R) {
                  continue;
                }
                var11 = 1;
                break;
              }
              if (var11 == 0) {
                var8[var9] = var14_ref_ln.field_R;
                var9++;
              }
            }
          }
          if (var9 == 0) {
            throw new RuntimeException("Target star " + param0.field_I + " does not appear to be connected to any of AI's stars.");
          }
          var15 = (sd) (param1.d(0));
          var16 = null;
          this.field_j = 0;
          var10Lifetime1 = 0;
          while (var15 != null) {
            var14 = 0;
            while (var9 > var14) {
              if (var24[var14] != var15) {
                var14++;
                continue;
              }
              var12 = 0;
              var22 = 0;
              var13Lifetime1 = var22;
              while (var22 < 4) {
                var12 = var12 + param0.field_G[var22] * param2[var10Lifetime1][var22];
                if (var12 < 0) {
                  var12 = -var12;
                }
                if (var12 > this.field_j) {
                  this.field_j = var12;
                  var16 = var15;
                }
                var22++;
              }
              break;
            }
            var15 = (sd) (param1.a((byte) -71));
            var10Lifetime1++;
          }
          this.field_j = this.field_j + 50 * (-1 + var9);
          if (param4 instanceof ui &&
            this.field_n.field_p == 36) {
            this.field_j = this.field_j + 100;
          }
          if (param4 instanceof hp &&
            this.field_n.field_L == 2) {
            if (!param6.field_o.field_i) {
              var17 = ((sd) (var16)).field_r;
            } else {
              var17 = param3.field_m.field_r;
            }
            if (-5 * this.field_n.field_G[0] > var17) {
              this.field_j = this.field_j - 100;
            }
            if (null != this.field_n.field_y &&
              this.field_n.field_y.field_x == param5) {
              this.field_j = this.field_j + 100;
            }
          }
          this.field_i = param0.field_x;
          if (null == param0.field_y) {
            var25 = param0.field_D;
            for (var18_int = 0; var18_int < var25.length; var18_int++) {
              var26 = var25[var18_int];
              if (param3 != var26.field_y &&
                var26.field_y != null) {
                this.field_i = this.field_i + var26.field_x;
              }
            }
          } else {
            var27 = param0.field_D;
            var23 = 0;
            var18_int = var23;
            while (var23 < var27.length) {
              var28 = var27[var23];
              if (param3 != var28.field_y && (param0.field_y == var28.field_y ||
                null != var28.field_y &&
                !param0.field_y.field_h[var28.field_y.field_x])) {
                this.field_i = this.field_i + var28.field_x;
              }
              var23++;
            }
          }
          if (param0.field_u) {
            this.field_i = 2 * this.field_i;
          }
          if (!param6.field_o.field_l) {
            var17Lifetime1 = 0;
            var18 = this.field_n.field_D;
            for (var19 = 0; var18.length > var19; var19++) {
              var20 = var18[var19];
              if (param3 != var20.field_y) {
                var17Lifetime1++;
              }
            }
            if (this.field_i > 0 &&
              0 < var17Lifetime1) {
              var17Lifetime1++;
            }
            this.field_i = this.field_i + var17Lifetime1;
          }
          if (this.field_i == 0) {
            this.field_i = 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_73_0 = var8_ref;
          stackIn_73_1 = new StringBuilder().append("kl.<init>(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param3 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param4 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(')').toString());
        }
    }

    final static boolean d(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 < 95) {
          kl.d((byte) -4);
        }
        stackIn_7_0 = (w.d(true)) || !(0 < es.field_m);
        return stackIn_7_0;
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        if (param0 > -53) {
          kl.d((byte) 123);
        }
        field_r = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var18 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = ShatteredPlansClient.field_F ? 1 : 0;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        try {
          var7_int = param3 & 16711935;
          if (param5 > param6) {
            param5 = param6;
          }
          gf.f(3 + param2, param1, 4 + param6 - 3, 16777215);
          var8 = param3 & 65280;
          gf.a(param2 + 3 - 1, 1 + param1, 16777215);
          gf.f(3 + param2, 1 + param1, -3 + (param6 + 2), 0);
          gf.a(3 + (param6 + param2), 1 + param1, 16777215);
          for (var9 = 2; var9 < 3; var9++) {
            var10 = (var9 * 256 - 512) / (param4 - 4);
            var11 = (-16711936 & (var10 >> 1) * 16711935 + (-var10 + 256) * var7_int | 16711680 & (256 - var10) * var8 + (var10 >> 1) * 65280) >>> 8;
            var12 = (-16711936 & 12583104 * (var10 >> 1) + 536879104 - 2097184 * var10 | 16711680 & (var10 >> 1) * 49152 + (2097152 - var10 * 8192)) >>> 8;
            var13 = 8355711 & var12 >> 1;
            var14 = param1 + var9;
            var15 = param2 - (-3 + var9);
            var16 = 3 + param5 + param2;
            var17 = var16 + 5;
            var18 = param6 + param2 + 3;
            if (var17 > var18) {
              var17 = var18;
            }
            gf.a(var15, var14, 16777215);
            gf.a(1 + var15, var14, 0);
            gf.f(2 + var15, var14, var16 - var15 - 2, var11);
            gf.f(var16, var14, var17 - var16, var13);
            gf.f(var17, var14, var18 - var17, var12);
            gf.a(var18, var14, 16777215);
            gf.a(var18 - 1, var14, 0);
          }
          if (param0 < 12) {
            field_r = (String) null;
          }
          for (var9Lifetime1 = 3; var9Lifetime1 < -3 + param4; var9Lifetime1++) {
            var10Lifetime1 = (-2 + var9Lifetime1) * 256 / (param4 - 4);
            var11Lifetime1 = (-16711936 & (var10Lifetime1 >> 1) * 16711935 + (-var10Lifetime1 + 256) * var7_int | (-var10Lifetime1 + 256) * var8 + 65280 * (var10Lifetime1 >> 1) & 16711680) >>> 8;
            var12Lifetime1 = (16711680 & (-var10Lifetime1 + 256) * 8192 + 49152 * (var10Lifetime1 >> 1) | -16711936 & 2097184 * (256 - var10Lifetime1) + 12583104 * (var10Lifetime1 >> 1)) >>> 8;
            var13Lifetime1 = (16711422 & var12Lifetime1) >> 1;
            var14Lifetime1 = var9Lifetime1 + param1;
            var15Lifetime1 = param2 + param5 + 3;
            var16Lifetime1 = var15Lifetime1 + 5;
            var17Lifetime1 = param6 + param2 + 3;
            if (var17Lifetime1 < var16Lifetime1) {
              var16Lifetime1 = var17Lifetime1;
            }
            gf.a(param2, var14Lifetime1, 16777215);
            gf.a(1 + param2, var14Lifetime1, 0);
            gf.f(2 + param2, var14Lifetime1, var15Lifetime1 - param2 - 2, var11Lifetime1);
            gf.f(var15Lifetime1, var14Lifetime1, var16Lifetime1 - var15Lifetime1, var13Lifetime1);
            gf.f(var16Lifetime1, var14Lifetime1, -var16Lifetime1 + var17Lifetime1, var12Lifetime1);
            gf.a(3 + (param6 + param2), var14Lifetime1, 16777215);
            gf.a(2 + (param6 + param2), var14Lifetime1, 0);
          }
          for (var9Lifetime2 = param4 - 3; var9Lifetime2 < -2 + param4; var9Lifetime2++) {
            var10Lifetime2 = (var9Lifetime2 * 256 - 512) / (param4 - 4);
            var11Lifetime2 = (16711680 & var8 * (256 - var10Lifetime2) + 65280 * (var10Lifetime2 >> 1) | var7_int * (256 - var10Lifetime2) + 16711935 * (var10Lifetime2 >> 1) & -16711936) >>> 8;
            var12Lifetime2 = ((var10Lifetime2 >> 1) * 16711935 + 1073758208 - var10Lifetime2 * 4194368 & -16711936 | (var10Lifetime2 >> 1) * 65280 + 16384 * (-var10Lifetime2 + 256) & 16711680) >>> 8;
            var13Lifetime2 = 8355711 & var12Lifetime2 >> 1;
            var14Lifetime2 = var9Lifetime2 + param1;
            var15Lifetime2 = -var9Lifetime2 + (param4 + param2 + (param5 + 2 - 3));
            var16Lifetime2 = var15Lifetime2 + 5;
            var17Lifetime2 = -3 + param4 + (param2 + param6) - (-2 + var9Lifetime2);
            gf.a(param2, var14Lifetime2, 16777215);
            if (var17Lifetime2 < var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            gf.a(1 + param2, var14Lifetime2, 0);
            gf.f(2 + param2, var14Lifetime2, var15Lifetime2 - (param2 + 2), var11Lifetime2);
            gf.f(var15Lifetime2, var14Lifetime2, -var15Lifetime2 + var16Lifetime2, var13Lifetime2);
            gf.f(var16Lifetime2, var14Lifetime2, -var16Lifetime2 + var17Lifetime2, var12Lifetime2);
            gf.a(var17Lifetime2, var14Lifetime2, 16777215);
            gf.a(-1 + var17Lifetime2, var14Lifetime2, 0);
          }
          gf.f(param2, param1 - (-param4 + 1), 1 + param6, 16777215);
          gf.a(param2, param1 + param4 - 2, 16777215);
          gf.f(param2 + 1, param1 + (param4 - 2), param6 - 1, 0);
          gf.a(-3 + param2 + param6 + 4, param1 + param4 - 2, 16777215);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kl.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_r = "In the first half of the 22nd Century (Old Earth Reckoning) scientists in the Escher Programme began research into faster-than-light travel.";
    }
}
