/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ba {
    static il field_c;
    static int field_a;
    static String field_b;

    final static String a(String param0, int param1, byte param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_34_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_14_0 = null;
        String stackOut_22_0 = null;
        String stackOut_27_0 = null;
        Object stackOut_35_0 = null;
        String stackOut_33_0 = null;
        String stackOut_30_0 = null;
        String stackOut_17_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            if (param1 == 3) {
              stackOut_3_0 = nm.field_c;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param2 == 83) {
                if (param1 != 6) {
                  if (param1 == 7) {
                    stackOut_14_0 = hg.field_o;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    if (param1 != 8) {
                      if (param1 == 9) {
                        stackOut_22_0 = wc.field_e;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      } else {
                        if (param1 == 10) {
                          stackOut_27_0 = se.field_a;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        } else {
                          if (11 != param1) {
                            if (param1 != 14) {
                              stackOut_35_0 = null;
                              stackIn_36_0 = stackOut_35_0;
                              break L0;
                            } else {
                              stackOut_33_0 = oi.a(new String[1], oe.field_d, param2 ^ 81);
                              stackIn_34_0 = stackOut_33_0;
                              return stackIn_34_0;
                            }
                          } else {
                            stackOut_30_0 = qd.field_g;
                            stackIn_31_0 = stackOut_30_0;
                            return stackIn_31_0;
                          }
                        }
                      }
                    } else {
                      stackOut_17_0 = ti.field_c;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                } else {
                  stackOut_9_0 = na.field_Eb;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("ba.E(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L1;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_36_0;
    }

    abstract int a(int param0, int param1);

    final static void b(int param0) {
        try {
            if (param0 != 14) {
                ba.a(-71);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ba.B(" + param0 + ')');
        }
    }

    abstract sj a(byte param0);

    abstract byte[] b(int param0, int param1);

    public static void a(int param0) {
        try {
            field_c = null;
            field_b = null;
            if (param0 != 14) {
                field_b = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ba.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
