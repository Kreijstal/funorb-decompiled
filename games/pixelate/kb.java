/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kb extends ch implements bp {
    static String field_M;
    static String field_J;
    static ob field_L;
    static int[] field_N;
    static String[] field_I;
    private oa field_K;

    final static void a(int param0, cb param1, vi param2, boolean param3, java.awt.Component param4, int param5) {
        try {
            if (param5 <= 102) {
                Object var7 = null;
                kb.a(-5, (cb) null, (vi) null, false, (java.awt.Component) null, -3);
            }
            oh.a(1024, param0, param3, param0, (byte) -110, param4, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "kb.O(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var4 = -101 % ((-56 - param2) / 62);
              var3 = bc.b(0, param1);
              if (-1 != param0.indexOf(param1)) {
                break L1;
              } else {
                if (param0.indexOf(var3) != -1) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param0.startsWith(param1)) {
                        break L3;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L3;
                        } else {
                          if (param0.endsWith(param1)) {
                            break L3;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackOut_11_0 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                  break L0;
                }
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("kb.M(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    void a(oa param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((kb) this).field_K = param0;
              ((kb) this).field_K.field_g = (kb) this;
              if (param1 == 20672) {
                break L1;
              } else {
                field_M = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kb.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        field_I = null;
        field_N = null;
        field_J = null;
        field_L = null;
        field_M = null;
    }

    abstract int l(int param0);

    abstract boolean m(int param0);

    public final ml a(int param0) {
        if (param0 != 1) {
            return null;
        }
        return (ml) (Object) ((kb) this).field_K;
    }

    abstract int e(byte param0);

    abstract int c(boolean param0);

    kb(int param0, int param1, int param2, int param3, eb param4) {
        super(param0, param1, param2, param3, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[1024];
        field_M = "Hide players in <%0>'s game";
        field_J = "Start Game";
        field_I = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
