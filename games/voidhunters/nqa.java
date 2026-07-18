/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nqa {
    static boolean field_c;
    static boolean[][] field_b;
    static volatile boolean field_a;

    final static Object a(ij param0, int param1) {
        ksa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ksa stackIn_14_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        ksa stackOut_13_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            if (!ls.field_q) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (param1 == 12642) {
                L1: {
                  if (null == param0) {
                    break L1;
                  } else {
                    var2 = param0.d(0);
                    L2: while (true) {
                      if (null == var2) {
                        break L1;
                      } else {
                        if (!VoidHunters.a(true, (Object) (Object) var2)) {
                          var2 = param0.a((byte) 98);
                          if (var3 == 0) {
                            continue L2;
                          } else {
                            break L1;
                          }
                        } else {
                          stackOut_13_0 = (ksa) var2;
                          stackIn_14_0 = stackOut_13_0;
                          return (Object) (Object) stackIn_14_0;
                        }
                      }
                    }
                  }
                }
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2_ref;
            stackOut_18_1 = new StringBuilder().append("nqa.B(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    public static void a(byte param0) {
        if (param0 != -30) {
            return;
        }
        try {
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nqa.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = true;
    }
}
