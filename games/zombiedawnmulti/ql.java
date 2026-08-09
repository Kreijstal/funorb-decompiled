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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = 255;
              var3_int = var3_int | (var4 & param2[4 * param1]) << 605424824;
              var3_int = var3_int | (var4 & param2[1 + 4 * param1]) << 736886928;
              var3_int = var3_int | (param2[4 * param1 - -2] & var4) << 79106056;
              var3_int = var3_int | var4 & param2[4 * param1 - -3];
              if (param0) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ql.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
        il var1 = (il) ((Object) mo.field_Fb.a(param0));
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        oo.a(var1.field_o, var1.field_i, var1.field_f);
        oo.h(var1.field_m, var1.field_h, var1.field_p, var1.field_g);
        var1.field_o = null;
        db.field_a.a(var1, false);
    }

    static {
        field_f = "Invalid password.";
    }
}
