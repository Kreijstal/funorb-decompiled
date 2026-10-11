/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_a;
    static String[] field_b;
    int field_c;

    final static String a(byte param0, String param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_9_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Lexicominos.field_L ? 1 : 0;
          try {
            try {
              var3 = (String) (oa.a(true, param2, "getcookies"));
              var4 = dc.a(var3, ';', (byte) -125);
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            if (param0 >= 81) {
              return null;
            }
            stackIn_16_0 = (String) null;
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var3_ref2;
            stackIn_20_1 = new StringBuilder().append("nj.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
            if (param2 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != -5) {
          nj.a((byte) -128);
        }
        field_b = null;
    }

    static {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
