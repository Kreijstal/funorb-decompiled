/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tb {
    static he field_d;
    static int field_c;
    static he[] field_b;
    static int field_a;

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param1.removeKeyListener((java.awt.event.KeyListener) (Object) ji.field_c);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) ji.field_c);
            gm.field_O = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("tb.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static String b(byte param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        String stackIn_39_0 = null;
        String stackIn_41_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_24_0 = null;
        String stackOut_35_0 = null;
        String stackOut_40_0 = null;
        String stackOut_38_0 = null;
        String stackOut_30_0 = null;
        Object stackOut_27_0 = null;
        String stackOut_19_0 = null;
        String stackOut_16_0 = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        try {
          L0: {
            if (hj.field_f < 2) {
              stackOut_3_0 = a.field_c;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (bi.field_I == null) {
                if (qd.field_Jb.a(0)) {
                  if (qd.field_Jb.a(255, "commonui")) {
                    if (!sb.field_i.a(0)) {
                      stackOut_24_0 = bh.field_d;
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0;
                    } else {
                      if (param0 == -81) {
                        if (sb.field_i.a(255, "commonui")) {
                          if (!ig.field_t.a(0)) {
                            stackOut_35_0 = ia.field_b;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0;
                          } else {
                            if (ig.field_t.c((byte) 68)) {
                              stackOut_40_0 = tl.field_J;
                              stackIn_41_0 = stackOut_40_0;
                              break L0;
                            } else {
                              stackOut_38_0 = fb.field_a + " - " + ig.field_t.d((byte) 95) + "%";
                              stackIn_39_0 = stackOut_38_0;
                              return stackIn_39_0;
                            }
                          }
                        } else {
                          stackOut_30_0 = ij.field_a + " - " + sb.field_i.b(param0 + 10542, "commonui") + "%";
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        }
                      } else {
                        stackOut_27_0 = null;
                        stackIn_28_0 = stackOut_27_0;
                        return (String) (Object) stackIn_28_0;
                      }
                    }
                  } else {
                    stackOut_19_0 = sa.field_b + " - " + qd.field_Jb.b(10461, "commonui") + "%";
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  }
                } else {
                  stackOut_16_0 = td.field_o;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                }
              } else {
                if (!bi.field_I.a(0)) {
                  stackOut_11_0 = mi.field_d;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = dh.field_J;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "tb.B(" + param0 + ')');
        }
        return stackIn_41_0;
    }

    public static void a(byte param0) {
        try {
            field_b = null;
            field_d = null;
            int var1_int = 78 / ((param0 - -6) / 36);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "tb.C(" + param0 + ')');
        }
    }

    static {
    }
}
