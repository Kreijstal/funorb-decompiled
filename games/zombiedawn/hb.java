/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends ga {
    private int field_x;
    private int field_y;
    private int field_A;
    private vn field_K;
    static String[] field_D;
    private vn[] field_L;
    private vn field_J;
    boolean field_F;
    int field_C;
    private vn field_B;
    private int field_z;
    static String field_G;
    private int field_H;
    private int field_E;

    private final void g(int param0) {
        this.field_L = new vn[]{this.b(this.field_y, this.field_A, -69), this.b(this.field_z, this.field_x, -105)};
        this.field_K = this.a(-108);
        this.field_J = this.field_K.d();
        this.field_B = new vn(this.field_n >> -116787551, this.field_n);
        int var2 = -77 / ((param0 - 88) / 33);
    }

    hb(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1719230081, param6 >> 962913793 & 8355711);
    }

    private final vn b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        vn var15 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var14 = ZombieDawn.field_J;
        var15 = new vn(this.field_E * 2, this.field_n);
        ki.a((byte) -99, var15);
        var5 = this.field_n >> 115498145;
        var6 = -39 / ((34 - param2) / 50);
        var7 = 0;
        L0: while (true) {
          if (this.field_n <= var7) {
            pa.a(-21189);
            return var15;
          } else {
            L1: {
              var8 = (var7 >> 570689921) * (this.field_E * 2 + -1) % (2 * this.field_E);
              var9 = 16711935 & param0;
              var10 = param0 & 65280;
              var11 = var7 + -var5;
              var12 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 + -(var11 * var11))) / (double)var5)) + 128;
              if ((var12 ^ -1) > -257) {
                stackOut_4_0 = (var12 * var9 & -16711936 | 16711680 & var12 * var10) >>> 29749576;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var10;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var13 = stackIn_5_0;
              bi.b(var8, var7, this.field_E, var13);
              var9 = 16711935 & param1;
              var10 = param1 & 65280;
              bi.b(var8 + -(2 * this.field_E), var7, this.field_E, var13);
              if (var12 >= 256) {
                stackOut_7_0 = var10 | var9;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (16711680 & var12 * var10 | -16711936 & var9 * var12) >>> -850366776;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var13 = stackIn_8_0;
            bi.b(var8 - -this.field_E, var7, this.field_E, var13);
            bi.b(-this.field_E + var8, var7, this.field_E, var13);
            var7++;
            continue L0;
          }
        }
    }

    private final void a(int param0, vn param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var5_int = this.field_i + param3;
            g.a(param0, (byte) 99, -this.field_K.field_w + var5_int, this.field_n + param0, this.field_K.field_w + param3);
            var6 = param3 + -this.field_H;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  var7 = -32 / ((param2 - 34) / 50);
                  pa.a(-21189);
                  if (bi.field_g > this.field_K.field_w + param3) {
                    break L2;
                  } else {
                    ki.a((byte) -118, this.field_B);
                    param1.b(-this.field_H, 0);
                    param1.b(-this.field_H + 2 * this.field_E, 0);
                    this.field_J.a(0, 0);
                    pa.a(-21189);
                    this.field_B.b(param3, param0);
                    break L2;
                  }
                }
                L3: {
                  if (-this.field_K.field_w + var5_int <= bi.field_b) {
                    ki.a((byte) -107, this.field_B);
                    var7 = -this.field_K.field_w + (this.field_i + this.field_H);
                    L4: while (true) {
                      if (this.field_E * 2 >= var7) {
                        param1.b(-var7, 0);
                        param1.b(-var7 + 2 * this.field_E, 0);
                        this.field_K.a(0, 0);
                        pa.a(-21189);
                        this.field_B.b(var5_int - this.field_K.field_w, param0);
                        break L3;
                      } else {
                        var7 = var7 - this.field_E * 2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param1.b(var6, param0);
                var6 = var6 + param1.field_w;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("hb.IA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param0 >= 0) {
            return;
        }
        this.field_z = 8355711 & param2 >> 1491906017;
        this.field_A = param1;
        this.field_x = 8355711 & param1 >> -1923347167;
        this.field_y = param2;
        this.g(52);
    }

    public static void f(int param0) {
        field_G = null;
        field_D = null;
        if (param0 > -83) {
            field_D = (String[]) null;
        }
    }

    private final vn a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ZombieDawn.field_J;
        int var2 = this.field_n >> 1810055425;
        vn var3 = new vn(var2, this.field_n);
        ki.a((byte) -118, var3);
        for (var4 = 0; var4 < this.field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_n) * var4);
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                bi.a(var5, var4, var8 << 1746294320 | (var8 | var8 << 1068007784));
            }
        }
        if (param0 >= -81) {
            this.field_H = 42;
        }
        pa.a(-21189);
        return var3;
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
            if (this.field_F) {
                this.field_H = this.field_H + 1;
                if (!(2 * this.field_E >= this.field_H)) {
                    this.field_H = this.field_H - 2 * this.field_E;
                }
            }
            int var5_int = 20 / ((46 - param1) / 42);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "hb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != (param1 ^ -1)) {
            return;
        }
        int var5 = this.field_k + param2;
        int var6 = this.field_j + param0;
        this.a(var6, this.field_L[param3], (byte) -52, var5);
        if (this.field_C < 65536) {
            g.a(var6, (byte) 99, var5 + this.field_i, var6 - -this.field_n, (this.field_i * this.field_C >> 1889691696) + var5);
            this.a(var6, this.field_L[1], (byte) -104, var5);
            pa.a(-21189);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -79 / ((-23 - param0) / 48);
        super.a(-116, param1, param2, param3, param4);
        this.g(123);
    }

    private hb(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_z = param7;
        this.field_E = param4;
        this.field_y = param5;
        this.field_x = param8;
        this.field_A = param6;
        this.a(-91, param1, param0, param2, param3);
    }

    static {
        field_D = new String[]{"You've conquered the Yanks!", "You've conquered the Brits!"};
        field_G = "Go to Next Level!";
    }
}
