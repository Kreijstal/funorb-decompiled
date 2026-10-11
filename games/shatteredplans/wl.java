/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static String field_e;
    static bi field_d;
    static String field_b;
    static String field_c;
    static vi field_a;
    static vd field_f;

    final static void a(int param0, int param1, ag[] param2) {
        int var4 = 0;
        ag var3 = null;
        int var5 = 0;
        ag var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 <= 22) {
            field_d = (bi) null;
          }
          var6 = param2[param0];
          var3 = var6;
          for (var4 = param0 - 1; var4 >= 0; var4--) {
            if (param2[var4].a(var3, -101) < 0) {
              param2[var4 + 1] = var6;
              return;
            }
            param2[1 + var4] = param2[var4];
          }
          param2[0] = var6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("wl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 == 85) {
          field_c = null;
          field_f = null;
          return;
        }
        ag[] var2 = (ag[]) null;
        wl.a(-6, -65, (ag[]) null);
        field_c = null;
        field_f = null;
    }

    static {
        field_e = "Log in";
        field_b = "Players";
        field_c = "<%1> fleets have retreated to <%0>";
    }
}
