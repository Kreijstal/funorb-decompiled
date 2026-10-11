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
        if (we.field_d == null) {
          we.field_d = new ll(e.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, e.field_b.field_M, -1, 2147483647, true);
        }
        return we.field_d;
    }

    public static void e(int param0) {
        field_p = null;
        int var1 = -27 / ((param0 + 7) / 56);
        field_u = null;
    }

    final static db[] a(kl param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        db[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!h.a(param3, param1, param0, -116)) {
            return null;
          }
          if (param2 != -26955) {
            ml.a((byte) 21);
          }
          stackIn_6_0 = hj.a(100);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ml.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
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
