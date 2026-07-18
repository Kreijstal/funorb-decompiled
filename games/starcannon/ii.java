/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends RuntimeException {
    static String field_c;
    Throwable field_a;
    String field_b;

    final static ig a(byte param0) {
        RuntimeException var1 = null;
        ig stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        ig stackOut_6_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            if (cl.field_k != uh.field_k) {
              if (s.field_f == uh.field_k) {
                uh.field_k = cl.field_k;
                stackOut_6_0 = gj.field_a;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0 == -92) {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (ig) (Object) stackIn_10_0;
                }
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "ii.A(" + param0 + ')');
        }
        return (ig) (Object) stackIn_12_0;
    }

    public static void b(byte param0) {
        try {
            field_c = null;
            if (param0 <= 40) {
                int discarded$0 = ii.a(78);
            }
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    ii(Throwable param0, String param1) {
        try {
            ((ii) this).field_b = param1;
            ((ii) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 6940) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            stackOut_3_0 = -p.field_g + kl.field_d;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "ii.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
    }
}
