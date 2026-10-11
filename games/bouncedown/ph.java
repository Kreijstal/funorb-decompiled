/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private String field_d;
    private static long[] field_a;
    static tg field_b;
    static byte[][] field_c;

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = this.field_d.equals(param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ph.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          field_b = (tg) null;
        }
        field_c = (byte[][]) null;
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
          lj.a(param1, "jagex-last-login-method", this.field_d, (byte) 126, 31536000L);
          if (param0 != 1) {
            field_c = (byte[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ph.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            bl.field_b = param0;
            try {
              var3 = param1.getParameter("cookieprefix");
              var4 = param1.getParameter("cookiehost");
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (param2 <= 28) {
                ph.a(-77);
              }
              if (param0.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ac.a((byte) 91, param1, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            kc.a(param1, 27477);
          } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ph.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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

    ph(String param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static long a(byte param0) {
        int var1 = -5 / ((param0 - 10) / 57);
        return -qe.field_k + fa.a(-79);
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_a = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            }
          }
          field_a[var2] = var0;
        }
    }
}
