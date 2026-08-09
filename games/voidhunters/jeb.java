/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jeb extends mfb {
    static Random field_b;
    static int[] field_c;

    final int c(int param0) {
        if (param0 != 0) {
            this.a(true);
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
            field_b = (Random) null;
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
            this.k(108);
            return 6;
        }
        return 6;
    }

    final int a(boolean param0) {
        if (param0) {
            this.h((byte) 61);
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
            String var3 = (String) null;
            jeb.a(31, (int[]) null, 36L, (String) null, (byte) 17);
            return r.field_k;
        }
        return r.field_k;
    }

    jeb() {
    }

    public static void i(byte param0) {
        field_c = null;
        int var1 = 29 % ((14 - param0) / 44);
        field_b = null;
    }

    final static boolean a(int param0, int[] param1, long param2, String param3, byte param4) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 <= -3) {
                break L1;
              } else {
                field_b = (Random) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  break L3;
                } else {
                  L4: {
                    if (-3 != (param0 ^ -1)) {
                      break L4;
                    } else {
                      if (!ira.a(param2, param3, 41)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("jeb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param4 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final int g(byte param0) {
        if (param0 >= -12) {
            field_c = (int[]) null;
            return cp.field_f;
        }
        return cp.field_f;
    }

    static {
        field_b = new Random();
    }
}
