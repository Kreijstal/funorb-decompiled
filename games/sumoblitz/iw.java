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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!k.a(param2, param0, param1, param3 ^ 3916)) {
            stackIn_2_0 = null;
            return (ne) (stackIn_2_0);
          }
          if (param3 != -21834) {
            field_b = -84;
          }
          stackIn_6_0 = ad.e(param3 + 34602);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("iw.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
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
