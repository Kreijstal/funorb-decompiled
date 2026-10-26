/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static float[] field_a;
    static int field_b;

    final static int a(CharSequence param0, byte param1) {
        String stackIn_11_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 120) {
            CharSequence var6 = (CharSequence) null;
            bg.a((CharSequence) null, (byte) 88);
          }
          int var2_int = param0.length();
          int var3 = 0;
          for (int var4 = 0; var4 < var2_int; var4++) {
            var3 = ae.a(param0.charAt(var4), -117) - var3 + (var3 << 5);
          }
          int stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var2;
          StringBuilder stackIn_10_1 = new StringBuilder().append("bg.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(java.applet.Applet param0, String param1, byte param2) {
        try {
          String stackIn_18_2 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            try {
              String var3 = (String) (fe.a("getcookies", (byte) -108, param0));
              if (param2 != -18) {
                field_b = -1;
              }
              String[] var4 = ee.a((byte) 10, ';', var3);
              for (int var5 = 0; var5 < var4.length; var5++) {
                int var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  String stackIn_9_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var3_ref = decompiledCaughtException;
            }
            Object stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_17_0 = var3_ref2;
            StringBuilder stackIn_17_1 = new StringBuilder().append("bg.A(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 2334) {
          CharSequence var2 = (CharSequence) null;
          bg.a((CharSequence) null, (byte) -15);
        }
    }

    static {
        field_b = 0;
        field_a = new float[4];
    }
}
