/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cfa extends oib {
    private String field_d;
    private String field_f;
    static String field_e;

    public static void c(byte param0) {
        int var1 = 121 % ((-54 - param0) / 33);
        field_e = null;
    }

    final dka a(byte param0) {
        int var2 = -125 % ((param0 - -7) / 56);
        return bta.field_r;
    }

    final void a(ds param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.b((byte) 0, ((cfa) this).field_f);
              param0.a((byte) -53, ((cfa) this).field_d);
              if (param1 == -26216) {
                break L1;
              } else {
                ((cfa) this).field_d = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cfa.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static bob b(byte param0) {
        if (!(null != elb.field_f)) {
            elb.field_f = new bob(web.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, web.field_o.field_k, -1, 2147483647, true);
        }
        return elb.field_f;
    }

    cfa(String param0, String param1) {
        try {
            ((cfa) this).field_f = param0;
            ((cfa) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "cfa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Offensive account name";
    }
}
