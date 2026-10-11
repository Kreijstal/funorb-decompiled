/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static j field_a;
    static int field_d;
    static int field_c;
    static int[] field_b;

    final static int a(byte param0) {
        if (param0 != -124) {
          field_a = (j) null;
          return ab.field_j;
        }
        return ab.field_j;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -30254) {
          wk.a((byte) -22);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 126 / ((param0 - 2) / 39);
          stackIn_1_0 = ek.a(-36, param1, 0, param1.length);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("wk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_8_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Transmogrify.field_A ? 1 : 0;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (kj.a(param0, false, "getcookies"));
              var5 = vi.a(';', var4, 0);
              var6 = 0;
              if (param1 != -45) {
                wk.b((byte) 74);
              }
              while (var5.length > var6) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_8_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_8_0;
                }
                var6++;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (md.field_j == null) {
              return param0.getParameter("settings");
            }
            stackIn_15_0 = md.field_j;
            return stackIn_15_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("wk.B(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(byte param0) {
        if (!ll.c(true)) {
          return;
        }
        tf.a((byte) 77, false, 4);
        if (param0 > -88) {
          CharSequence[] var2 = (CharSequence[]) null;
          wk.a(96, (CharSequence[]) null);
          return;
        }
    }

    static {
        field_a = new j(12, 34, 190);
    }
}
