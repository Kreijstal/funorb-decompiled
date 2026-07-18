/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static int field_b;
    static int field_c;
    static int[] field_a;

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              param0.setFocusTraversalKeysEnabled(false);
              if (param1 == 11631) {
                break L1;
              } else {
                vm.a(-6);
                break L1;
              }
            }
            param0.addKeyListener((java.awt.event.KeyListener) (Object) kb.field_a);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) kb.field_a);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("vm.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_19_0 = false;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_1_0 = false;
        try {
          L0: {
            if (!pe.field_r) {
              if (pm.field_a) {
                stackOut_6_0 = cf.a(31077, param0, param3);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (mp.a(param3, param0, param2 ^ 1899)) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                } else {
                  if (param2 == 19466) {
                    if (!hj.field_b) {
                      stackOut_19_0 = gf.a(param0, param1, 69);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    }
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  }
                }
              }
            } else {
              stackOut_1_0 = lq.field_a.a(-88, de.field_f, ji.field_r);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var4, "vm.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_20_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -586) {
                break L1;
              } else {
                field_b = 106;
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "vm.B(" + param0 + ')');
        }
    }

    static {
    }
}
