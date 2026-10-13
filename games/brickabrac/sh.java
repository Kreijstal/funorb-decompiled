/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static String field_b;
    static String field_c;
    static int field_a;
    static mh field_d;

    final static eh a(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (null != MouseInput.field_g) {
          var1 = 89 / ((param0 - 32) / 44);
          return MouseInput.field_g;
        }
        MouseInput.field_g = new eh();
        MouseInput.field_g.a(ArchiveNetworkClient.field_u, 13421772);
        MouseInput.field_g.field_p = 2763306;
        MouseInput.field_g.field_h = 6;
        MouseInput.field_g.field_a = 4;
        MouseInput.field_g.field_g = 0;
        MouseInput.field_g.field_f = 5;
        MouseInput.field_g.field_j = 7697781;
        MouseInput.field_g.field_m = 14;
        MouseInput.field_g.field_l = og.field_Yb;
        var1Lifetime1 = 89 / ((param0 - 32) / 44);
        return MouseInput.field_g;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        int var9 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = -59 / ((param1 - 40) / 63);
          if (param3 >= 2 &&
            param3 <= 36) {
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            for (var9 = 0; var8 > var9; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param2.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var5 = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (var10 != 43 ||
                !param0))) {
                if (var10 >= 48 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  var10 <= 90) {
                  var10 -= 55;
                } else if (var10 >= 97 &&
                  var10 <= 122) {
                  var10 -= 87;
                } else {
                  return false;
                }
                if (param3 <= var10) {
                  return false;
                }
                if (var5 != 0) {
                  var10 = -var10;
                }
                var11 = var10 + var7 * param3;
                if (var7 != var11 / param3) {
                  return false;
                }
                var7 = var11;
                var6 = 1;
              }
            }
            stackIn_40_0 = var6;
            return stackIn_40_0 != 0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("sh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0 != 1) {
              field_b = (String) null;
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                qh.field_a = 1 + (int)(var3.longValue() / 1048576L);
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 <= 110) {
          field_d = (mh) null;
        }
    }

    static {
        field_c = "More suggestions";
        field_b = "Encouraging rule breaking";
    }
}
