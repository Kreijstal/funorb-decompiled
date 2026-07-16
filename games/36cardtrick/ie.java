/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends he {
    int field_k;
    int field_p;
    int field_q;
    int field_l;
    static vg field_m;
    int field_o;
    int field_n;

    final static boolean b(byte param0) {
        Object var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 34) {
          if ((cd.field_e ^ -1) <= -11) {
            if (vg.field_d) {
              return false;
            } else {
              L0: {
                if (g.j(param0 + -27)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          var2 = null;
          int discarded$4 = ie.a(false, (CharSequence) null);
          if ((cd.field_e ^ -1) <= -11) {
            if (vg.field_d) {
              return false;
            } else {
              L1: {
                if (g.j(param0 + -27)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 != -11) {
            ie.e(75);
        }
    }

    final static void a(byte param0, long param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            Thread.sleep(param1);
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
    }

    final static int a(boolean param0, CharSequence param1) {
        Object var3 = null;
        if (param0) {
          var3 = null;
          int discarded$2 = ie.a(false, (CharSequence) null);
          return bd.a(true, param1, (byte) 122, 10);
        } else {
          return bd.a(true, param1, (byte) 122, 10);
        }
    }

    final static void f(int param0) {
        if (param0 != -11) {
            boolean discarded$0 = ie.b((byte) 44);
        }
    }

    ie() {
    }

    static {
    }
}
