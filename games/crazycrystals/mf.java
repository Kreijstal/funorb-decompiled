/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends wl {
    int field_v;
    static String field_r;
    byte[] field_s;
    static byte[] field_u;
    sp field_t;

    final byte[] e(int param0) {
        int var2 = 70 / ((55 - param0) / 55);
        if (this.field_n) {
          throw new RuntimeException();
        }
        return this.field_s;
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
          String stackIn_9_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = CrazyCrystals.field_B;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (hi.a(param0, "getcookies", -126));
              var5 = ik.a(var4, (byte) -76, ';');
              if (param1 != -28697) {
                mf.f(82);
              }
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (to.field_f == null) {
              return param0.getParameter("settings");
            }
            stackIn_16_0 = to.field_f;
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("mf.A(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(byte param0) {
        if (param0 < 18) {
          mf.f(-91);
          if (this.field_n) {
            return 0;
          }
          return 100;
        }
        if (this.field_n) {
          return 0;
        }
        return 100;
    }

    public static void f(int param0) {
        field_u = null;
        if (param0 <= 19) {
          return;
        }
        field_r = null;
    }

    mf() {
    }

    static {
        field_u = new byte[520];
        field_r = " (new)";
    }
}
