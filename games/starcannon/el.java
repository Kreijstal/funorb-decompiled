/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends dk {
    int field_K;
    int field_F;
    int field_G;
    static boolean[] field_D;
    int field_E;
    static String[] field_A;
    static hl[] field_H;
    int field_I;
    static hl field_J;
    int field_B;

    public static void e(byte param0) {
        field_J = null;
        field_H = null;
        field_D = null;
        field_A = null;
    }

    final static void a(gi param0, int param1, int param2, boolean param3) {
        try {
            qc.field_g = param1;
            u.field_c = param0;
            qf.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "el.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
    }

    final static jk[] a(boolean param0, ka param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        jk[] var4 = null;
        int var5 = 0;
        jk var6 = null;
        Object var7 = null;
        bk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        jk[] stackIn_3_0 = null;
        jk[] stackIn_9_0 = null;
        jk[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        jk[] stackOut_2_0 = null;
        jk[] stackOut_15_0 = null;
        jk[] stackOut_8_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!param1.a((byte) -68)) {
              stackOut_2_0 = new jk[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var8 = param1.a(-125);
              L1: while (true) {
                if (var8.field_b != 0) {
                  if (var8.field_b != 2) {
                    L2: {
                      var12 = (int[]) var8.field_f;
                      var11 = var12;
                      var10 = var11;
                      var9 = var10;
                      var3 = var9;
                      if (!param0) {
                        break L2;
                      } else {
                        var7 = null;
                        el.a((gi) null, 30, 44, true);
                        break L2;
                      }
                    }
                    var4 = new jk[var12.length >> 2];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_15_0 = (jk[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new jk();
                        var4[var5] = var6;
                        var6.field_d = var3[var5 << 2];
                        var6.field_h = var3[1 + (var5 << 2)];
                        var6.field_e = var3[(var5 << 2) + 2];
                        var6.field_i = var3[(var5 << 2) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_8_0 = new jk[]{};
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  uc.a(-108, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("el.D(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    final static hl[] b(int param0, int param1, int param2, int param3) {
        if (param1 != 22396) {
            return null;
        }
        return oj.a(-1, param0, 1, param2, param3);
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var12 = StarCannon.field_A;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              var8_int = -param2 + (-((el) this).field_s + -((el) this).field_K) + param5;
              var9 = param1 + (-((el) this).field_G + (-((el) this).field_j + -param3));
              if (var9 * var9 + var8_int * var8_int < ((el) this).field_I * ((el) this).field_I) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - qd.field_z;
                  if (0.0 <= var10) {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)((el) this).field_B;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((el) this).field_B;
                    break L1;
                  }
                }
                ((el) this).field_F = (int)((double)((el) this).field_B * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((el) this).field_B > ((el) this).field_F) {
                    L3: while (true) {
                      if (((el) this).field_F >= 0) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        ((el) this).field_F = ((el) this).field_F + ((el) this).field_B;
                        continue L3;
                      }
                    }
                  } else {
                    ((el) this).field_F = ((el) this).field_F - ((el) this).field_B;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("el.G(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_17_0 != 0;
    }

    private el() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new boolean[64];
        field_A = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
