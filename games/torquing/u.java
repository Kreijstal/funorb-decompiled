/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends am {
    static int[] field_v;
    static vh field_t;
    static double field_s;
    static int[] field_w;
    private int field_u;

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param0 <= 86) {
          L0: {
            int[] discarded$2 = ((u) this).a((byte) 80, 91);
            var4 = ((u) this).field_l.a(param1, 25657);
            var3 = var4;
            if (((u) this).field_l.field_b) {
              dk.a(var4, 0, ci.field_c, ((u) this).field_u);
              break L0;
            } else {
              break L0;
            }
          }
          return var4;
        } else {
          L1: {
            var4 = ((u) this).field_l.a(param1, 25657);
            var3 = var4;
            if (((u) this).field_l.field_b) {
              dk.a(var4, 0, ci.field_c, ((u) this).field_u);
              break L1;
            } else {
              break L1;
            }
          }
          return var4;
        }
    }

    final static int[] a(int param0, int[] param1, int param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        Object stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 32681) {
              var4 = new int[param2];
              var3 = var4;
              dk.a(param1, 0, var4, 0, param2);
              stackOut_3_0 = (int[]) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (int[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("u.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 == var4_int) {
                ((u) this).field_u = (param0.i((byte) -101) << 12) / 255;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == 35) {
              break L0;
            } else {
              int[] discarded$2 = ((u) this).a((byte) -38, 62);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("u.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public u() {
        this(4096);
    }

    private u(int param0) {
        super(0, true);
        ((u) this).field_u = 4096;
        ((u) this).field_u = param0;
    }

    public static void g(byte param0) {
        field_v = null;
        field_t = null;
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[1024];
        field_s = 0.0;
        field_w = new int[8192];
    }
}
