/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends rqa {
    static ds field_p;
    static llb field_o;

    ss(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int[] param0, byte param1, int[] param2) {
        if (param1 != 16) {
            return;
        }
        try {
            smb.a(param2, 0, param0.length + -1, (byte) -79, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ss.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 169) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                ss.a(58);
                break L1;
              }
            }
            si.a(169, 62, param0[0].a(42));
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ss.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_p = new ds(256);
    }
}
