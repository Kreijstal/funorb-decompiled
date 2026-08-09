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
            field_a = (nl) null;
        }
    }

    abstract void a(int param0);

    abstract void a(int param0, iva param1, int param2);

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != 101) {
            ffa var2 = (ffa) null;
            vw.a(-92, (ffa) null, -43, true);
        }
    }

    final static q a(int param0, ffa param1, int param2, boolean param3) {
        q var4 = null;
        RuntimeException var4_ref = null;
        q stackIn_5_0 = null;
        q stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = (q) ((Object) vga.field_n.c(27));
              if (var4 == null) {
                var4 = new q(param1, param0, param2);
                break L1;
              } else {
                var4.a(param0, param1, (byte) 116, param2);
                break L1;
              }
            }
            if (param3) {
              stackIn_7_0 = (q) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (q) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("vw.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    void b(byte param0) {
        if (param0 != 107) {
            this.b((byte) 23);
        }
    }

    void a(boolean param0) {
        if (!param0) {
            this.a(false);
        }
    }

    void b(int param0) {
        if (param0 <= 64) {
            this.a((byte) 45, -125, -56);
        }
    }

    vw(eo param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(boolean param0, int param1);

    abstract void a(byte param0, int param1, int param2);

    void b(boolean param0) {
        if (!param0) {
            field_b = (jea) null;
        }
    }

    abstract boolean c(int param0);

    static {
        field_a = new nl("email");
    }
}
