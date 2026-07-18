/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends kb {
    private static int[] field_M;
    private int field_C;
    private int field_P;
    private int field_N;
    int field_D;
    static je field_F;
    private wk field_S;
    private int field_E;
    private int field_L;
    private wk[] field_O;
    private wk field_J;
    private int field_H;
    boolean field_R;
    private wk field_K;
    static String field_G;
    static int[] field_Q;

    private final wk b(int param0, int param1, int param2) {
        wk var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = new wk(((rj) this).field_C * 2, ((rj) this).field_w);
        int discarded$1 = 3;
        vn.a(var4);
        var5 = ((rj) this).field_w >> 1;
        if (param1 < -54) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((rj) this).field_w) {
              rf.b(-18862);
              return var4;
            } else {
              L1: {
                var7 = (((rj) this).field_C * 2 - 1) * (var6 >> 1) % (((rj) this).field_C * 2);
                var8 = param2 & 16711935;
                var9 = 65280 & param2;
                var10 = var6 + -var5;
                var11 = (int)(Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5 * 128.0) + 128;
                if (var11 >= 256) {
                  stackOut_6_0 = var9 | var8;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = (var8 * var11 & -16711936 | 16711680 & var11 * var9) >>> 8;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                qn.e(var7, var6, ((rj) this).field_C, var12);
                var8 = 16711935 & param0;
                qn.e(var7 + -(((rj) this).field_C * 2), var6, ((rj) this).field_C, var12);
                var9 = 65280 & param0;
                if (var11 < 256) {
                  stackOut_9_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> 8;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = var9 | var8;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              qn.e(var7 - -((rj) this).field_C, var6, ((rj) this).field_C, var12);
              qn.e(-((rj) this).field_C + var7, var6, ((rj) this).field_C, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        int discarded$0 = 3;
        this.i();
    }

    final void c(int param0, int param1, int param2) {
        ((rj) this).field_L = param1;
        ((rj) this).field_H = param0;
        ((rj) this).field_P = param1 >> 1 & 8355711;
        ((rj) this).field_E = 8355711 & param0 >> 1;
        int discarded$0 = 3;
        this.i();
        if (param2 != 27178) {
            field_F = null;
        }
    }

    private final void a(int param0, int param1, wk param2, int param3) {
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
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = param3 + ((rj) this).field_l;
            id.a(((rj) this).field_J.field_y + param3, -((rj) this).field_J.field_y + var5_int, param1 + ((rj) this).field_w, param1, (byte) 87);
            var6 = -((rj) this).field_N + param3;
            var7 = -123 / ((param0 - -26) / 40);
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  rf.b(-18862);
                  if (qn.field_j <= param3 + ((rj) this).field_J.field_y) {
                    int discarded$2 = 3;
                    vn.a(((rj) this).field_K);
                    param2.g(-((rj) this).field_N, 0);
                    param2.g(((rj) this).field_C * 2 - ((rj) this).field_N, 0);
                    ((rj) this).field_S.b(0, 0);
                    rf.b(-18862);
                    ((rj) this).field_K.g(param3, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (-((rj) this).field_J.field_y + var5_int <= qn.field_e) {
                    int discarded$3 = 3;
                    vn.a(((rj) this).field_K);
                    var8 = -((rj) this).field_J.field_y + ((rj) this).field_l + ((rj) this).field_N;
                    L4: while (true) {
                      if (var8 <= ((rj) this).field_C * 2) {
                        param2.g(-var8, 0);
                        param2.g(-var8 + ((rj) this).field_C * 2, 0);
                        ((rj) this).field_J.b(0, 0);
                        rf.b(-18862);
                        ((rj) this).field_K.g(var5_int - ((rj) this).field_J.field_y, param1);
                        break L3;
                      } else {
                        var8 = var8 - ((rj) this).field_C * 2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param2.g(var6, param1);
                var6 = var6 + param2.field_y;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("rj.H(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final static bi a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            bi var5 = null;
            dh var5_ref = null;
            bi stackIn_3_0 = null;
            dh stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            bi stackOut_2_0 = null;
            dh stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                var4 = Class.forName("jo");
                var5 = (bi) var4.newInstance();
                var5.a(param0, -46, param3, param1);
                stackOut_2_0 = (bi) var5;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new dh();
                ((bi) (Object) var5_ref).a(param0, -46, param3, param1);
                stackOut_4_0 = (dh) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (bi) (Object) stackIn_5_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("rj.E(").append(param0).append(',').append(param1).append(',').append(1423111778).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param3 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L0;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L0;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, (param6 & 16711422) >> 1);
    }

    public static void a() {
        field_G = null;
        field_M = null;
        field_F = null;
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 >= -82) {
            return;
        }
        if (0 != param3) {
            return;
        }
        int var5 = ((rj) this).field_B + param0;
        int var6 = param1 + ((rj) this).field_p;
        this.a(-77, var6, ((rj) this).field_O[0], var5);
        if (!(65536 <= ((rj) this).field_D)) {
            id.a((((rj) this).field_l * ((rj) this).field_D >> 16) + var5, var5 + ((rj) this).field_l, ((rj) this).field_w + var6, var6, (byte) 74);
            this.a(-103, var6, ((rj) this).field_O[1], var5);
            rf.b(-18862);
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (((rj) this).field_R) {
                ((rj) this).field_N = ((rj) this).field_N + 1;
                if (((rj) this).field_C * 2 < ((rj) this).field_N) {
                  ((rj) this).field_N = ((rj) this).field_N - ((rj) this).field_C * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 32722) {
                break L2;
              } else {
                wk discarded$2 = this.b(11, 65, -18);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("rj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(int param0) {
        if (nw.g(125)) {
            return;
        }
        if (!(ps.field_v)) {
            return;
        }
        byte[] var2 = new byte[2];
        byte[] var1 = var2;
        var2[1] = (byte)(ek.field_d << 2);
        var2[0] = (byte) 1;
        if (uc.field_a) {
            var2[1] = (byte)oe.c((int) var2[1], 2);
        }
        if (cu.field_a) {
            var2[1] = (byte)oe.c((int) var2[1], 1);
        }
        li discarded$0 = nm.a(0, 6, var2);
        ps.field_v = false;
    }

    private final wk j() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = ((rj) this).field_w >> 1;
        wk var3 = new wk(var2, ((rj) this).field_w);
        int discarded$0 = 3;
        vn.a(var3);
        for (var4 = 0; var4 < ((rj) this).field_w; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((rj) this).field_w) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                qn.a(var5, var4, var8 | var8 << 8 | var8 << 16);
            }
        }
        rf.b(-18862);
        return var3;
    }

    private final void i() {
        ((rj) this).field_O = new wk[]{this.b(((rj) this).field_H, -61, ((rj) this).field_L), this.b(((rj) this).field_E, -120, ((rj) this).field_P)};
        int discarded$0 = 750;
        ((rj) this).field_J = this.j();
        ((rj) this).field_S = ((rj) this).field_J.e();
        ((rj) this).field_K = new wk(((rj) this).field_w >> 1, ((rj) this).field_w);
    }

    final static void d(byte param0) {
        c.field_e = null;
        qm.field_K = null;
        j.field_e = null;
        vj.field_j = null;
        if (param0 < 96) {
            return;
        }
        qv.field_j = null;
        iq.field_g = null;
    }

    private rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((rj) this).field_L = param5;
        ((rj) this).field_H = param6;
        ((rj) this).field_P = param7;
        ((rj) this).field_C = param4;
        ((rj) this).field_E = param8;
        ((rj) this).a(param0, param2, param1, 8192, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_M = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
            field_M[var0] = 65536 * (var0 / 2) + (var0 + 256 * (var0 / 3));
        }
        field_G = "Quality: ";
        field_Q = new int[8192];
    }
}
