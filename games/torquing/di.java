/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends af {
    static int[] field_e;
    static String field_c;
    private sm field_d;

    final static void a(int param0, byte param1, int param2, int[] param3, int param4) {
        int var5_int = 0;
        int var7 = Torquing.field_u;
        try {
            param0--;
            param4--;
            var5_int = param4 + -7;
            while (var5_int > param0) {
                param0++;
                param3[param0] = param2;
                param0++;
                param3[param0] = param2;
                param0++;
                param3[param0] = param2;
                param0++;
                param3[param0] = param2;
                param0++;
                param3[param0] = param2;
                param0++;
                param3[param0] = param2;
                param0++;
                param3[param0] = param2;
                param0++;
                param3[param0] = param2;
            }
            while (param0 < param4) {
                param0++;
                param3[param0] = param2;
            }
            int var6 = -59 / ((-50 - param1) / 39);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "di.E(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_e = null;
        if (param0 == -7) {
            return;
        }
        Object var2 = null;
        di.a(-29, (byte) -24, 121, (int[]) null, -98);
    }

    final void b(int param0) {
        if (param0 != 6) {
            ((di) this).b(77);
            ((di) this).field_d.a(0, 0);
            return;
        }
        ((di) this).field_d.a(0, 0);
    }

    final static dn a(int param0, String[] param1) {
        dn var2 = null;
        RuntimeException var2_ref = null;
        dn stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_2_0 = null;
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
              var2 = new dn(false);
              var2.field_d = param1;
              if (param0 == 0) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            stackOut_2_0 = (dn) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("di.F(").append(param0).append(44);
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
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    di(sm param0) {
        try {
            ((di) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "di.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "OVER <%0>";
    }
}
