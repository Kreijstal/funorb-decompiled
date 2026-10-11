/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static vd field_b;
    static int field_d;
    static boolean field_a;
    static String field_c;
    static String field_e;

    final static boolean a(int param0) {
        if (param0 >= -71) {
          o[] var2 = (o[]) null;
          e.a((o[]) null, 123, 6, (byte) 67, 68, 39);
          return qb.field_p;
        }
        return qb.field_p;
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 != -2) {
          field_c = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(o[] param0, int param1, int param2, byte param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = wizardrun.field_H;
        try {
          if (param0 != null &&
            param5 > 0) {
            if (param3 <= 27) {
              e.a(59);
            }
            var6_int = param0[0].field_x;
            var7 = param0[2].field_x;
            var8 = param0[1].field_x;
            param0[0].d(param4, param1, param2);
            param0[2].d(param4 + param5 - var7, param1, param2);
            ed.b(ac.field_q);
            ed.b(var6_int + param4, param1, param4 + param5 - var7, param1 + param0[1].field_s);
            var9 = param4 + var6_int;
            var10 = -var7 + param5 + param4;
            for (param4 = var9; param4 < var10; param4 = param4 + var8) {
              param0[1].d(param4, param1, param2);
            }
            ed.a(ac.field_q);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("e.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_e = "Continue";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
