/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iw {
    static int field_a;
    static int field_b;
    int field_c;

    final static ne a(int param0, int param1, ki param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ne stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (k.a(param2, param0, param1, param3 ^ 3916)) {
              L1: {
                if (param3 == -21834) {
                  break L1;
                } else {
                  field_b = -84;
                  break L1;
                }
              }
              stackIn_6_0 = ad.e(param3 + 34602);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("iw.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ne) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    iw(int param0) {
        this.field_c = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = 0;
        field_a = -1;
    }
}
