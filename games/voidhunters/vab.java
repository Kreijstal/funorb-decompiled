/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vab {
    int field_b;
    static String field_a;
    private qfa field_c;

    protected final void finalize() throws Throwable {
        this.field_c.g(this.field_b, -92);
        super.finalize();
    }

    final static void a(byte param0, ml param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ml var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -94) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if ((var2_int ^ -1) <= -5) {
                break L0;
              } else {
                var3 = new ml(32);
                var3.a(1, 1, new ml(24));
                var3.a(param0 ^ -93, 2, new ml(24));
                var3.a(1, 3, new ml(24));
                var3.a(param0 ^ -93, 4, new ml(24));
                var3.a(1, 5, new ml(24));
                param1.a(param0 ^ -93, var2_int, var3);
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("vab.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = (String) null;
        }
    }

    vab(qfa param0, int param1, int param2) {
        try {
            this.field_b = param2;
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Back";
    }
}
