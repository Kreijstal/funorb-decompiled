/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends na {
    int field_bb;
    static String field_I;
    private int field_T;
    private oh field_L;
    private int field_U;
    private oh field_P;
    static boolean field_S;
    private int field_M;
    private int field_W;
    static int field_X;
    static String field_O;
    private int field_N;
    private oh[] field_Q;
    static String field_Z;
    boolean field_K;
    static int[] field_ab;
    private int field_J;
    private oh field_Y;
    static String field_V;

    private final oh a(int param0) {
        int var4 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = TetraLink.field_J;
        int var2 = ((lg) this).field_u >> 1;
        oh var3 = new oh(var2, ((lg) this).field_u);
        sk.a((byte) 117, var3);
        int var5 = -120 % ((2 - param0) / 39);
        for (var4 = 0; var4 < ((lg) this).field_u; var4++) {
            for (var6 = 0; var2 > var6; var6++) {
                var7 = (double)var6 * (double)var6 / (double)((((lg) this).field_u - var4) * var4);
                var9 = 1;
                if (var7 < 1.0) {
                    var7 = Math.sqrt(-var7 + 1.0);
                    var9 = 1.0 > var7 ? (int)(var7 * 255.0) : 255;
                }
                ra.a(var6, var4, var9 << 8 | var9 | var9 << 16);
            }
        }
        dh.a(-581);
        return var3;
    }

    public static void d(byte param0) {
        field_ab = null;
        field_O = null;
        field_V = null;
        field_I = null;
        field_Z = null;
    }

    private final oh a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        oh var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = TetraLink.field_J;
        var14 = new oh(((lg) this).field_U * 2, ((lg) this).field_u);
        sk.a((byte) 112, var14);
        var5 = ((lg) this).field_u >> 1;
        var6 = 0;
        L0: while (true) {
          if (((lg) this).field_u <= var6) {
            if (param1 < -15) {
              dh.a(-581);
              return var14;
            } else {
              return null;
            }
          } else {
            L1: {
              var7 = (var6 >> 1) * (2 * ((lg) this).field_U - 1) % (((lg) this).field_U * 2);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = -var5 + var6;
              var11 = 128 - -(int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
              if (256 > var11) {
                stackOut_4_0 = (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              ra.g(var7, var6, ((lg) this).field_U, var12);
              var8 = param0 & 16711935;
              var9 = 65280 & param0;
              ra.g(-(2 * ((lg) this).field_U) + var7, var6, ((lg) this).field_U, var12);
              if (var11 < 256) {
                stackOut_7_0 = (-16711936 & var8 * var11 | 16711680 & var9 * var11) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ra.g(((lg) this).field_U + var7, var6, ((lg) this).field_U, var12);
            ra.g(var7 + -((lg) this).field_U, var6, ((lg) this).field_U, var12);
            var6++;
            continue L0;
          }
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (!param2) {
            ra.a();
        } else {
            ra.d(0, 0, ra.field_f, ra.field_e, 0, 192);
        }
        if (param1 != 1) {
            field_X = 111;
        }
        i.b(param2, param1 + 107);
    }

    lg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    private final void g(int param0) {
        ((lg) this).field_Q = new oh[]{this.a(((lg) this).field_W, (byte) -55, ((lg) this).field_T), this.a(((lg) this).field_N, (byte) -77, ((lg) this).field_J)};
        ((lg) this).field_L = this.a(-37);
        ((lg) this).field_P = ((lg) this).field_L.a();
        ((lg) this).field_Y = new oh(((lg) this).field_u >> 1, ((lg) this).field_u);
    }

    final static String a(boolean param0, char param1) {
        if (param0) {
            String discarded$0 = lg.a(false, '￐');
        }
        return String.valueOf(param1);
    }

    private final void a(int param0, oh param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        var9 = TetraLink.field_J;
        try {
          L0: {
            var5_int = ((lg) this).field_F + param0;
            kl.a(-((lg) this).field_L.field_u + var5_int, param2 + ((lg) this).field_u, param2, (byte) -79, ((lg) this).field_L.field_u + param0);
            var6 = param0 - ((lg) this).field_M;
            var7 = 10 % ((param3 - 44) / 63);
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  dh.a(-581);
                  if (param0 + ((lg) this).field_L.field_u >= ra.field_j) {
                    sk.a((byte) 118, ((lg) this).field_Y);
                    param1.c(-((lg) this).field_M, 0);
                    param1.c(2 * ((lg) this).field_U + -((lg) this).field_M, 0);
                    ((lg) this).field_P.e(0, 0);
                    dh.a(-581);
                    ((lg) this).field_Y.c(param0, param2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (ra.field_l >= -((lg) this).field_L.field_u + var5_int) {
                    sk.a((byte) 116, ((lg) this).field_Y);
                    var8 = ((lg) this).field_M + -((lg) this).field_L.field_u + ((lg) this).field_F;
                    L4: while (true) {
                      if (var8 <= 2 * ((lg) this).field_U) {
                        param1.c(-var8, 0);
                        param1.c(((lg) this).field_U * 2 + -var8, 0);
                        ((lg) this).field_L.e(0, 0);
                        dh.a(-581);
                        ((lg) this).field_Y.c(-((lg) this).field_L.field_u + var5_int, param2);
                        break L3;
                      } else {
                        var8 = var8 - 2 * ((lg) this).field_U;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param1.c(var6, param2);
                var6 = var6 + param1.field_u;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("lg.C(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(na param0, int param1, int param2, boolean param3) {
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
            if (param3) {
              L1: {
                if (!((lg) this).field_K) {
                  break L1;
                } else {
                  ((lg) this).field_M = ((lg) this).field_M + 1;
                  if (((lg) this).field_M <= ((lg) this).field_U * 2) {
                    break L1;
                  } else {
                    ((lg) this).field_M = ((lg) this).field_M - ((lg) this).field_U * 2;
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("lg.MA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        ((lg) this).field_N = 8355711 & param2 >> 1;
        ((lg) this).field_T = param1;
        int var4 = 63 / ((66 - param0) / 52);
        ((lg) this).field_W = param2;
        ((lg) this).field_J = 8355711 & param1 >> 1;
        this.g(308991265);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 != param3) {
            return;
        }
        int var5 = ((lg) this).field_t + param1;
        int var6 = ((lg) this).field_w + param2;
        this.a(var5, ((lg) this).field_Q[0], var6, (byte) 124);
        if (65536 > ((lg) this).field_bb) {
            kl.a(var5 - -((lg) this).field_F, ((lg) this).field_u + var6, var6, (byte) -79, (((lg) this).field_bb * ((lg) this).field_F >> 16) + var5);
            this.a(var5, ((lg) this).field_Q[1], var6, (byte) 119);
            dh.a(-581);
        }
    }

    private lg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((lg) this).field_W = param6;
        ((lg) this).field_T = param5;
        ((lg) this).field_J = param7;
        ((lg) this).field_N = param8;
        ((lg) this).field_U = param4;
        ((lg) this).a(param3, param1, 86, param0, param2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -19 % ((param2 - -61) / 51);
        super.a(param0, param1, 90, param3, param4);
        this.g(308991265);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Suggest muting this player";
        field_O = "Accept draw";
        field_Z = "Month";
        field_ab = new int[16384];
        field_V = "Playing";
    }
}
