/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends am {
    static bd field_i;
    static int field_n;
    static String[] field_k;
    static String field_m;
    boolean field_j;
    int[] field_h;
    static bd field_o;
    int field_l;

    final static void c(int param0) {
        eh.field_e = false;
        li.field_o = false;
        g.a((byte) 104, param0);
        od.field_I = e.field_q;
        ki.field_f = e.field_q;
    }

    public static void a(boolean param0) {
        if (param0) {
          de.c(-110);
        }
        field_o = null;
        field_i = null;
        field_k = null;
        field_m = null;
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException var2 = null;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_6_0 = null;
          String stackIn_13_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          int var6Lifetime1;
          var8 = HostileSpawn.field_I ? 1 : 0;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (a.a("getcookies", param1, -126));
              var5 = cj.a(var4, -128, ';');
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_6_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_6_0;
                }
              }
              var6Lifetime1 = 1 / ((param0 + 47) / 58);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            if (bi.field_g == null) {
              stackIn_15_0 = param1.getParameter("settings");
              return stackIn_15_0;
            }
            stackIn_13_0 = bi.field_g;
            return stackIn_13_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2;
            stackIn_18_1 = new StringBuilder().append("de.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 19926) {
          java.applet.Applet var4 = (java.applet.Applet) null;
          de.a(-87, (java.applet.Applet) null);
        }
        int var3 = param1 - 1 & param2 >> 31;
        return var3 + (param2 + (param2 >>> 31)) % param1;
    }

    de() {
    }

    static {
        field_m = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_k = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_n = 200;
    }
}
