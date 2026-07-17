/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends kd {
    static int[] field_E;
    int[] field_F;
    static int[] field_B;
    static int[] field_A;
    private int[][] field_z;
    static int field_C;
    static ul field_H;
    private String[] field_G;
    private int[] field_D;
    static wk field_y;

    final void c(byte param0) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        int var2 = -79 % ((param0 - -50) / 55);
        if (((ao) this).field_F != null) {
            for (var3 = 0; var3 < ((ao) this).field_F.length; var3++) {
                ((ao) this).field_F[var3] = vn.a(((ao) this).field_F[var3], 32768);
            }
        }
    }

    final static String[] a(mi param0, int[] param1, int param2, String param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        String[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        String[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (jh.field_b != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        jh.field_b = new String[16];
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_int = param0.a(param3, param1, jh.field_b);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof ArrayIndexOutOfBoundsException ? 5 : 14);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) caughtException;
                        if (jh.field_b.length < 1024) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        jh.field_b = new String[jh.field_b.length << 1];
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = new String[var4_int];
                        var5 = var8;
                        var6 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4_int <= var6) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8[var6] = jh.field_b[var6];
                        var6++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (String[]) var5;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var4 = (RuntimeException) (Object) caughtException;
                    stackOut_14_0 = (RuntimeException) var4;
                    stackOut_14_1 = new StringBuilder().append("ao.F(");
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (param0 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "{...}";
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                    stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (param1 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                    stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                    stackOut_18_2 = "{...}";
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                    stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(18985).append(44);
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (param3 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                    stackOut_21_2 = "{...}";
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                    stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                    stackOut_22_2 = "null";
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String i(int param0) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(((ao) this).field_G != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((ao) this).field_G[0]);
        for (var3 = param0; ((ao) this).field_G.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((ao) this).field_G[var3]);
        }
        return var2.toString();
    }

    public static void g() {
        field_B = null;
        field_H = null;
        field_A = null;
        field_E = null;
        field_y = null;
    }

    final void a(gi param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 < -68) {
              L1: while (true) {
                var3_int = param0.f((byte) -85);
                if (var3_int != 0) {
                  int discarded$3 = 100;
                  this.a(var3_int, param0);
                  continue L1;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ao.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final static void h() {
        ub.c(0);
        if (null != sl.field_n) {
            int discarded$0 = 9174;
            pa.a(sl.field_n);
        }
        ma.g(0);
        int discarded$13 = -115;
        og.b();
        ln.a(-8601);
        int discarded$22 = -14;
        if (rn.a()) {
            mm.field_g.a(1, (byte) -117);
            gj.a(0, 0);
        }
        pm.m(-47);
    }

    ao() {
    }

    private final void a(int param0, gi param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        fm var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                ((ao) this).field_G = ka.a('<', false, param1.h(1));
                break L1;
              } else {
                if (param0 == 2) {
                  var4_int = param1.f((byte) -114);
                  ((ao) this).field_F = new int[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (~var4_int >= ~var5) {
                      break L1;
                    } else {
                      ((ao) this).field_F[var5] = param1.c((byte) -60);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (3 == param0) {
                    var4_int = param1.f((byte) -99);
                    ((ao) this).field_z = new int[var4_int][];
                    ((ao) this).field_D = new int[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (~var5 <= ~var4_int) {
                        break L1;
                      } else {
                        L4: {
                          var6 = param1.c((byte) -60);
                          var7 = wa.b(var6, 99);
                          if (var7 != null) {
                            ((ao) this).field_D[var5] = var6;
                            ((ao) this).field_z[var5] = new int[var7.field_k];
                            var8 = 0;
                            L5: while (true) {
                              if (var7.field_k <= var8) {
                                break L4;
                              } else {
                                ((ao) this).field_z[var5][var8] = param1.c((byte) -60);
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (4 == param0) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var4_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("ao.B(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 100 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        field_A = jg.a(true);
        field_A[0] = -410976256;
        int[] var3 = field_A;
        var3[1] = vn.a(var3[1], 32);
        field_E = jg.a(true);
        int[] var4 = field_E;
        var4[1] = vn.a(var4[1], 8);
        field_E[0] = -1711275968;
        int[] var5 = field_E;
        var5[1] = vn.a(var5[1], 16);
        field_B = jg.a(true);
        field_B[0] = 64712;
        for (var0 = 32; var0 <= 36; var0++) {
            var1 = field_B;
            var2 = var0;
            var1[var2 >> 5] = vn.a(var1[var2 >> 5], 1 << ec.a(31, var2));
        }
        int[] var6 = field_A;
        var6[1] = vn.a(var6[1], 64);
    }
}
