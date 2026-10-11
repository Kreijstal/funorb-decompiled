/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    private double[] field_h;
    static ji field_d;
    static String field_a;
    private double[] field_f;
    private double[] field_e;
    static int field_c;
    static String field_b;
    static nf field_g;

    final void a(int param0, double[] param1, double param2) {
        int var11 = 0;
        double var5_double = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        int var28 = 0;
        vg var29 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var28 = Confined.field_J ? 1 : 0;
        try {
          if (1e-7 > param2) {
            return;
          }
          var5_double = param2 * param1[9];
          var7 = param2 * param1[10];
          if (param0 != 26214) {
            var29 = (vg) null;
            this.a(-107, -2.534413273598302, 0.45288593443831515, 0.5839953212132996, (vg) null, 63);
          }
          var9 = param1[11] * param2;
          for (var11 = 0; var11 < 8192; var11++) {
            var12 = -var5_double + this.field_h[var11];
            var14 = this.field_e[var11] - var7;
            var16 = this.field_f[var11] - var9;
            param2 = var12 * var12 + var14 * var14 + var16 * var16;
            if (1.0 < param2) {
              var18 = 6.283185307179586 * Math.random();
              var20 = 0.999 * Math.random();
              var22 = Math.sqrt(1.0 - var20);
              var20 = Math.sqrt(var20);
              var24 = var20 * Math.sin(var18);
              var26 = Math.cos(var18) * var20;
              this.field_h[var11] = var26 * param1[6] + param1[3] * var24 + var22 * param1[9];
              this.field_e[var11] = param1[7] * var26 + var24 * param1[4] + var22 * param1[10];
              this.field_f[var11] = param1[11] * var22 + (param1[5] * var24 + var26 * param1[8]);
            } else {
              this.field_h[var11] = var12;
              this.field_e[var11] = var14;
              this.field_f[var11] = var16;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("kn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, double param1, double param2, double param3, vg param4, int param5) {
        int var37 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        double var42 = 0.0;
        double var44 = 0.0;
        double var46 = 0.0;
        double var48 = 0.0;
        double var50 = 0.0;
        double var52 = 0.0;
        double var54 = 0.0;
        double var56_double = 0.0;
        int var56 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        vg var63 = null;
        kh var64 = null;
        double var52Lifetime1;
        double var54Lifetime1;
        int var60Lifetime1;
        int var60Lifetime2;
        int var60Lifetime3;
        int var61Lifetime1;
        int var61Lifetime2;
        int var61Lifetime3;
        var62 = Confined.field_J ? 1 : 0;
        try {
          var64 = new kh((pm) null, (bi) null, 0);
          var11 = 32.0 * param4.field_R;
          if (param5 != -1212126616) {
            var63 = (vg) null;
            this.a((byte) 43, -52, (vg) null);
          }
          var13 = param4.field_ab * 32.0;
          var15 = 32.0 * param4.field_M;
          var17 = param4.field_V * 32.0;
          var19 = param4.field_U * 32.0;
          var21 = 32.0 * param4.field_F;
          var23 = 32.0 * param4.field_P;
          var25 = param4.field_H * 32.0;
          var27 = 32.0 * param4.field_N;
          var29 = param2 * var13 + var11 * param1 + var15 * param3;
          var31 = param2 * var19 + var17 * param1 + param3 * var21;
          var33 = var23 * param1 + var25 * param2 + param3 * var27;
          var35 = 0.032;
          if (!(var33 < 0.0)) {
            var35 = var35 + var33;
          } else {
            var35 = var35 - var33;
          }
          for (var37 = 0; var37 < 8192; var37++) {
            boolean decompiledFrameRemainder0 = true;
            var38 = this.field_h[var37];
            var40 = this.field_e[var37];
            var42 = this.field_f[var37];
            var44 = var42 * var15 + (var40 * var13 + var11 * var38);
            var46 = var19 * var40 + var17 * var38 + var42 * var21;
            var48 = var27 * var42 + (var25 * var40 + var23 * var38);
            if (var48 > var35) {
              var50 = 0.32 / var48 * 640.0;
              if (var50 >= 8.0) {
                var64.field_D = var46 + var31;
                var64.field_C = -var33 + var48;
                var64.field_ab = var46 - var31;
                var64.field_bb = var44 - var29;
                var64.field_Y = var29 + var44;
                var64.field_A = var48 + var33;
                decompiledFrameRemainder0 = !(!var64.g(-10603));
                if (decompiledFrameRemainder0) {
                  var64.c(param5 + 1212124912);
                  if (var64.field_V) {
                    var52 = (double)(var64.field_t - var64.field_G);
                    var54 = (double)(-var64.field_z + var64.field_w);
                    var56_double = var50 / Math.sqrt(var54 * var54 + var52 * var52);
                    if (var56_double > 1.0) {
                      var56_double = 1.0;
                    }
                    var58 = 255 - (int)(255.0 * (1.0 - var56_double) * (1.0 - var56_double) * (-var56_double + 1.0));
                    var59 = (int)(var56_double * 255.0);
                    var64.field_H = var59 | (var59 << 8 | var58 << 16);
                    var64.a(param0, -72);
                    var60 = var64.a(13107, (byte) -63);
                    var64.a(param0, 0, -14936, var60);
                    var64.field_H = var58 << 16 | var58 << 8 | var59;
                    var61 = var60;
                    var60Lifetime1 = var64.a(26214, (byte) -63);
                    var64.a(param0, var61, -14936, var60Lifetime1);
                    var64.field_H = var58 << 8 | var59 << 16 | var59;
                    var61Lifetime1 = var60Lifetime1;
                    var60Lifetime2 = var64.a(39321, (byte) -63);
                    var64.a(param0, var61Lifetime1, -14936, var60Lifetime2);
                    var64.field_H = var58 | (var58 << 8 | var59 << 16);
                    var61Lifetime2 = var60Lifetime2;
                    var60Lifetime3 = var64.a(52428, (byte) -63);
                    var64.a(param0, var61Lifetime2, -14936, var60Lifetime3);
                    var61Lifetime3 = var60Lifetime3;
                    var64.field_H = var58 | (var59 << 16 | var59 << 8);
                    var64.a(param0, var61Lifetime3, -14936, 65536);
                    var64.b(param0, (byte) 27);
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                var52Lifetime1 = 10240.0 * (var44 / var48) + 5120.0;
                var54Lifetime1 = 3008.0 + var46 / var48 * 10240.0;
                if (!(16.0 > var50)) {
                  if (var52Lifetime1 > -var50 &&
                    var50 + 10240.0 > var52Lifetime1 &&
                    -var50 < var54Lifetime1 &&
                    var54Lifetime1 < var50 + 6016.0) {
                    fn.a((int)var52Lifetime1, (int)var54Lifetime1, (int)(0.5 + var50), 255, tl.field_d);
                  }
                } else {
                  if (var52Lifetime1 > -16.0 &&
                    10256.0 > var52Lifetime1 &&
                    var54Lifetime1 > -16.0 &&
                    var54Lifetime1 < 6032.0) {
                    var56 = (int)(0.5 + var50 * 0.99609375 * var50);
                    if (var56 > 0) {
                      fn.a((int)var52Lifetime1, (int)var54Lifetime1, 16, var56, tl.field_d);
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_32_0 = var10;
          stackIn_32_1 = new StringBuilder().append("kn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -122) {
          field_c = -89;
        }
        field_g = null;
        field_d = null;
        field_b = null;
    }

    final void a(byte param0, int param1, vg param2) {
        int var4_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        int var24 = 0;
        int var25 = 0;
        var25 = Confined.field_J ? 1 : 0;
        try {
          var5 = -38 / ((param0 + 76) / 41);
          for (var4_int = 0; 8192 > var4_int; var4_int++) {
            var6 = this.field_h[var4_int];
            var8 = this.field_e[var4_int];
            var10 = this.field_f[var4_int];
            var12 = param2.field_M * var10 + (param2.field_R * var6 + param2.field_ab * var8);
            var14 = param2.field_F * var10 + (param2.field_V * var6 + param2.field_U * var8);
            var16 = param2.field_N * var10 + (param2.field_H * var8 + param2.field_P * var6);
            if (var16 > 0.001) {
              var18 = 10240.0 * (var12 / var16) + 5120.0;
              var20 = 3008.0 + var14 / var16 * 10240.0;
              var22 = 0.01 / var16 * 640.0;
              if (!(var22 < 16.0)) {
                if (var18 > -var22 &&
                  var18 < var22 + 10240.0 &&
                  var20 > -var22 &&
                  6016.0 + var22 > var20) {
                  fn.a((int)var18, (int)var20, (int)(var22 + 0.5), 255 * param1 >> 8, tl.field_d);
                }
              } else {
                if (var18 > -16.0 &&
                  10256.0 > var18 &&
                  -16.0 < var20 &&
                  var20 < 6032.0) {
                  var24 = (int)(var22 * 0.99609375 * var22 + 0.5);
                  if (0 < var24) {
                    fn.a((int)var18, (int)var20, 16, param1 * var24 >> 8, tl.field_d);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("kn.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    kn() {
        int var1 = 0;
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        this.field_h = new double[8192];
        this.field_e = new double[8192];
        this.field_f = new double[8192];
        for (var1 = 0; var1 < 8192; var1++) {
          var2 = -0.999 + 1.998 * Math.random();
          var4 = Math.sqrt(1.0 - var2 * var2);
          var6 = Math.random() * 6.283185307179586;
          var8 = Math.sin(var6) * var4;
          var10 = var4 * Math.cos(var6);
          var12 = Math.pow(Math.random(), 0.3333333333333333);
          this.field_h[var1] = var8 * var12;
          this.field_e[var1] = var12 * var10;
          this.field_f[var1] = var2 * var12;
        }
    }

    final static void a(int param0, java.applet.Applet param1, long param2, String param3, String param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var9 = param1.getParameter("cookiehost");
              var7 = var9;
              var7Lifetime1 = var9;
              var8 = 61 % ((69 - param0) / 49);
              var10 = param4 + "=" + param3 + "; version=1; path=/; domain=" + var9;
              var7Lifetime2 = var10;
              var7Lifetime3 = var10;
              if (param2 >= 0L) {
                var7Lifetime4 = var10 + "; Expires=" + ha.a(ri.a(-3) + 1000L * param2, 13) + "; Max-Age=" + param2;
              } else {
                var7Lifetime4 = var10 + "; Discard;";
              }
              kf.a(param1, true, "document.cookie=\"" + var7Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("kn.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param4 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "<%0> cluster missiles";
        field_a = "<col=FFFFFF>Nuclear missiles:</col> rare devices for use in tight corners, a single nuclear missile will explode with style and obliterate practically everything in sight. Press <col=FFFFFF><%0></col> to fire one. You can carry four.";
    }
}
