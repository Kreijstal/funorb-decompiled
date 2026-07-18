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
        int var1 = 19;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (h.a(param3, param1, param0, -116)) {
            return hj.a(100);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ml.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + -26955 + ',' + param3 + ')');
        }
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
            de.a(-14149, 5, param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ml.J(" + (param0 != null ? "{...}" : "null") + ',' + 5 + ',' + -1 + ')');
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
