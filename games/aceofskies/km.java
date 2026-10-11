/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    private gk field_c;
    static int field_b;
    private gq field_a;
    private gk field_d;

    final static int a(int param0) {
        if (param0 != 1) {
          return 11;
        }
        return 1;
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          try {
            if (!rk.field_f.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (param1 != 1) {
              var5 = (String) null;
              km.a((String) null, -68);
            }
            var3 = 0;
            while (true) {
              if (param0.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (-1 != var2.indexOf((int) param0.charAt(var3))) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var2_ref2;
          stackIn_22_1 = new StringBuilder().append("km.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final jr a(int param0, int param1) {
        jr var3;
        int var4;
        byte[] var5;
        jr var3Lifetime1;
        var3 = (jr) (this.field_a.a((long)param0, -94));
        var4 = -15 / ((36 - param1) / 45);
        if (var3 != null) {
          return var3;
        }
        if (param0 >= 32768) {
          var5 = this.field_c.a(1, -10470, param0 & 32767);
        } else {
          var5 = this.field_d.a(1, -10470, param0);
        }
        var3Lifetime1 = new jr();
        if (var5 != null) {
          var3Lifetime1.a((byte) 111, new rb(var5));
        }
        if (param0 >= 32768) {
          var3Lifetime1.b(true);
        }
        this.field_a.a((long)param0, var3Lifetime1, -105);
        return var3Lifetime1;
    }

    private km() throws Throwable {
        throw new Error();
    }

    static {
    }
}
