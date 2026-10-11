/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static int field_a;
    static int field_b;

    final static bm a(mi param0, byte param1, int param2) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        bm stackIn_5_0 = null;
        bm stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ig.a(param0, param2, (byte) 37)) {
            stackIn_2_0 = null;
            return (bm) (stackIn_2_0);
          }
          if (param1 > 22) {
            stackIn_7_0 = ei.o(69);
            return stackIn_7_0;
          }
          stackIn_5_0 = (bm) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kb.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
