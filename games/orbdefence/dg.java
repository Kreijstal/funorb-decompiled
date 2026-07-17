/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends pj {
    private hj field_G;
    private int field_A;
    static String field_C;
    private int field_y;
    static int[] field_B;
    private int field_K;
    private hj[] field_E;
    private int field_H;
    int field_J;
    private hj field_F;
    boolean field_z;
    private hj field_L;
    private int field_x;
    private int field_D;

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, (16711422 & param6) >> 1);
    }

    private final void a(int param0, int param1, int param2, hj param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((dg) this).field_m + param2;
              id.a(-((dg) this).field_L.field_o + var5_int, param2 + ((dg) this).field_L.field_o, ((dg) this).field_r + param1, param1, 734);
              var6 = param2 + -((dg) this).field_A;
              if (param0 > 100) {
                break L1;
              } else {
                hj discarded$4 = this.i(114);
                break L1;
              }
            }
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  int discarded$5 = -105;
                  oc.g();
                  if (((dg) this).field_L.field_o + param2 < ul.field_i) {
                    break L3;
                  } else {
                    de.a(-128, ((dg) this).field_G);
                    param3.c(-((dg) this).field_A, 0);
                    param3.c(-((dg) this).field_A + 2 * ((dg) this).field_D, 0);
                    ((dg) this).field_F.e(0, 0);
                    int discarded$6 = -105;
                    oc.g();
                    ((dg) this).field_G.c(param2, param1);
                    break L3;
                  }
                }
                L4: {
                  if (ul.field_e >= -((dg) this).field_L.field_o + var5_int) {
                    de.a(-127, ((dg) this).field_G);
                    var7 = ((dg) this).field_A + ((dg) this).field_m + -((dg) this).field_L.field_o;
                    L5: while (true) {
                      if (((dg) this).field_D * 2 >= var7) {
                        param3.c(-var7, 0);
                        param3.c(-var7 + 2 * ((dg) this).field_D, 0);
                        ((dg) this).field_L.e(0, 0);
                        int discarded$7 = -105;
                        oc.g();
                        ((dg) this).field_G.c(var5_int + -((dg) this).field_L.field_o, param1);
                        break L4;
                      } else {
                        var7 = var7 - 2 * ((dg) this).field_D;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param3.c(var6, param1);
                var6 = var6 + param3.field_o;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("dg.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 <= 113) {
            dg.a((byte) -26);
        }
        field_C = null;
        field_B = null;
    }

    private final hj i(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = OrbDefence.field_D ? 1 : 0;
        int var2 = ((dg) this).field_r >> 1;
        hj var3 = new hj(var2, ((dg) this).field_r);
        if (param0 < 33) {
            return null;
        }
        de.a(-125, var3);
        for (var4 = 0; var4 < ((dg) this).field_r; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((dg) this).field_r));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                ul.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        int discarded$0 = -105;
        oc.g();
        return var3;
    }

    private final hj a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = OrbDefence.field_D ? 1 : 0;
        var14 = new hj(2 * ((dg) this).field_D, ((dg) this).field_r);
        de.a(-127, var14);
        var5 = ((dg) this).field_r >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((dg) this).field_r) {
            int discarded$1 = -105;
            oc.g();
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (2 * ((dg) this).field_D + -1) % (((dg) this).field_D * 2);
              var8 = 16711935 & param0;
              var9 = param0 & 65280;
              var10 = var6 - var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (var11 < 256) {
                stackOut_4_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              ul.d(var7, var6, ((dg) this).field_D, var12);
              ul.d(-(((dg) this).field_D * 2) + var7, var6, ((dg) this).field_D, var12);
              var8 = 16711935 & param2;
              var9 = 65280 & param2;
              if (256 <= var11) {
                stackOut_7_0 = var9 | var8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> 8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ul.d(((dg) this).field_D + var7, var6, ((dg) this).field_D, var12);
            ul.d(var7 + -((dg) this).field_D, var6, ((dg) this).field_D, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        int discarded$0 = 0;
        this.c();
    }

    final void a(int param0, int param1, int param2) {
        ((dg) this).field_y = param1;
        ((dg) this).field_H = param2 >> 1 & 8355711;
        ((dg) this).field_x = param2;
        ((dg) this).field_K = (param1 & param0) >> 1;
        int discarded$0 = 0;
        this.c();
    }

    private final void c() {
        ((dg) this).field_E = new hj[]{this.a(((dg) this).field_y, (byte) -45, ((dg) this).field_x), this.a(((dg) this).field_K, (byte) -45, ((dg) this).field_H)};
        ((dg) this).field_L = this.i(90);
        ((dg) this).field_F = ((dg) this).field_L.b();
        ((dg) this).field_G = new hj(((dg) this).field_r >> 1, ((dg) this).field_r);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param1) {
            return;
        }
        int var5 = ((dg) this).field_s + param3;
        int var6 = param0 - -((dg) this).field_n;
        this.a(121, var6, var5, ((dg) this).field_E[0]);
        if (param2 != 1048575) {
            return;
        }
        if (!(((dg) this).field_J >= 65536)) {
            id.a(var5 + ((dg) this).field_m, (((dg) this).field_m * ((dg) this).field_J >> 16) + var5, var6 - -((dg) this).field_r, var6, 734);
            this.a(111, var6, var5, ((dg) this).field_E[1]);
            int discarded$0 = -105;
            oc.g();
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((dg) this).field_z) {
                break L1;
              } else {
                ((dg) this).field_A = ((dg) this).field_A + 1;
                if (((dg) this).field_A <= ((dg) this).field_D * 2) {
                  break L1;
                } else {
                  ((dg) this).field_A = ((dg) this).field_A - 2 * ((dg) this).field_D;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -77) {
                break L2;
              } else {
                ((dg) this).field_z = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("dg.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((dg) this).field_H = param8;
        ((dg) this).field_K = param7;
        ((dg) this).field_x = param6;
        ((dg) this).field_y = param5;
        ((dg) this).field_D = param4;
        ((dg) this).a(param0, param1, param3, (byte) -90, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_B = new int[8192];
    }
}
