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
        ag var3 = null;
        int var4 = 0;
        int var5 = 0;
        ag var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 22) {
                break L1;
              } else {
                field_d = (bi) null;
                break L1;
              }
            }
            var6 = param2[param0];
            var3 = var6;
            var4 = param0 + -1;
            L2: while (true) {
              if (var4 < 0) {
                param2[0] = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-1 >= (param2[var4].a(var3, -101) ^ -1)) {
                  param2[1 + var4] = param2[var4];
                  var4--;
                  continue L2;
                } else {
                  param2[var4 - -1] = var6;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("wl.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        ag[] var2;
        field_a = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != 85) {
          var2 = (ag[]) null;
          wl.a(-6, -65, (ag[]) null);
          field_c = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_f = null;
          return;
        }
    }

    static {
        field_e = "Log in";
        field_b = "Players";
        field_c = "<%1> fleets have retreated to <%0>";
    }
}
