/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_b;
    static char[] field_d;
    static boolean field_c;
    static boolean[] field_e;
    static double field_a;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(double param0, double param1, byte param2, int param3, double param4, double param5, nf param6, double param7, vg param8) {
        double var14_double = 0.0;
        RuntimeException var14 = null;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        double var29 = 0.0;
        int var31 = 0;
        nf stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        int stackIn_9_5;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -11) {
            return;
          }
          var14_double = -param8.field_T + param0;
          var16 = param5 - param8.field_L;
          var18 = -param8.field_O + param4;
          var20 = var18 * param8.field_M + (param8.field_R * var14_double + var16 * param8.field_ab);
          var22 = param8.field_V * var14_double + var16 * param8.field_U + param8.field_F * var18;
          var24 = var18 * param8.field_N + (param8.field_P * var14_double + param8.field_H * var16);
          if (!(var24 >= 0.15)) {
            return;
          }
          var26 = 320 + (int)(var20 / var24 * 640.0);
          var27 = 188 + (int)(640.0 * (var22 / var24));
          var28 = (int)(param1 / var24 * 640.0);
          var29 = (double)(2 * param3) * (1.0 - var18 / param7);
          var31 = (int)qn.field_v.a(var29, 0, param4);
          if (var31 <= 0) {
            return;
          }
          stackIn_8_0 = (nf) (param6);
          stackIn_8_1 = var26 - var28;
          stackIn_8_2 = -var28 + var27;
          stackIn_8_3 = 2 * var28;
          stackIn_8_4 = 2 * var28;
          if (param3 < var31) {
            stackIn_9_5 = param3;
          } else {
            stackIn_9_5 = var31;
          }
          ((nf) (Object) stackIn_8_0).d(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_9_5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_13_0 = var14;
          stackIn_13_1 = new StringBuilder().append("pa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          field_d = (char[]) null;
          if (null == kl.field_G) {
            return false;
          }
          if (lk.field_d.a(-128)) {
            return true;
          }
          return false;
        }
        if (null == kl.field_G) {
          return false;
        }
        if (lk.field_d.a(-128)) {
          return true;
        }
        return false;
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_6_0 = null;
          String stackIn_13_0 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Confined.field_J ? 1 : 0;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (kf.a(75, "getcookies", param0));
              var5 = ij.a(param1 ^ 59, (char)param1, var4);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_6_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == wm.field_jb) {
              return param0.getParameter("settings");
            }
            stackIn_13_0 = wm.field_jb;
            return stackIn_13_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var2_ref;
            stackIn_16_1 = new StringBuilder().append("pa.A(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 5 / ((param0 + 16) / 38);
        field_d = null;
    }

    static {
        field_d = new char[]{(char)91, (char)93, (char)35};
        field_c = false;
        field_b = -1;
    }
}
