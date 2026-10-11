/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ila extends ksa {
    String field_d;

    final static void c(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = VoidHunters.field_G;
        try {
          var1_int = bs.field_b[0];
          if (param0 != -15) {
            return;
          }
          for (var2 = 1; var2 < bs.field_b.length; var2++) {
            var3 = bs.field_b[var2];
            cua.a(aq.field_p, var2 << 4, aq.field_p, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ila.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_17_0 = false;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = VoidHunters.field_G;
          try {
            if (ch.field_o) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (ia.a(param1, "getcookies", 12348));
              var4 = up.a((byte) -67, ';', var3);
              for (var5 = param0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_17_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref2;
            stackIn_20_1 = new StringBuilder().append("ila.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ila(String param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ila.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte[] param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var3Lifetime1;
        var4 = VoidHunters.field_G;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = "[";
          for (var3 = 0; var3 < param0.length; var3++) {
            var2 = var2 + param0[var3];
            if (-1 + param0.length > var3) {
              var2 = var2 + ",";
            }
          }
          var3Lifetime1 = 84 % ((param1 + 26) / 46);
          stackIn_12_0 = var2 + "]";
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("ila.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
