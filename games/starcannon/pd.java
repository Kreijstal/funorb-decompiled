/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int field_c;
    static int field_a;
    static int[] field_d;
    static int field_b;

    final static void a(String param0, int param1, byte param2) {
        int var3_int = 0;
        s.field_c = false;
        ic.field_a = false;
        if (param2 != -77) {
            return;
        }
        try {
            if (null != fa.field_G) {
                if (!fa.field_G.field_G) {
                    return;
                }
                var3_int = 1;
                if (8 == param1) {
                    param1 = 2;
                    if (!tc.field_x) {
                        param0 = ag.field_k;
                    } else {
                        param0 = pk.field_b;
                    }
                    wi.field_c.b((byte) -79, lc.field_hb);
                }
                if (10 == param1) {
                    qc.a(false);
                    var3_int = 0;
                }
                if (var3_int != 0) {
                    if (!(!ic.field_a)) {
                        param0 = fb.a(oh.field_b, param2 ^ -50, new String[]{param0});
                    }
                    if (vj.field_V) {
                        param0 = jl.field_k;
                    }
                    fa.field_G.a(param0, param1, true);
                }
                if (256 != param1) {
                    if (-11 == (param1 ^ -1)) {
                        return;
                    }
                    if (!tc.field_x) {
                        wi.field_c.a(false);
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "pd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 98) {
            field_c = -122;
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 10) {
                break L1;
              } else {
                var3 = (String) null;
                pd.a((String) null, 75, (byte) -104);
                break L1;
              }
            }
            stackIn_3_0 = cc.a(param0, 10, true, param1 ^ -60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pd.B(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_d = new int[8192];
        field_c = 0;
        field_b = 0;
    }
}
