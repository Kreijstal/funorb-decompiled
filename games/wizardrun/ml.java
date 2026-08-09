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
        int var1 = -27 / ((param0 - -7) / 56);
        field_u = null;
    }

    final static db[] a(kl param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        db[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (h.a(param3, param1, param0, -116)) {
              L1: {
                if (param2 == -26955) {
                  break L1;
                } else {
                  ml.a((byte) 21);
                  break L1;
                }
              }
              stackIn_6_0 = hj.a(100);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ml.E(");

            if (param0 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        v.field_d.a(param0, false);
        if (param2 != -1) {
            return;
        }
        try {
            de.a(-14149, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ml.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract int c(boolean param0);

    ml() {
        this.field_s = true;
    }

    static {
        field_p = "Suggested names: ";
    }
}
