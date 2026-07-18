/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends ik {
    int field_v;
    static sk field_x;
    uf field_t;
    static int field_y;
    static String field_w;
    byte[] field_u;

    final byte[] f(int param0) {
        if (!((tg) this).field_r) {
          if (param0 != 0) {
            ((tg) this).field_t = null;
            return ((tg) this).field_u;
          } else {
            return ((tg) this).field_u;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static ma d(byte param0) {
        int discarded$0 = 29084;
        int discarded$1 = -86;
        return new ma(we.a(), ek.a());
    }

    public static void h() {
        field_x = null;
        field_w = null;
        int var1 = 0;
    }

    final int e(int param0) {
        if (param0 == -29144) {
          if (((tg) this).field_r) {
            return 0;
          } else {
            return 100;
          }
        } else {
          int discarded$6 = ((tg) this).e(69);
          if (((tg) this).field_r) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    final static ig a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_5_0 = null;
        ig stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_4_0 = null;
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
            if (jl.field_a != ie.field_x) {
              if (param0 <= -27) {
                L1: {
                  if (ie.field_x != s.field_f) {
                    break L1;
                  } else {
                    if (!param1.equals((Object) (Object) te.field_a)) {
                      break L1;
                    } else {
                      ie.field_x = cl.field_k;
                      stackOut_8_0 = mf.field_a;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    }
                  }
                }
                mf.field_a = null;
                ie.field_x = jl.field_a;
                te.field_a = param1;
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ig) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("tg.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return (ig) (Object) stackIn_11_0;
    }

    tg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new sk();
        field_w = "Player names can be up to 12 letters, numbers and underscores";
    }
}
