/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends rk {
    static int[] field_m;
    int field_s;
    static pf field_q;
    static String field_r;
    static nf[] field_t;
    static int field_n;
    int[] field_p;
    static int field_u;
    boolean field_o;

    final static in a(int param0, String param1, int param2) {
        in var3 = null;
        RuntimeException var3_ref = null;
        in stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        in stackOut_2_0 = null;
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
              var3 = new in(false);
              var3.field_f = param1;
              var3.field_g = param2;
              if (param0 == 4) {
                break L1;
              } else {
                gd.a((byte) 14);
                break L1;
              }
            }
            stackOut_2_0 = (in) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("gd.B(").append(param0).append(44);
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != -3) {
          var2 = null;
          gd.a(21, 49, (bi) null, (pm) null);
          field_r = null;
          field_q = null;
          field_m = null;
          field_t = null;
          return;
        } else {
          field_r = null;
          field_q = null;
          field_m = null;
          field_t = null;
          return;
        }
    }

    final static void a(int param0, int param1, bi param2, pm param3) {
        try {
            da.a(param0, 0, param2, false, param3);
            int var4_int = -74 / ((param1 - -76) / 32);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gd.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    gd() {
        ((gd) this).field_o = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Account created successfully!";
        field_u = 4;
    }
}
