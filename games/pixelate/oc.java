/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends ng {
    private int field_I;
    static tf field_W;
    private int field_T;
    static tf field_N;
    private tf field_K;
    boolean field_Y;
    private tf field_L;
    private tf field_F;
    private int field_M;
    static de[] field_H;
    static tf field_S;
    private int field_V;
    private int field_Z;
    private int field_R;
    int field_Q;
    private tf[] field_P;
    static boolean field_G;
    static ak field_U;
    static boolean field_J;
    static ak field_O;
    static String field_X;

    private final void d(byte param0) {
        Object var3 = null;
        ((oc) this).field_P = new tf[]{this.a(((oc) this).field_Z, ((oc) this).field_I, (byte) -121), this.a(((oc) this).field_V, ((oc) this).field_T, (byte) -125)};
        if (param0 <= 73) {
          var3 = null;
          ((oc) this).a(59, -16, -71, (ng) null);
          ((oc) this).field_F = this.c(true);
          ((oc) this).field_K = ((oc) this).field_F.e();
          ((oc) this).field_L = new tf(((oc) this).field_C >> 1, ((oc) this).field_C);
          return;
        } else {
          ((oc) this).field_F = this.c(true);
          ((oc) this).field_K = ((oc) this).field_F.e();
          ((oc) this).field_L = new tf(((oc) this).field_C >> 1, ((oc) this).field_C);
          return;
        }
    }

    public static void a(byte param0) {
        field_U = null;
        field_H = null;
        field_N = null;
        field_S = null;
        field_O = null;
        field_W = null;
        field_X = null;
    }

    private final tf c(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Pixelate.field_H ? 1 : 0;
        int var2 = ((oc) this).field_C >> 1;
        tf var3 = new tf(var2, ((oc) this).field_C);
        h.a(-72, var3);
        for (var4 = 0; ((oc) this).field_C > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((oc) this).field_C + -var4) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                t.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        ia.a((byte) 92);
        return var3;
    }

    final static void a(te param0, boolean param1) {
        try {
            bn.field_I.a((ak) (Object) param0, (byte) 26);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "oc.C(" + (param0 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    oc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, (16711422 & param6) >> 1);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param1 == 0) {
          var5 = 19 % ((param3 - 70) / 49);
          var6 = ((oc) this).field_z + param2;
          var7 = ((oc) this).field_p + param0;
          this.a(((oc) this).field_P[0], 1177347297, var6, var7);
          if (65536 > ((oc) this).field_Q) {
            hp.a(var6 + (((oc) this).field_E * ((oc) this).field_Q >> 16), ((oc) this).field_C + var7, var6 + ((oc) this).field_E, (byte) -126, var7);
            this.a(((oc) this).field_P[1], 1177347297, var6, var7);
            ia.a((byte) 92);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        ((oc) this).field_Z = param1;
        ((oc) this).field_V = (16711422 & param1) >> 1;
        if (param0 <= 87) {
          field_O = null;
          ((oc) this).field_I = param2;
          ((oc) this).field_T = param2 >> 1 & 8355711;
          this.d((byte) 120);
          return;
        } else {
          ((oc) this).field_I = param2;
          ((oc) this).field_T = param2 >> 1 & 8355711;
          this.d((byte) 120);
          return;
        }
    }

    final void a(int param0, int param1, int param2, ng param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!((oc) this).field_Y) {
                break L1;
              } else {
                ((oc) this).field_R = ((oc) this).field_R + 1;
                if (2 * ((oc) this).field_M < ((oc) this).field_R) {
                  ((oc) this).field_R = ((oc) this).field_R - ((oc) this).field_M * 2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 40) {
              break L0;
            } else {
              ((oc) this).field_Q = 103;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("oc.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 94, param2, param3, param4);
        this.d((byte) 96);
        if (param1 < 19) {
            ((oc) this).field_M = -109;
        }
    }

    private final tf a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tf var15 = null;
        tf var16 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        if (param2 >= -119) {
          field_U = null;
          var15 = new tf(2 * ((oc) this).field_M, ((oc) this).field_C);
          h.a(-66, var15);
          var5 = ((oc) this).field_C >> 1;
          var6 = 0;
          L0: while (true) {
            if (((oc) this).field_C <= var6) {
              ia.a((byte) 92);
              return var15;
            } else {
              L1: {
                var7 = (2 * ((oc) this).field_M - 1) * (var6 >> 1) % (2 * ((oc) this).field_M);
                var8 = 16711935 & param0;
                var9 = param0 & 65280;
                var10 = var6 - var5;
                var11 = 128 - -(int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
                if (256 > var11) {
                  stackOut_15_0 = (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 8;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                } else {
                  stackOut_14_0 = var9 | var8;
                  stackIn_16_0 = stackOut_14_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_16_0;
                t.b(var7, var6, ((oc) this).field_M, var12);
                t.b(-(((oc) this).field_M * 2) + var7, var6, ((oc) this).field_M, var12);
                var9 = param1 & 65280;
                var8 = param1 & 16711935;
                if (var11 >= 256) {
                  stackOut_18_0 = var8 | var9;
                  stackIn_19_0 = stackOut_18_0;
                  break L2;
                } else {
                  stackOut_17_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 8;
                  stackIn_19_0 = stackOut_17_0;
                  break L2;
                }
              }
              var12 = stackIn_19_0;
              t.b(((oc) this).field_M + var7, var6, ((oc) this).field_M, var12);
              t.b(-((oc) this).field_M + var7, var6, ((oc) this).field_M, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          var16 = new tf(2 * ((oc) this).field_M, ((oc) this).field_C);
          h.a(-66, var16);
          var5 = ((oc) this).field_C >> 1;
          var6 = 0;
          L3: while (true) {
            if (((oc) this).field_C <= var6) {
              ia.a((byte) 92);
              return var16;
            } else {
              L4: {
                var7 = (2 * ((oc) this).field_M - 1) * (var6 >> 1) % (2 * ((oc) this).field_M);
                var8 = 16711935 & param0;
                var9 = param0 & 65280;
                var10 = var6 - var5;
                var11 = 128 - -(int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
                if (256 > var11) {
                  stackOut_5_0 = (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 8;
                  stackIn_6_0 = stackOut_5_0;
                  break L4;
                } else {
                  stackOut_4_0 = var9 | var8;
                  stackIn_6_0 = stackOut_4_0;
                  break L4;
                }
              }
              L5: {
                var12 = stackIn_6_0;
                t.b(var7, var6, ((oc) this).field_M, var12);
                t.b(-(((oc) this).field_M * 2) + var7, var6, ((oc) this).field_M, var12);
                var9 = param1 & 65280;
                var8 = param1 & 16711935;
                if (var11 >= 256) {
                  stackOut_8_0 = var8 | var9;
                  stackIn_9_0 = stackOut_8_0;
                  break L5;
                } else {
                  stackOut_7_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 8;
                  stackIn_9_0 = stackOut_7_0;
                  break L5;
                }
              }
              var12 = stackIn_9_0;
              t.b(((oc) this).field_M + var7, var6, ((oc) this).field_M, var12);
              t.b(-((oc) this).field_M + var7, var6, ((oc) this).field_M, var12);
              var6++;
              continue L3;
            }
          }
        }
    }

    private final void a(tf param0, int param1, int param2, int param3) {
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
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5_int = param2 + ((oc) this).field_E;
            hp.a(((oc) this).field_F.field_F + param2, ((oc) this).field_C + param3, var5_int - ((oc) this).field_F.field_F, (byte) -112, param3);
            var6 = param2 - ((oc) this).field_R;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  ia.a((byte) 92);
                  if (((oc) this).field_F.field_F + param2 >= t.field_e) {
                    h.a(-122, ((oc) this).field_L);
                    param0.b(-((oc) this).field_R, 0);
                    param0.b(-((oc) this).field_R + ((oc) this).field_M * 2, 0);
                    ((oc) this).field_K.g(0, 0);
                    ia.a((byte) 92);
                    ((oc) this).field_L.b(param2, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (-((oc) this).field_F.field_F + var5_int <= t.field_h) {
                  h.a(-74, ((oc) this).field_L);
                  var7 = ((oc) this).field_E - (((oc) this).field_F.field_F + -((oc) this).field_R);
                  L3: while (true) {
                    if (((oc) this).field_M * 2 >= var7) {
                      param0.b(-var7, 0);
                      param0.b(-var7 + ((oc) this).field_M * 2, 0);
                      ((oc) this).field_F.g(0, 0);
                      ia.a((byte) 92);
                      ((oc) this).field_L.b(-((oc) this).field_F.field_F + var5_int, param3);
                      break L0;
                    } else {
                      var7 = var7 - 2 * ((oc) this).field_M;
                      continue L3;
                    }
                  }
                } else {
                  return;
                }
              } else {
                param0.b(var6, param3);
                var6 = var6 + param0.field_F;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("oc.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 1177347297 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private oc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((oc) this).field_V = param7;
        ((oc) this).field_T = param8;
        ((oc) this).field_Z = param5;
        ((oc) this).field_I = param6;
        ((oc) this).field_M = param4;
        ((oc) this).a(param2, (byte) 33, param1, param0, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new de[18];
        hb.a(true, 127, 0, 590, new int[11], 30, 50);
        hb.a(true, 175, 1, 460, new int[6], 30, 180);
        hb.a(true, 175, 2, 460, new int[7], 30, 180);
        hb.a(true, 175, 4, 460, new int[6], 30, 180);
        hb.a(true, 410, 5, 610, new int[2], 30, 30);
        hb.a(true, 410, 6, 460, new int[2], 30, 180);
        hb.a(true, 420, 7, 460, new int[3], 30, 70);
        hb.a(true, 420, 8, 460, new int[2], 30, 180);
        hb.a(true, 420, 9, 460, new int[2], 30, 180);
        hb.a(true, 260, 10, 460, new int[2], 30, 180);
        hb.a(true, 420, 11, 460, new int[1], 30, 180);
        hb.a(true, 175, 12, 460, new int[0], 30, 180);
        hb.a(true, 420, 13, 460, new int[2], 30, 180);
        hb.a(true, 360, 16, 460, new int[3], 30, 180);
        hb.a(true, 420, 17, 460, new int[1], 30, 180);
        hb.a(true, 175, 14, 460, new int[0], 30, 180);
        field_S = fi.a(600);
        field_W = fi.a(180);
        field_N = fi.a(300);
        field_X = "Play free version";
    }
}
