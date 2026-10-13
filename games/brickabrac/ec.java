/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ib implements en {
    static int field_J;
    static String field_L;
    private int[] field_T;
    private d[] field_I;
    private int field_M;
    static boolean field_O;
    static tg field_P;
    static int[] field_N;
    private String field_R;
    static String field_S;
    private TextFont field_H;
    private lp field_K;
    static ki field_Q;

    final void a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        try {
          if (param0) {
            d var5 = (d) null;
            this.a(117, -42, (byte) 27, -108, (d) null);
          }
          var4_int = this.field_M;
          this.a((byte) -106, 1 + var4_int);
          this.field_I[var4_int] = this.a((byte) 126, param1, (uh) (this));
          this.field_T[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ec.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_M; var6_int++) {
            if (param4 != this.field_I[var6_int]) {
              continue;
            }
            var7 = this.field_T[var6_int];
            if (var7 != -1) {
              bd.a(this.field_T[var6_int], true);
            } else {
              this.field_K.m(17);
            }
            break;
          }
          if (param2 > -22) {
            field_O = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ec.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        lm.a(-1);
        cg.field_l = true;
        sa.field_E = true;
        mf.field_f.a(-126);
        if (param0 != 6846) {
          ec.a(-62);
        }
        pq.a(0, GameScreen.field_b, false);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        this.field_H.a(this.field_R, 14 + (param1 + this.field_o), 10 + (param0 + this.field_w), this.field_t - 28, this.field_s, 16777215, -1, 0, 0, this.field_H.ascent);
    }

    final d a(byte param0, String param1, uh param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        d var5 = null;
        int var6 = 0;
        d stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -104 / ((param0 - 89) / 37);
          var5 = new d(param1, param2);
          var5.field_l = (ub) ((Object) new hi());
          var6 = this.field_s - 2;
          this.a(34 + this.field_s, 0, 0, (byte) -119, this.field_t);
          var5.a(30, 7, var6, (byte) -119, -14 + this.field_t);
          this.a(var5, true);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ec.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (param1 <= this.field_M) {
          return;
        }
        d[] var7 = new d[param1];
        d[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < this.field_M; var5++) {
          var7[var5] = this.field_I[var5];
          var4[var5] = this.field_T[var5];
        }
        this.field_T = var4;
        if (param0 > -54) {
          return;
        }
        this.field_I = var3;
        this.field_M = param1;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RgbSprite var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int[] var32 = null;
        int[] var33 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        var31 = BrickABrac.field_J ? 1 : 0;
        try {
          var8_int = param2 + (-param1 - param7);
          var9 = -param7 + param4 - param1;
          var10 = param1 + (param2 + param7);
          if (Rasterizer2D.clipRight < var10) {
            var10 = Rasterizer2D.clipRight;
          }
          if (Rasterizer2D.clipLeft > var8_int) {
            var8_int = Rasterizer2D.clipLeft;
          }
          var11 = param4 + param1 + param7;
          if (var9 < Rasterizer2D.clipTop) {
            var9 = Rasterizer2D.clipTop;
          }
          if (var11 > Rasterizer2D.clipBottom) {
            var11 = Rasterizer2D.clipBottom;
          }
          var33 = new int[32];
          var32 = var33;
          var12 = var32;
          var13 = 16711935 & param0;
          var14 = 65280 & param0;
          for (var15 = 0; var15 < 16; var15++) {
            var16 = param6 * var15 >> 4;
            var12[var15] = LevelSelectScreen.d(ik.a(var16 * var14, 16711680), ik.a(var13 * var16, -16711936)) >>> 8;
            var12[-var15 + 31] = LevelSelectScreen.d(ik.a(var16 * var13, -16711936), ik.a(16711680, var16 * var14)) >>> 8;
          }
          var15Lifetime1 = var10 - var8_int;
          var16Lifetime1 = -var9 + var11;
          if (param3 != 99) {
            field_O = false;
          }
          if (var15Lifetime1 > 0 &&
            var16Lifetime1 > 0) {
            var17 = new RgbSprite(var15Lifetime1, var16Lifetime1);
            var18 = param1 * param1;
            var19 = (param7 + param1) * (param7 + param1);
            var20 = 0;
            var21 = -param4 + var9;
            var22 = 0;
            while (var22 < var16Lifetime1) {
              var23 = -param2 + var8_int;
              var24 = var23 * var23 + var21 * var21;
              var25 = 0;
              while (var25 < var15Lifetime1) {
                var26 = var22 + var9;
                var27 = var25 + var8_int;
                if (var24 != 0) {
                  if (var24 < var18) {
                    var28 = ap.a(var24 << 12, -55);
                    var29 = (param1 << 6) - var28;
                    var30 = var28 - ((-BrickABrac.c(2048, (var29 << 7) / param1) + 65536) * param5 >> 11);
                    var26 = var21 * var30 / var28 + param4;
                    var27 = var30 * var23 / var28 + param2;
                    if (Rasterizer2D.clipLeft > var27) {
                      var27 = Rasterizer2D.clipLeft;
                    }
                    if (Rasterizer2D.clipTop > var26) {
                      var26 = Rasterizer2D.clipTop;
                    }
                    if (var27 >= Rasterizer2D.clipRight) {
                      var27 = Rasterizer2D.clipRight;
                    }
                    if (var26 >= Rasterizer2D.clipBottom) {
                      var26 = Rasterizer2D.clipBottom;
                    }
                  } else {
                    if (var19 <= var24) {
                      var17.pixels[var20] = Rasterizer2D.pixels[Rasterizer2D.width * var26 + var27];
                      var20++;
                      var23++;
                      var25++;
                      var24 = var24 + (-1 + var23 * 2);
                      continue;
                    }
                    var28 = ap.a(var24 << 12, -100);
                    var29 = -(param1 << 6) + var28;
                    var30 = var28 - (param5 * (-BrickABrac.c(2048, (var29 << 7) / param7) + 65536) >> 11);
                    var27 = param2 + var23 * var30 / var28;
                    var26 = var30 * var21 / var28 + param4;
                    if (Rasterizer2D.clipLeft > var27) {
                      var27 = Rasterizer2D.clipLeft;
                    }
                    if (Rasterizer2D.clipTop > var26) {
                      var26 = Rasterizer2D.clipTop;
                    }
                    if (Rasterizer2D.clipBottom <= var26) {
                      var26 = Rasterizer2D.clipBottom;
                    }
                    if (var27 >= Rasterizer2D.clipRight) {
                      var27 = Rasterizer2D.clipRight;
                    }
                  }
                }
                var17.pixels[var20] = Rasterizer2D.pixels[Rasterizer2D.width * var26 + var27];
                var20++;
                var23++;
                var25++;
                var24 = var24 + (-1 + var23 * 2);
              }
              var22++;
              var21++;
            }
            var17.drawAt(var8_int, var9);
            Rasterizer2D.b(param2 << 4, param4 << 4, param7 + param1 << 4, 255, var33);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var8), "ec.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    ec(lp param0, TextFont param1, String param2) {
        super(0, 0, 288, 0, (ub) null);
        int var4_int = 0;
        this.field_M = 0;
        try {
          this.field_K = param0;
          this.field_R = param2;
          this.field_H = param1;
          var4_int = this.field_R == null ? 0 : this.field_H.measureWrappedHeight(this.field_R, 260, this.field_H.ascent);
          this.a(22 + var4_int, 0, 0, (byte) -119, 288);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_Q = null;
        if (param0 != 0) {
          field_Q = (ki) null;
        }
        field_N = null;
        field_L = null;
        field_S = null;
        field_P = null;
    }

    static {
        field_L = "Reload game";
        field_J = 15;
        field_S = "Offline";
    }
}
