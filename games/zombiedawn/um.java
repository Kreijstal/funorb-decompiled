/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class um implements vc {
    private long field_b;
    static int field_a;

    final static tk a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        tk stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!gl.field_E.a(90)) {
                break L1;
              } else {
                if (param1.equals((Object) (Object) gl.field_E.c(0))) {
                  break L1;
                } else {
                  gl.field_E = co.a(param1, -100);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                var3 = null;
                tk discarded$2 = um.a((byte) -101, (String) null);
                break L2;
              }
            }
            stackOut_5_0 = gl.field_E;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("um.R(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    public final void a(int param0) {
        ((um) this).field_b = pd.a(-22826);
        if (param0 != -7674) {
            ((um) this).field_b = -52L;
        }
    }

    public final String b(byte param0) {
        int var2 = 0;
        if (!((um) this).b(110)) {
          if (pd.a(-22826) < 350L + ((um) this).field_b) {
            return null;
          } else {
            var2 = -9 / ((-33 - param0) / 57);
            return ((um) this).c(-111);
          }
        } else {
          return null;
        }
    }

    abstract rh c(byte param0);

    abstract String c(int param0);

    public final rh a(byte param0) {
        if (param0 > -71) {
            ((um) this).field_b = 85L;
            if (((um) this).b(121)) {
                return di.field_L;
            }
            if (!(pd.a(-22826) >= ((um) this).field_b + 350L)) {
                return se.field_l;
            }
            return ((um) this).c((byte) -7);
        }
        if (((um) this).b(121)) {
            return di.field_L;
        }
        if (!(pd.a(-22826) >= ((um) this).field_b + 350L)) {
            return se.field_l;
        }
        return ((um) this).c((byte) -7);
    }

    static {
    }
}
