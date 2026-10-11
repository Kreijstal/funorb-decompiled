/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static bd field_e;
    static boolean field_a;
    static nc field_b;
    static boolean field_i;
    static String[] field_g;
    static long field_d;
    static String field_c;
    static ll[] field_j;
    static int[] field_h;
    static qb field_f;

    public static void a(int param0) {
        if (param0 != -1) {
          field_h = (int[]) null;
        }
        field_e = null;
        field_j = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_c = null;
        field_h = null;
    }

    final static String a(boolean param0, fm param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            fd.a(-96);
          }
          stackIn_3_0 = rl.a(param1.field_d, 29424);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(int param0, java.applet.Applet param1, String param2) {
        try {
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          String stackIn_6_0 = null;
          Object stackIn_11_0 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            try {
              var3 = (String) (ei.a(param1, 118, "getcookies"));
              var4 = eh.a(false, ';', var3);
              var5 = 0;
              var6 = -80 / ((param0 + 36) / 40);
              while (var5 < var4.length) {
                var7 = var4[var5].indexOf('=');
                if (var7 >= 0 &&
                  var4[var5].substring(0, var7).trim().equals(param2)) {
                  stackIn_6_0 = var4[var5].substring(var7 + 1).trim();
                  return stackIn_6_0;
                }
                var5++;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_11_0 = null;
            return (String) (stackIn_11_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("fd.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param2 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = null;
        field_d = 20000000L;
        field_c = "'<col=ffffff>Z</col>' and '<col=ffffff>X</col>' move your character.<br>'<col=ffffff>N</col>' switches units.<br>'<col=ffffff>Q</col>' skips your turn.<br>'<col=ffffff>Enter</col>' and '<col=ffffff>Backspace</col>' perform a jump and a high jump, respectively.<br>Use the mouse to select targets and hold the mouse button to increase the velocity of your attacks.";
        field_g = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = new int[]{67, 68, 69};
    }
}
