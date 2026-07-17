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

    final static float a(float param0, float param1, boolean param2) {
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        float stackIn_7_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        float stackOut_6_0 = 0.0f;
        var5 = TetraLink.field_J;
        try {
          L0: {
            var3_float = 0.0f;
            var4 = 0;
            L1: while (true) {
              if (var4 >= 8) {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    field_u = null;
                    break L2;
                  }
                }
                stackOut_6_0 = var3_float;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_float = (float)((double)var3_float + (double)vj.a(param1, true) * Math.sin((double)((float)(1 << var4) * param0 + vj.a(vj.a(param1, true) + param1, true))));
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "mb.D(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    public static void b(byte param0) {
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
