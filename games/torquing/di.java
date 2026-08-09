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
            throw rb.a((Throwable) ((Object) runtimeException), "di.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_e = null;
        if (param0 == -7) {
            return;
        }
        int[] var2 = (int[]) null;
        di.a(-29, (byte) -24, 121, (int[]) null, -98);
    }

    final void b(int param0) {
        if (param0 != 6) {
            this.b(77);
            this.field_d.a(0, 0);
            return;
        }
        this.field_d.a(0, 0);
    }

    final static dn a(int param0, String[] param1) {
        dn var2 = null;
        RuntimeException var2_ref = null;
        dn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new dn(false);
              var2.field_d = param1;
              if (param0 == 0) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (dn) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("di.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    di(sm param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "OVER <%0>";
    }
}
