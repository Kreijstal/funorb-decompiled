/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static String field_c;
    static gh field_a;
    static ul field_b;
    static String[] field_d;
    static String field_f;
    static ml field_e;
    static kj field_g;

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (!(co.field_f <= var1)) {
          be.field_d = be.field_d + (-var1 + co.field_f);
        }
        co.field_f = var1;
        int var3 = 23 / ((-10 - param0) / 47);
        return be.field_d + var1;
    }

    final static boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        return cf.c((byte) 89);
    }

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 9) {
            mm.a((byte) 11, -108);
          }
          stackIn_3_0 = ok.field_e.a(param1, -742, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("mm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        param1 = (1431655765 & param1) + ((param1 & -1431655766) >>> 1);
        param1 = (858993459 & param1) + ((param1 & -858993459) >>> 2);
        param1 = (param1 >>> 4) + param1 & 252645135;
        if (param0 < 100) {
          return -11;
        }
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return 255 & param1;
    }

    final static void a(String param0, byte param1, String param2, java.applet.Applet param3, long param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param3.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              if (param1 < 88) {
                mm.a(true);
              }
              var9 = param0 + "=" + param2 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L > param4) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + mj.b(param4 * 1000L + mm.a(-75), 0) + "; Max-Age=" + param4;
              }
              hn.a(param3, 27781, "document.cookie=\"" + var7Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("mm.G(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, nk param1) {
        int var3 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          if (!nk.f((byte) -23) &&
            oc.a(param1.field_N, param0 + 16155, false)) {
            return false;
          }
          if (t.a(rn.field_D, param1.field_N, -20370)) {
            return true;
          }
          if (param1.field_Q == 1) {
            return false;
          }
          var7 = nl.a(uc.field_b[0], (byte) 125);
          var6 = var7;
          var5 = var6;
          var2 = var5;
          for (var3 = 0; var3 < var7.length - 8; var3++) {
            if (var7[var3] == param1.field_N) {
              return true;
            }
          }
          if (param0 == -16242) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("mm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_g = null;
        int var1 = 54 % ((param0 - 28) / 55);
        field_c = null;
    }

    static {
        field_c = "% engineered";
        field_d = new String[]{"PURPLE TEAM", "ORANGE TEAM", "GREEN TEAM"};
        field_b = new ul();
        field_f = "Cubes needed: ";
        field_e = new ml();
    }
}
