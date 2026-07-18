/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vw {
    static nl field_a;
    static jea field_b;
    eo field_c;

    abstract void a(int param0, boolean param1);

    void c(boolean param0) {
        if (!param0) {
            field_a = null;
        }
    }

    abstract void a(int param0);

    abstract void a(int param0, iva param1, int param2);

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final static q a(int param0, ffa param1, int param2) {
        q var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var4 = (q) (Object) vga.field_n.c(27);
            if (var4 == null) {
              var4 = new q(param1, param0, param2);
              break L0;
            } else {
              var4.a(param0, param1, (byte) 116, param2);
              break L0;
            }
          }
          return var4;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("vw.Q(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + true + ')');
        }
    }

    void b(byte param0) {
        if (param0 != 107) {
            ((vw) this).b((byte) 23);
        }
    }

    void a(boolean param0) {
        if (!param0) {
            ((vw) this).a(false);
        }
    }

    void b(int param0) {
        if (param0 <= 64) {
            ((vw) this).a((byte) 45, -125, -56);
        }
    }

    vw(eo param0) {
        try {
            ((vw) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(boolean param0, int param1);

    abstract void a(byte param0, int param1, int param2);

    void b(boolean param0) {
        if (!param0) {
            field_b = null;
        }
    }

    abstract boolean c(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nl("email");
    }
}
