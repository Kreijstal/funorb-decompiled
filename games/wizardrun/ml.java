/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ml extends rk {
    static String field_p;
    boolean field_r;
    boolean field_q;
    volatile boolean field_s;
    static int field_t;
    static ji field_u;

    abstract byte[] d(int param0);

    final static ll a(byte param0) {
        int var1 = 57 / ((43 - param0) / 33);
        if (!(we.field_d != null)) {
            we.field_d = new ll(e.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, e.field_b.field_M, -1, 2147483647, true);
        }
        return we.field_d;
    }

    public static void e(int param0) {
        field_p = null;
        int var1 = 27;
        field_u = null;
    }

    final static db[] a(kl param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        db[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        db[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (h.a(param3, param1, param0, -116)) {
              L1: {
                if (param2 == -26955) {
                  break L1;
                } else {
                  ll discarded$2 = ml.a((byte) 21);
                  break L1;
                }
              }
              stackOut_5_0 = hj.a(100);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("ml.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 11579568) {
            return;
        }
        di.a(false, param1, 117);
    }

    final static void a(dc param0, int param1, int param2) {
        v.field_d.a((wl) (Object) param0, false);
        try {
            de.a(-14149, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ml.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + -1 + 41);
        }
    }

    abstract int c(boolean param0);

    ml() {
        ((ml) this).field_s = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Suggested names: ";
    }
}
