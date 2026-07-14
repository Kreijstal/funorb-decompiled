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
        CharSequence var2 = null;
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
          var2 = (CharSequence) null;
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
            if (param0 == 10) {
              break L0;
            } else {
              field_m = (vg) null;
              break L0;
            }
          }
          Thread.sleep(param1);
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (InterruptedException) (Object) decompiledCaughtException;
    }

    final static int a(boolean param0, CharSequence param1) {
        CharSequence var3 = null;
        if (param0) {
          var3 = (CharSequence) null;
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
