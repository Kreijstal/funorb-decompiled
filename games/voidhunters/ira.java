/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ira extends mfb {
    static lkb field_b;
    static java.awt.Frame field_c;

    ira() {
    }

    final boolean h(byte param0) {
        int discarded$0 = 0;
        if (param0 <= 18) {
            discarded$0 = this.a(false);
            return false;
        }
        return false;
    }

    final int b(boolean param0) {
        if (param0) {
            return 72;
        }
        return qh.field_J;
    }

    final int a(boolean param0) {
        if (param0) {
            field_b = (lkb) null;
            return 41;
        }
        return 41;
    }

    final int b(int param0) {
        int var2 = -55 / ((7 - param0) / 47);
        return ljb.field_o;
    }

    final int f(byte param0) {
        if (param0 < 0) {
            field_c = (java.awt.Frame) null;
            return fja.field_o;
        }
        return fja.field_o;
    }

    final boolean e(int param0) {
        int var2 = -111 / ((param0 - 54) / 54);
        return true;
    }

    public static void l(int param0) {
        boolean discarded$0 = false;
        field_b = null;
        field_c = null;
        if (param0 != 17036) {
            String var2 = (String) null;
            discarded$0 = ira.a(25L, (String) null, -89);
        }
    }

    final int a(int param0) {
        int discarded$0 = 0;
        if (param0 != 0) {
            discarded$0 = this.c((byte) -16);
            return eg.field_o;
        }
        return eg.field_o;
    }

    final int g(byte param0) {
        int discarded$0 = 0;
        if (param0 > -12) {
            discarded$0 = this.d((byte) -91);
            return nob.field_p;
        }
        return nob.field_p;
    }

    final int k(int param0) {
        if (param0 != 0) {
            return -72;
        }
        return 3;
    }

    final int c(byte param0) {
        int var2 = -86 % ((param0 - 75) / 46);
        return upb.field_a;
    }

    final static boolean a(long param0, String param1, int param2) {
        boolean discarded$2 = false;
        vu var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
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
              var4 = di.a(param1, 0);
              if (param2 == 41) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = ira.a(1L, (String) null, 31);
                break L1;
              }
            }
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                if (null != var4.field_Ab) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (null == lqa.field_o) {
                  break L4;
                } else {
                  if (null == pjb.a(param0, true)) {
                    break L4;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L3;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4_ref);
            stackOut_12_1 = new StringBuilder().append("ira.G(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final int g(int param0) {
        if (param0 != 2769) {
            return 6;
        }
        return uh.field_q;
    }

    final boolean h(int param0) {
        if (param0 != -2291) {
            field_b = (lkb) null;
            return true;
        }
        return true;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
            field_b = (lkb) null;
            return mqa.field_s;
        }
        return mqa.field_s;
    }

    final int c(int param0) {
        if (param0 != 0) {
            return -95;
        }
        return asa.field_e;
    }

    final int a(byte param0) {
        int var2 = 106 % ((param0 - -48) / 43);
        return 1;
    }

    static {
        field_b = new lkb();
    }
}
