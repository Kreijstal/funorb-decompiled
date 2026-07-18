/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jeb extends mfb {
    static Random field_b;
    static int[] field_c;

    final int c(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((jeb) this).a(true);
            return ava.field_a;
        }
        return ava.field_a;
    }

    final int b(int param0) {
        int var2 = 63 % ((7 - param0) / 47);
        return rlb.field_e;
    }

    final boolean h(byte param0) {
        if (param0 < 18) {
            return false;
        }
        return false;
    }

    final int a(int param0) {
        if (param0 != 0) {
            field_b = null;
            return m.field_p;
        }
        return m.field_p;
    }

    final int a(byte param0) {
        int var2 = -96 / ((-48 - param0) / 43);
        return mq.field_j;
    }

    final int f(byte param0) {
        if (param0 < 0) {
            return 34;
        }
        return oq.field_a;
    }

    final int k(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((jeb) this).k(108);
            return 6;
        }
        return 6;
    }

    final int a(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((jeb) this).h((byte) 61);
            return 71;
        }
        return 71;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
            return -93;
        }
        return jj.field_o;
    }

    final int b(boolean param0) {
        if (param0) {
            Object var3 = null;
            boolean discarded$0 = jeb.a(31, (int[]) null, 36L, (String) null, (byte) 17);
            return r.field_k;
        }
        return r.field_k;
    }

    jeb() {
    }

    public static void i() {
        field_c = null;
        int var1 = 1;
        field_b = null;
    }

    final static boolean a(int param0, int[] param1, long param2, String param3, byte param4) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            L1: {
              if (param4 <= -3) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  break L3;
                } else {
                  L4: {
                    if (param0 != 2) {
                      break L4;
                    } else {
                      if (!ira.a(param2, param3, 41)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("jeb.C(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          L6: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final int g(byte param0) {
        if (param0 >= -12) {
            field_c = null;
            return cp.field_f;
        }
        return cp.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random();
    }
}
