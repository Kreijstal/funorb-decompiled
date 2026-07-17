/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends bca {
    nq field_q;
    static String field_r;

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        mea stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        mea stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                var4 = null;
                ((rb) this).a((op) null, -23);
                break L1;
              }
            }
            stackOut_2_0 = new mea(param1, (rb) this);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rb.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (at) (Object) stackIn_3_0;
    }

    rb(int param0, nq param1, nq param2) {
        super(param0, param1);
        try {
            ((rb) this).field_q = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rb.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, lu param1) {
        try {
            super.a((byte) -124, param1);
            if (param0 > -12) {
                rb.d((byte) -104);
            }
            er.a(((rb) this).field_q, 117, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rb.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void d(byte param0) {
        field_r = null;
        int var1 = 53 % ((25 - param0) / 44);
    }

    rb(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            ((rb) this).field_k = param0.e((byte) 91);
            ((rb) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (var2_int < 0) {
                    break;
                }
                ((rb) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
            }
            ((rb) this).field_q = qi.a(param0, (byte) 75);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(op param0, int param1) {
        try {
            ((rb) this).a(param0, (byte) -2);
            int var3_int = 68 % ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rb.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Staff impersonation";
    }
}
