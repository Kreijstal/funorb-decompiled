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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.d((byte) 101);
          if (param0 > -20) {
            var4 = (oa) null;
            oh.a((byte) 95, (oa) null);
          }
          stackIn_5_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("oh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
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
