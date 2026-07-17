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
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              var3_int = 0;
              var4 = 255;
              var3_int = var3_int | (var4 & param2[4 * param1]) << 24;
              var3_int = var3_int | (var4 & param2[1 + 4 * param1]) << 16;
              var3_int = var3_int | (param2[4 * param1 - -2] & var4) << 8;
              var3_int = var3_int | var4 & param2[4 * param1 - -3];
              if (param0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            stackOut_2_0 = var3_int;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ql.A(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
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
