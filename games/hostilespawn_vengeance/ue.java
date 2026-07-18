/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class ue extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_g;
    static int field_e;
    java.awt.Frame field_i;
    static bd field_h;
    static int[] field_k;
    static bd field_j;
    static bd field_f;
    static ql field_a;
    static int field_d;
    static String field_b;
    static bd field_c;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((ue) this).field_g = true;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ue.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_13_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param1.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1.equals((Object) (Object) "I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1.equals((Object) (Object) "S")) {
                  stackOut_10_0 = Short.TYPE;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (!param1.equals((Object) (Object) "J")) {
                    if (!param1.equals((Object) (Object) "Z")) {
                      if (param1.equals((Object) (Object) "F")) {
                        stackOut_20_0 = Float.TYPE;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        field_c = null;
                        if (!param1.equals((Object) (Object) "D")) {
                          if (param1.equals((Object) (Object) "C")) {
                            stackOut_27_0 = Character.TYPE;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    } else {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  } else {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("ue.D(").append(0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_28_0;
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static void a(int param0) {
        if (wb.field_R > 0) {
        }
        w.field_r = w.field_r + param0;
        qb.field_k = qb.field_k - param0;
        if (0 >= rf.field_f) {
        }
    }

    ue() {
    }

    final void a(boolean param0, fd param1) {
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
              sd.a(param1, -106, ((ue) this).field_i);
              if (param0) {
                break L1;
              } else {
                field_h = null;
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
            stackOut_3_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_a = null;
        field_j = null;
        if (param0 != -27) {
          ue.a((byte) 62);
          field_f = null;
          field_k = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_k = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = new ql();
        field_b = "FROM ONLY";
    }
}
