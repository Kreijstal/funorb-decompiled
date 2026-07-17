/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static String field_a;
    static int[] field_b;

    final static void a(ri param0) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (null != bn.field_c) {
                int discarded$3 = 256;
                qh.a(true, (byte) -56, 1048576, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (ic.field_b == null) {
              break L0;
            } else {
              var4 = (Object) (Object) ch.field_q;
              synchronized (var4) {
                L2: {
                  ic.field_b.b(256, -1, 94);
                  if (param0 != oa.field_B) {
                    L3: {
                      ic.field_b.d(19);
                      ch.field_q.c();
                      oa.field_B = param0;
                      if (null != oa.field_B) {
                        ic.field_b.a(true, oa.field_B, (byte) 23);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("fe.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 256 + 44 + 1 + 44 + 113 + 41);
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Accept <%0> into this game";
    }
}
