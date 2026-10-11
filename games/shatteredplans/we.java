/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static String field_d;
    static String field_a;
    static int field_c;
    static int field_e;
    static String field_b;
    static bi field_f;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -62) {
          field_d = (String) null;
        }
        field_a = null;
        field_f = null;
        field_b = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = param0.getParameter("username");
          if (param1 != 4289) {
            field_b = (String) null;
          }
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (oq.a(5722, var3) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("we.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = im.field_c;
          synchronized (var1) {
            of.field_e = of.field_e + 1;
            tc.field_B = fe.field_J;
            if (param0 != -59) {
              we.a(49, -95, -50, 61, 66, -88, -81, -110, -20);
            }
            if (qn.field_c < 0) {
              for (var2 = 0; var2 < 112; var2++) {
                di.field_p[var2] = false;
              }
              qn.field_c = hb.field_e;
            } else {
              while (hb.field_e != qn.field_c) {
                var2 = m.field_x[hb.field_e];
                hb.field_e = 127 & 1 + hb.field_e;
                if (var2 < 0) {
                  di.field_p[~var2] = false;
                  continue;
                }
                di.field_p[var2] = true;
              }
            }
            fe.field_J = cg.field_I;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "we.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_28_0;
        int stackIn_28_1;
        int stackIn_28_2;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_29_5;
        int stackIn_32_0;
        int stackIn_32_1;
        int stackIn_32_2;
        int stackIn_32_3;
        int stackIn_32_4;
        int stackIn_33_5;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        long var14 = 0L;
        long var16 = 0L;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14_intLifetime1;
        long var14Lifetime1;
        long var16Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        var23 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var9_int = 0;
          if (param0 != 9) {
            field_e = -59;
          }
          var10 = 0;
          var11 = 0;
          var12 = gf.field_i << 4;
          var13 = gf.field_l << 4;
          if (param3 > param1) {
            var14_int = param3;
            param3 = param1;
            param1 = var14_int;
            var14_intLifetime1 = param2;
            param2 = param6;
            param6 = var14_intLifetime1;
            param5 = -param5 + param8;
          }
          if (param3 < var13 &&
            var13 < param1) {
            var11 = (int)(65536L * (long)(param1 - var13) / (long)(-param3 + param1));
          }
          if (var12 > param3 &&
            param1 > var12) {
            var10 = (int)(65536L * (long)(-param3 + var12) / (long)(-param3 + param1));
          }
          var14 = (long)(param1 - param3);
          var16 = (long)(param6 - param2);
          param3 = param3 + (int)((long)var10 * var14 >> 16);
          param2 = param2 + (int)((long)var10 * var16 >> 16);
          param1 = param1 - (int)((long)var11 * var14 >> 16);
          param6 = param6 - (int)((long)var11 * var16 >> 16);
          var13Lifetime1 = gf.field_f << 4;
          var12Lifetime1 = gf.field_a << 4;
          var11Lifetime1 = 0;
          var10Lifetime1 = 0;
          if (param2 > param6) {
            var18 = param3;
            param3 = param1;
            param1 = var18;
            var18Lifetime2 = param2;
            param2 = param6;
            param6 = var18Lifetime2;
            param5 = param8 - param5;
          }
          var14Lifetime1 = (long)(-param3 + param1);
          var16Lifetime1 = (long)(param6 - param2);
          if (param2 < var12Lifetime1 &&
            param6 > var12Lifetime1) {
            var10Lifetime1 = (int)((long)(var12Lifetime1 - param2) * 65536L / (long)(param6 - param2));
          }
          if (param2 < var13Lifetime1 &&
            var13Lifetime1 < param6) {
            var11Lifetime1 = (int)((long)(param6 - var13Lifetime1) * 65536L / (long)(-param2 + param6));
          }
          param6 = param6 - (int)(var16Lifetime1 * (long)var11Lifetime1 >> 16);
          param2 = param2 + (int)((long)var10Lifetime1 * var16Lifetime1 >> 16);
          param3 = param3 + (int)(var14Lifetime1 * (long)var10Lifetime1 >> 16);
          var9_int = var9_int + param5 / param8;
          param1 = param1 - (int)(var14Lifetime1 * (long)var11Lifetime1 >> 16);
          param5 = param5 % param8;
          if (0 > param5) {
            var9_int--;
            param5 = param5 + param8;
          }
          var18Lifetime1 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 - param2) + (-param3 + param1) * (param1 - param3)));
          var19 = param3;
          var20 = param2;
          while (param5 < var18Lifetime1) {
            var21 = param5 * (-param3 + param1) / var18Lifetime1 + param3;
            var22 = param2 + param5 * (-param2 + param6) / var18Lifetime1;
            stackIn_28_0 = var21;
            stackIn_28_1 = var19;
            stackIn_28_2 = var22;
            stackIn_28_3 = -86;
            stackIn_28_4 = var20;
            if ((1 & var9_int) != 0) {
              stackIn_29_5 = param7;
            } else {
              stackIn_29_5 = param4;
            }
            ar.$cfr$intArgs$a$c3a94e747ff6(stackIn_28_0, stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_29_5);
            var19 = var21;
            var20 = var22;
            var9_int++;
            param5 = param5 + param8;
          }
          stackIn_32_0 = param1;
          stackIn_32_1 = var19;
          stackIn_32_2 = param6;
          stackIn_32_3 = -128;
          stackIn_32_4 = var20;
          if (0 == (1 & var9_int)) {
            stackIn_33_5 = param4;
          } else {
            stackIn_33_5 = param7;
          }
          ar.$cfr$intArgs$a$c3a94e747ff6(stackIn_32_0, stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4, stackIn_33_5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var9), "we.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_a = "No options available";
        field_d = "You can spectate this game";
        field_b = "Connection lost - attempting to reconnect";
        field_e = 9;
    }
}
