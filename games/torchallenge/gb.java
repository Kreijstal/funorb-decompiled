/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static String field_e;
    static int field_b;
    static vb field_d;
    static int[] field_c;
    static double field_a;
    static h field_f;

    final static void a(int param0, int param1, eg param2, int param3, ka[] param4, ka[] param5, boolean param6, int param7, eg param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        try {
          ka[] var16 = (ka[]) null;
          bh.a(param10, param14, ai.field_d, 0, param4, qa.field_f, param9, param5, param7, param12, param3, param13, 0, param0, param8, param11, -96, 480, (ka[]) null, lg.field_f, param2);
          int var15_int = -62 % ((param1 - 1) / 55);
          ik.a(param6, -27055);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "gb.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static qj a(int param0, byte[] param1) {
        qj var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        qj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (qj) (stackIn_2_0);
          }
          if (param0 != -28993) {
            gb.a(16);
          }
          var2 = new qj(param1, ug.field_e, dd.field_t, pg.field_r, lg.field_e, td.field_m, h.field_a);
          p.a(0);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("gb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static vi a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vi stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        vi stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (param0 >= -86) {
            stackIn_3_0 = (vi) null;
            return stackIn_3_0;
          }
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              stackIn_13_0 = di.field_g;
              return stackIn_13_0;
            }
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (57 >= var4) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_10_0 = null;
          return (vi) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("gb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static int b(int param0) {
        int var1 = 82 / ((-2 - param0) / 38);
        return ea.field_f;
    }

    public static void a(int param0) {
        if (param0 <= 40) {
          field_f = (h) null;
        }
        field_f = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_b = 20;
        field_e = "Create a free account to start using this feature";
        field_c = new int[]{11, 22, 1};
        field_a = Math.atan2(1.0, 0.0);
    }
}
