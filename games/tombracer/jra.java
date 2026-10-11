/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jra extends loa {
    static String field_b;
    static String[] field_c;

    jra(qea param0) {
        super(param0);
    }

    final void a(int param0, int param1, hj param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var5_intLifetime1;
        int var6Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          for (var5_int = 1; -1 + param2.field_f > var5_int; var5_int++) {
            for (var6 = 1; -1 + param2.field_a > var6; var6 += 2) {
              param2.a(var6, 0, 0, var5_int);
            }
          }
          var5_intLifetime1 = 2;
          if (param1 < 73) {
            jra.a(78);
          }
          while (var5_intLifetime1 < -2 + param2.field_a) {
            var6Lifetime1 = 1 + this.field_a.a(param2.field_f - 2, 0);
            param2.a(var5_intLifetime1, 0, 0, var6Lifetime1);
            var5_intLifetime1 += 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("jra.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 19290) {
          jra.a(30);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new String[3];
    }
}
