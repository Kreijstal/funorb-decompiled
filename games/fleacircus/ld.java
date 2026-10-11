/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component field_a;
    static String field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -85) {
          ld.a(40);
        }
        field_c = null;
    }

    final static int a(int param0) {
        gf.field_e.a(-23608);
        if (!td.field_k.b((byte) 66)) {
          return ij.a(125);
        }
        if (param0 <= 37) {
          return 24;
        }
        return 0;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        Exception var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          var2_int = -89 % ((73 - param0) / 41);
          try {
            if (!ce.field_d.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var4 = 0;
            while (true) {
              if (var4 >= param1.length()) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                return true;
              }
              if (var3.indexOf((int) param1.charAt(var4)) != -1) {
                var4++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ld.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static mk a(boolean param0, byte param1) {
        mk var2 = new mk(true);
        var2.field_g = param0 ? true : false;
        if (param1 != 42) {
          field_c = (String) null;
        }
        return var2;
    }

    ld(java.awt.Component param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ld.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ld.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "<%0>Spikes:<%1> Skewers fleas, so avoid them.";
        field_c = "Reload game";
    }
}
