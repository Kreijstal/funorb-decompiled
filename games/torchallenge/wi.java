/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_b;
    static byte[] field_c;
    static ka[] field_d;
    private int[] field_e;
    static int[] field_a;

    public static void c() {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static ji a(int param0, int param1, int[] param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        ji var9 = null;
        RuntimeException var9_ref = null;
        Object var10 = null;
        ji stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ji stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var9 = new ji(param4, param7, param5, param6, param1, param0, param2);
              if (param3 == 77) {
                break L1;
              } else {
                var10 = null;
                ji discarded$2 = wi.a(85, 87, (int[]) null, (byte) -123, -94, 96, 7, -66, 33);
                break L1;
              }
            }
            wf.field_g.a((da) (Object) var9, param3 + -188);
            ul.a(-18261, var9, param8);
            stackOut_2_0 = (ji) var9;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9_ref;
            stackOut_4_1 = new StringBuilder().append("wi.D(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
        return stackIn_3_0;
    }

    final static ef a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        ef stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (qc.field_i != eh.field_p) {
              L1: {
                if (param1 > 90) {
                  break L1;
                } else {
                  boolean discarded$2 = wi.a(2);
                  break L1;
                }
              }
              L2: {
                if (hf.field_b != eh.field_p) {
                  break L2;
                } else {
                  if (param0.equals((Object) (Object) ta.field_zb)) {
                    eh.field_p = mg.field_c;
                    stackOut_10_0 = gf.field_w;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              ta.field_zb = param0;
              eh.field_p = qc.field_i;
              gf.field_w = null;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (ef) (Object) stackIn_9_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ef) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("wi.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ib.a(88, gi.b(param0 ^ 12476));
    }

    wi(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > param0.length - -(param0.length >> 1)) {
                ((wi) this).field_e = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = var2_int - 1 & param0[var3];
                        L4: while (true) {
                          if (((wi) this).field_e[var4 + var4 + 1] == -1) {
                            ((wi) this).field_e[var4 + var4] = param0[var3];
                            ((wi) this).field_e[1 + (var4 + var4)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int + -1 & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((wi) this).field_e[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("wi.<init>(");
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
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static String b(int param0) {
        if (param0 != 1) {
            field_a = null;
        }
        if (sj.field_R) {
            return null;
        }
        if (bk.field_p < cf.field_a) {
            return null;
        }
        if (!(cf.field_a + ef.field_e <= bk.field_p)) {
            return ie.field_g;
        }
        return null;
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        var4 = -97 % ((21 - param0) / 60);
        var3 = (((wi) this).field_e.length >> 1) + -1;
        var5 = var3 & param1;
        L0: while (true) {
          var6 = ((wi) this).field_e[var5 - (-var5 - 1)];
          if (-1 != var6) {
            if (param1 != ((wi) this).field_e[var5 + var5]) {
              var5 = 1 + var5 & var3;
              continue L0;
            } else {
              return var6;
            }
          } else {
            return -1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[520];
        field_b = "members-only content";
    }
}
