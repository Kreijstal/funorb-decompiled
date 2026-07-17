/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    int field_j;
    static io field_i;
    static io field_f;
    static io field_c;
    static io field_g;
    static io field_k;
    static io field_h;
    static io field_e;
    static io field_d;
    static ci field_b;
    static float[] field_a;

    final static void a(int param0, mf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              sj.field_c.a((hj) (Object) param1);
              if (param0 >= 93) {
                break L1;
              } else {
                io.a(-28);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("io.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private io(int param0) {
        ((io) this).field_j = param0;
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
          io.a(41);
          field_h = null;
          field_f = null;
          field_e = null;
          field_d = null;
          field_a = null;
          field_k = null;
          return;
        } else {
          field_h = null;
          field_f = null;
          field_e = null;
          field_d = null;
          field_a = null;
          field_k = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new io(1);
        field_f = new io(2);
        field_c = new io(4);
        field_g = new io(1);
        field_k = new io(2);
        field_h = new io(4);
        field_e = new io(2);
        field_d = new io(4);
        field_a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}
