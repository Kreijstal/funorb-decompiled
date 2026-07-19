/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static String field_a;
    static int[] field_b;

    final static void a(ri param0, int param1, boolean param2, int param3) {
        Object var4 = null;
        RuntimeException var4_ref = null;
        Object var4_ref2 = null;
        Throwable var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (null != bn.field_c) {
                qh.a(param2, (byte) -56, 1048576, param0, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (ic.field_b == null) {
                break L2;
              } else {
                var4_ref2 = ch.field_q;
                synchronized (var4_ref2) {
                  L3: {
                    ic.field_b.b(param1, -1, 94);
                    if (param0 != oa.field_B) {
                      L4: {
                        ic.field_b.d(19);
                        ch.field_q.c();
                        oa.field_B = param0;
                        if (null != oa.field_B) {
                          ic.field_b.a(param2, oa.field_B, (byte) 23);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                break L2;
              }
            }
            if (param3 > 20) {
              break L0;
            } else {
              field_b = (int[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4_ref);
            stackOut_18_1 = new StringBuilder().append("fe.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_a = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_a = "Accept <%0> into this game";
    }
}
