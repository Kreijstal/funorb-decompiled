/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static boolean field_b;
    static int field_d;
    static upa field_a;
    static String field_c;

    public static void a(int param0) {
        int[] discarded$0 = null;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            int[] var2 = (int[]) null;
            discarded$0 = sb.a(121, (int[]) null);
        }
    }

    final static int[] a(int param0, int[] param1) {
        int incrementValue$2 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int stackIn_3_0 = 0;
        int[] stackIn_5_0 = null;
        int stackIn_10_0 = 0;
        int[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_9_0 = 0;
        int[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = new int[pd.a(param1, 2048)];
            var2 = var7;
            var3 = 0;
            var4 = param0;
            L1: while (true) {
              stackOut_2_0 = param1.length;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= var4) {
                      break L4;
                    } else {
                      stackOut_4_0 = (int[]) (param1);
                      stackIn_15_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var6 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_5_0[var4] != 0) {
                            var5 = 0;
                            L6: while (true) {
                              if (32 <= var5) {
                                break L5;
                              } else {
                                stackOut_9_0 = 1 << var5 & param1[var4];
                                stackIn_3_0 = stackOut_9_0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var6 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    if (stackIn_10_0 == 0) {
                                      break L7;
                                    } else {
                                      incrementValue$2 = var3;
                                      var3++;
                                      var7[incrementValue$2] = fh.a(var5, var4 << -1533565403);
                                      break L7;
                                    }
                                  }
                                  var5++;
                                  if (var6 == 0) {
                                    continue L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = (int[]) (var7);
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2_ref);
            stackOut_16_1 = new StringBuilder().append("sb.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    final static void a(int param0, cn param1, cn param2, cn param3, cn param4) {
        try {
            bja.field_a = param4;
            qoa.field_b = param1;
            ua.field_a = param2;
            nj.field_v = param3;
            ns.field_j = new nda(qoa.field_b, nj.field_v);
            bia.field_J = new u[237];
            int var5_int = -51 % ((param0 - 32) / 59);
            fna.field_j = new qua[4];
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = null;
        field_c = "Accept <%0> into this game";
    }
}
