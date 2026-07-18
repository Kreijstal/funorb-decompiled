/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int field_c;
    static sn field_d;
    static String field_a;
    static String field_e;
    static cj field_b;
    static String field_f;

    final static int a(boolean param0, int param1, byte[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 0;
            var4 = 255;
            var3_int = var3_int | (var4 & param2[4 * param1]) << 24;
            var3_int = var3_int | (var4 & param2[1 + 4 * param1]) << 16;
            var3_int = var3_int | (param2[4 * param1 - -2] & var4) << 8;
            var3_int = var3_int | var4 & param2[4 * param1 - -3];
            stackOut_0_0 = var3_int;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ql.A(").append(true).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 4) {
          ql.a(-69);
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static void a(boolean param0) {
        il var1 = (il) (Object) mo.field_Fb.a(true);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        oo.a(var1.field_o, var1.field_i, var1.field_f);
        oo.h(var1.field_m, var1.field_h, var1.field_p, var1.field_g);
        var1.field_o = null;
        db.field_a.a((br) (Object) var1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Invalid password.";
    }
}
