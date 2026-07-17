/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mb extends gb {
    static String field_A;
    static int field_z;
    static wf[] field_y;
    int field_t;
    static ni field_u;
    static long field_B;
    static int[] field_w;
    static hl field_x;
    static String field_v;
    static int field_C;

    mb(int param0) {
        ((mb) this).field_t = param0;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    abstract Object g(int param0);

    abstract boolean f(int param0);

    final static float a(float param0, float param1) {
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        float stackIn_5_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float stackOut_4_0 = 0.0f;
        var5 = TetraLink.field_J;
        try {
          L0: {
            var3_float = 0.0f;
            var4 = 0;
            L1: while (true) {
              if (var4 >= 8) {
                field_u = null;
                stackOut_4_0 = var3_float;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                int discarded$6 = 1;
                int discarded$7 = 1;
                int discarded$8 = 1;
                var3_float = (float)((double)var3_float + (double)vj.a(param1) * Math.sin((double)((float)(1 << var4) * param0 + vj.a(vj.a(param1) + param1))));
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "mb.D(" + param0 + 44 + param1 + 44 + 0 + 41);
        }
        return stackIn_5_0;
    }

    public static void b() {
        field_v = null;
        field_A = null;
        field_x = null;
        field_u = null;
        field_w = null;
        field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Show all private chat";
        field_w = new int[8192];
        field_B = 20000000L;
        field_v = "Retry";
    }
}
