/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ao {
    static sa field_b;
    static String field_d;
    static String field_a;
    static IntrusiveDeque field_c;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        int var1 = 96 % ((param0 - 6) / 52);
        field_a = null;
        field_b = null;
    }

    final static byte[] a(CipherPacketBuffer param0, byte[] param1, boolean param2, int param3) {
        int var7 = 0;
        String stackIn_23_2 = null;
        String stackIn_26_2 = null;
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var4_int = param0.b((byte) -53, param3);
          if (var4_int == 0) {
            Object stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new byte[var4_int];
          }
          int var5 = param0.b((byte) 93, 3);
          if (!param2) {
            byte[] stackIn_10_0 = (byte[]) null;
            return stackIn_10_0;
          }
          int var6 = (byte)param0.b((byte) -85, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)(param0.b((byte) -111, var5) + var6);
            }
          }
          byte[] stackIn_19_0 = (byte[]) (param1);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var4;
          StringBuilder stackIn_22_1 = new StringBuilder().append("ao.CA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(java.applet.Applet param0, boolean param1) {
        try {
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            try {
              String var9 = param0.getParameter("cookieprefix");
              String var3 = var9 + "settings";
              String var4 = (String) (fe.a("getcookies", (byte) -108, param0));
              if (param1) {
                String stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              String[] var5 = ee.a((byte) 10, ';', var4);
              for (int var6 = 0; var6 < var5.length; var6++) {
                int var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  String stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var2 = decompiledCaughtException;
            }
            if (gt.field_r == null) {
              return param0.getParameter("settings");
            }
            String stackIn_16_0 = gt.field_r;
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_19_0 = var2_ref;
            StringBuilder stackIn_19_1 = new StringBuilder().append("ao.BA(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = "To Customer Support";
        field_a = "Accuracy";
        field_c = null;
    }
}
