/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends wf {
    int field_k;
    static uh field_h;
    boolean field_i;
    int[] field_g;
    static int field_j;

    final static boolean a(byte param0, oa param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oa var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.d((byte) 101);
              if (param0 <= -20) {
                break L1;
              } else {
                var4 = (oa) null;
                oh.a((byte) 95, (oa) null);
                break L1;
              }
            }
            L2: {
              if (var2_int != 1) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("oh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    oh() {
        this.field_i = false;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 83) {
            oh.a((byte) 68);
        }
    }

    static {
    }
}
