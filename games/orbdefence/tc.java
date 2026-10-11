/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static wd[] field_a;
    static int field_b;

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        java.applet.Applet var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (nh.a(false, param1)) {
            return true;
          }
          var9 = kk.field_V;
          var8 = var9;
          var7 = var8;
          var2 = var7;
          if (param0 != -20) {
            var6 = (java.applet.Applet) null;
            tc.a((byte) -96, (java.applet.Applet) null);
          }
          for (var3 = 0; var3 < var9.length; var3++) {
            var4 = var9[var3];
            if (~var4 == ~param1) {
              return true;
            }
          }
          var2Lifetime1 = dm.field_d;
          for (var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 == param1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "tc.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          tc.a((byte) -85, (java.applet.Applet) null);
        }
    }

    final static void a(int param0) {
        mj var1 = (mj) (nd.field_b.b((byte) -58));
        if (var1 == null) {
          th.a(109);
          return;
        }
        se var2 = cd.field_t;
        var2.l(0);
        var2.l(0);
        var2.l(0);
        var2.l(0);
        var1.b(57);
        if (param0 > -35) {
          field_b = 85;
        }
    }

    final static String a(byte param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          String stackIn_15_0 = null;
          String stackIn_17_0 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = OrbDefence.field_D ? 1 : 0;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (gm.a(param0 - 31142, "getcookies", param1));
              var5 = g.a(37, ';', var4);
              if (param0 != -41) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (ld.field_e == null) {
              stackIn_17_0 = param1.getParameter("settings");
              return stackIn_17_0;
            }
            stackIn_15_0 = ld.field_e;
            return stackIn_15_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("tc.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
