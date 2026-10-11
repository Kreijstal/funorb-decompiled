/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends ag {
    private qm field_J;
    static int field_H;
    static long field_K;
    static String field_I;

    final static void i(byte param0) {
        rk.field_O.q(-256);
        if (mj.field_p >= 6) {
          if (7 != mj.field_p) {
            gj.a(true, true, 14, mn.field_r);
            df.a((byte) 120, mj.field_p + 1);
          }
        } else {
          if (co.a(-20675) == 0 &&
            7 != mj.field_p) {
            gj.a(true, true, 14, mn.field_r);
            df.a((byte) 120, mj.field_p + 1);
          }
        }
        if (param0 == 74) {
          return;
        }
        mh.g((byte) 11);
    }

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_J = (qm) null;
          }
          stackIn_3_0 = this.field_J.a(param0 + 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    mh(qm param0) {
        try {
          this.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(byte param0) {
        int var1 = 53 % ((33 - param0) / 61);
        field_I = null;
    }

    final static void g(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 45) {
          mh.i((byte) -22);
        }
        if (null == ch.field_a) {
          return;
        }
        var1 = ch.field_a;
        synchronized (var1) {
          ch.field_a = null;
        }
    }

    static {
        field_I = "Wands ";
    }
}
