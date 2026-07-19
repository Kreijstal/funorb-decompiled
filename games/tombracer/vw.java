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
        q discarded$0 = null;
        field_b = null;
        field_a = null;
        if (param0 != 101) {
            ffa var2 = (ffa) null;
            discarded$0 = vw.a(-92, (ffa) null, -43, true);
        }
    }

    final static q a(int param0, ffa param1, int param2, boolean param3) {
        q var4 = null;
        RuntimeException var4_ref = null;
        q stackIn_6_0 = null;
        q stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        q stackOut_7_0 = null;
        q stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = (q) ((Object) vga.field_n.c(27));
                if (var4 == null) {
                  break L2;
                } else {
                  var4.a(param0, param1, (byte) 116, param2);
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = new q(param1, param0, param2);
              break L1;
            }
            if (param3) {
              stackOut_7_0 = (q) (var4);
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_5_0 = (q) null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4_ref);
            stackOut_9_1 = new StringBuilder().append("vw.Q(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
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
