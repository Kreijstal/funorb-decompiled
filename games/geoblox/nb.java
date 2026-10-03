/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static String field_a;

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kc.a((java.awt.Component) ((Object) param1), 0);
          df.a(false, (java.awt.Component) ((Object) param1));
          if (param0 != -2) {
            field_a = (String) null;
          }
          if (null == vc.field_f) {
            return;
          }
          vc.field_f.a((java.awt.Component) ((Object) param1), (byte) 83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("nb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        ja var6;
        double var7;
        double var9;
        int var11;
        int var12;
        ja stackIn_17_0;
        int stackIn_17_1;
        float stackIn_17_2;
        int stackIn_17_3;
        float stackIn_17_4;
        int stackIn_18_5 = 0;
        int stackIn_21_6;
        float stackIn_21_7;
        float stackIn_21_8;
        float stackIn_21_9;
        int stackIn_23_10 = 0;
        if (param0 != -28195) {
          return;
        }
        var6 = (ja) ((Object) ra.field_a.e(1));
        if (var6 == null) {
          return;
        }
        var7 = (double)(-320 + param1);
        var9 = (double)(-240 + param3);
        param1 = (int)(320.0 + (var7 * Math.cos((double)(-el.field_o.field_J)) - var9 * Math.sin((double)(-el.field_o.field_J))));
        param3 = (int)(Math.sin((double)(-el.field_o.field_J)) * var7 + Math.cos((double)(-el.field_o.field_J)) * var9 + 240.0);
        if (!param5) {
          var6.a(-75, (float)param1, 0, (float)(-param1 + 320), param4, 0, 0.0f, (float)param3, (float)(-param3 + 240), param2, 0.0f);
        } else {
          var11 = (param4 + param2) % 4;
          var12 = 0;
          if (var11 == 0) {
            var12 = 2;
          }
          if (var11 == 1) {
            var12 = 4;
          }
          if (var11 == 2) {
            var12 = 3;
          }
          if (3 == var11) {
            var12 = 1;
          }
          stackIn_17_0 = var6;
          stackIn_17_1 = param0 + 28113;
          stackIn_17_2 = (float)param1;
          stackIn_17_3 = var12;
          stackIn_17_4 = (float)(320 - param1);
          stackIn_18_5 = (var12 != 2) ? -1 : param4;
          stackIn_21_6 = 0;
          stackIn_21_7 = 0.0f;
          stackIn_21_8 = (float)param3;
          stackIn_21_9 = (float)(-param3 + 240);
          if ((var12 != 2) &&
              (1 != var12)) {
            stackIn_23_10 = -1;
          } else {
            stackIn_23_10 = param2;
          }
          ((ja) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_18_5, stackIn_21_6, stackIn_21_7, stackIn_21_8, stackIn_21_9, stackIn_23_10, 0.0f);
        }
        var6.field_K = null;
        ji.field_r.a(param0 ^ 28286, var6);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = Geoblox.field_C;
        if (param10 != -2) {
            return;
        }
        if (param4 <= param7) {
            if (param15 > param7) {
                wh.a(param3, param11, param13, param1, param15, param9, param2, param0, param4, param14, param6, vb.field_c, param12, param8, param5, param7, -1275583984);
                return;
            }
            if (param15 > param4) {
                wh.a(param1, param11, param13, param3, param7, param0, param6, param9, param4, param8, param2, vb.field_c, param12, param14, param5, param15, -1275583984);
                return;
            }
            wh.a(param1, param2, param8, param12, param7, param0, param6, param5, param15, param13, param11, vb.field_c, param3, param14, param9, param4, -1275583984);
            return;
        }
        if (param4 < param15) {
            wh.a(param3, param6, param14, param12, param15, param9, param2, param5, param7, param13, param11, vb.field_c, param1, param8, param0, param4, param10 ^ 1275583982);
            return;
        }
        if (param15 > param7) {
            wh.a(param12, param6, param14, param3, param4, param5, param11, param9, param7, param8, param2, vb.field_c, param1, param13, param0, param15, -1275583984);
            return;
        }
        wh.a(param12, param2, param8, param1, param4, param5, param11, param0, param15, param14, param6, vb.field_c, param3, param13, param9, param7, -1275583984);
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            field_a = (String) null;
            if (rb.field_d == null) {
                return false;
            }
            if (rb.field_d.a(-119)) {
                return true;
            }
            return false;
        }
        if (rb.field_d == null) {
            return false;
        }
        if (rb.field_d.a(-119)) {
            return true;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 >= -80) {
            nb.a(108);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = "Loading fonts";
    }
}
