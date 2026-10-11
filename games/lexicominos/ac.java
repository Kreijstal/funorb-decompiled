/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;

    final static void a(boolean param0, int param1, db[] param2, int param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 != null &&
            param4 > 0) {
            if (!param0) {
              return;
            }
            var5_int = param2[0].field_r;
            var6 = param2[2].field_r;
            var7 = param2[1].field_r;
            param2[0].d(param3, param1);
            param2[2].d(-var6 + param3 + param4, param1);
            lf.b(uh.field_C);
            lf.f(var5_int + param3, param1, param4 + (param3 - var6), param1 + param2[1].field_x);
            var8 = var5_int + param3;
            var9 = param4 + (param3 - var6);
            for (param3 = var8; param3 < var9; param3 = param3 + var7) {
              param2[1].d(param3, param1);
            }
            lf.a(uh.field_C);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ac.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 4) {
          ac.a(true, 32, true, true);
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        int var4Lifetime1;
        if (param1 >= -46) {
          field_a = (String) null;
          var4 = 0;
          if (param2) {
            var4 += 4;
          }
          if (param3) {
            var4 += 2;
          }
          if (param0) {
            var4++;
            return ll.field_e[var4];
          }
          return ll.field_e[var4];
        }
        var4Lifetime1 = 0;
        if (param2) {
          var4Lifetime1 += 4;
        }
        if (param3) {
          var4Lifetime1 += 2;
        }
        if (!param0) {
          return ll.field_e[var4Lifetime1];
        }
        var4Lifetime1++;
        return ll.field_e[var4Lifetime1];
    }

    static {
        field_a = "Names cannot start or end with space or underscore";
    }
}
